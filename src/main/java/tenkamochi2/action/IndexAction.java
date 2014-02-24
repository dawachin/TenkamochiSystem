/*
 * Copyright 2004-2008 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
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
