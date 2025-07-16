package org.example.programmers;

import java.util.*;

public class TheBestCollection {
    public int[] solution(int n, int s) {
        if (s <n) return new int[]{-1};

        int[] result = new int[n];
        int base = s/n;
        int rem = s%n;

        for(int i=0; i<n; i++){
            result[i] = base + (i >= n-rem ? 1:0);
        }
        return result;
    }
}



//3 14 2
//4 4 4