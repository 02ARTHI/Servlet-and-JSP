

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstSevletApp
 */
@WebServlet("/Register")
public class FirstSevletApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
      public FirstSevletApp() {
        super();
        System.out.println("servlet object is created");
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("uname");
		String city = request.getParameter("ucity");
		
		PrintWriter writer =response.getWriter();
		response.sendRedirect("/FourthWebApp/success.jsp");
//		writer.println("Hello " + name);
//		writer.println("I know you're from " + city);
//		writer.println("<html> <head> <title> Second App</title></head>");
//		writer.println("<body bgcolor='cyan'> <h1><marquee> Welcome to our dynamic app </marquee></h1>");
//		writer.println("<table>");
//		writer.println("<tr> <th>NAME</th>  <th>CITY</th> </tr>");
//		writer.println("<tr><td> "+name+"</td> <td> "+city+"</td> </tr>");
//		
//		writer.println("</table></body>");
//		
//		writer.println("</html>");
//		
//		writer.close();
		
	}

}
