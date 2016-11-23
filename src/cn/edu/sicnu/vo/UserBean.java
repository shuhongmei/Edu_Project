/**  
 * @Title: UserBean.java
 * @Package cn.edu.sicnu.beans
 * @Description: TODO
 * @author i-Robot
 * @date 2016年11月21日
 */
package cn.edu.sicnu.vo;

/**
 * ClassName: UserBean 
 * @Description: TODO
 * @author i-Robot
 * @date 2016年11月21日
 */
public class UserBean {
	private String username;
    private String password;
    private int gender;
    
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}

}
