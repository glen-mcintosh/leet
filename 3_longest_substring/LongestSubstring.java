import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {

      HashSet<Character> set = new HashSet<>(); 

      int count = 0;
      int globalCount = 0;
      int left = 0;


      for (int right = 0; right < s.length(); right++) {

          while (set.contains(s.charAt(right))) {
              set.remove(s.charAt(left));
              left++;
          }

          set.add(s.charAt(right));

          int currentLength = right - left + 1;

          if (currentLength > globalCount) {
              globalCount = currentLength;
          }
      }

      return globalCount;
        
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(solution.lengthOfLongestSubstring("bbbbb"));
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));
        System.out.println(solution.lengthOfLongestSubstring(""));
    }
}



/// Good but we can do better 
    // public int lengthOfLongestSubstring(String s) {

    //   HashSet<Character> set = new HashSet<>(); 

    //   int count = 0;
    //   int globalCount = 0;
    //   int left = 0;


    //   for (int right = 0; right < s.length(); right++) {

    //       while (set.contains(s.charAt(right))) {
    //           set.remove(s.charAt(left));
    //           left++;
    //       }

    //       set.add(s.charAt(right));

    //       int currentLength = right - left + 1;

    //       if (currentLength > globalCount) {
    //           globalCount = currentLength;
    //       }
    //   }

    //   return globalCount;
        
    // }

// This works but is O{^3} and fails due to time constraint
    // public int lengthOfLongestSubstring(String s) {

    //   int total_length = 0;
    //   int count = 1;

    //   boolean dup_found = false;

    //   for (int i = 0; i < s.length(); i++) {
    //     count = 1;
    //     dup_found = false;
    //     for (int j = i + 1; j < s.length(); j++) {
    //       dup_found = false;
    //       if (s.charAt(i) != s.charAt(j)){
    //         for (int k = i; k < j; k++){
    //           if (s.charAt(k) == s.charAt(j)) {
    //             dup_found = true;
    //             break;
    //           }
    //         }
    //         if (!dup_found) {
    //           count++;
    //         } else {
    //           break;
    //         }
    //       } else {
    //         break;
    //       }
    //     }
    //     if (count > total_length) {
    //       total_length = count;
    //     }
    //   }
    //   return total_length;
    // }

/// Accepted but not efficient
    // public int lengthOfLongestSubstring(String s) {

    //   int total_length = 0;
    //   int count = 1;

    //   boolean dup_found = false;

    //   for (int i = 0; i < s.length(); i++) {
    //     count = 1;
    //     HashSet<Character> set = new HashSet<>();
    //     for (int j = i + 1; j < s.length(); j++) {
    //       dup_found = false;
    //       if (s.charAt(i) != s.charAt(j)){
    //         if (set.contains(s.charAt(j))) {
    //           break;
    //         } else {
    //           count++;
    //           set.add(s.charAt(j));
    //         }
    //       } else {
    //         break;
    //       }
    //     }
    //     if (count > total_length) {
    //       total_length = count;
    //     }
    //   }
    //   return total_length;
    // }
