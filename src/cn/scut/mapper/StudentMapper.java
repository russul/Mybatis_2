package cn.scut.mapper;

import cn.scut.domain.Student;

/*
 * 使用mapper代理的方式开发dao
        需要编写mapper.xml
        需要编写mapper接口（相当于dao接口）遵循一定的规范， mybatis就可以自动生成接口实现类的代理对象
 * 规范：mapper接口中的方法名要和mapper.xml中statement的id一致
 * 		接口中方法的输入参数类型要和parameterType值相同
 * 		接口中方法的返回值类型要和resultType指定的类型一致
 */
public interface StudentMapper {
	public Student findStudentById(int id) throws Exception;
}
