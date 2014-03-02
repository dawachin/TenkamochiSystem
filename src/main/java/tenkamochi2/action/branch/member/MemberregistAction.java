package tenkamochi2.action.branch.member;

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
public class MemberregistAction {
	
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

	/** 入力画面表示 */
	@Execute(validator = false)
	public String index	() {
        return "memberinput.jsp";
    }
	
	/** 登録処理＆完了画面表示 */
    @Execute(validator = false)
	public String submit () {
    	
    	//フォームの内容をエンティティにコピーする
    	TMember emp = Beans.createAndCopy(TMember.class, memberlistForm).execute();
    	//エンティティの内容をDBに追加する
    	tMemberService.insert(emp);
    	
        return "memberconform.jsp";
	}
        
}

	

	