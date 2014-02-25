package tenkamochi2.action;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.framework.beans.util.Beans;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import tenkamochi2.form.MemberForm;
import tenkamochi2.service.TMemberService;
import tenkamochi2.entity.TMember;

/**
 * 会員情報の変更・追加・削除などを管理するクラス
 */
public class MemberUpdateAction {
	
    /** Memberのアクションフォーム */
	@ActionForm
	@Resource
	 protected MemberForm memberForm;
	
	/** TMemberのサービスクラス */
	@Resource
	protected TMemberService tMemberService;
	
	
	
	
	
	
	
	/** 編集画面表示 */
  	@Execute(validator = false, urlPattern = "update/{id}")
  	public String update () {
  		
  		//urlPatternで渡されたパラメータ（id）を元にDBを検索し、該当のレコードをエンティティに入れる
  		TMember memberentity = tMemberService.findById(memberForm.id);
  		//エンティティの内容をフォームにコピー
  		Beans.copy(memberentity, memberForm).execute();
  		
        return "index.jsp";
    }
  	
  	
  	/** 編集登録処理＆完了画面表示 */
  	public String submit () {
  		
  		//フォームの内容をエンティティにコピーする
    	TMember emp = Beans.createAndCopy(TMember.class, memberForm).execute();
    	//エンティティの内容をDBに上書きする
    	tMemberService.update(emp);
  		
        return "conform.jsp";
    }
        
}

	

	