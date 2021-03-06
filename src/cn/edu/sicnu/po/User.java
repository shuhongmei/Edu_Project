package cn.edu.sicnu.po;

// default package



/**
 * User entity. @author MyEclipse Persistence Tools
 */
public class User  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String username;
     private String password;
     private int gender;


    // Constructors

    /** default constructor */
    public User() {
    }

    
    /** full constructor */
    public User(String username, String password, int gender) {
        this.username = username;
        this.password = password;
        this.gender = gender;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public int getGender() {
        return this.gender;
    }
    
    public void setGender(int gender) {
        this.gender = gender;
    }
   








}