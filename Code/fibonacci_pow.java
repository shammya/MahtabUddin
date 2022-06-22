public class MyClass {
    public static void main(String args[]) {
      int x=10;
      int n=5;
      //int z=x+y;

      System.out.println("10 ^ 5 is = " + pow(x,n));
    }
    
    public static int pow(int x,int n){
        
        if(n==1)
            return x;
        else
            return x * pow(x,n-1);
    }
    
    public static int fib(int n){
        
        if(n<=1)
            return 1;
        else
            return fib(n-1)+fib(n-2);
    }
}