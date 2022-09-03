class Student
{
  public static void main(String[] args)
  {
    Student s=new Student();
    s.study();
  }
  public void study()
  {
    System.out.println("go to school study well");
  }
}

class  Graduate extends Student //extends is a keyword inheritance 
{
  public static void main(String[] args)
  {
    Graduate s=new Graduate();
    s.project();  
    s.study();         //Graduate also access in student class also using extends keyword
  }
  public void project()
  {
    System.out.println("doing final year project");
  }
}

class Javadeveloper extends Graduate
{
  public static void main(String[] args)
  {
    Javadeveloper s=new Javadeveloper();
    s.searchjob();
    s.study();
    s.project();
  }
  public void searchjob()
  {
    System.out.println("looking for mnc company");
  }
}
