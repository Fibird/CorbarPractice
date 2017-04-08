package cc.chaoyangliu.corbar.test;
import org.omg.CosNaming.*;

import cc.chaoyangliu.corbar.client.SysProp;
import cc.chaoyangliu.corbar.client.SysPropHelper;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.omg.CORBA.*;
public class SysPropClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	String SetInfo, ReturnInfo, ref;
        	org.omg.CORBA.Object objRef;
        	SysProp syspropRef;
        	// Initializing the ORB
        	ORB orb = ORB.init(args, null);
        	if (args.length >= 1)
        	{
        		ref = args[0];
        		//System.out.println(ref);
        	}
        	else
        	{
        	   System.out.println("aaaaaaaaaaaaaaaaaa");
        	   return ;
        	}
        	

            //下面一条语句得到的是一个NamingContext对象，并非SysProp对象
        	objRef = orb.string_to_object(ref);
        	syspropRef = SysPropHelper.narrow(objRef);
        	
        	System.out.println("开始调用");
        	
        	boolean isConnected = syspropRef.connDataBase("root", "root", "rmijdbc");
        	
        	if (isConnected) {
        		System.out.println("Connection Success!");
        	}
        	
        	boolean isCreated = syspropRef.createTable("grade");
        	if (isCreated) {
        		System.out.println("Table Creation Success!");
        	}
        	boolean isAdded = syspropRef.addGrade("grade", "2014012537", "Chaoyang", 98);
        	if (isAdded) {
        		System.out.println("Student Add Success!");
        	}
        	int g = syspropRef.queryGrade("grade", "2014012537");
        	if (g != -1) {
        		System.out.println("Query Success and grade is " + g);
        	}
        	String [] a = syspropRef.showTables();
        	
    		for (int i = 0; i < a.length; i++) {
    			//System.out.println(i + " " + a.get(i));
    			System.out.println("Table " + i + ": " + a[i]);
    		}
    		
    		syspropRef.free();		
        }catch(Exception e)
        {
        	e.printStackTrace();
        }
	}

}
