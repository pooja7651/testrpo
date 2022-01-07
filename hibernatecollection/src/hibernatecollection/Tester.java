package hibernatecollection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.*;
public class Tester {

	public static void main(String[] args) {
System.out.println("1");
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		System.out.println("2");		
SessionFactory sf=cfg.buildSessionFactory();
Session session=sf.openSession();
Transaction transaction=session.beginTransaction();

ArrayList<String>  arrayList=new ArrayList<String>();
arrayList.add("B.");
arrayList.add("M");
arrayList.add("12th");
	
//ArrayList<String>  arrayList1=new ArrayList<String>();
//arrayList1.add("xyzz");
//arrayList1.add("abcz");

Students obj=new Students();
obj.setName("Pooja");
obj.setRecord(arrayList);
session.persist(obj);
//Students obj1=new Students();
//obj1.setName("Java");
//obj1.setRecord(arrayList1);
//session.persist(obj1);

transaction.commit();
System.out.println("Success");
	
	}

}
