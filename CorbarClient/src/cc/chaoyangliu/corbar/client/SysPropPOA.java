package cc.chaoyangliu.corbar.client;
/**
* SysPropPOA.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从DataService.idl
* 2017年4月7日 星期五 下午04时52分01秒 CST
*/

public abstract class SysPropPOA extends org.omg.PortableServer.Servant
 implements SysPropOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("connDataBase", new java.lang.Integer (0));
    _methods.put ("createTable", new java.lang.Integer (1));
    _methods.put ("queryGrade", new java.lang.Integer (2));
    _methods.put ("addGrade", new java.lang.Integer (3));
    _methods.put ("showTables", new java.lang.Integer (4));
    _methods.put ("free", new java.lang.Integer (5));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // SysProp/connDataBase
       {
         String usr = in.read_string ();
         String pwd = in.read_string ();
         String dbn = in.read_string ();
         boolean $result = false;
         $result = this.connDataBase (usr, pwd, dbn);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // SysProp/createTable
       {
         String tn = in.read_string ();
         boolean $result = false;
         $result = this.createTable (tn);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 2:  // SysProp/queryGrade
       {
         String Itable = in.read_string ();
         String Iid = in.read_string ();
         int $result = (int)0;
         $result = this.queryGrade (Itable, Iid);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 3:  // SysProp/addGrade
       {
         String Itable = in.read_string ();
         String Iid = in.read_string ();
         String Iname = in.read_string ();
         int Igrade = in.read_long ();
         boolean $result = false;
         $result = this.addGrade (Itable, Iid, Iname, Igrade);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 4:  // SysProp/showTables
       {
         String $result[] = null;
         $result = this.showTables ();
         out = $rh.createReply();
         TableListHelper.write (out, $result);
         break;
       }

       case 5:  // SysProp/free
       {
         this.free ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:SysProp:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public SysProp _this() 
  {
    return SysPropHelper.narrow(
    super._this_object());
  }

  public SysProp _this(org.omg.CORBA.ORB orb) 
  {
    return SysPropHelper.narrow(
    super._this_object(orb));
  }


} // class SysPropPOA
