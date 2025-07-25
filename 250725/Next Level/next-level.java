import java.util.Scanner;

class User {
    String id;
    int level;

    public User(String id, int level){
        this.id = id;
        this.level = level;
    }

    public void print(){
        System.out.println("user " + id + " lv " + level);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int level = sc.nextInt();
        // Please write your code here.

        User codetree = new User("codetree", 10);
        User hello = new User(id, level);

        codetree.print();
        hello.print();
    }
}