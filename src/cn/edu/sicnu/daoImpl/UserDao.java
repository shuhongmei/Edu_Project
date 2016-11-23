/**  
 * @Title: UserDao.java
 * @Package cn.edu.sicnu.daoImpl
 * @Description: TODO
 * @author i-Robot
 * @date 2016年11月16日
 */
package cn.edu.sicnu.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.edu.sicnu.dao.IUserDao;
import cn.edu.sicnu.po.User;
import cn.edu.sicnu.vo.UserBean;

/**
 * ClassName: UserDao 
 * @Description: TODO
 * @author i-Robot
 * @date 2016年11月16日
 */
public class UserDao extends HibernateDaoSupport implements IUserDao {

	/* (non-Javadoc)
	 * @see cn.edu.sicnu.dao.BaseDao#saveObject(java.lang.Object)
	 */
	@Override
	public void saveObject(Object obj) throws HibernateException {
		getHibernateTemplate().save(obj);
	}

	/* (non-Javadoc)
	 * @see cn.edu.sicnu.dao.IUserDao#findByUserBean(cn.edu.sicnu.vo.UserBean)
	 */
	@Override
	public List<User> findByUserBean(UserBean userBean) throws HibernateException {
		// TODO Auto-generated method stub
		List<User> users=new ArrayList<User>();
		String hqlString="from User where User.username=?";
		System.out.println("==="+getHibernateTemplate().find(hqlString, userBean.getUsername()));
		users=(List<User>) getHibernateTemplate().find(hqlString, userBean.getUsername());
		System.out.println("==="+users);
		return users;
	}

}
