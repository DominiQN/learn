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

        if (origin.x > 0) {
            queue.add(Coordinate.of(origin.x - 1, origin.y));
        }

        if (origin.x < rowLength - 1) {
            queue.add(Coordinate.of(origin.x + 1, origin.y));
        }

        if (origin.y > 0) {
            queue.add(Coordinate.of(origin.x, origin.y - 1));
        }

        if (origin.y < colLength - 1) {
            queue.add(Coordinate.of(origin.x, origin.y + 1));
        }

        while (!queue.isEmpty()) {
            Coordinate coordinate = queue.poll();

            if (map.get(coordinate.x).get(coordinate.y) == 1) {
                return coordinate.distanceFrom(origin);
            }

            // x 처리
            //// 위,아래 벽에 닿지 않았다면
            if (coordinate.x > 0 && coordinate.x < rowLength - 1) {
                // 노가다
            }

            // y 처리
            //// 왼, 오른 벽에 닿지 않았다면
            if (coordinate.y > 0 && coordinate.y < colLength - 1) {
                // 노가다
            }
        }

        throw new RuntimeException("Bug exists");
    }
    /*
     아이디어

     기준점 기준 십자가는 회전 + 십자가로 움직이기 (b, e, g, d)
     십자가 제외 좌표는 시계방향 회전으로만 움직이기 (a, c, h, f)

     a(1,1) b(1,2) c(1,3)
     d(2,1) 0(2,2) e(2,3)
     f(3,1) g(3,2) h(3,3)

     ax < 0x 위쪽
     ay < 0y -

     bx < 0x 위쪽
     by = 0y 오른쪽

     cx < 0x -
     cy > 0y 오른

     dx = 0x 위쪽
     dy < 0y 왼쪽


     ex = 0x 아래
     ey > 0y 오른

     fx > 0x -
     fy < 0y 왼쪽

     gx > 0x 아래
     gy = 0y 왼쪽

     hx > 0x 아래
     hy > 0y -
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
