package com.MybatisUtils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtils {
	private static SqlSessionFactory sqlsessionfactory=null;
	static {
		try {
			String resource="mybatis-config.xml";
			InputStream inputstream = Resources.getResourceAsStream(resource);
			 sqlsessionfactory=new SqlSessionFactoryBuilder().build(inputstream);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static SqlSession getSqlSession() {
		return sqlsessionfactory.openSession();
	}
}
