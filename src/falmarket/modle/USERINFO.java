package falmarket.modle;
// default package

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * USERINFO entity. @author MyEclipse Persistence Tools
 */
@Table(name="userinfo")
@Entity(name="userinfo")
public class USERINFO  implements java.io.Serializable {


    // Fields    
	 @Id
	 @GeneratedValue
	 @Column(name="userid")
     private String userid;
	 @Column(name="username")
     private String username;
	 @Column(name="level")
     private Integer level;
	 @Column(name="password")
     private String password;
     


    // Constructors

    /** default constructor */
    public USERINFO() {
    }

	/** minimal constructor */
    public USERINFO(String userid, String username, String password) {
        this.userid = userid;
        this.username = username;
        this.password = password;
    }
    
    /** full constructor */
    public USERINFO(String userid, String username, Integer level, String password) {
        this.userid = userid;
        this.username = username;
        this.level = level;
        this.password = password;
        
    }

   
    // Property accessors

    public String getUserid() {
        return this.userid;
    }
    
    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getLevel() {
        return this.level;
    }
    
    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

 








}