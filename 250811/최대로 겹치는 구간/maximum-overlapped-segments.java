import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();

            for(int j = x1; j < x2; j++){
                map.put(j, map.getOrDefault(j, 0) + 1);
            }
        }
        
        System.out.println(Collections.max(map.values()));
    }
}