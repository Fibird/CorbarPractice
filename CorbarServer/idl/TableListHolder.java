
/**
* TableListHolder.java .
* ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
* ��DataService.idl
* 2017��4��7�� ������ ����04ʱ52��01�� CST
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
