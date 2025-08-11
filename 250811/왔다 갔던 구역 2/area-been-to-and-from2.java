import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<Integer, Integer> count = new TreeMap<>();
        
        int current = 0;
        
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            
            if (dir == 'R') {
                // 오른쪽으로 x만큼 이동
                int target = current + x;
                for (int j = current; j < target; j++) {
                    count.put(j, count.getOrDefault(j, 0) + 1);
                }
                current = target;
            } else {
                // 왼쪽으로 x만큼 이동
                int target = current - x;
                for (int j = current - 1; j >= target; j--) {
                    count.put(j, count.getOrDefault(j, 0) + 1);
                }
                current = target;
            }
        }
        
        int result = 0;
        for (Integer value : count.values()) {
            if (value >= 2) {
                result++;
            }
        }
        
        System.out.println(result);
    }
}