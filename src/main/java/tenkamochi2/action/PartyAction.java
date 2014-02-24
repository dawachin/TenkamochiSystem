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

import tenkamochi2.form.PartyForm;
import tenkamochi2.service.TDrinkPartyService;
import tenkamochi2.service.TMeetingPartyService;
import tenkamochi2.entity.TMeetingParty;
import tenkamochi2.entity.TDrinkParty;


/**
 * 
 * @author namiken
 *
 */
public class PartyAction {
	
    /** Memberのアクションフォーム */
	@ActionForm
	@Resource
	 protected PartyForm partyForm;
	
	 /** MeetingPartyのリスト */
	public List<TMeetingParty> meetingpartyItems;
	
	/** DrinkPartyのリスト */
	public List<TDrinkParty> drinkpartyItems;
	
	/** TMeetingPartyのサービスクラス */
	@Resource
	protected TMeetingPartyService tMeetingPartyService;
	
	/** TDrinkPartyのサービスクラス */
	@Resource
	protected TDrinkPartyService tDrinkPartyService;
	
	//一覧表示
	@Execute(validator = false)
	public String index	() {
		
		meetingpartyItems = tMeetingPartyService.findAll();
		drinkpartyItems = tDrinkPartyService.findAll();
		
        return "partyindex.jsp";
    }
	
	//入力画面表示
	@Execute(validator = false)
	public String input	() {
        return "partyinput.jsp";
    }
	
	//登録処理＆登録完了画面表示
    @Execute(validator = false)
	public String submit() {
    	
    	/** 登録処理 */
    	TMeetingParty MeetingPartyentity = Beans.createAndCopy(TMeetingParty.class, partyForm).execute();
    	tMeetingPartyService.insert(MeetingPartyentity);
    	
    	TDrinkParty DrinkPartyentity = Beans.createAndCopy(TDrinkParty.class,partyForm).execute();
    	DrinkPartyentity.partyId = MeetingPartyentity.id; 
    	tDrinkPartyService.insert(DrinkPartyentity);
    	
        return "partyconform.jsp";
	}

}

	

	