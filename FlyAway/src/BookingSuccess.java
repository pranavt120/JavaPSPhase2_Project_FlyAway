

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.simplilearn.AppMain;
import com.simplilearn.PersonalData;

/**
 * Servlet implementation class BookingSuccess
 */
public class BookingSuccess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookingSuccess() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		int fid = Integer.valueOf(request.getParameter("fid"));
//		int id = Integer.valueOf(request.getParameter("id"));
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String seatNumber = request.getParameter("seatNumber");
		int phone = Integer.valueOf(request.getParameter("phone"));
		
		System.out.println("fname : "+ fname);
		System.out.println("lname : "+ lname);
		
		AppMain appMain = new AppMain();
		
		int id1 = appMain.personalInfo(); 
		System.out.println("id1 : "+ id1);
		
		PersonalData person = new PersonalData();
		person.setFirstName(fname);
		person.setSurname(lname);
		person.setEmail(email);
		person.setPhone(phone);
		person.setFid(fid);
		person.setId(id1+1);
		
		appMain.ConfirmBooking(person, fid, seatNumber);
		request.getRequestDispatcher("confirmation.jsp").forward(request, response);
	}

}
