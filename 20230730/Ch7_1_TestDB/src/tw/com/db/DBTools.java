package tw.com.db;

import tw.com.dao.StudentDao;

public class DBTools {
		public static StudentDao getStudentDao() {
			return new MySqlStudent();
		}
}
