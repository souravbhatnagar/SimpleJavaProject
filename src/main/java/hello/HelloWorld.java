package hello;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
	Scanner myObj = new Scanner(System.in);
	System.out.println("Hello, World!\nTry entering some text: ");
	String input = myObj.nextLine();
        int length = input.length();
        System.out.println("Length of the input: " + length);
    }
}
