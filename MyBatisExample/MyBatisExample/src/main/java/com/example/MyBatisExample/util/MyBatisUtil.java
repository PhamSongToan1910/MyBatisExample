package com.example.MyBatisExample.util;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	private static SqlSessionFactory sessionFactory;

	static {
		Reader reader;
		try {
			reader = Resources.getResourceAsReader("resources/SqlMapConfig.xml");
			sessionFactory = new SqlSessionFactoryBuilder().build(reader);	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static SqlSessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
