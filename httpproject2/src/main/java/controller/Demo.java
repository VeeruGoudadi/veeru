package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Patientdao;
import dto.Patient;
@WebServlet("/abc")
public class Demo extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		
		String s1=req.getParameter("pid");
		int pid=Integer.parseInt(s1);
		
		String pname=req.getParameter("pname");
		String bgroup=req.getParameter("bgroup");
		String s2=req.getParameter("phno");
		long phno=Long.parseLong(s2);
		
		Patient p =new Patient();
		p.setPid(pid);
		p.setPname(pname);
		p.setBgroup(bgroup);
		p.setPhno(phno);
		
		Patientdao dao=new Patientdao();
		dao.insert(p);
	}
}
