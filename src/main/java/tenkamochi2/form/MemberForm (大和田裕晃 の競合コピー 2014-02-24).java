package tenkamochi2.form;

import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Required;

public class MemberForm {
	
	/* 名前　*/
	@Required
	@Maxlength(maxlength=10)
	public String name;
	
	/* ハンドルネーム　*/
	@Required
	@Maxlength(maxlength=10)
	public String hname;
	
	/* 性別　*/
	@Required
	@Maxlength(maxlength=10)
	public String sex;
	
	/* メールアドレス　*/
	@Required
	@Maxlength(maxlength=10)
	public String mail;
	
	/* 所属部　*/
	@Required
	@Maxlength(maxlength=10)
	public String department;
	
	/* 所属学科　*/
	@Required
	@Maxlength(maxlength=10)
	public String curriculum;
	
	/* 入学年度　*/
	@Required
	@Maxlength(maxlength=10)
	public String entrance;
	
	/* 電話番号1　*/
	@Required
	@Maxlength(maxlength=10)
	public String tel1;
	
	/* 電話番号2　*/
	@Required
	@Maxlength(maxlength=10)
	public String tel2;
	/* 電話番号3　*/
	@Required
	@Maxlength(maxlength=10)
	public String tel3;
	
	/* 役職　*/
	@Required
	@Maxlength(maxlength=10)
	public String officer;
	
	/* ID　*/
	@Required
	@Maxlength(maxlength=10)
	public String userName;
	
	/* パスワード　*/
	@Required
	@Maxlength(maxlength=10)
	public String password;

}
