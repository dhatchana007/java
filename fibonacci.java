Fibonacci series
Next number is sum of previous two number
eg;
0 1 1 2 3 5 8 13 etc.
  
  First 10 numbers in fibonacci series
  
  class Fibonacciseries
  {
    public static void main(String[] args)
    {
      int f=-1;
      int s=1;
      int t=0;
      int i=1;
      while(i<=10)
      {
        t=f+s;
        f=s;
        s=t;
        System.out.println(t);
        i++;
      }
    }
  }
        
