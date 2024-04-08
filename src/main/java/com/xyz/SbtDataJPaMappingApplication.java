package com.xyz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.xyz.entity.Address;
import com.xyz.entity.Category;
import com.xyz.entity.Employee;
import com.xyz.entity.Mobile;
import com.xyz.entity.Product;
import com.xyz.entity.StuAddress;
import com.xyz.entity.Student;
import com.xyz.repositotry.AddressRepo;
import com.xyz.repositotry.CategoryRepo;
import com.xyz.repositotry.EmpRepo;
import com.xyz.repositotry.MobileRepo;
import com.xyz.repositotry.ProductRepo;
import com.xyz.repositotry.StuAddRepo;
import com.xyz.repositotry.StudentRepo;

@SpringBootApplication
public class SbtDataJPaMappingApplication implements CommandLineRunner {

//	@Autowired
//	EmpRepo er;
//	@Autowired
//	MobileRepo mr;
//	@Autowired
//	AddressRepo ar;
//	@Autowired
//	ProductRepo pr;
//	@Autowired
//	CategoryRepo cr;
	
	
	@Autowired
	 StudentRepo sr;
	@Autowired
	StuAddRepo sar;
	
	public static void main(String[] args) {
		ApplicationContext ac= SpringApplication.run(SbtDataJPaMappingApplication.class, args);
	   
	}

	@Override
	public void run(String... args) throws Exception {
		
//		Employee emp = new Employee();
//		emp.setFullName("ram");
//		emp.setMb(mb);
//		
//		Mobile mb = new Mobile();
//		mb.setMobileName("Nokiasa");
//		mb.setEmp(emp);
//		mr.save(mb);
//		er.save(emp);
		
//		Employee em= er.findById(1).get();
//		System.out.println(em.getMb().getMobileName());
//		
//		System.out.println("Runnnnnnn");
		
		
//		Employee ep = new Employee();
//		ep.setFullName("hello");
//		er.save(ep);
//		
//		Mobile mb = new Mobile();
//		mb.setMobileName("asus");
//		mb.setEmp(ep);
//		mr.save(mb);
//		System.out.println("success");
//		Employee ep= er.findById(1).get();
//		System.out.println(ep.getFullName());
//		System.out.println(ep.getMb().getMobileName());
//		Mobile mb= mr.findById(1).get();
//		
//		System.out.println(mb.getEmp().getFullName());
		
//		Employee ep = new Employee();
//		ep.setFullName("ram");
//		
//		
//		Address ad1= new Address();
//		ad1.setCity("abc");
//		ad1.setAdType("job address");
//		ad1.setEm(ep);
//		
//		Address add2 = new Address();
//		add2.setCity("xyz");
//		add2.setAdType("current");
//		add2.setEm(ep);
//		
//		Address ad3 = new Address();
//		ad3.setCity("wxyz");
//		ad3.setAdType("Home");
//		ad3.setEm(ep);
//		
//		
////		er.save(ep);
////		ar.save(ad1);
////		ar.save(add2);
////		ar.save(ad3);
////		System.out.println("success");
////		Address ao= ar.findById(2).get();
////		System.out.println(ao.getEm().getFullName());
//		
////	 Employee ee = er.findById(3).get();
////	  ee.getAddress().forEach(e->System.out.println(e));
//	 
//		Product pd1 = new Product();
//		pd1.setName("samsung");
//		Product pd2 = new Product();
//		pd2.setName("Boxdj");
//		Product pd3 = new Product();
//		pd3.setName("sampoo");
//		
//		Category ct1 = new Category();
//		ct1.setName("electronics");
//		
//		Category ct2 = new Category();
//		ct2.setName("Speekers");
//		
//		ct1.getPd().add(pd1);
//		ct1.getPd().add(pd2);
//		
//		ct2.getPd().add(pd2);
//		
//		pd1.getCat().add(ct1);
//		pd2.getCat().add(ct1);
//		
//		pd2.getCat().add(ct2);
//		
//		
//		pr.save(pd1);
//		pr.save(pd2);
//		pr.save(pd3);
//		
//		cr.save(ct1);
//		cr.save(ct2);
//	
//		Category ca= cr.findById(4).get();
//		ca.getPd().forEach(s->System.out.println(s.getName()));
		
		
//		Student st1 = new Student();
//		st1.setName("ram");
//	  sr.save(st1);
//	  
//	  StuAddress sa1 = new StuAddress();
//	  sa1.setCity("Delhi");
//	  sa1.setStu(st1);
//	  sar.save(sa1);
//	  
//	  StuAddress sa2 = new StuAddress();
//	  sa2.setCity("bangalore");
//	  sa2.setStu(st1);
//	  sar.save(sa2);
		
		Student st1 = new Student();
		st1.setName("sankha");
		Student st2 = new Student();
		st2.setName("ram");
		
		
		StuAddress sa1 = new StuAddress();
		sa1.setCity("banga");
		sa1.getStu().add(st1);
		sa1.getStu().add(st2);
		
		st1.getLl().add(sa1);
		st2.getLl().add(sa1);
		
		sr.save(st1);
		sr.save(st2);
		
		sar.save(sa1);
		
		
		
		
	  System.out.println("save");
		
		
		
	}

	
	
}
