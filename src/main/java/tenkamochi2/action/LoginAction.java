package tenkamochi2.action;

import javax.annotation.Resource;

import org.seasar.framework.beans.util.Beans;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import tenkamochi2.dto.UserDto;
import tenkamochi2.form.UserForm;
import tenkamochi2.service.TMemberService;
import tenkamochi2.entity.TMember;

public class LoginAction {
	
	@Resource
	@ActionForm
	public UserForm userform;
	
	/** ログイン情報を格納するDto */
	@Resource
	public UserDto userDto;
	
	/** TMemberのサービスクラス */
	@Resource
	protected TMemberService tMemberService;
	
	
	@Execute(validator = true, input = "/login/index.jsp")
	public String index(){
	
		//入力されたuserNameとpassで、memberテーブルから検索する
		TMember member = tMemberService.findById_and_pass(userform.userName, userform.password);
		
		//検索結果がnullじゃなかったらloginDtoに入力されたuserNameを格納する
		if (member != null) {
			//セッションへの保存処理
			//LoginDtoに値を入れるだけでsessionに保存される
			Beans.copy(this.userform, this.userDto).execute();
		}
	return "/mypage/?redirect=true";
	}

}
