package in.ac.adit.controller;



import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.ac.adit.dao.UserDAOImpl;
import in.ac.adit.model.User;

public class getalluser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		RequestDispatcher rd = null;

		UserDAOImpl userDAOImpl = new UserDAOImpl();
		List<User> l = userDAOImpl.getalluser();
		
		req.setAttribute("list",l);	
		rd= req.getRequestDispatcher("getalluser.jsp");
		rd.forward(req,res);
	}
	
}
