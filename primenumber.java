What is Prime number
A number can be divided exactly only by itself and 1.
  eg: 4 is an divided by 2, so that is not prime number
  
  1.prime number programe
  
  public class Primenumber
  {
    public static void main(String[] args)
    {
      int no=10;
      boolean value=false;
      int i=2;
      while(i<no)
      {
        if(no%2==0)
        value=true;
        break;
      }
      i=i+1;
    
    if(value==true)
      System.out.println(no+"="+"this is not a prime number");
    else
      System.out.println(no+"="+"this is prime number");
    }
}

output;
10= this is not a prime number

2.1 to 20 prime numbers

public class primenumber1_20
{
  public static void main(String[] args)
  {
     public static void main(String[] args) {

  int num = 20, count;

  for (int i = 1; i <= num; i++) {
   count = 0;
   for (int j = 2; j <= i / 2; j++) {
    if (i % j == 0) {
     count++;
     break;
    }
   }

   if (count == 0) {
    System.out.println(i);
   }

  }
 }
output;
    
1
2
3
5
7
11
13
17
19
