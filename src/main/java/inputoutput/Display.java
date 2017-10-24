package inputoutput;

import user.User;

import java.util.Scanner;

public class Display {

    public static String userInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        return scanner.nextLine();
    }

}
