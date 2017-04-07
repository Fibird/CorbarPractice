
/**
* SysPropHolder.java .
* ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
* ��DataService.idl
* 2017��4��7�� ������ ����04ʱ52��01�� CST
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
