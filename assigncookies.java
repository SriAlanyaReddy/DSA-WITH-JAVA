import java.util.Arrays;
import java.util.Scanner;

public class assigncookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0; // Pointer for cookies
        int j = 0; // Pointer for children

        while (i < s.length && j < g.length) {
            if (s[i] >= g[j]) {
                j++; // Cookie satisfies the current child
            }
            i++; // Move to the next cookie
        }

        return j; // Number of content children
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read size of the greed array
        System.out.println("Enter the number of children:");
        int numChildren = scanner.nextInt();
        int[] g = new int[numChildren];

        // Read greed factors
        System.out.println("Enter the greed factors of the children:");
        for (int i = 0; i < numChildren; i++) {
            g[i] = scanner.nextInt();
        }

        // Read size of the cookies array
        System.out.println("Enter the number of cookies:");
        int numCookies = scanner.nextInt();
        int[] s = new int[numCookies];

        // Read cookie sizes
        System.out.println("Enter the sizes of the cookies:");
        for (int i = 0; i < numCookies; i++) {
            s[i] = scanner.nextInt();
        }

        // Create an instance of assigncookies and call the method
        assigncookies solution = new assigncookies();
        int result = solution.findContentChildren(g, s);

        // Output the result
        System.out.println("Number of content children: " + result);

        // Close the scanner
        scanner.close();
    }
}
//Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie.
//
//Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with; and each cookie j has a size s[j]. If s[j] >= g[i], we can assign the cookie j to the child i, and the child i will be content. Your goal is to maximize the number of your content children and output the maximum number.
//
//
//
//Example 1:
//
//Input: g = [1,2,3], s = [1,1]
//Output: 1
//Explanation: You have 3 children and 2 cookies. The greed factors of 3 children are 1, 2, 3.
//And even though you have 2 cookies, since their size is both 1, you could only make the child whose greed factor is 1 content.
//You need to output 1.
//Example 2:
//
//Input: g = [1,2], s = [1,2,3]
//Output: 2
//Explanation: You have 2 children and 3 cookies. The greed factors of 2 children are 1, 2.
//You have 3 cookies and their sizes are big enough to gratify all of the children,
//You need to output 2.
//
//
//Constraints:
//
//1 <= g.length <= 3 * 104
//0 <= s.length <= 3 * 104
//1 <= g[i], s[j] <= 231 - 1