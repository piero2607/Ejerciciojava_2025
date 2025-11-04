package Procesos;


public class Ejercicio4 {
    public static void main(String[] args) {
        if (args.length==0){
            System.out.println("No hay cadena para leer");
        }else{
            String palabra=args[0];
            int longitudpalabra=palabra.length();
            for (int i = 0; i < longitudpalabra/2; i++) {
                if (palabra.charAt(i)!=palabra.charAt(palabra.length()-1-i)){
                    System.out.println("La palabra no es palindromo");
                }else{
                    System.out.println("La palabra si es palindromo");
                }

        }

        }
    }
}
