package org.example.programmers;

import java.util.LinkedList;
import java.util.Queue;

public class WordTransformation {

    public int solution(String begin, String target, String[] words) {
        boolean[] visited = new boolean[words.length];
        Queue<Node> queue = new LinkedList<>();

        queue.offer(new Node(begin, 0));

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.word.equals(target)) {
                return current.depth;
            }

            for (int i = 0; i < words.length; i++) {
                if (!visited[i] && isOneLetterDiff(current.word, words[i])) {
                    visited[i] = true;
                    queue.offer(new Node(words[i], current.depth + 1));
                }
            }
        }

        return 0;
    }

    private boolean isOneLetterDiff(String a, String b) {
        int diff = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) diff++;
            if (diff > 1) return false;
        }
        return diff == 1;
    }

    static class Node {
        String word;
        int depth;

        Node(String word, int depth) {
            this.word = word;
            this.depth = depth;
        }
    }
}

//1. 한 번에 한 개의 알파벳만 바꿀 수 있습니다. 2. words에 있는 단어로만 변환할 수 있습니다.

//예를 들어 begin이 "hit"
// target가 "cog"
// words가 ["hot","dot","dog","lot","log","cog"]라면 "hit" -> "hot" -> "dot" -> "dog" -> "cog"와 같이 4단계를 거쳐 변환할 수 있습니다.