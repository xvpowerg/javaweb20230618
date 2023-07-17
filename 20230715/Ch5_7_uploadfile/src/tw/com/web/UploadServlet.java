package tw.com.web;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig
@WebServlet("/upload")
public class UploadServlet extends HttpServlet{		
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Part part =  req.getPart("photo");
		String fileName = part.getSubmittedFileName();
		InputStream ins = part.getInputStream();
		Path target = Paths.get("c:","upload_images",fileName);
		Files.copy(ins, target,
				StandardCopyOption.REPLACE_EXISTING);
		resp.sendRedirect("view_images");
	}
}
