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
	
	//一覧表示
	@Execute(validator = false)
	public String index	() {
		memberItems = tMemberService.findByIdList();
        return "memberindex.jsp";
    }
	
	//入力画面表示
	@Execute(validator = false)
	public String input	() {
        return "memberinput.jsp";
    }
	
	//登録処理＆登録完了画面表示
    @Execute(validator = false)
	public String submit() {
    	/** 登録処理 */
    	TMember emp = Beans.createAndCopy(TMember.class, memberForm).execute();
    	tMemberService.insert(emp);
        return "memberconform.jsp";
	}
        
}

	

	