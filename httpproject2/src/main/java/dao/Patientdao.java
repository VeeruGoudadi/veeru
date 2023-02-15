package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.mysql.cj.Query;

import dto.Patient;

public class Patientdao
{
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
	public void insert(Patient p) 
	{
		entityTransaction.begin();
		entityManager.persist(p);
		entityTransaction.commit();
	}
	public void update(int pid, long phno,String pname) 
	{
		Patient p=entityManager.find(Patient.class,pid);
		if (p!=null) {
		p.setPhno(phno);
		p.setPname(pname);
		entityTransaction.begin();
		entityManager.merge(p);
		entityTransaction.commit();
		}
		else {
			System.out.println("Data is not found Enter valid input!!!!");
		}
	}
	public void delete(int pid) 
	{
		Patient p=entityManager.find(Patient.class, pid);
		if (p!=null) {
		entityTransaction.begin();
		entityManager.remove(p);
		entityTransaction.commit();
		}
		else {
			System.out.println("Data is not found Enter valid input!!!!");
		}
	}
	public void fetch(int pid) 
	{
		Patient p1=entityManager.find(Patient.class, pid);
		if (p1!=null) 
		{
			System.out.println(p1);
		}
		else {
			System.out.println("Data not found!!!!");
		}
	}
	public void fetchall() 
	{
		
		
		
	}
}