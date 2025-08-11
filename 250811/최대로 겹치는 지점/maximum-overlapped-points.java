import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> p = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            for(int j = start; j <= end; j++){
                p.put(j, p.getOrDefault(j, 0) + 1);
            }
        }
    
        System.out.println(Collections.max(p.values()));
    }
}