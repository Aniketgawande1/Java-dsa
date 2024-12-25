import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int range = scanner.nextInt();
        int counter = 1;
        while (counter <= range) {
            System.out.println(counter);
            counter ++;
            scanner.close();
        }
    }
    
}