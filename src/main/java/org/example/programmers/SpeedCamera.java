package org.example.programmers;

import java.util.Arrays;
import java.util.Comparator;

public class SpeedCamera {
    public int solution(int[][] routes){
        Arrays.sort(routes, Comparator.comparingInt(a -> a[1])); // 진출 시점 기준 정렬

        int cameraCount = 0;
        int cameraPos = Integer.MIN_VALUE;

        for (int[] route : routes) {
            int entry = route[0];
            int exit = route[1];

            // 현재 차량이 기존 카메라 위치를 지나지 않았다면 새 카메라 설치
            if (cameraPos < entry) {
                cameraCount++;
                cameraPos = exit; // 카메라를 이 차량의 진출 지점에 설치
            }
        }

        return cameraCount;
    }
}
