package me.joraly;
//v1
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;

public class Main {
    static String s = File.separator;
    static String path = "src"+s+"main"+s+"resources"+s + "out"+ s;
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        int i = 1;

        while(true) {
            int x = i;
            Integer.toString(x);
            System.out.printf("%3s|", String.valueOf(x));
            String command = scanner.nextLine();
            i++;
            switch (command){
                case "!q" -> {
                    scanner.close();
                    return;
                }
                case "!sq" -> {
                    try {


                        System.out.println("CN |Впишите название (с расширением файла)");
                        String fileName = scanner.nextLine();
                        File file = new File(path + fileName);
                        if(file.exists())
                            file.createNewFile();
                        PrintWriter pw = new PrintWriter(file);
                        pw.println(sb);
                        pw.close();
                        return;

                    } catch(IOException e) {
                        System.out.println("Error |" + e);
                    }
                }
                default -> {
                    sb.append(command + "\n");
                }
            }
        }
    }
}