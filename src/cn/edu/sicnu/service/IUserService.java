/**  
 * @Title: UserManaer.java
 * @Package cn.edu.sicnu.service
 * @Description: TODO
 * @author i-Robot
 * @date 2016年11月16日
 */
package cn.edu.sicnu.service;

import java.util.List;

import cn.edu.sicnu.po.User;
import cn.edu.sicnu.vo.UserBean;

/**
 * ClassName: UserManaer 
 * @Description: 用户注册业务逻辑接口
 * @author i-Robot
 * @date 2016年11月16日
 */
public interface IUserService {
	public void regUser(UserBean userBean);
	
	public int login(UserBean userBean);
}
