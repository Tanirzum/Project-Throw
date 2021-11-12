import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = scanner.nextInt();
            if (x != 0) {
                try {
                    throw new Exception();
                } catch (Exception e) {
                    System.out.println("Пишите 0");
                } finally {
                    break;
                }
            }
        }
    }
}
