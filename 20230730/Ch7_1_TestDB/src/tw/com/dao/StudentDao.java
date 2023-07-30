package tw.com.dao;

import tw.com.beans.Student;

public interface StudentDao {
	boolean createStudent(String name,
			double score);
	Student finedStudent(int id);
}
