package Procesos;

import java.io.*;
import java.util.Scanner;

public class Ejercicio4_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime una palabara:\n");
        String palabra=sc.nextLine();
        ProcessBuilder pb=new ProcessBuilder("java","Procesos.Ejercicio4",palabra);
        Process process=null;
        File archivo=new File("C:\\Users\\Usuario\\IdeaProjects\\untitled\\out\\production\\untitled\\Procesos");
        pb.directory(archivo);
        try {
            process= pb.start();
            BufferedReader br=new BufferedReader(new InputStreamReader(process.getInputStream()));
            String linea=br.readLine();
            if (linea==null){
                System.out.println("Esta vacio");
            }else{
                BufferedWriter bw=new BufferedWriter(new FileWriter("Palindromo.txt"));
                while (linea!=null){
                    bw.write(linea);
                    bw.newLine();
                    linea=br.readLine();
                }
                bw.close();
            }

        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
