package Procesos;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Ejercicio2_extra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        ProcessBuilder processBuilder = new ProcessBuilder("java", "Procesos.Ejercicio2", cadena);
        Process process = null;
        File file = new File("C:\\Users\\Usuario\\IdeaProjects\\untitled");
        processBuilder.directory(file);

        try {
            process = processBuilder.start();
            InputStream inputStream = process.getInputStream();
            int c = inputStream.read();
            while (c != -1) {
                System.out.print((char) c);
                c = inputStream.read();
            }
            inputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

