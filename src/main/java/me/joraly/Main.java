package me.joraly;
//v1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;

        while(true) {
            int x = i;
            Integer.toString(x);
            System.out.printf("%3s|", String.valueOf(x));
            String command = scanner.nextLine();
            i++;
            switch (command){
                case "!q" -> { return;
                }
                default -> {
                    continue;
                }
            }
        }
    }
}