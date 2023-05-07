package shopping;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Regular extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	//res.getWriter().print("<h1>Regularrrr</h1>");
		String product=req.getParameter("product");
		int shoe=Integer.parseInt(getServletContext().getInitParameter("shoe"));
		int shirt=Integer.parseInt(getServletContext().getInitParameter("shirt"));
		
		double percentage=Double.parseDouble(getServletConfig().getInitParameter("discount"));
		double discount=shoe*(percentage/100);
		
		if(product.equals("shoe")) {
			res.getWriter().print("<h1> Price of shoe is"+(shoe-(shoe*(percentage/100)))+"</h1>");
			
		}else if(product.contentEquals("shirt")) {
			res.getWriter().print("<h1> Price of shirt is"+(shirt-(shirt*(percentage/100)))+"</h1>");
			
			
		}else {
			res.getWriter().print("<h1> Enter proper product Name</h1>");
			
		}
		
	
	
	
	
	
	}
}
