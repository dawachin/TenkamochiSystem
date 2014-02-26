package tenkamochi2.action.admin.member;

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
public class MemberupdateAction {
	
    /** Memberのアクションフォーム */
	@ActionForm
	@Resource
	 protected MemberlistForm memberlistForm;
	
	/** TMemberのサービスクラス */
	@Resource
	protected TMemberService tMemberService;
	
	
	
	
	
/* ------------------- 以下画面表示や登録処理のメソッド ------------------- */	
	
	/** 編集画面表示 */
  	@Execute(validator = false, urlPattern = "update/{id}")
  	public String update () {
  		
  		//urlPatternで渡されたパラメータ（id）を元にDBを検索し、該当のレコードをエンティティに入れる
  		TMember memberentity = tMemberService.findById(memberlistForm.id);
  		//エンティティの内容をフォームにコピー
  		Beans.copy(memberentity, memberlistForm).execute();
  		
        return "index.jsp";
    }
  	
  	
  	/** 編集登録処理＆完了画面表示 */
  	public String submit () {
  		
  		//フォームの内容をエンティティにコピーする
    	TMember emp = Beans.createAndCopy(TMember.class, memberlistForm).execute();
    	//エンティティの内容をDBに上書きする
    	tMemberService.update(emp);
  		
        return "conform.jsp";
    }
        
}

	

	