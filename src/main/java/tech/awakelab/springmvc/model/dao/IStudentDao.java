package tech.awakelab.springmvc.model.dao;

import java.util.List;

import tech.awakelab.springmvc.model.bean.Student;

public interface IStudentDao {
	
	  public List<Student> findAllStundents();

	  public Student saveStudent(Student student);

	  public void deleteStudentById(int id);

	  public Student updateStudent(Student student);
	  
	  public Student findByIdStudent(int id);
	  
}
