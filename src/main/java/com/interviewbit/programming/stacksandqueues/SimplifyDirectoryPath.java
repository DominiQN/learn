package com.interviewbit.programming.stacksandqueues;

import java.util.ArrayDeque;
import java.util.Deque;

public class SimplifyDirectoryPath {
    public String simplifyPath(String path) {
        Deque<String> deque = new ArrayDeque<>();

        for (String element : path.split("/")) {
            switch (element) {
                case "":
                case ".":
                    continue;
                case "..":
                    deque.pollLast();
                    continue;
                default:
                    deque.addLast(element);
            }
        }

        return "/" + String.join("/", deque);
    }
}
