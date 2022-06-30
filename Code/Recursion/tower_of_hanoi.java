public class MyClass {
    public static void main(String args[]) {
      int x=10;
      int y=25;
      int z=x+y;

      //System.out.println("Sum of x+y = " + z);
      toh(3,'A','B','C');
    }
    
    public static void toh(int n,char p1,char p2,char p3){
        
        if(n==1){
            System.out.printf("move disk from %c to %c\n",p1,p3);
            return ;
        }
        
        toh(n-1,p1,p3,p2);
        toh(1,p1,p2,p3);
        toh(n-1,p2,p1,p3);
    }
}