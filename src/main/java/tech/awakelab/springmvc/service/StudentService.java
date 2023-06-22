package tech.awakelab.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.awakelab.springmvc.model.bean.Student;
import tech.awakelab.springmvc.model.dao.StudentDAOImpl;

@Service
public class StudentService {

	@Autowired
	StudentDAOImpl studentDao;
	
	public StudentService() {
	
	}
	
	public List<Student> getAll() {
		return studentDao.findAllStundents();
	}
	
}
