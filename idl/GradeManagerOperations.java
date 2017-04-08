
/**
* GradeManagerOperations.java .
* ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
* ��DataService.idl
* 2017��4��8�� ������ ����02ʱ37��22�� CST
*/

public interface GradeManagerOperations 
{
  boolean connDataBase (String usr, String pwd, String dbn);
  boolean createTable (String tn);
  int queryGrade (String Itable, String Iid);
  boolean addGrade (String Itable, String Iid, String Iname, int Igrade);
  String[] showTables ();
  void free ();
} // interface GradeManagerOperations
