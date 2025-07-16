package org.example.graph;

import java.util.*;

public class CloneGraph_re0616 {
    public Node cloneGraph(Node node) {

        if (node == null) {
            return null;
        }
        Queue<Node> queue = new LinkedList<>();
        Map<Node, Node> visited = new HashMap<>();

        Node clone = new Node(node.val);
        visited.put(node, clone);

        queue.add(node);

        while(!queue.isEmpty()) {
            Node curr = queue.poll();
            for(Node neighbor : curr.neighbors) {
                if(!visited.containsKey(neighbor)) {
                    Node newNode = new Node(neighbor.val);
                    visited.put(neighbor, newNode);
                    queue.add(neighbor);
                }
                visited.get(curr).neighbors.add(visited.get(neighbor));

            }
        }

        return visited.get(node);
    }

    class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
}

