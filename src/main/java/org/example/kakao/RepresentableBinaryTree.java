package org.example.kakao;

import java.util.Arrays;

public class RepresentableBinaryTree {
    public int[] solution(long[] numbers) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            String binary = Long.toBinaryString(numbers[i]);

            // 트리 구조에 맞게 앞에 0을 채워서 2^k - 1 길이로 맞추기
            int treeLength = getTreeLength(binary.length());
            int zeroPad = treeLength - binary.length();
            String padded = "0".repeat(zeroPad) + binary;

            answer[i] = isValid(padded) ? 1 : 0;
        }
        return answer;
    }

    // 트리 유효성 검사 (루트가 0인데 자식에 1이 있으면 false)
    private boolean isValid(String bin) {
        return check(bin);
    }

    private boolean check(String bin) {
        if (bin.length() == 1) return true;

        int mid = bin.length() / 2;
        char root = bin.charAt(mid);

        String left = bin.substring(0, mid);
        String right = bin.substring(mid + 1);

        if (root == '0') {
            if (hasOne(left) || hasOne(right)) return false;
        }

        return check(left) && check(right);
    }

    private boolean hasOne(String s) {
        return s.contains("1");
    }

    // 이진트리 구조의 노드 수: 2^k - 1 이상으로 맞춤
    private int getTreeLength(int len) {
        int h = 0;
        while ((1 << h) - 1 < len) {
            h++;
        }
        return (1 << h) - 1;
    }
}
//numbers	result
//[7, 42, 5]	[1, 1, 0]
//[63, 111, 95]	[1, 1, 0]

//111
//101