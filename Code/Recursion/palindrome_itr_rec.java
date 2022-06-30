public class MyClass {
    public static void main(String args[]) {
      int x=10;
      int y=25;
      int z=x+y;

      System.out.println("recursive : " + isPalindrome("abcbax"));
      System.out.println("iterative : " + isPalindromeItr("abcbax"));
    }
    
    public static boolean isPalindrome(String s) {
    return isPalindrome(s, 0);
    }
    private static boolean isPalindrome(String s, int index) {
        if (index == s.length() / 2)
            return true;
        if (s.charAt(index) == s.charAt(s.length() - 1 - index))
            return isPalindrome(s, index + 1);
        return false;
    }
    
    private static boolean isPalindromeItr(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }
        return true;
    }
}