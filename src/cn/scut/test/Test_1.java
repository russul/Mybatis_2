package cn.scut.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import cn.scut.domain.Student;
import cn.scut.mapper.StudentMapper;

public class Test_1 {

	@Test
	public void test_1() throws Exception {
		String resource = "SqlMapConfig.xml";
		// 得到配置文件
		InputStream inputStream = Resources.getResourceAsStream(resource);
		// 创建会话工厂类
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
				.build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		Student student = studentMapper.findStudentById(1001);
		System.out.println(student);
	}
}
