import java.io.IOException;
import java.util.Scanner;

public class Runner {

    //Клас прийняття рішення
    static CLI cli = new CLI();
    boolean marker = true;

    public void run(String[] args) throws IOException {
        if (args == null) cli.inputDate();
        else {
            System.out.println("Бажаєте ввести параметри для роботи програми (Y), чи використати аргументи (N), або можливо вихід з програми (X)?");
            Scanner scanner = new Scanner(System.in);
            while (marker) {
                String answer = scanner.nextLine();
                switch (answer) {
                    case "Y":
                        cli.inputDate();
                        marker = false;
                        break;
                    case "N":
                        new ParameterHandler().run(args);
                        marker = false;
                        break;
                    case "X":
                        marker = false;
                        break;
                    default:
                        System.out.println("Помилкове введення. Введіть (Y), (N) або (X)");
                }
//            if ("Y".equalsIgnoreCase(answer)) {
//                cli.inputDate();
//            } else if ("N".equalsIgnoreCase(answer)) {
//                new ParameterHandler().run(args);
//            } else if ("X".equalsIgnoreCase(answer)) {
//                break;
//            } else System.out.println("Помилкове введення. Введіть (Y), (N) або (X)");
            }
        }
    }
}
