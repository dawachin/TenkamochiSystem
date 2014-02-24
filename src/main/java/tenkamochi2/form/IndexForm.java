package tenkamochi2.form;

import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Required;

public class IndexForm {
	
	@Required
	@Maxlength(maxlength=10)
	public String userName;
	
	@Required
	@Maxlength(maxlength=10)
	public String password;

}
