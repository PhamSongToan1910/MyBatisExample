package  com.example.MyBatisExample.mapper;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Component;

import com.example.MyBatisExample.entity.Person;
import com.example.MyBatisExample.util.MyBatisUtil;

import java.util.List;


public class PersonDAO {
	
	public List<Person> getAllPerson(){
		SqlSession session = MyBatisUtil.getSessionFactory().openSession();
		List<Person> persons = session.selectList("getAllPerson");
		session.commit();
		session.close();
		return persons;
	}
	
}
