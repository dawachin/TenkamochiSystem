package tenkamochi2.action.admin;

import javax.annotation.Resource;

import org.seasar.struts.annotation.Execute;

import tenkamochi2.dto.UserDto;

public class MypageAction {
	
	@Resource
	public UserDto userDto;
	
	
	@Execute(validator = false)
	public String index(){
		
	return "index.jsp";
	}

}
