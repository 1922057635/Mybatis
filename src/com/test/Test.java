package com.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.MybatisUtils.MybatisUtils;
import com.pojo.User;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		SqlSession sqlsession=MybatisUtils.getSqlSession();
//		根据ID查找用户
//		User user=sqlsession.selectOne("com.dao.UserDaoMapper.getUserById",20);
//		System.out.println(user);
//		根据name查询用户
//		List<Object> lists=sqlsession.selectList("com.dao.UserDaoMapper.findUserByName","新");
//		for(Object user:lists)
//		{
//			System.out.println(user);
//	}
//		插入用户
		User user=new User();
		user.setName("董朝晖");
		user.setPassword("789456");
		user.setTuition(5.98);
		user.setDate(new Date());
		sqlsession.insert("com.dao.UserDaoMapper.insertUser", user);
		System.out.println(user.getId());
		sqlsession.commit();
//		更新用户
//		User user=new User();
//		user.setId(26);
//		user.setName("刘洋");
//		user.setPassword("567374");
//		user.setTuition(1.23);
//		user.setDate(new Date());
//		int rows=sqlsession.update("com.dao.UserDaoMapper.updateUser", user);
//		if(rows>0)
//		{
//			System.out.println("更新成功");
//		}
//		sqlsession.commit();
//		sqlsession.close();
//		删除用户
//		int rows=sqlsession.delete("com.dao.UserDaoMapper.deleteUser", 26);
//		if(rows>0)
//		{
//			System.out.println("删除成功");
//		}
//		sqlsession.commit();
//		sqlsession.close();
	}

}
