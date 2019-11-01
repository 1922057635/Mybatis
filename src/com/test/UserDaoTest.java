package com.test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.MybatisUtils.MybatisUtils;
import com.dao.UserDao;
import com.pojo.User;

public class UserDaoTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		SqlSession sqlsession=MybatisUtils.getSqlSession();
		System.out.println(sqlsession);
		UserDao userdao=sqlsession.getMapper(UserDao.class);
		User user=new User();
		user.setPassword("567374");
		user.setName("ÐÂ");
		List<User> list=userdao.getUserByNameAndNumber(user);
		for(User u:list)
		{
			System.out.println(u);
		}
//		userdao.insertUser(user);
//		System.out.println(user.getId());
		sqlsession.commit();
		sqlsession.close();
	}

}
