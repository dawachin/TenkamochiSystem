package tenkamochi2.action.admin;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import java.text.DateFormat;
import java.util.Date;

import org.apache.struts.util.TokenProcessor;
import org.seasar.framework.beans.util.Beans;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import tenkamochi2.form.admin.ClubForm;
import tenkamochi2.form.admin.PartyForm;
import tenkamochi2.dto.UserDto;
import tenkamochi2.entity.TClub;
import tenkamochi2.entity.TDrinkParty;
import tenkamochi2.entity.TMeetingParty;
import tenkamochi2.entity.TParty;
import tenkamochi2.service.TClubService;
import tenkamochi2.service.TDrinkPartyService;
import tenkamochi2.service.TMeetingPartyService;
import tenkamochi2.service.TPartyService;

/**
 * 会員情報の変更・追加・削除などを管理するクラス
 */
public class PartyRegistAction {
	
	/** ログイン情報 **/
	protected UserDto userDto;
	
    /** Memberのアクションフォーム */
	@ActionForm
	@Resource
	 protected PartyForm partyForm;
	
	/** TMemberのサービスクラス */
	@Resource
	protected TClubService tClubService;
	
	/** TDrinkPartのサービスクラス */
	@Resource
	protected TDrinkPartyService tDrinkPartyService;
	
	/** TMeetingPartのサービスクラス */
	@Resource
	protected TMeetingPartyService tMeetingPartyService;
	
	/** TPartのサービスクラス */
	@Resource
	protected TPartyService tPartyService;
	
	/** TMemberのサービスクラス */
	public HttpServletRequest request;
	
	
/* ------------------- 以下画面表示や登録処理のメソッド ------------------- */	
	
	
	/** 入力画面表示 */
	@Execute(validator = false)
	public String index	() {
		//2重登録防止のためのTokenの生成
        TokenProcessor.getInstance().saveToken(request);
        return "partyinput.jsp";
    }
	
	/** 登録処理＆完了画面 */
	@Execute(validator = false)
	public String submit () {
	
	//2重登録防止のためTokenが正常な場合にのみ レコード追加処理を行う	
	if (TokenProcessor.getInstance().isTokenValid(request, true)) {
		
		TMeetingParty meeting = new TMeetingParty();
		meeting.meetingName = partyForm.meetingName;
//		meeting.meetingNecessaryFlag = partyForm.meetingNecessaryFlag;
		meeting.meetingRoom = partyForm.meetingRoom;
//		meeting.meetingTime = DateFormat.getDateInstance();
//		meeting.meetingDeadline = DateFormat.getDateInstance()
		tMeetingPartyService.insert(meeting);
		
		TDrinkParty drink = new TDrinkParty();
		drink.drunkRoom = partyForm.drunkRoom;
//		drink.drunkTime = DateFormat.getDateInstance(partyForm.drunkTime);
		drink.drunkMemo = partyForm.drunkMemo;
//		drink.drunkDeadline =DateFormat.getDateInstance(partyForm.drunkDeadline);
		tDrinkPartyService.insert(drink);
		
		TParty party = new TParty();
		party.registId = userDto.memberId;
		party.meetingId = meeting.id;
		party.drinkId = drink.id;
		tPartyService.insert(party);
		
		
        return "partysubmit.jsp";
    }
	return null;
       
	}
}

	

	