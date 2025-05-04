package com.interviewbit.programming.stacksandqueues;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.stream.Collectors;

public class HotelService {
    public ArrayList<Integer> nearestHotel(ArrayList<ArrayList<Integer>> map, ArrayList<ArrayList<Integer>> coordinates) {

        return (ArrayList<Integer>) coordinates.stream()
                // 1기반 인덱스에서 0기반 인덱스로 변경
                .map((coordinate) -> distance(Coordinate.of(coordinate.get(0) - 1, coordinate.get(1) - 1), map))
                .collect(Collectors.toList());
    }

    private int distance(Coordinate origin, ArrayList<ArrayList<Integer>> map) {
        final Queue<Coordinate> queue = new ArrayDeque<>();

        queue.add(origin);

        final int rowLength = map.size();
        final int colLength = map.get(0).size();

        addUp(queue, origin);
        addDown(queue, origin, rowLength);
        addLeft(queue, origin);
        addRight(queue, origin, colLength);

        while (!queue.isEmpty()) {
            Coordinate coordinate = queue.poll();

            if (map.get(coordinate.x).get(coordinate.y) == 1) {
                return coordinate.distanceFrom(origin);
            }

            if (coordinate.x < origin.x && coordinate.y < origin.y) {
                // a
                addUp(queue, coordinate);
            } else if (coordinate.x < origin.x && coordinate.y == origin.y) {
                // b
                addUp(queue, coordinate);
                addRight(queue, coordinate, colLength);
            } else if (coordinate.x < origin.x && coordinate.y > origin.y) {
                // c
                addRight(queue, coordinate, colLength);
            } else if (coordinate.x == origin.x && coordinate.y > origin.y) {
                // d
                addRight(queue, coordinate, colLength);
                addDown(queue, coordinate, rowLength);
            } else if (coordinate.x > origin.x && coordinate.y > origin.y) {
                // e
                addDown(queue, coordinate, rowLength);
            } else if (coordinate.x > origin.x && coordinate.y == origin.y) {
                // f
                addDown(queue, coordinate, rowLength);
                addLeft(queue, coordinate);
            } else if (coordinate.x > origin.x && coordinate.y < origin.y) {
                // g
                addLeft(queue, coordinate);
            } else if (coordinate.x == origin.x && coordinate.y < origin.y) {
                // h
                addLeft(queue, coordinate);
                addUp(queue, coordinate);
            }

        }

        throw new RuntimeException("Bug exists");
    }
    /*
     아이디어

     기준점 기준 십자가는 회전 + 십자가로 움직이기 (b, d, f, h)
     십자가 제외 좌표는 시계방향 회전으로만 움직이기 (a, c, e, g)

     a(1,1) b(1,2) c(1,3)
     h(2,1) 0(2,2) d(2,3)
     g(3,1) f(3,2) e(3,3)
     */

    private void addUp(Queue<Coordinate> queue, Coordinate from) {
        if (from.x > 0) {
            queue.add(Coordinate.of(from.x - 1, from.y));
        }
    }

    private void addDown(Queue<Coordinate> queue, Coordinate from, int rowLength) {
        if (from.x < rowLength - 1) {
            queue.add(Coordinate.of(from.x + 1, from.y));
        }
    }

    private void addLeft(Queue<Coordinate> queue, Coordinate from) {
        if (from.y > 0) {
            queue.add(Coordinate.of(from.x, from.y - 1));
        }
    }

    private void addRight(Queue<Coordinate> queue, Coordinate from, int colLength) {
        if (from.y < colLength - 1) {
            queue.add(Coordinate.of(from.x, from.y + 1));
        }
    }

    static class Coordinate {
        int x;
        int y;

        public static Coordinate of (int x, int y) {
            return new Coordinate(x, y);
        }

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int distanceFrom(Coordinate other) {
            return Math.abs(this.x - other.x) + Math.abs(this.y - other.y);
        }

        @Override
        public String toString() {
            return "(" + x +
                "," + y +
                ')';
        }
    }
}
