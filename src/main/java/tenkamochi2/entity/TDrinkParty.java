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
@Table(name = "T_DRINK_PARTY")
public class TDrinkParty {

    /** idプロパティ */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = true, unique = true)
    public Integer id;
    
    
	/* 飲み会の時間　*/
    @Column(nullable = false, unique = false)
    @Temporal(TemporalType.TIMESTAMP)
	public Date drunkTime;
	
	/* 飲み会の場所　*/
    @Column(nullable = false, unique = false)
	public String drunkRoom;
    
    /* 飲み会のメモ　*/
    @Column(nullable = false, unique = false)
	public String drunkMemo;
	
	/* 飲み会出欠席締め切り時間　*/
    @Column(nullable = false, unique = false)
    @Temporal(TemporalType.TIMESTAMP)
	public Date drunkDeadline;
    
    @OneToOne
    @JoinColumn(name = "ID",referencedColumnName = "DRINK_ID")
    public TParty tParty;
    


}