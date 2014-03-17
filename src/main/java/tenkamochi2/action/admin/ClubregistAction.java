package tenkamochi2.action.admin;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.util.TokenProcessor;
import org.seasar.framework.beans.util.Beans;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import tenkamochi2.form.admin.ClubForm;
import tenkamochi2.entity.TClub;
import tenkamochi2.service.TClubService;

/**
 * 会員情報の変更・追加・削除などを管理するクラス
 */
public class ClubregistAction {
	
    /** Memberのアクションフォーム */
	@ActionForm
	@Resource
	 protected ClubForm clubForm;
	
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
        return "clubinput.jsp";
    }
	
	/** 登録処理＆完了画面 */
	@Execute(validator = false)
	public String submit () {
	
	//2重登録防止のためTokenが正常な場合にのみ レコード追加処理を行う	
	if (TokenProcessor.getInstance().isTokenValid(request, true)) {
		
		//フォームの内容をエンティティにコピーする
		TClub tClub =  Beans.createAndCopy(TClub.class, clubForm).execute();
		//エンティティの内容をDBに追加する
		tClubService.insert(tClub);
	}
        return "clubsubmit.jsp";
    }
	

        
}

	

	