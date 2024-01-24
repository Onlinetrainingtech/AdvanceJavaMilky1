

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletP1
 */
@WebServlet("/ServletP1")
public class ServletP1 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out=resp.getWriter();
		String u1=req.getParameter("uname");
		String p1=req.getParameter("pass");
		if(u1.equals("admin")&&p1.equals("admin@123"))
		{
			//out.println("Login Sucess!!!");
			RequestDispatcher rd=req.getRequestDispatcher("sucess.html");
			rd.forward(req, resp);
		}
		else
		{
			RequestDispatcher rd=req.getRequestDispatcher("fail.html");
			rd.forward(req, resp);
			//out.println("Login Fail!!!");
		}
//		out.println("My Data is::"+u1+"\t"+p1);
		
	}

}
