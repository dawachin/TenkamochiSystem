package tenkamochi2.action.admin;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import tenkamochi2.form.admin.ClubForm;
import tenkamochi2.service.TClubService;

/**
 * 会員情報の一覧を表示し、検索するクラス
 */
public class ClublistAction {
	
    /** Memberのアクションフォーム */
	@ActionForm
	@Resource
	 protected ClubForm clubForm;
	
	/** TMemberのサービスクラス */
	@Resource
	protected TClubService tClubService;
	
	
	
	
/* ------------------- 以下画面表示や登録処理のメソッド ------------------- */	
	
	/** 一覧画面表示 */
	@Execute(validator = false)
	public String index	() {
		clubForm.clubItems = tClubService.findAllOrderById();
        return "clublist.jsp";
    } 
}

	

	