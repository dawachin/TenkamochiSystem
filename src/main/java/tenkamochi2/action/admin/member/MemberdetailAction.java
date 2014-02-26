package tenkamochi2.action.admin.member;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.framework.beans.util.Beans;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import tenkamochi2.form.admin.MemberlistForm;
import tenkamochi2.service.TMemberService;
import tenkamochi2.entity.TMember;

/**
 * 会員情報の変更・追加・削除などを管理するクラス
 */
public class MemberdetailAction {
	
    /** Memberのアクションフォーム */
	@ActionForm
	@Resource
	 protected MemberlistForm memberlistForm;
	
	 /** Memberのリスト */
	public List<TMember> memberItems;
	
	/** TMemberのサービスクラス */
	@Resource
	protected TMemberService tMemberService;
	
	
	
	
/* ------------------- 以下画面表示や登録処理のメソッド ------------------- */	


    
    /** 詳細画面表示 */
  	@Execute(validator = false, urlPattern = "detail/{id}")
  	public String detail () {
  		
  		//urlPatternで渡されたパラメータ（id）を元にDBを検索し、該当のレコードをエンティティに入れる
  		TMember memberentity = tMemberService.findById(memberlistForm.id);
  		//エンティティの内容をフォームにコピー
  		Beans.copy(memberentity, memberlistForm).execute();
  		
        return "memberdetail.jsp";
    }
        
}

	

	