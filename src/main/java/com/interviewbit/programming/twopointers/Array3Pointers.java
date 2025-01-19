package com.interviewbit.programming.twopointers;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

// This is not my solution.
public class Array3Pointers {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int minimize(final List<Integer> a, final List<Integer> b, final List<Integer> c) {
        List<Node> nodes = new ArrayList<>();

        for (int value : a) {
            nodes.add(new Node(0, value));
        }
        for (int value : b) {
            nodes.add(new Node(1, value));
        }
        for (int value : c) {
            nodes.add(new Node(2, value));
        }

        Collections.sort(nodes);

        int result = Integer.MAX_VALUE;
        Map<Integer, Integer> nodeMap = new HashMap<>();

        for (Node node : nodes) {
            nodeMap.put(node.index, node.value);

            if (nodeMap.size() == 3) {
                result = Math.min(result, maxDistance(nodeMap));
            }
        }

        return result;
    }

    private int maxDistance(Map<Integer, Integer> nodeMap) {
        int a = nodeMap.get(0);
        int b = nodeMap.get(1);
        int c = nodeMap.get(2);

        int ab = Math.abs(a - b);
        int bc = Math.abs(b - c);
        int ca = Math.abs(c - a);

        return Math.max(ab, Math.max(bc, ca));
    }

    private static class Node implements Comparable<Node> {
        private final int index;
        private final int value;

        public Node(int index, int value) {
            this.index = index;
            this.value = value;
        }

        @Override
        public int compareTo(@NotNull Node other) {
            return Integer.compare(this.value, other.value);
        }
    }
}
