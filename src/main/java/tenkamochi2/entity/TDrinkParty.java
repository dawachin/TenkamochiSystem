package tenkamochi2.entity;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Employeeエンティティクラス
 * 
 * @author S2JDBC-Gen
 */
@Entity
@Table(name = "T_DRINK_PARTY")
public class TDrinkParty {

    /** idプロパティ */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = true, unique = true)
    public Integer id;
    
    /* 連結する会議ID */
	@Column(nullable = false, unique = false)
	public Integer partyId;
    
	/* 飲み会の時間　*/
    @Column(nullable = false, unique = false)
    @Temporal(TemporalType.TIMESTAMP)
	public Date drunkPartyTime;
	
	/* 飲み会の場所　*/
    @Column(nullable = false, unique = false)
	public String drunkPartyRoom;
    
    /* 飲み会のメモ　*/
    @Column(nullable = false, unique = false)
	public String drunkPartyMemo;
	
	/* 飲み会出欠席締め切り時間　*/
    @Column(nullable = false, unique = false)
    @Temporal(TemporalType.TIMESTAMP)
	public Date drunkPartyDeadline;
    



}