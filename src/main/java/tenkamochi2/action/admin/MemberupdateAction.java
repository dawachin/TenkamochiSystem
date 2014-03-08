package tenkamochi2.action.admin;

import javax.annotation.Resource;

import org.seasar.framework.beans.util.Beans;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import tenkamochi2.form.admin.MemberUpdateForm;
import tenkamochi2.form.admin.MemberlistForm;
import tenkamochi2.service.TMemberService;
import tenkamochi2.entity.TMember;

/**
 * 会員情報の変更・追加・削除などを管理するクラス
 */
public class MemberupdateAction {
	
    /** MemberUpdateのアクションフォーム */
	@ActionForm
	@Resource
	 protected MemberUpdateForm memberupdateForm;
	
	 /** MemberUpdateのアクションフォーム */
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
  		TMember memberentity = tMemberService.findById(memberupdateForm.id);
  		//エンティティの内容をフォームにコピー
  		Beans.copy(memberentity, memberupdateForm).execute();
  		
        return "index.jsp";
    }
  	
  	
  	/** 編集登録処理＆完了画面表示 */
  	@Execute(validator = false, urlPattern = "submit/{id}")
  	public String submit () {
  		
  		//更新するレコードをidから検索してentityの形で呼び出す
  		TMember member = tMemberService.findById(memberupdateForm.id);
  		//呼び出されたレコードの情報に新しく入力されたフォームの情報をコピーする
  		Beans.copy(memberupdateForm, member);

    	//エンティティの内容をDBに上書きする
    	tMemberService.update(member);
  		
        return "conform.jsp";
    }
        
}

	

	