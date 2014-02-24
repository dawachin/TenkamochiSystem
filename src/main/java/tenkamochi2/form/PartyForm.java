package tenkamochi2.form;
import java.sql.Timestamp;


import org.seasar.struts.annotation.Required;

public class PartyForm {
	
	/* 会議名　*/
	@Required
	public String partyName;
	
	/* 会議の必須判定　*/
	public Boolean partyNecessaryFlag;
	
	/* 会議時間　*/
	public Timestamp partyTime;
	
	/* 会議場所　*/
	public String partyRoom;
	
	/* 会議内容　*/
	@Required
	public String partyMemo;
	
	/* 会議出欠席締め切り時間　*/
	public Timestamp partyDeadline;
	
	/* 飲み会の有無　*/
	@Required
	public Boolean drunkPartyFlag;
	
	/* 飲み会の時間　*/
	public Timestamp drunkPartyTime;
	
	/* 飲み会の場所　*/
	public String drunkPartyRoom;
	
	/* 飲み会出欠席締め切り時間　*/
	public Timestamp drunkPartyDeadline;

}
