package tech.awakelab.springmvc.model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import tech.awakelab.springmvc.model.bean.Student;

public class StudentDAOImpl implements IStudentDao {
	
	@Autowired
	JdbcTemplate template; // name=template de la linea 20 del root-context.xml
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public List<Student> findAllStundents() {
	
		String sql = "SELECT id, name, lastname, email FROM students";
		return template.query(sql, new StudentRowMapper());
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteStudentById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student findByIdStudent(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	// Clase anidada
	class StudentRowMapper implements RowMapper<Student> {
	    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		      return new Student(rs.getInt("id"), rs.getString("name"), rs.getString("lastname"), rs.getString("email"));
		    }	
	}
	

}
