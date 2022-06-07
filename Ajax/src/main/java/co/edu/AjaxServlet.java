package co.edu;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Servlet implementation class AjaxServlet
 */
@WebServlet({ "/AjaxServlet", "/ajax.do" })
public class AjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AjaxServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String job = request.getParameter("job");
		PrintWriter out = response.getWriter();//출력스트림
		System.out.println(job);
		if(job.equals("html")) {
			out.print("<h3>아작스페이지입니다.</h3>");
			out.print("<a href='index.html'>첫페이지로</a>");
			
		}else if(job.equals("json")) {
//			String json = "[";
//			out.print("<h3>JSON페이지입니다.</h3>");
//			out.print("<a href='index.html'>첫페이지로</a>");
			EmpDAO dao = new EmpDAO();
			List<Employee> list = dao.empList();
//			for(int i = 0; i <list.size(); i++) {
//				json += "{\"fname\":" + list.get(i).getFirstName() + "}";
//				if (i != list.size() -1) {
//					json += ",";
//				}
//			}
//			json += "]";
			Gson gson = new GsonBuilder().create();
			out.print(gson.toJson(list));
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8"); //요청 한글처리
		response.setCharacterEncoding("utf-8"); //응답한글처리
		response.setContentType("text/html;charset=utf-8");
		
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String hdate = request.getParameter("hiredate");
		String job = request.getParameter("job");
		String cmd = request.getParameter("cmd");
		String empId = request.getParameter("empId");
		
		Employee emp = new Employee();
		emp.setFirstName(fname);
		emp.setLastName(lname);
		emp.setEmail(email);
		emp.setHireDate(hdate);
		emp.setJobId(job);
		
		if (cmd.equals("insert")) {
			
			EmpDAO dao = new EmpDAO();
			dao.insertEmp(emp);
			
			System.out.println(emp);
		}else if (cmd.equals("update")) {
			EmpDAO dao = new EmpDAO();
			emp.setEmployeeId(Integer.parseInt(empId));
			if (dao.updateEmp(emp) == null) {
				// {"retCOd
				
			}else {
				
			}
			
		}else if (cmd.equals("delete")) {
			EmpDAO dao = new EmpDAO();
			emp.setEmployeeId(Integer.parseInt(empId));
		}
		
		
		Gson gson = new GsonBuilder().create();
		response.getWriter().print(gson.toJson(emp));
		
		doGet(request, response);
	}

}
