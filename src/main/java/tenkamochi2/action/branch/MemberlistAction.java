package tenkamochi2.action.branch;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import tenkamochi2.form.admin.MemberlistForm;
import tenkamochi2.service.TMemberService;
import tenkamochi2.entity.TMember;

/**
 * 会員情報の一覧を表示し、検索するクラス
 */
public class MemberlistAction {
	
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
	
	/** 一覧画面表示 */
	@Execute(validator = false)
	public String index	() {
		memberItems = tMemberService.findByIdList();
        return "memberindex.jsp";
    } 
}

	

	