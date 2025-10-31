package Procesos;

import java.io.*;
import java.util.Scanner;

public class Ejercicio3 {


        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            ProcessBuilder builder=new ProcessBuilder();
            File directorio=new File("");
            builder.directory(directorio);

            int ng;
            try{
                Process proceso=builder.start();
                BufferedReader lector=new BufferedReader(new InputStreamReader(proceso.getInputStream()));
                String linea=lector.readLine();
                if (linea==null){
                    System.out.println("No hay entrada de informacion");
                }else{
                    BufferedWriter escritor=new BufferedWriter(new FileWriter("archivo3.txt"));
                    while(linea!=null){
                        escritor.write(linea);
                        escritor.newLine();
                        linea=lector.readLine();
                    }
                    escritor.close();
                }

            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }


