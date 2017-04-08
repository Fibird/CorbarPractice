
/**
* GradeManagerHolder.java .
* ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
* ��DataService.idl
* 2017��4��8�� ������ ����02ʱ37��22�� CST
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
