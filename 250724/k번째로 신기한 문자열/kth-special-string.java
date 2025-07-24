import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        // Please write your code here.
        Arrays.sort(words);

        int count = 0;
        String result = "";
        for(int i = 0; i < words.length; i++){
            if(words[i].charAt(0) == t.charAt(0)){
                if(words[i].length() < t.length()) {
                    continue;
                }

                boolean flag = true;
                for(int j = 0; j < t.length(); j++){
                    if(words[i].charAt(j) != t.charAt(j)){
                        flag = false;
                    }
                }

                if(flag) count++;
            }

            if(count == k) {
                result = words[i];
                break;
            }
        }

        System.out.println(result);
    }
}