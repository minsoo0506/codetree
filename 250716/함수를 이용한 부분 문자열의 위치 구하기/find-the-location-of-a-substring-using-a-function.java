import java.util.Scanner;
public class Main {
    public static char[] full;
    public static char[] part;

    public static int find(){
        int idx = -1;

        if(full.length < part.length) return idx;

        for(int i = 0; i < full.length; i++){
            if(part[0] == full[i]){
                if(i + part.length > full.length) break;
                else {
                    boolean flag = true;

                    for(int j = 0; j < part.length; j++){
                        if(full[i + j] != part[j]) {
                            flag = false;
                            break;
                        }
                    }

                    if(flag) idx = i;
                }
            }
        }

        return idx;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String pattern = sc.next();
        // Please write your code here.
        full = text.toCharArray();
        part = pattern.toCharArray();

        System.out.println(find());
    }
}