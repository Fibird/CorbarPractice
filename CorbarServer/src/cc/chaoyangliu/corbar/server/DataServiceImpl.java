/**
 * 
 */
package cc.chaoyangliu.corbar.server;
import java.util.ArrayList;

import org.omg.CORBA.*;
import org.omg.PortableServer.*;
import org.omg.PortableServer.POA;
/**
 * @author bird
 *
 */
public class DataServiceImpl extends DataServicePOA {
	private ORB orb;
	private DBManager dbm;
	/**
	 * 
	 */
	public DataServiceImpl() {
		// TODO Auto-generated constructor stub
		super();
		dbm = new DBManager();
	}
	
	public void setOrb(ORB orb_val)
	{
	   this.orb = orb_val;	
	}
	/* (non-Javadoc)
	 * @see cc.chaoyangliu.corbar.server.DataServiceOperations#connDataBase(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public boolean connDataBase(String usr, String pwd, String dbn) {
		// TODO Auto-generated method stub
		return dbm.connDataBase(usr, pwd, dbn);	
	}

	/* (non-Javadoc)
	 * @see cc.chaoyangliu.corbar.server.DataServiceOperations#createTable(java.lang.String)
	 */
	@Override
	public boolean createTable(String tn) {
		// TODO Auto-generated method stub
		return dbm.createTable(tn);
	}

	/* (non-Javadoc)
	 * @see cc.chaoyangliu.corbar.server.DataServiceOperations#queryGrade(java.lang.String, java.lang.String)
	 */
	@Override
	public int queryGrade(String Itable, String Iid) {
		// TODO Auto-generated method stub
		return dbm.queryGrade(Itable, Iid);
	}

	/* (non-Javadoc)
	 * @see cc.chaoyangliu.corbar.server.DataServiceOperations#addGrade(java.lang.String, java.lang.String, java.lang.String, int)
	 */
	@Override
	public boolean addGrade(String Itable, String Iid, String Iname, int Igrade) {
		// TODO Auto-generated method stub
		return dbm.addGrade(Itable, Iname, Iid, Igrade);
	}

	/* (non-Javadoc)
	 * @see cc.chaoyangliu.corbar.server.DataServiceOperations#showTables()
	 */
	@Override
	public String[] showTables() {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		a = dbm.getTables();
		int s = a.size();
		return (String [])a.toArray(new String[s]);
	}

	/* (non-Javadoc)
	 * @see cc.chaoyangliu.corbar.server.DataServiceOperations#free()
	 */
	@Override
	public void free() {
		// TODO Auto-generated method stub
		dbm.disConn();
	}

}
