package tenkamochi2.original.manager;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Properties;

import javax.annotation.Resource;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import tenkamochi2.dto.UserDto;
import tenkamochi2.entity.TMember;
import tenkamochi2.service.TMemberService;

public class MailManager {

	@Resource
	UserDto user;
	
	//送信先アドレス
	ArrayList<TMember> toAddress = new ArrayList<TMember>();

	//内容
	String content = null;

	//タイトル
	String title = null;

	//エラーメッセージ
	StringBuilder errorMsg = new StringBuilder();

	//エンコード
	String encoding = "ISO-2022-JP";

	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 現在の内容に追加する。
	 * @param content
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * アドレスを設定する
	 * @param toAddress
	 */
	public void setToAddress(TMember...member) {
		for (TMember tMember : member) {
			toAddress.add(tMember);
		}
	}
	/**
	 * メール送信
	 * @return
	 */
	public boolean sendMail() {
		if (!check()) {
			return false;
		}
		Properties objPrp = new Properties();
		objPrp.put("mail.smtp.host", "localhost"); // SMTPサーバ名
		objPrp.put("mail.host", "localhost"); // 接続するホスト名
		// メールセッションを確立
		Session session = Session.getDefaultInstance(objPrp, null);
		// 送信メッセージを生成
		MimeMessage objMsg = new MimeMessage(session);
		try {
			// 送信先（TOのほか、CCやBCCも設定可能）
			objMsg.setRecipients(Message.RecipientType.TO, getToAddress());
			TMember loginUser = new TMemberService().findById(user.memberId);
			// Fromヘッダ
			InternetAddress objFrm = new InternetAddress(loginUser.mail, loginUser.hname);

			objMsg.setFrom(objFrm);
			// 件名
			objMsg.setSubject(title, encoding);

			// 本文
			objMsg.setText(content, encoding);

			// メール送信
			Transport.send(objMsg);

			return true;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return false;
		} catch (MessagingException e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * 送信先アドレスをセットする
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws AddressException
	 */
	private Address[] getToAddress() throws UnsupportedEncodingException, AddressException {
		InternetAddress[] addressArary = new InternetAddress[toAddress.size()];

		int count = 0;
		for (TMember member : toAddress) {
			addressArary[count] = new InternetAddress(member.mail, member.hname, encoding);
			count++;
		}
		return addressArary;
	}

	/**
	 * メールを送信する前にチェックを行う		<br />
	 * チェックをしてOKならTRUE
	 * @return
	 */
	private boolean check() {
		boolean notErrorFlg = true;
		if (toAddress.size() == 0) {
			notErrorFlg = false;
			errorMsg.append("not toAddress");
		}
		
		if (title == null) {
			title = "";
		}
		
		if (content == null) {
			content = "";
		}
		return notErrorFlg;
	}

}
