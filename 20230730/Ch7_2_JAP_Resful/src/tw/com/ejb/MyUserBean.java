package tw.com.ejb;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import tw.com.jpa.MyUser;

@Stateless
public class MyUserBean implements MyUserBeanLocal {
	@Inject
	private EntityManager em;
	
	@Override
	public boolean login(MyUser myUser) {
		// TODO Auto-generated method stub		
		return findUserByAccount(myUser.getAccount(),myUser.getPassword()) != null;
	}

	@Override
	public boolean regisrter(MyUser myUser) {
		// TODO Auto-generated method stub
		
		try{
			em.persist(myUser);	
		}catch(Exception ex) {
			return false;
		}
		
		return true;
	}

	@Override
	public MyUser findUserByAccount(String account,String password) {
		// TODO Auto-generated method stub
		MyUser myUser = null;
		TypedQuery<MyUser> query =  em.createNamedQuery("findMyUser",MyUser.class);
		query.setParameter("account", account);
		query.setParameter("password", password);
		
		try {
			myUser = query.getSingleResult();	
		}catch(Exception ex) {
			System.out.println("findUserByAccount:"+ex);
			return null;
		}		
		
		return myUser;
	}

	@Override
	public boolean deleteUser(MyUser myUser) {
		// TODO Auto-generated method stub
		try {
			myUser =   em.merge(myUser);
			em.remove(myUser);
			return true;
		}catch(Exception ex) {
			System.out.println(ex);
		}
		//建立關聯性
		
		return false;
	}
	
}
