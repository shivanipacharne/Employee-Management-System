
package Oops_Concept;
import java.io.IOException;




import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/RegisterFrom")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID=1L;
	private ShivaniDao shivaniDao;
	
	
	
	public void init() {
		shivaniDao=new ShivaniDao();
	}

	public  void doPost(HttpServletRequest request,HttpServletResponse response )
	throws IOException{
		
		String firstname=request.getParameter("firstname");
		String middlename=request.getParameter("middlename");
		String lastname=request.getParameter("lastname");
		String address=request.getParameter("address");
		String mobileno=request.getParameter("mobileno");
		String education=request.getParameter("education");
		String email=request.getParameter("email");
		String Salary=request.getParameter("Salary");
		
		ServeletBean serveletbean=new ServeletBean();
		
		
		serveletbean.setFirstName(firstname);
		serveletbean.setMiddleName(middlename);
		serveletbean.setLastName(lastname);
		serveletbean.setAddress(address);
		serveletbean.seMobileNo(mobileno);
		serveletbean.setEducation(education);
		serveletbean.setEmail(email);
		serveletbean.setSalary(Salary);
	
		try {
			shivaniDao.registerServeletBean(serveletbean);
		}catch(Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("StudentReg.jsp");
		
	}


	}


