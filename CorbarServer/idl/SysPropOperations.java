
/**
* SysPropOperations.java .
* ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
* ��DataService.idl
* 2017��4��7�� ������ ����04ʱ52��01�� CST
*/

public interface SysPropOperations 
{
  boolean connDataBase (String usr, String pwd, String dbn);
  boolean createTable (String tn);
  int queryGrade (String Itable, String Iid);
  boolean addGrade (String Itable, String Iid, String Iname, int Igrade);
  String[] showTables ();
  void free ();
} // interface SysPropOperations
