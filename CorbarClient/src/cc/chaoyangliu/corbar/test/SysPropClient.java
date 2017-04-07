package cc.chaoyangliu.corbar.test;
import org.omg.CosNaming.*;

import cc.chaoyangliu.corbar.client.SysProp;
import cc.chaoyangliu.corbar.client.SysPropHelper;

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
        	

            //����һ�����õ�����һ��NamingContext���󣬲���SysProp����
        	objRef = orb.string_to_object(ref);
        	syspropRef = SysPropHelper.narrow(objRef);


        	/*
        	objRef = orb.resolve_initial_references("NameService");
        	System.out.println(orb.object_to_string(objRef));
        	NamingContext ncRef = NamingContextHelper.narrow(objRef);
        	
        	NameComponent nc =new NameComponent("SysProp","");
        	
        	NameComponent path[] = {nc};

        	syspropRef = SysPropHelper.narrow(ncRef.resolve(path));
            */
        	
        	if (args.length>1)
        	{
        	  SetInfo=args[1];
        	}
        	else
        	{
        	  SetInfo="java.home";
        	}

        	
        	System.out.println("��ʼ����");
        	
        	boolean isConnected = syspropRef.connDataBase("root", "root", "rmijdbc");
        	
        	if (isConnected) {
        		System.out.println("Connection Success!");
        	}
        	        	
        }catch(Exception e)
        {
        	e.printStackTrace();
        }
	}

}
