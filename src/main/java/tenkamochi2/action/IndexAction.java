package tenkamochi2.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import tenkamochi2.form.IndexForm;
import tenkamochi2.service.TMemberService;
import tenkamochi2.entity.TMember;

public class IndexAction {
	
	@ActionForm
	@Resource
	protected IndexForm indexForm;
	
	/** TMemberのサービスクラス */
	@Resource
	protected TMemberService tmemberService;
	
    @Execute(validator = false)
	public String index() {
        return "index.jsp";
	}
    
    @Execute(validator = false)
	public String login() {
    	
    	//ログイン処理
    	TMember member = tmemberService.findById_and_pass(indexForm.userName, indexForm.password);
    	if (member == null){
    		return "index.jsp";
    	}
        return "top.jsp";
	}

}
