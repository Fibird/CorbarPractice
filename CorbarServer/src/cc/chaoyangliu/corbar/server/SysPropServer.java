package cc.chaoyangliu.corbar.server;
import org.omg.CosNaming.*;

import java.util.ArrayList;

import org.omg.CORBA.*;
import org.omg.PortableServer.*;
import org.omg.PortableServer.POA;

//��д���Ӧ�ķ���һ��Ҫ�� _����ImplBase�̳У���ʵ����Ӧ�ķ���
class SysPropImpl extends SysPropPOA // ����ķ���ʵ��
{
	private ORB orb;
	private DBManager dbm;
	public SysPropImpl() {
		super();
		dbm = new DBManager();
	}
	public void setOrb(ORB orb_val)
	{
	   this.orb = orb_val;	
	}
	@Override
	public boolean connDataBase(String usr, String pwd, String dbn) {
		// TODO Auto-generated method stub	
		return dbm.connDataBase(usr, pwd, dbn);	
	}
	/* (non-Javadoc)
	 * @see cc.chaoyangliu.rmiprac.service.DataService#CreateTable()
	 */
	@Override
	public boolean createTable(String tn) {
		// TODO Auto-generated method stub
		return dbm.createTable(tn);
	}

	/* (non-Javadoc)
	 * @see cc.chaoyangliu.rmiprac.service.DataService#QueryGrade(java.lang.String)
	 */
	@Override
	public int queryGrade(String tn, String id) {
		// TODO Auto-generated method stub
		return dbm.queryGrade(tn, id);
	}

	/* (non-Javadoc)
	 * @see cc.chaoyangliu.rmiprac.service.DataService#addGrade(java.lang.String, java.lang.String, int)
	 */
	@Override
	public boolean addGrade(String tn, String n, String id, int g) {
		// TODO Auto-generated method stub
		return dbm.addGrade(tn, n, id, g);
	}

	/* (non-Javadoc)
	 * @see cc.chaoyangliu.rmiprac.service.DataService#free()
	 */
	@Override
	public void free() {
		// TODO Auto-generated method stub
		dbm.disConn();
	}

	@Override
	public String[] showTables() {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		a = dbm.getTables();
		int s = a.size();
		return (String [])a.toArray(new String[s]);
	}
}

public class SysPropServer // �𶯷���ĳ���
{
	public static void main(String args[]) {
		try{
		  System.out.println("�����ͳ�ʼ�� ORB ");
		 
		  ORB orb = ORB.init(args, null);
		  
		  POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
		  
		  rootpoa.the_POAManager().activate();

		  System.out.println("����������󲢽����� ORB ע�� ");
		  SysPropImpl sysProImpl = new SysPropImpl();
		
		  sysProImpl.setOrb(orb);
		  
		  //System.out.println(orb.object_to_string(sysProImpl));
		  
		  org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
		  NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
		  NameComponent[] path = {new NameComponent("SysProp", "")};
		  
		  org.omg.CORBA.Object ref = rootpoa.servant_to_reference(sysProImpl);
		  SysProp href = SysPropHelper.narrow(ref);
		  System.out.println(orb.object_to_string(href));
		 
		  System.out.println(ncRef.getClass().toString());
		  ncRef.rebind(path, href);
		  
		  System.out.println("SysPropServer ready and waiting ...");
		  
		  orb.run();
		  
		} catch (Exception e) {
			System.err.println("Error: " + e);
			e.printStackTrace(System.out);
		}
	}
}
