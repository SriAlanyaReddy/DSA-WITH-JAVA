import java.util.Arrays;
import java.util.Scanner;

public class cpuschedular {
    static int solve(int bt[]) {
        int totalWaitingTime = 0;
        int currentWaitingTime = 0;
        int n = bt.length;
        Arrays.sort(bt);

        for (int i = 0; i < n; i++) {
            totalWaitingTime += currentWaitingTime;
            currentWaitingTime += bt[i];
        }

        return totalWaitingTime / n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Number of processes
        int[] bt = new int[n];

        for (int i = 0; i < n; i++) {
            bt[i] = scanner.nextInt(); // Burst times
        }

        int result = solve(bt);
        System.out.println(result);
        scanner.close();
    }
}
