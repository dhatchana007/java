while-Repeated action when occurs using while
  
  class Nestedloop
  {
    public static void main(String[] args)
    {
      int count=5;
      while(count>=3)
      {
      int factorial=1;
      int no=1;
      while(no<=count)
      {
        factorial=factorial*no;
        no++;
      }
      System.out.println(factorial);
        count--;
    }
  }
}
       
