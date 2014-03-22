package tenkamochi2.action.admin;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.util.TokenProcessor;
import org.seasar.framework.beans.util.Beans;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import tenkamochi2.form.admin.ClubForm;
import tenkamochi2.form.admin.MemberlistForm;
import tenkamochi2.service.TClubService;
import tenkamochi2.service.TMemberService;
import tenkamochi2.entity.TClub;
import tenkamochi2.entity.TMember;

/**
 * 会員情報の変更・追加・削除などを管理するクラス
 */
public class MemberregistAction {
	
    /** Memberのアクションフォーム */
	@ActionForm
	@Resource
	 protected MemberlistForm memberlistForm;
	 
	/** Clubのフォーム */
	@Resource
	 protected ClubForm clubForm;
	
	 /** Memberのリスト */
	public List<TMember> memberItems;
	
	/** Clubのリスト */
	public List<TClub> clubItems;
	
	/** TMemberのサービスクラス */
	@Resource
	protected TMemberService tMemberService;
	
	/** TMemberのサービスクラス */
	@Resource
	protected TClubService tClubService;
	
	/** TMemberのサービスクラス */
	public HttpServletRequest request;
	
	
/* ------------------- 以下画面表示や登録処理のメソッド ------------------- */	
	
	
	/** 入力画面表示 */
	@Execute(validator = false)
	public String index	() {
		
		//2重登録防止のためのTokenの生成
        TokenProcessor.getInstance().saveToken(request);
        //部の選択肢のためにTClubからすべての部の選択肢を取得
        this.clubItems = this.tClubService.findAllOrderById();
        
        return "memberinput.jsp";
    }
	
	/** 登録処理＆完了画面表示 */
    @Execute(validator = false)
	public String submit () {
    	
    //2重登録防止のためTokenが正常な場合にのみ レコード追加処理を行う	
    if (TokenProcessor.getInstance().isTokenValid(request, true)) {
    	
    	//フォームの内容をエンティティにコピーする
    	TMember emp = Beans.createAndCopy(TMember.class, memberlistForm).execute();
    	//エンティティの内容をDBに追加する
    	tMemberService.insert(emp);
    	
    }	
        return "memberconform.jsp";
	}
        
}

	

	