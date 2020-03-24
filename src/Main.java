import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Refill: ");
        long refill = in.nextLong();
        in.close();
        long account = 100;
        long limit = 1000;
        if (refill >= limit) {
            account = account + refill + (int)Math.floor(refill / 100);
        }
        if (refill<limit) {
            account = account + refill;
        }
        System.out.printf("Total score: %s \n", account);
    }
}
