package tenkamochi2.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Employeeエンティティクラス
 * 
 * @author S2JDBC-Gen
 */
@Entity
@Table(name = "T_PARTY_DRINK_ATTEND")
public class TPartyDrinkAttend {

    /** idプロパティ */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = true, unique = true)
    public Integer id;
    
    /** メンバーID　*/
    @Column(nullable = false, unique = false)
	public Integer memberNum;
    
    /** 飲み会ID　*/
    @Column(nullable = false, unique = false)
	public Integer partyNum;

    /** 出欠席フラグ　*/
    @Column(nullable = false, unique = false)
	public Integer partyAttendFlrag;

    
}