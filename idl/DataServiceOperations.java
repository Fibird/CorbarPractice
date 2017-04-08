
/**
* DataServiceOperations.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从DataService.idl
* 2017年4月8日 星期六 下午02时46分34秒 CST
*/

public interface DataServiceOperations 
{
  boolean connDataBase (String usr, String pwd, String dbn);
  boolean createTable (String tn);
  int queryGrade (String Itable, String Iid);
  boolean addGrade (String Itable, String Iid, String Iname, int Igrade);
  String[] showTables ();
  void free ();
} // interface DataServiceOperations
