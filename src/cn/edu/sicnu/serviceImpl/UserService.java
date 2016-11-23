/**  
 * @Title: UserManagerImpl.java
 * @Package cn.edu.sicnu.serviceImpl
 * @Description: TODO
 * @author i-Robot
 * @date 2016年11月16日
 */
package cn.edu.sicnu.serviceImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.springframework.beans.BeanUtils;

import cn.edu.sicnu.dao.IUserDao;
import cn.edu.sicnu.po.User;
import cn.edu.sicnu.service.IUserService;
import cn.edu.sicnu.vo.UserBean;

/**
 * ClassName: UserManagerImpl 
 * @Description: 用户注册业务逻辑实现类
 * @author i-Robot
 * @date 2016年11月16日
 */
public class UserService implements IUserService {
	private IUserDao userDao;
	

	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	/* (non-Javadoc)
	 * @see cn.edu.sicnu.service.UserManaer#regUser(cn.edu.sicnu.beans.UserForm)
	 */
	@Override
	public void regUser(UserBean userBean) throws HibernateException {
		User mUser=new User();
		BeanUtils.copyProperties(userBean, mUser);
		userDao.saveObject(mUser);
	}

	/* (non-Javadoc)
	 * @see cn.edu.sicnu.service.IUserService#login(cn.edu.sicnu.vo.UserBean)
	 */
	@Override
	public int login(UserBean userBean) {
		// TODO Auto-generated method stub
		List<User> users=userDao.findByUserBean(userBean);
		if (users.size()==0) {
			return 0;//表示用户不存在
		}else {
			if (users.get(0).getPassword().equals(userBean.getPassword())) {
				return 2;//表示验证通过
			}else {
				return 1;//表示密码错误
			}
		}
	}
	
	
}
