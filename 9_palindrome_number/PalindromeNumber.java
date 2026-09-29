import java.util.ArrayList;

class Solution {
    public boolean isPalindrome(int x) {

      int front = 0;
      int back = 0;

      ArrayList<Integer> list = new ArrayList<>();
        
      if (x < 0) {
        return false;
      }

      while (x > 10) {

        x /= 10;

        x%=10;

        list.add(x%10);


      }

      System.out.println(list);

      return true;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.isPalindrome(121));        // true
        System.out.println(solution.isPalindrome(-121));       // false
        System.out.println(solution.isPalindrome(10));         // false
        System.out.println(solution.isPalindrome(0));          // true
        System.out.println(solution.isPalindrome(7));          // true
        System.out.println(solution.isPalindrome(1221));       // true
        System.out.println(solution.isPalindrome(12321));      // true
        System.out.println(solution.isPalindrome(12345));      // false
        System.out.println(solution.isPalindrome(1001));       // true
        System.out.println(solution.isPalindrome(100));        // false
        System.out.println(solution.isPalindrome(2147447412)); // true
        System.out.println(solution.isPalindrome(2147483647)); // false
    }
}