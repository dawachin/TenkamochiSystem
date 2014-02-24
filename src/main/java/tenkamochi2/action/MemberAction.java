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
    
//    @Execute(validator = false)
//    public String complete() {
//    	
//    	Member emp = Beans.createAndCopy(Member.class, memberForm).execute();
//    	memberService.insert(emp);
//    	
//    	return "membercomplete.jsp";
//    }
    
}

	

	