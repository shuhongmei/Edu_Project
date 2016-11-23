/**  
 * @Title: BaseDao.java
 * @Package cn.edu.sicnu.dao
 * @Description: TODO
 * @author i-Robot
 * @date 2016年11月16日
 */
package cn.edu.sicnu.dao;

import java.util.List;

import org.hibernate.HibernateException;

import cn.edu.sicnu.po.User;
import cn.edu.sicnu.vo.UserBean;

/**
 * ClassName: BaseDao 
 * @Description: 
 * @author i-Robot
 * @date 2016年11月16日
 */
public interface IUserDao {
	public void saveObject(Object obj) throws HibernateException;
	public List<User> findByUserBean(UserBean userBean) throws HibernateException;
}
