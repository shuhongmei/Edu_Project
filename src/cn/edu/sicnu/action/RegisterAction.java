/**  
 * @Title: RegisterAction.java
 * @Package cn.edu.sicnu.action
 * @Description: TODO
 * @author i-Robot
 * @date 2016年11月16日
 */
package cn.edu.sicnu.action;

import cn.edu.sicnu.service.IUserService;
import cn.edu.sicnu.serviceImpl.UserService;
import cn.edu.sicnu.vo.UserBean;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * ClassName: RegisterAction 
 * @Description: 注册操作的Action类
 * @author i-Robot
 * @date 2016年11月16日
 */
public class RegisterAction extends ActionSupport implements ModelDriven<UserBean> {
	private UserBean userBean=new UserBean();
	private IUserService userService;

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ModelDriven#getModel()
	 */
	@Override
	public UserBean getModel() {
		return userBean;
	}
	
	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		try {  
            System.out.println(userBean.getUsername()+"================"+userBean.getPassword());
            userService.regUser(userBean);
            return SUCCESS;  
        } catch (Exception e) {  
            e.printStackTrace();  
            return ERROR;  
        }  
	}
	
}
