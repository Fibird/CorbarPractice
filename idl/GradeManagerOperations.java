
/**
* GradeManagerOperations.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从DataService.idl
* 2017年4月8日 星期六 下午02时37分22秒 CST
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
