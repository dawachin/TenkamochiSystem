package tenkamochi2.form.admin;

import java.util.List;
import java.util.Map;

import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Required;

import tenkamochi2.entity.TClub;

public class PartyForm {
	
	public Integer id;
	
	/* 会議名　*/
	@Required
	@Maxlength(maxlength=10)
	public String meetingName;
	
	/* 会議の必須判定　*/
	@Required
	@Maxlength(maxlength=10)
	public String meetingNecessaryFlag;
	
	/* 会議時間　*/
	@Required
	@Maxlength(maxlength=10)
	public String meetingTime;
	
	/* 会議場所　*/
	@Required
	@Maxlength(maxlength=10)
	public String meetingRoom;
	
	/* 会議内容　*/
	public String meetingMemo;
	
	/* 会議出欠席締め切り時間　*/
	public String meetingDeadline;
	
	/* 会議出欠席締め切り時間　*/
	public String drunkTime;
	
	/* 会議出欠席締め切り時間　*/
	public String drunkRoom;
	
	/* 会議出欠席締め切り時間　*/
	public String drunkMemo;
	
	/* 会議出欠席締め切り時間　*/
	public String drunkDeadline;
	
}
