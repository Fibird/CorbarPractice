package cc.chaoyangliu.corbar.test;

import org.omg.CosNaming.*;

import cc.chaoyangliu.corbar.client.DataService;
import cc.chaoyangliu.corbar.client.DataServiceHelper;
import cc.chaoyangliu.corbar.util.Config;
import cc.chaoyangliu.corbar.util.Student;

import java.util.ArrayList;
import org.omg.CORBA.*;

public class DataServiceClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] ns = {"Mary", "Mike", "Tony"};
		String [] ids = {"201401", "201402", "201403"};
		String [] tbs = {"t1", "t2", "t3"};
		int [] gs = {98, 86, 78};
		int grade = 0;
		Config cfg = new Config("config/config.properties");
		String ref = cfg.getProperty("IOR");
		ArrayList<Student> ss = new ArrayList<Student>();
		for (int i = 0; i < 3; i++)
		{
			ss.add(new Student(ns[i], ids[i], gs[i]));
		}
		DataService dsRef = null;
		
		// initialize the ORB
		try {
			ORB orb = ORB.init (args, null);
			// Get Object reference from command-line argument
			org.omg.CORBA.Object object = orb.string_to_object(ref);
			dsRef = DataServiceHelper.narrow(object);
		} catch (SystemException ex) {
			System.err.println(ex);
		}
        
		System.out.println("---------Test of Creating Table---------");
		System.out.println("Connecting Remote DataBase...");
		if (dsRef.connDataBase("root", "root", "rmijdbc")) {
			System.out.println("Connection Success!");
		}
		System.out.println("---------Test of Creating Table---------");
		System.out.println("Creating...");
		if (dsRef.createTable("grade")) {
			System.out.println("Table Creation Sucess!\n");
		}
		
		System.out.println("---------Test of inserting Data---------");
		System.out.println("Inserting...");
		for (Student s : ss)
		{
			dsRef.addGrade("grade", s.getId(), s.getName(), s.getGrade());
		}	
		System.out.println("Insert these data:");
		for (Student s : ss)
			System.out.println(s);
		
		System.out.println();
		System.out.println("---------Test of Querying Data---------");
		System.out.println("Querying...");
		for (Student s : ss)
		{
			grade = dsRef.queryGrade("grade", s.getId());
			System.out.println("The grade of " + s.getId() + "is " + grade);
		}
		System.out.println("Data Query Success!\n");
		System.out.println("---------Test of showing tables---------");
		for (int i = 0; i < tbs.length; i++) {
			dsRef.createTable(tbs[i]);
		}
		String [] a = dsRef.showTables();

		for (int i = 0; i < a.length; i++) {
			System.out.println(i + " " + a[i]);
		}
		System.out.println("Showing Tables Success!\n");
		System.out.println("Disconnecting...");
		dsRef.free();	
		System.out.println("Nice! Everything is well!");
	}
}
