package tw.com.web;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/view_images")
public class ViewImageServlet  extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Path path =  Paths.get("c:","upload_images");
		List<String> fileNameList =  Files.list(path).
				map(p->p.getFileName().toString()).
				collect(Collectors.toList());
		req.setAttribute("imageList", fileNameList);
		req.getRequestDispatcher("image_view.jsp").
		forward(req, resp);
	}
}
