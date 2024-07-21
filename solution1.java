import java.util.ArrayList;
import java.util.List;
///500. Keyboard Row
//Solved
//Easy
//Topics
//Companies
//Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.
//
//In the American keyboard:
//
//the first row consists of the characters "qwertyuiop",
//the second row consists of the characters "asdfghjkl", and
//the third row consists of the characters "zxcvbnm".
class Solution {
    public String[] findWords(String[] words) {
        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl";
        String s3 = "zxcvbnm";

        ArrayList<String> stringList = new ArrayList<>();

        for (String word : words) {
            if (searchLetter(s1, word.toLowerCase()) ||
                    searchLetter(s2, word.toLowerCase()) ||
                    searchLetter(s3, word.toLowerCase())) {
                stringList.add(word);
            }
        }

        return stringList.toArray(new String[0]);
    }

    public boolean searchLetter(String row, String word) {
        for (char c : word.toCharArray()) {
            if (row.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        String[] result = solution.findWords(words);

        for (String word : result) {
            System.out.println(word);
        }
    }
}
