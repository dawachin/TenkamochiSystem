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
public class MemberAction {
	
    /** Memberのアクションフォーム */
	@ActionForm
	@Resource
	 protected MemberForm memberForm;
	
	 /** Memberのリスト */
	public List<TMember> memberItems;
	
	/** TMemberのサービスクラス */
	@Resource
	protected TMemberService tMemberService;
	
	
	
	
/* ------------------- 以下画面表示や登録処理のメソッド ------------------- */	
	
	/** 一覧画面表示 */
	@Execute(validator = false)
	public String index	() {
		memberItems = tMemberService.findByIdList();
        return "memberindex.jsp";
    }
	
	/** 入力画面表示 */
	@Execute(validator = false)
	public String input	() {
        return "memberinput.jsp";
    }
	
	/** 登録処理＆完了画面表示 */
    @Execute(validator = false)
	public String submit () {
    	
    	//フォームの内容をエンティティにコピーする
    	TMember emp = Beans.createAndCopy(TMember.class, memberForm).execute();
    	//エンティティの内容をDBに追加する
    	tMemberService.insert(emp);
    	
        return "memberconform.jsp";
	}
    
    /** 詳細画面表示 */
  	@Execute(validator = false, urlPattern = "detail/{id}")
  	public String detail () {
  		
  		//urlPatternで渡されたパラメータ（id）を元にDBを検索し、該当のレコードをエンティティに入れる
  		TMember memberentity = tMemberService.findById(memberForm.id);
  		//エンティティの内容をフォームにコピー
  		Beans.copy(memberentity, memberForm).execute();
  		
        return "memberdetail.jsp";
    }
        
}

	

	