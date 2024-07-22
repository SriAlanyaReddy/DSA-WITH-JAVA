//You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

//Return true if you can reach the last index, or false otherwise.
import java.util.Scanner;
//55. Jump Game
//You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
//
//Return true if you can reach the last index, or false otherwise.
//
// 
class jump{
    public boolean canJump(int[] a) {
        int n = a.length;
        int max_i = 0; // Maximum index we can reach

        // Iterate through the array
        for (int i = 0; i < n; i++) {
            // If the current index is beyond the maximum reachable index, return false
            if (i > max_i) {
                return false;
            }
            // Update the maximum reachable index
            max_i = Math.max(max_i, i + a[i]);
        }

        // If we complete the loop, it means we can reach the end
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements in the array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] a = new int[n];

        // Read the elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        // Create an instance of Solution and call the canJump method
        jump solution = new jump();
        boolean result = solution.canJump(a);

        // Output the result
        if (result) {
            System.out.println("You can reach the last index.");
        } else {
            System.out.println("You cannot reach the last index.");
        }

        scanner.close();
    }
}

 
