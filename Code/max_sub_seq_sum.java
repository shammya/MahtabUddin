public class MyClass {
    public static void main(String args[]) {
      int x=10;
      int y=25;
      int z=x+y;
    
      int[] a = {-1,-2,-5,-4,-9};
      System.out.println("maximum subsequence sum of array is (iterative) :  " + maxSubSeqSum(a));
      System.out.println("maximum subsequence sum of array is (recursive):  " + maxSubSeqSum(a,0,a.length-1));
    }
    
    
    // iterative solution
    public static int maxSubSeqSum(int[] a){
        int sum =0,mx = -1000000;
        for(int i=0;i<a.length;i++){
            mx = max(mx,a[i]);
            if(sum+a[i]>sum)
                sum+=a[i];
        }
        if(mx<0)
            return mx;
        return sum;
    }
    
    // recursive solution
    public static int maxSubSeqSum(int[] a,int l,int r){
        //base case where to stop
        //if the array becomes 1 element
        if(l==r){
            //if(a[l]>0)
                return a[l];
            //return 0;
        }
        
        int m = (l+r)/2;
        int leftSum = maxSubSeqSum(a,l,m);
        int rightSum = maxSubSeqSum(a,m+1,r);
        int sum=0;
        
        if(leftSum <0 && rightSum <0)
            return max(leftSum,rightSum);
         if(leftSum >0)
            sum+=leftSum;
         if(rightSum >0)
            sum+=rightSum;
            
        return sum;
    }
    
    
    
    public static int max(int a,int b){
        if(a>=b)
            return a;
        else
            return b;
    }
}