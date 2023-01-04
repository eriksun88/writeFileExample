import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scr = new Scanner(System.in);
        FileOutputStream output = new FileOutputStream("C:/Temp/CopyFile.txt");
        String choice = " ";
        while (choice == "yes" && choice == "Yes") {
            System.out.println("do you want to write sth?");

            if (choice.equals("Yes") || choice.equals("yes")) {
                System.out.println("Enter text to write to file:");
                String input = scr.next();
                for (int i = 0; i < input.length(); i++) {
                    output.write(input.charAt(i));
                }
            } else if (choice.equals("No") || choice.equals("no")) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
            output.close();
        }
    }
}