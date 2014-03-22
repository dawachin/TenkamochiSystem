package tenkamochi2.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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

    /** tMember_Idプロパティ */
    @Column(nullable = true, unique = true)
    public Integer memberId;
    
    /** tParty_Idプロパティ */
    @Column(nullable = true, unique = true)
    public Integer partyId;
    
    /** drinkの出欠席のプロパティ */
    @Column(nullable = true, unique = true)
    public Integer drinkAt;
    
    /** meetingの出欠席のプロパティ */
    @Column(nullable = true, unique = true)
    public Integer meetingAt;
    
    @ManyToOne
    @JoinColumn(name = "MEMBER_ID",referencedColumnName = "ID")
    public TMember tMember;
    
    @ManyToOne
    @JoinColumn(name = "PARTY_ID",referencedColumnName = "ID")
    public TParty tParty;
    
}