import java.util.Scanner;
import java.util.Arrays;

class Info implements Comparable<Info>{
    String name;
    String address;
    String region;

    public Info(String name, String address, String region) {
        this.name = name;
        this.address = address;
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getRegion() {
        return region;
    }
    
    @Override
    public int compareTo(Info o) {
        return this.name.compareTo(o.getName());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Info[] info = new Info[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String address = sc.next();
            String region = sc.next();

            info[i] = new Info(name, address, region);
        }
        // Please write your code here.
        Arrays.sort(info);

        System.out.println("name " + info[n - 1].getName());
        System.out.println("addr " + info[n - 1].getAddress());
        System.out.println("city " + info[n - 1].getRegion());

        sc.close();
    }
}