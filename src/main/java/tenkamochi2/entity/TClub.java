package tenkamochi2.entity;
import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Clubのエンティティクラス
 * 
 * @author S2JDBC-Gen
 */
@Entity
@Table(name = "T_CLUB")
public class TClub implements Serializable {
	
	private static final long serialVersionUID = 1L;

    /** idプロパティ */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = true, unique = true)
    public Integer id;
    
    /** 部名 */
    @Column(nullable = true, unique = true)
    public String  ClubName;
    
    /** 部長のID */
    @Column(nullable = true, unique = true)
    public Integer  OfficerId;
    
    /** 部名 */
    @Column(nullable = false, unique = false)
    public String  ClubMemo;
    
    /** ☆ */
    @OneToMany(mappedBy = "tClub")
    public List<TMemberClub> tMemberClubList;

}