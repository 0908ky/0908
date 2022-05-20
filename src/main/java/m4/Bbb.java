package m4;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Bbb
 */
//@WebServlet(...)ここでURL末尾を決められる。これでも画面推移できる
public class Bbb extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Bbb() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int x= Integer.parseInt(request.getParameter("x"));
		int y= Integer.parseInt(request.getParameter("y"));
		
		String kigou = request.getParameter("kigou");
		int a=0;
		String name="";
		
		switch(kigou) {
		
			case "tasu":
				a=x+y;
				name="和";
				break;
			
			case "hiku":
				a=x-y;
				name="差";
				break;
			
			case "kakeru":
				a=x*y;
				name="積";
				break;
		}
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>Insert title here</title>");
		out.println("</head>");
		out.println("<body>	");
		out.println(String.format("<p>%dと%dの%sは%dです</p>",x,y,name,a));
		out.println("</body>");
		out.println("</html>");
		
	}

}
