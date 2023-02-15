package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Patientdao;
@WebServlet("/abd")
public class Sample extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		
		String s1=req.getParameter("pid");
		int pid=Integer.parseInt(s1);
		
		String s2=req.getParameter("phno");
		long phno=Long.parseLong(s2);
		String pname=req.getParameter("pname");
		
		Patientdao dao=new Patientdao();
		dao.update(pid,phno,pname);
			
	}
}
