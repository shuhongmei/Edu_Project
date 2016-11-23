/**  
 * @Title: LoginAction.java
 * @Package cn.edu.sicnu.action
 * @Description: TODO
 * @author i-Robot
 * @date 2016年11月21日
 */
package cn.edu.sicnu.action;

import cn.edu.sicnu.serviceImpl.UserService;
import cn.edu.sicnu.vo.UserBean;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * ClassName: LoginAction 
 * @Description: TODO
 * @author i-Robot
 * @date 2016年11月21日
 */
public class LoginAction extends ActionSupport implements ModelDriven<UserBean> {
	private UserBean userBean=new UserBean();
	private UserService userService=new UserService();
	
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ModelDriven#getModel()
	 */
	@Override
	public UserBean getModel() {
		// TODO Auto-generated method stub
		return userBean;
	}
	
	@Override
	public String execute() throws Exception {
		int state=userService.login(userBean);
		String lab=null;
		switch (state) {
		case 0://用户不存在
			
			break;
		case 1://密码错误
			break;
		case 2://登录成功
			lab=SUCCESS;
			break;
		}
		return lab;
	}

}
