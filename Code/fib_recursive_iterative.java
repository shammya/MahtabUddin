public class MyClass {
    public static int[] f = new int[100];
    public static void main(String args[]) {
      int x=10;
      int y=25;
      int z=x+y;

      System.out.println("5th fibonacci " + fibo(8));
       System.out.println("5th fibonacci " + fibo(7));
      fib(10);
      System.out.println("10th fibonacci " + f[10]);
      System.out.println("10th fibonacci " + f[7]);
    }
    
    public static void fib(int n){
        f[0]=1;
        f[1]=1;
        
        for(int i=2;i<=n;i++){
            f[i] = f[i-1] + f[i-2];
        }
    }
    
    public static int fibo (int n) {
        int z = 0;
        int z_1 = 1;
        int z_2 = 1;
        for (int i = 1; i<n; i++) {
        z = z_1 + z_2;
        z_2 = z_1;
        z_1 = z;
        }
    return z;
    }

}