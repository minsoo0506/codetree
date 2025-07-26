import java.util.Scanner;

class Product {
    String id;
    int code;

    public Product(String id, int code) {
        this.id = id;
        this.code = code;
    }

    public void print() {
        System.out.println("product " + code + " is " + id);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id2 = sc.next();
        int code2 = sc.nextInt();
        // Please write your code here.

        Product p1 = new Product("codetree", 50);
        Product p2 = new Product(id2, code2);

        p1.print();
        p2.print();
    }
}