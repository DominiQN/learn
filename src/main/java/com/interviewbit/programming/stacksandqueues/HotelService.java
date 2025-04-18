package com.interviewbit.programming.stacksandqueues;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.stream.Collectors;

public class HotelService {
    public ArrayList<Integer> nearestHotel(ArrayList<ArrayList<Integer>> map, ArrayList<ArrayList<Integer>> coordinates) {

        return (ArrayList<Integer>) coordinates.stream()
                .map((coordinate) -> distance(Coordinate.of(coordinate.get(0), coordinate.get(1)), rowLength, colLength))
                .collect(Collectors.toList());
    }

    private int distance(Coordinate origin, ArrayList<ArrayList<Integer>> map) {
        final Queue<Coordinate> queue = new ArrayDeque<>();

        queue.add(origin);

        final int rowLength = map.size();
        final int colLength = map.get(0).size();

        while (!queue.isEmpty()) {
            Coordinate coordinate = queue.poll();

            if (map.get(coordinate.x).get(coordinate.y) == 1) {
                return coordinate.distanceFrom(origin);
            }


        }

        throw new RuntimeException("Bug exists");
    }
    /*

     a(1,1) b(1,2) c(1,3)
     d(2,1) 0(2,2) e(2,3)
     f(3,1) g(3,2) h(3,3)

     ax < 0x 위쪽
     ay < 0y 왼쪽

     bx < 0x
     by = 0y

     cx < 0x 위쪽
     cy > 0y 오른

     dx = 0x
     dy < 0y




     ex = 0x
     ey > 0y

     fx > 0x 아래
     fy < 0y 왼쪽

     gx > 0x
     gy = 0y

     hx > 0x 아래
     hy > 0y 오른


     */


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
    }
}
