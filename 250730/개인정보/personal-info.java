import java.util.Scanner;
import java.util.Arrays;

class Info {
    String name;
    int height;
    double weight;

    public Info(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public void printInfo() {
        System.out.println(name + " " + height + " " + weight);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        Info[] infos = new Info[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();

            infos[i] = new Info(name, height, weight);
        }
        // 이름 순으로 정렬
        Arrays.sort(infos, (a, b) -> a.name.compareTo(b.name));

        System.out.println("name");
        for(int i = 0; i < n; i++) {
            infos[i].printInfo();
        }

        // 키가 큰 순으로 정렬
        Arrays.sort(infos, (a, b) -> b.height - a.height);

        System.out.println("\nheight");
        for(int i = 0; i < n; i++) {
            infos[i].printInfo();
        }
    }
}