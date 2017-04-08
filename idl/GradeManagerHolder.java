
/**
* GradeManagerHolder.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从DataService.idl
* 2017年4月8日 星期六 下午02时37分22秒 CST
*/

public final class GradeManagerHolder implements org.omg.CORBA.portable.Streamable
{
  public GradeManager value = null;

  public GradeManagerHolder ()
  {
  }

  public GradeManagerHolder (GradeManager initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = GradeManagerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    GradeManagerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return GradeManagerHelper.type ();
  }

}
