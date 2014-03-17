package tenkamochi2.action.admin;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.framework.beans.util.Beans;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import tenkamochi2.form.admin.ClubForm;
import tenkamochi2.service.TClubService;
import tenkamochi2.entity.TClub;

/**
 * 会員情報の変更・追加・削除などを管理するクラス
 */
public class ClubdetailAction {
	
    /** Memberのアクションフォーム */
	@ActionForm
	@Resource
	 protected ClubForm clubForm;
	
	 /** Memberのリスト */
	public List<TClub> clubItems;
	
	/** TMemberのサービスクラス */
	@Resource
	protected TClubService tClubService;
	
	
	
	
/* ------------------- 以下画面表示や登録処理のメソッド ------------------- */	


    
    /** 詳細画面表示 */
  	@Execute(validator = false, urlPattern = "detail/{id}")
  	public String detail () {
  		
  		//urlPatternで渡されたパラメータ（id）を元にDBを検索し、該当のレコードをエンティティに入れる
  		TClub clubentity = tClubService.findById(clubForm.id);
  		//エンティティの内容をフォームにコピー
  		Beans.copy(clubentity, clubForm).execute();
  		
        return "clubdetail.jsp";
    }
        
}

	

	