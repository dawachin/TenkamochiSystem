package tenkamochi2.form;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;
import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Required;

@Component(instance=InstanceType.SESSION)
public class UserForm  implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Required
	@Maxlength(maxlength=10)
	public String userName;
	
	@Required
	@Maxlength(maxlength=10)
	public String password;

}
