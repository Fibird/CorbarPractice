package cc.chaoyangliu.corbar.client;


/**
* DataServiceHelper.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从DataService.idl
* 2017年4月8日 星期六 下午02时46分34秒 CST
*/

abstract public class DataServiceHelper
{
  private static String  _id = "IDL:DataService:1.0";

  public static void insert (org.omg.CORBA.Any a, DataService that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static DataService extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (DataServiceHelper.id (), "DataService");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static DataService read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_DataServiceStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, DataService value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static DataService narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof DataService)
      return (DataService)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _DataServiceStub stub = new _DataServiceStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static DataService unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof DataService)
      return (DataService)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _DataServiceStub stub = new _DataServiceStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
