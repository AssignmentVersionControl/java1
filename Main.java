import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static boolean isRepeat(int INPUT) {
        if (INPUT != 0) {
            return true;
        }

        else {
            return false;
        }

    }

    public static void main(String[] args) throws IOException, InterruptedException {
        int INPUT;
        Scanner scanner = new Scanner(System.in);

        do {
            Menu systemMenu = new Menu();
            systemMenu.displayMenu();
            INPUT = scanner.nextInt();
            ClearScreen ClsScreen = new ClearScreen();
            ClsScreen.clearscreen();
            switch (INPUT) {

                case 1:
                    case1 function1 = new case1();
                    function1.read();
                    break;

                case 2:
                    case2 function2 = new case2();
                    function2.read();
                    break;

                case 3:
                    case3 function3 = new case3();
                    function3.read();
                    break;

                case 4:
                    case4 function4 = new case4();
                    function4.read();
                    break;

                default:
                    System.out.println("Exit Program or Invalid Input!!");
                    break;

            }
        } while (isRepeat(INPUT) == true);

    }
}
