package tenkamochi2.form.admin;

import java.util.List;
import java.util.Map;

import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Required;

import tenkamochi2.entity.TClub;

public class ClubForm {
	
	public Integer id;
	
	/* 部名　*/
	@Required
	@Maxlength(maxlength=10)
	public String ClubName;
	
	/* 部長のID　*/
	@Required
	@Maxlength(maxlength=10)
	public String OfficerId;
	
	/* 部の概要　*/
	@Required
	@Maxlength(maxlength=10)
	public String ClubMemo;
	
	/* Clubのリスト */
	public List<TClub> clubItems;
	
	/* Clubのマップ */
	public List<Map<Integer,String>> clubMap;	
	
	/* 選択した項目のパラメータ　*/
	public String[] club_checks = new String[0];

}
