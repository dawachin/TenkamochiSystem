package tenkamochi2.action;

import javax.annotation.Resource;

import org.seasar.framework.beans.util.Beans;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import tenkamochi2.dto.UserDto;
import tenkamochi2.form.UserForm;

public class LoginAction {
	
	@Resource
	@ActionForm
	public UserForm userform;
	
	@Resource
	public UserDto userDto;
	
	
	@Execute(validator = true, input = "/login/index.jsp")
	public String index(){
		
		//セッションへの保存処理
		//LoginDtoに値を入れるだけでsessionに保存される
		Beans.copy(this.userform, this.userDto).execute();
		
		
	return "/mypage/?redirect=true";
	}

}
