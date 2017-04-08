package cc.chaoyangliu.corbar.server;

import org.omg.CORBA.ORB;
import org.omg.CosNaming.*;
import org.omg.PortableServer.*;

public class StartServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			  System.out.println("Create and Init Orb.");
			  // Init ORB
			  ORB orb = ORB.init(args, null);
			  // Init POA
			  POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));  
			  rootpoa.the_POAManager().activate();

			  System.out.println("Create a DataService Object and Register it in ORB");
			  DataServiceImpl dsImpl = new DataServiceImpl();
			
			  dsImpl.setOrb(orb);
			  
			  //System.out.println(orb.object_to_string(sysProImpl));
			  
			  org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
			  NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
			  NameComponent[] path = {new NameComponent("SysProp", "")};
			  
			  // Servant to Reference
			  org.omg.CORBA.Object ref = rootpoa.servant_to_reference(dsImpl);
			  DataService href = DataServiceHelper.narrow(ref);
			  // Print stringified reference
			  System.out.println(orb.object_to_string(href));
			 
			  System.out.println(ncRef.getClass().toString());
			  ncRef.rebind(path, href);
			  
			  System.out.println("DataServer ready and waiting ...");
			  
			  orb.run();
			  
			} catch (Exception e) {
				System.err.println("Error: " + e);
				e.printStackTrace(System.out);
			}
	}

}
