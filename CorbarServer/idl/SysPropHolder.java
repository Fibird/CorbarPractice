
/**
* SysPropHolder.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从DataService.idl
* 2017年4月7日 星期五 下午04时52分01秒 CST
*/

public final class SysPropHolder implements org.omg.CORBA.portable.Streamable
{
  public SysProp value = null;

  public SysPropHolder ()
  {
  }

  public SysPropHolder (SysProp initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = SysPropHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    SysPropHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return SysPropHelper.type ();
  }

}
