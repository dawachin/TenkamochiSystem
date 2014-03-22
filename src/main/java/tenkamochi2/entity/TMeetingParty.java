package tenkamochi2.entity;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Employeeエンティティクラス
 * 
 * @author S2JDBC-Gen
 */
@Entity
@Table(name = "T_MEETING_PARTY")
public class TMeetingParty {

    /** idプロパティ */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = true, unique = true)
    public Integer id;
    
    /* 会議名　*/
    @Column(nullable = false, unique = false)
	public String meetingName;
	
	/* 会議の必須判定　*/
    @Column(nullable = false, unique = false)
	public Boolean meetingNecessaryFlag;
	
	/* 会議時間　*/
    @Column(nullable = false, unique = false)
    @Temporal(TemporalType.TIMESTAMP)
	public Date meetingTime;
	
	/* 会議場所　*/
    @Column(nullable = false, unique = false)
	public String meetingRoom;
	
	/* 会議内容　*/
    @Column(nullable = false, unique = false)
	public String meetingMemo;
	
	/* 会議出欠席締め切り時間　*/
    @Column(nullable = false, unique = false)
    @Temporal(TemporalType.TIMESTAMP)
	public Date meetingDeadline;
    

    @OneToOne
    @JoinColumn(name = "ID",referencedColumnName = "MEETING_ID")
    public TParty tParty;
 

}