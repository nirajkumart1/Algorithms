/**
  print 1 to N

  time complexity: O(n)
  space complexity: O(n)
*/

class Print1ToN {
   // using recursion
   public static void print1ToN(int n) {
     // base case
     if (n == 0) {
       return;
     }
     else
     { 
     print1ToN(n - 1);
     }
     
     System.out.println(n);
     }
 
    public static void main(String[] args) {
      print1ToN(6);
   }
} 
       