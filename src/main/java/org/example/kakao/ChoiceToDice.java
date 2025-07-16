package org.example.kakao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChoiceToDice {

    static int n;
    static int[][] dice;
    static int maxWin = -1;
    static List<Integer> answer;

    public static int[] solution(int[][] diceInput) {
        n = diceInput.length;
        dice = diceInput;
        answer = new ArrayList<>();

        combination(0, new ArrayList<>(), new boolean[n]);

        return answer.stream().mapToInt(i -> i + 1).toArray(); // 주사위 번호는 1-based
    }

    // A가 고를 수 있는 주사위 조합 생성
    private static void combination(int idx, List<Integer> aList, boolean[] visited) {
        if (aList.size() == n / 2) {
            List<Integer> bList = new ArrayList<>();
            for (int i = 0; i < n; i++) if (!visited[i]) bList.add(i);
            simulate(aList, bList);
            return;
        }

        for (int i = idx; i < n; i++) {
            visited[i] = true;
            aList.add(i);
            combination(i + 1, aList, visited);
            visited[i] = false;
            aList.remove(aList.size() - 1);
        }
    }

    // A와 B의 조합으로 가능한 모든 주사위 합 생성 후 승률 계산
    private static void simulate(List<Integer> aList, List<Integer> bList) {
        List<Integer> aSums = getAllSums(aList);
        List<Integer> bSums = getAllSums(bList);
        Collections.sort(bSums);

        int win = 0;
        for (int a : aSums) {
            int count = lowerBound(bSums, a); // a보다 작은 b의 개수
            win += count;
        }

        if (win > maxWin) {
            maxWin = win;
            answer = new ArrayList<>(aList);
        }
    }

    // 주사위 조합으로 가능한 모든 합 계산
    private static List<Integer> getAllSums(List<Integer> indices) {
        List<Integer> sums = new ArrayList<>();
        dfsSum(indices, 0, 0, sums);
        return sums;
    }

    private static void dfsSum(List<Integer> indices, int depth, int sum, List<Integer> result) {
        if (depth == indices.size()) {
            result.add(sum);
            return;
        }

        int[] faces = dice[indices.get(depth)];
        for (int face : faces) {
            dfsSum(indices, depth + 1, sum + face, result);
        }
    }


    // lower bound: a보다 작은 수 개수 구하기
    private static int lowerBound(List<Integer> sortedList, int target) {
        int left = 0, right = sortedList.size();
        while (left < right) {
            int mid = (left + right) / 2;
            if (sortedList.get(mid) < target) left = mid + 1;
            else right = mid;
        }
        return left;
    }
}
