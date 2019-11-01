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
//		����ID�����û�
//		User user=sqlsession.selectOne("com.dao.UserDaoMapper.getUserById",20);
//		System.out.println(user);
//		����name��ѯ�û�
//		List<Object> lists=sqlsession.selectList("com.dao.UserDaoMapper.findUserByName","��");
//		for(Object user:lists)
//		{
//			System.out.println(user);
//	}
//		�����û�
		User user=new User();
		user.setName("������");
		user.setPassword("789456");
		user.setTuition(5.98);
		user.setDate(new Date());
		sqlsession.insert("com.dao.UserDaoMapper.insertUser", user);
		System.out.println(user.getId());
		sqlsession.commit();
//		�����û�
//		User user=new User();
//		user.setId(26);
//		user.setName("����");
//		user.setPassword("567374");
//		user.setTuition(1.23);
//		user.setDate(new Date());
//		int rows=sqlsession.update("com.dao.UserDaoMapper.updateUser", user);
//		if(rows>0)
//		{
//			System.out.println("���³ɹ�");
//		}
//		sqlsession.commit();
//		sqlsession.close();
//		ɾ���û�
//		int rows=sqlsession.delete("com.dao.UserDaoMapper.deleteUser", 26);
//		if(rows>0)
//		{
//			System.out.println("ɾ���ɹ�");
//		}
//		sqlsession.commit();
//		sqlsession.close();
	}

}
