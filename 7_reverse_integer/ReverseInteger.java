class Solution {
    public int reverse(int x) {

        int num = 0;


        int digit = 0;


        while (x != 0) {

            digit = x % 10;

            if (num > Integer.MAX_VALUE / 10) return 0;
            if (num < Integer.MIN_VALUE / 10) return 0;

            num = num * 10 + digit;
            
            x /= 10;
        }

        return num;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.reverse(1463847412));           // 321
        // System.out.println(solution.reverse(-123));            // -321
        // System.out.println(solution.reverse(120));          // 21
        // System.out.println(solution.reverse(0));            // 0
        // System.out.println(solution.reverse(9));            // 9
        // System.out.println(solution.reverse(1000));         // 1
        // System.out.println(solution.reverse(1534236469));   // 0 (overflow)
        // System.out.println(solution.reverse(-2147483412));  // -2143847412
    }
}