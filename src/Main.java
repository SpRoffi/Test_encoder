import java.io.IOException;


public class Main {


    public static void main(String[] args)  {
        try {
            new Runner().run(args);
        } catch (IOException e) {
            System.out.println("Error - " + e);
        }
    }
}