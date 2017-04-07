
/**
* SysPropOperations.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从DataService.idl
* 2017年4月7日 星期五 下午04时52分01秒 CST
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
