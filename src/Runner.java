import java.io.IOException;
import java.util.Scanner;

public class Runner {

    //Клас прийняття рішення

    static boolean marker = true;

    public void run(String[] args) throws IOException {
        if (args == null) new CLI().inputDate();
        else {
            System.out.println("Бажаєте ввести параметри для роботи програми (Y), чи використати аргументи (N), або можливо вихід з програми (X)?");
            Scanner scanner = new Scanner(System.in);
            while (marker) {
                String answer = scanner.nextLine();
                switch (answer) {
                    case "Y":
                        new CLI().inputDate();
                    case "N":
                        new ParameterHandler().run(args);
                    case "X":
                        break;
                    default:
                        System.out.println("Помилкове введення. Введіть (Y), (N) або (X)");
                }
//            if ("Y".equalsIgnoreCase(answer)) {
//                new CLI().inputDate();
//            } else if ("N".equalsIgnoreCase(answer)) {
//                new ParameterHandler().run(args);
//            } else if ("X".equalsIgnoreCase(answer)) {
//                break;
//            } else System.out.println("Помилкове введення. Введіть (Y), (N) або (X)");
            }
        }
    }
}
