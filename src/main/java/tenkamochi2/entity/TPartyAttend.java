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
@Table(name = "T_PARTY_ATTEND")
public class TPartyAttend {

    /** idプロパティ */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = true, unique = true)
    public Integer id;
    
    /** メンバーID　*/
    @Column(nullable = false, unique = false)
	public String memberNum;
    
    /** 会議ID　*/
    @Column(nullable = false, unique = false)
	public String partyNum;

    /** 出欠席フラグ　*/
    @Column(nullable = false, unique = false)
	public String partyAttendFlrag;

    
}