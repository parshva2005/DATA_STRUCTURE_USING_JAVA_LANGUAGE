import java.util.*;

public class MaxHammingDistance {

    // Method to solve each test case
    private static void solveTestCase(int N, int[] A) {
        // Create a list of indices and sort based on values
        Integer[] indices = new Integer[N];
        for (int i = 0; i < N; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, (i1, i2) -> Integer.compare(A[i1], A[i2]));

        // Create the result array B
        int[] B = new int[N];

        // Fill B with A values, but rotated to maximize Hamming distance
        for (int i = 0; i < N; i++) {
            B[indices[i]] = A[indices[(i + 1) % N]];
        }

        // Calculate the Hamming distance
        int hammingDistance = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] != B[i]) {
                hammingDistance++;
            }
        }

        // Output the results
        System.out.println(hammingDistance);
        for (int i = 0; i < N; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); // Number of test cases
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt(); // Length of the array A
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt(); // Read the array A
            }

            // Solve the test case
            solveTestCase(N, A);
        }

        scanner.close();
    }
}

