package Procesos;

import java.util.Arrays;

public class Ejercicio2 {

    public class ejercicio2 {
        public static void main(String[] args) {
            if (args.length==0){
                System.out.println("no hay cadena");
                System.exit(1);
            }
            for (int i = 0; i <5 ; i++) {
                System.out.println(Arrays.toString(args));
            }
        }
    }


}
