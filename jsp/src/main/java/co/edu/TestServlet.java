package co.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/testServ")
public class TestServlet extends HttpServlet{
	@Override
	public void init(ServletConfig config) throws ServletException {
		
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/xml;charset=utf-8");
		
		PrintWriter out =resp.getWriter();
		//json형태의 데이터 => 		resp.setContentType("text/json;charset=utf-8");
		//[{\"name\":\"홍길동\",\"age\":10},{\"name\":\"박민수\",\"age\":20}]
//		out.print("[{\"name\":\"홍길동\",\"age\":10},{\"name\":\"박민수\",\"age\":20}]");
		
		//xml형태의 데이터 =>		resp.setContentType("text/xml;charset=utf-8");
		//<data><name>홍길동</name><age>10</age><name>박민수</name><age>15</age></data>
		out.print("<data><name>홍길동</name><age>10</age><name>박민수</name><age>15</age></data>");
	}
}
