import java.util.Scanner;
import java.util.Arrays;

class Point implements Comparable<Point>{
    int id;
    int distance;

    public Point(int id, int distance) {
        this.id = id;
        this.distance = distance;
    }

    @Override
    public int compareTo(Point o) {
        if(this.distance == o.distance) {
            return this.id - o.id;
        }
        else {
            return this.distance - o.distance;
        }
    }
}

public class Main {
    public static int distance(int x, int y) {
        return Math.abs(x) + Math.abs(y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Point[] points = new Point[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            points[i] = new Point(i + 1, distance(x, y));
        }
        
        Arrays.sort(points);

        for (int i = 0; i < n; i++) {
            System.out.println(points[i].id);
        }
    }
}