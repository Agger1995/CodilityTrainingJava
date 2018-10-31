/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codility;

import java.util.Arrays;

/**
 *
 * @author chris
 */
public class Solution1 {

    /**
     * Missing integer
     *
     * @param A
     * @return
     */
    public int solution(int[] A) {

        Arrays.sort(A);
        // Edge cases
        if (A[0] > 1) {
            return 1;
        }
        if (1 > A[A.length - 1]) {
            return 1;
        }

        for (int i = 1; i <= A.length; i++) {
            if (this.contains(A, i)) {
                continue;
            }
            return i;
        }
        return A.length;
    }

    private boolean contains(int[] arr, int i) {
        for (int a : arr) {
            if (a < 0) {
                continue;
            }
            if (i == a) {
                return true;
            }
        }
        return false;
    }

    /**
     * Not done
     *
     * @param A
     * @return
     */
    public int solution1(int[] A) {
        // Edge cases
        if (A[0] > 1) {
            return 1;
        }
        if (1 > A[A.length - 1]) {
            return 1;
        }

        for (int i = 0; i < A.length - 1; i++) {

        }
        return 0;
    }

    public int permMissingElem(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (A[i] != i + 1) {
                return i + 1;
            }
        }
        return A.length + 1;
    }

    public int frogJmp(int X, int Y, int D) {
        if (X == Y) {
            return 0;
        }
        return (int) Math.ceil((double) (Y - X) / D);
    }

    public int tapeEquilibrium(int[] A) {
        int sumA = 0, sumB = 0, min = Integer.MAX_VALUE;
        // Left sum
        sumA += A[0];
        // Right sum
        for (int i = 1; i < A.length; i++) {
            sumB += A[i];
        }
        // With each iteration, we deduct from sumB and add to sumA
        // Find if the new is a new min, set it if it is. 
        // Return min.
        for (int i = 1; i < A.length; i++) {
            int tmp = Math.abs(sumA - sumB);
            if (tmp < min) {
                min = tmp;
            }
            sumA += A[i];
            sumB -= A[i];
        }
        return min;
    }

    /**
     * Permutation array is an array which goes from 1..N, uninterrupted.
     *
     * @param A
     * @return
     */
    public int permutation(int[] A) {
        Arrays.sort(A);
        if ((A.length == 1 && A[0] != 1) || A[0] < 0) {
            return 0;
        }
        for (int i = 0; i < A.length; i++) {
            if ((i + 1) != A[i]) {
                return 0;
            }
        }
        return 1;
    }

    public int frogRiverOne(int X, int[] A) {
        if (X < 1 || X > 100000 || A.length == 0 || A.length > 100000 || A.length < X) {
            return -1;
        }
        if (A[0] == X && A.length == 1) {
            return 0;
        }
        boolean[] leaves = new boolean[X + 1];
        for (int i = 0; i < A.length; i++) {
            if (!leaves[A[i]]) {
                leaves[A[i]] = true;
                X--;
            }
            if (X == 0) {
                return i;
            }
        }
        return -1;
    }

    /**
     *
     * @param N = 0
     * @param A = operations
     * @return
     */
    public int[] counters(int N, int[] A) {
        int setMax = 2, currMax = 3;
        int[] counters = new int[N];
        for (int i = 0; i < A.length; i++) {
            // Increment
            if (1 <= A[i] && A[i] <= N) {
                counters[A[i] - 1] = counters[A[i] - 1] + 1;
            } else if (A[i] == N + 1) {
                // set all counters to max value of any counter
                // Find max counter
                // set setMax = max counter

            }
        }
        if (setMax != 0) {
            for (int i = 0; i < counters.length; i++) {
                if (currMax == i) {
                    continue;
                }
                if (counters[i] == 0) {
                    counters[i] = setMax;
                } else {
                    counters[i] += setMax;
                }
            }
        }
        return counters;
    }

}
