import java.io.IOException;
import java.util.Scanner;

public class CLI {

    // Клас введення аргументів з консолі

    String [] args = new String[3];

    public void inputDate() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть дію (ENCRYPT, DECRYPT або BRUTE_FORCE");
        args[0] = scanner.nextLine();
        System.out.println("Введіть путь до файлу");
        args[1] = scanner.nextLine();
        if (!"BRUTE_FORCE".equalsIgnoreCase(args[0])) {
            System.out.println("Введіть ключ");
            args[2] = scanner.nextLine();

        }
        new ParameterHandler().run(args);

    }
}
