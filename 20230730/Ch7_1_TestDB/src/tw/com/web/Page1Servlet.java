package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.beans.Student;
import tw.com.dao.StudentDao;
import tw.com.db.DBTools;
import tw.com.db.MySqlStudent;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



@WebServlet("/page1")
public class Page1Servlet  extends HttpServlet{
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
//			String url = "jdbc:mysql://localhost:3306/testdb20230730?serverTimezone=CST&useSSL=false&allowPublicKeyRetrieval=true";
//			String user = "root";
//			String password = "123456";
//			
//			 try( Connection con =   DriverManager.getConnection(url,user,password)){
//				 PreparedStatement ps =  con.prepareStatement("INSERT INTO student(name,score)VALUES(?,?)");
//				 ps.setString(1, "Ken");
//				 ps.setDouble(2, 95.6);
//				 ps.executeUpdate();
//			 }catch(SQLException ex) {
//				 System.out.println("EX:"+ex);
//			 }
			
			StudentDao st1 = DBTools.
					getStudentDao();
			//boolean b1 = st1.createStudent("Lucy",75);
			//System.out.println(b1);
			 Student st =  st1.finedStudent(2);
			 System.out.println(st);
		}
}
