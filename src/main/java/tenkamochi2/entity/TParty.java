package tenkamochi2.entity;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 * Employeeエンティティクラス
 * 
 * @author S2JDBC-Gen
 */
@Entity
@Table(name = "T_PARTY")
public class TParty {

    /** idプロパティ */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = true, unique = true)
    public Integer id;
    
    /** tDrink_Idプロパティ */
    @Column(nullable = true, unique = true)
    public Integer drinkId;
    
    /** tMeeting_Idプロパティ */
    @Column(nullable = true, unique = true)
    public Integer meetingId;
    
    @OneToOne
    @JoinColumn(name = "DRINK_ID",referencedColumnName = "ID")
    public TDrinkParty drink;
    
    @OneToOne
    @JoinColumn(name = "MEETING_ID",referencedColumnName = "ID")
    public TMeetingParty meeting;
    
    @OneToMany(mappedBy = "tParty")
    public List<TPartyAttend> attendList;
    
    
}