import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

class Solution {
    
    public List<String> letterCombinations(String digits) {

      HashMap<Character, String> map = new HashMap<>();

      map.put('2', "abc");
      map.put('3', "def");
      map.put('4', "ghi");
      map.put('5', "jkl");
      map.put('6', "mno");
      map.put('7', "pqrs");
      map.put('8', "tuv");
      map.put('9', "wxyz");

      ArrayList<String> combos = new ArrayList<>();
      combos.add("");

      for (int i = 0; i < digits.length(); i++) {
          String options = map.get(digits.charAt(i));

          ArrayList<String> nextCombos = new ArrayList<>();

          for (String combo : combos) {
              for (int j = 0; j < options.length(); j++) {
                  nextCombos.add(combo + options.charAt(j));
              }
          }

          combos = nextCombos;
      }

      return combos;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.letterCombinations("23"));
        // expected: [ad, ae, af, bd, be, bf, cd, ce, cf]

        System.out.println(solution.letterCombinations("2"));
        // expected: [a, b, c]

        System.out.println(solution.letterCombinations(""));
        // expected: []

        System.out.println(solution.letterCombinations("7"));
        // expected: [p, q, r, s]

        System.out.println(solution.letterCombinations("79"));
        // expected 16 combinations

        System.out.println(solution.letterCombinations("234"));
        // expected 27 combinations
    }
}



    // public String getLetters(char number) {

    //   String options = "";

    //   switch (number) {
    //     case '2':
    //       options = "abc";
    //       break;
    //     case '3':
    //       options = "def";
    //       break;
    //     case '4':
    //       options = "ghi";
    //       break;
    //     case '5':
    //       options = "jkl";
    //       break;
    //     case '6':
    //       options = "mno";
    //       break;
    //     case '7':
    //       options = "pqrs";
    //       break;
    //     case '8':
    //       options = "tuv";
    //       break;
    //     case '9':
    //       options = "wxyz";
    //       break;
    //     default:
    //       return null;
    //   }

    //   return options;
    // }


      // Abonding this. It works for two letter combos but to consider up to 4 will be gnarly 
      // ArrayList<String> list = new ArrayList<>();

      // for (int i = 0; i < digits.length(); i++ ) {

      //   String option = getLetters(digits.charAt(i));

      //   list.add(option);

      // }

      // ArrayList<String> comboList = new ArrayList<>();

      // // this is each string in list
      // for (int i = 0; i < list.size(); i++) {

      //   // this is for the string
      //   for (int j = 0; j < list.get(i).length(); j++){

      //       if (list.size() < 2 ) {
      //         comboList.add(String.valueOf(list.get(i).charAt(j)));
      //       }

      //     // this is for the next in the list of possible options
      //     for (int k = i + 1; k < list.size(); k++)

      //       // this is for the distributed options
      //       for (int l = 0; l < list.get(k).length(); l++) {

      //         // char[] charArray = {list.get(i).charAt(j), list.get(k).charAt(l)};
      //         // String option = new String(charArray);
      //         // comboList.add(option);

      //         for (int m = k + 1; k < list.size())

      //       }
      //   }
      // }
      // return comboList;