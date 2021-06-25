package mvcspring.doa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import mvcspring.model.User;

@Repository
public class UserDao {
	
	@Autowired
	private HibernateTemplate hibernatetemplate;

	public int saveUser(User user) {
		int id = (Integer) this.hibernatetemplate.save(user);
		return id;

	}

}
