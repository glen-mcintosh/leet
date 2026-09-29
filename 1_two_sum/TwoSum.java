import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {

      HashMap<Integer, Integer> map = new HashMap<>();

      for (int i = 0; i < nums.length; i++) {
        int needed = target - nums[i];

        if (map.containsKey(needed)) {
          return new int[] {map.get(needed), i};
        } else {
          map.put(nums[i], i);
        }
      }
      return null;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // int[] nums = {3,2,4}; 
        // int target = 6;

        // int[] nums = {3,3};
        // int target = 6;

        int[] result = solution.twoSum(nums, target);

        System.out.println(java.util.Arrays.toString(result));
    }
}


//  public int[] twoSum(int[] nums, int target) {

//       for (int i = 0; i < nums.length; i++) {
//         for (int j = i + 1; j < nums.length; j++) {
//           if (nums[i] + nums[j] == target){
//             return new int [] {i, j};
//           } 
//         }
//       }
//       return null;
//     }