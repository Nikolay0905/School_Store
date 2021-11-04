import Dialogs.ClientDialog;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Здравейте!");
        System.out.println("Kаква е вашата роля? [Клиент] [Мениджър]");

        String role = scan.nextLine();

        if (role.equalsIgnoreCase("Клиент")) {
            ClientDialog dialog = new ClientDialog();
            dialog.chooseLocation();
            dialog.chooseProduct();
        }

        System.out.println("Довиждане!");
      }
    }

