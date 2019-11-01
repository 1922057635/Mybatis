package com.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.MybatisUtils.MybatisUtils;
import com.dao.PersonDao;
import com.pojo.Card;
import com.pojo.Person;
import com.pojo.Users;

public class PersonDaoTest {

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
		PersonDao persondao=sqlsession.getMapper(PersonDao.class);
//		Person person=persondao.findPersonById(1);
//		System.out.print(person);
//		测试findPersonsById方法
//		List<Integer> list=new ArrayList<>();
//		list.add(1);
//		list.add(2);
//		List<Person> lists=persondao.findPersonsById(list);
//		for(Person l:lists)
//		{
//			System.out.println(l);
//		}
//		sqlsession.close();
//		测试selectPersonAndCardByCardId方法
		List<Users> lists=persondao.selectPersonAndCardByCardId(1);
		for(Users users:lists)
		{
			System.out.println(users);
		}
		sqlsession.close();
	}
	@Test
	public void findPersonByIdTest() {
		SqlSession sqlsession=MybatisUtils.getSqlSession();
		PersonDao persondao=sqlsession.getMapper(PersonDao.class);
		Person person=persondao.findPersonById(1);
		System.out.println(person.getName());
		System.out.println(person.getCard());
	}

}
