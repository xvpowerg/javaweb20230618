package tw.com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import tw.com.beans.Student;
import tw.com.dao.StudentDao;

public class MySqlStudent implements StudentDao{
	private String url = "jdbc:mysql://localhost:3306/testdb20230730?serverTimezone=CST&useSSL=false&allowPublicKeyRetrieval=true";
	private String user = "root";
	private String password = "123456";
	
	MySqlStudent(){}
	@Override
	public boolean createStudent(String name, double score) {
		// TODO Auto-generated method stub
	
		int count = 0;
		 try( Connection con =   DriverManager.getConnection(url,user,password)){
			 PreparedStatement ps =  con.
					 prepareStatement("INSERT INTO student(name,score)VALUES(?,?)");
			 ps.setString(1,name);
			 ps.setDouble(2, score);
			 count =  ps.executeUpdate();
		 }catch(SQLException ex) {
			 System.out.println("EX:"+ex);
		 }
		
		return count > 0;
	}

	@Override
	public Student finedStudent(int id) {
		String sql = "SELECT * FROM student WHERE id = ?";
		 try( Connection con =   DriverManager.getConnection(url,user,password)){
			 PreparedStatement ps =  con.
					 prepareStatement(sql);		 
			 ps.setInt(1, id);	 
			ResultSet resultSet =   ps.executeQuery();
			if (resultSet.next()) {
				int stId  = resultSet.getInt("id");
				String name = resultSet.getString("name");
				double score = resultSet.getDouble("score");
				Student st = new Student();
				st.setId(stId);
				st.setName(name);
				st.setScore(score);
				return st;
			}else {
				return null;	
			}
		 }		
		 catch(SQLException ex) {
			 System.out.println("EX:"+ex);
		 }
		 
		// TODO Auto-generated method stub
		 return null;
	}

}
