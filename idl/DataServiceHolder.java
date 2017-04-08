
/**
* DataServiceHolder.java .
* ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
* ��DataService.idl
* 2017��4��8�� ������ ����02ʱ46��34�� CST
*/

public final class DataServiceHolder implements org.omg.CORBA.portable.Streamable
{
  public DataService value = null;

  public DataServiceHolder ()
  {
  }

  public DataServiceHolder (DataService initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = DataServiceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    DataServiceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return DataServiceHelper.type ();
  }

}
