
/**
* TableListHolder.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从DataService.idl
* 2017年4月7日 星期五 下午04时52分01秒 CST
*/

public final class TableListHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public TableListHolder ()
  {
  }

  public TableListHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = TableListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    TableListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return TableListHelper.type ();
  }

}
