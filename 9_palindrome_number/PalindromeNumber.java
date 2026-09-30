// import java.util.ArrayList;

class Solution {
    public boolean isPalindrome(int x) {

      if (x < 0) return false;

      int first = 0;
      int last = 0;

      int divisor = 1;

      while (x / divisor >= 10) {
        divisor *= 10;
      }

      while (divisor > 1) {

        first = x / divisor;
        last = x % 10;

        if (first != last) {

          return false;

        } else {
          x = (x % divisor) / 10;
          divisor /= 100;
        }
      }

      return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.isPalindrome(1000021));        // true
        // System.out.println(solution.isPalindrome(-121));       // false
        // System.out.println(solution.isPalindrome(10));         // false
        // System.out.println(solution.isPalindrome(0));          // true
        // System.out.println(solution.isPalindrome(7));          // true
        // System.out.println(solution.isPalindrome(1221));       // true
        // System.out.println(solution.isPalindrome(12321));      // true
        // System.out.println(solution.isPalindrome(12345));      // false
        // System.out.println(solution.isPalindrome(1001));       // true
        // System.out.println(solution.isPalindrome(100));        // false
        // System.out.println(solution.isPalindrome(2147447412)); // true
        // System.out.println(solution.isPalindrome(2147483647)); // false
    }
}



    // public boolean isPalindrome(int x) {
    //   ArrayList<Integer> list = new ArrayList<>();
        
    //   if (x < 0) {
    //     return false;
    //   }

    //   while (x > 0) {

    //     int digit = x % 10;

    //     list.add(digit);

    //     x /= 10;
    //   }

    //   int front = 0;
    //   int back = list.size() -1;
    //   while ( front < back) {
    //     if (list.get(front) != list.get(back)) {
    //       return false;
    //     } else {
    //       front++;
    //       back--;
    //     }
        
    //   }

    //   return true; 
    // }