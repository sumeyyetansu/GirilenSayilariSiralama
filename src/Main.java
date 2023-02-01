import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c ;

        System.out.println("1. sayı (a) :");
        a = scanner.nextInt();

        System.out.println("2. sayı (b) :");
        b = scanner.nextInt();

        System.out.println("3. sayı (c) :");
        c = scanner.nextInt();

        if(b<a && c<a){
            if (b<c){
                System.out.println("b<c<a");
            }
            else {
                System.out.println("c<b<a");}

        } else if (a<b && c<b) {
            if (a<c){
                System.out.println("a<c<b");
            }else {
                System.out.println("c<a<b");
            }

        } else {
            if (a<b){
                System.out.println("a<b<c");
            }
            else {
                System.out.println("b<a<c");
            }
        }
    }
}