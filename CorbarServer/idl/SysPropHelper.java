
/**
* SysPropHelper.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从DataService.idl
* 2017年4月7日 星期五 下午04时52分01秒 CST
*/

abstract public class SysPropHelper
{
  private static String  _id = "IDL:SysProp:1.0";

  public static void insert (org.omg.CORBA.Any a, SysProp that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static SysProp extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (SysPropHelper.id (), "SysProp");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static SysProp read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_SysPropStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, SysProp value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static SysProp narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof SysProp)
      return (SysProp)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _SysPropStub stub = new _SysPropStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static SysProp unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof SysProp)
      return (SysProp)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _SysPropStub stub = new _SysPropStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
