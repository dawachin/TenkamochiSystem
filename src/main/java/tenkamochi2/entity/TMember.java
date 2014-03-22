package tenkamochi2.entity;
import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Employeeエンティティクラス
 * 
 * @author S2JDBC-Gen
 */
@Entity
@Table(name = "T_MEMBER")
public class TMember implements Serializable {
	
	private static final long serialVersionUID = 1L;

    /** idプロパティ */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    public Integer id;
    
    /** 名前 */
    @Column(nullable = true, unique = false)
    public String  name;
    
    /** ハンドルネーム */
    @Column(nullable = true, unique = false)
    public String  hname;
    
    /** 性別 */
    @Column(nullable = false, unique = false)
    public String sex;
    
    /** メールアドレス */
    @Column(nullable = true, unique = false)
    public String mail;
    
    /** 所属部 */
    @Column(nullable = true, unique = false)
    public String department;
    
    /** 学科 */
    @Column(nullable = false, unique = false)
    public String curriculum;
    
    /** 入学年度*/
    @Column(nullable = false, unique = false)
    public Integer entrance;
   
    /** 電話番号1 */
    @Column(nullable = false, unique = false)
    public Integer tel1;
    
    /** 電話番号2 */
    @Column(nullable = false, unique = false)
    public Integer tel2;
    
    /** 電話番号3 */
    @Column(nullable = false, unique = false)
    public Integer tel3;
    
    /** 役職 */
    @Column(nullable = false, unique = false)
    public String officer;
    
    /** ID */
    @Column(nullable = true, unique = false)
    public String userName;
    
    /** パスワード */
    @Column(nullable = true, unique = false)
    public String password;
    
    /** ★ */
    @OneToMany(mappedBy = "tMember")
    public List<TMemberClub> tMemberClubeList;
    
    @OneToMany(mappedBy = "tMember")
    public List<TPartyAttend> attendList;

}