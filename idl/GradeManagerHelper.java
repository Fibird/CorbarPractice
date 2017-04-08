
/**
* GradeManagerHelper.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从DataService.idl
* 2017年4月8日 星期六 下午02时37分22秒 CST
*/

abstract public class GradeManagerHelper
{
  private static String  _id = "IDL:GradeManager:1.0";

  public static void insert (org.omg.CORBA.Any a, GradeManager that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static GradeManager extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (GradeManagerHelper.id (), "GradeManager");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static GradeManager read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_GradeManagerStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, GradeManager value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static GradeManager narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof GradeManager)
      return (GradeManager)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _GradeManagerStub stub = new _GradeManagerStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static GradeManager unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof GradeManager)
      return (GradeManager)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _GradeManagerStub stub = new _GradeManagerStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
