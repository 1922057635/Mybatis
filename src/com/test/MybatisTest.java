package com.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.MybatisUtils.MybatisUtils;
import com.pojo.User;

class MybatisTest {

	@Before
	void setUp() throws Exception {
	}

	@After
	void tearDown() throws Exception {
	}

	@Test
	void test() throws IOException {
		//fail("Not yet implemented");
		SqlSession sqlsession=MybatisUtils.getSqlSession();
		User user=sqlsession.selectOne("com.dao.UserDao.getUserById",20);
		System.out.println(user);
	}

}
