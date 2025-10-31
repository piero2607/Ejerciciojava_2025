package Procesos;

public class Ejercicio1 {
    public static void main(String[] args) {
        if (args.length==0){
            System.out.println(1);
            System.exit(1);
        } else if (isNumeric(args[0])) {
            if (Integer.parseInt(args[0])<0){
                System.out.println(3);
                System.exit(3);
            }
            System.out.println(2);
            System.exit(2);

        }
    }
    public static boolean isNumeric(String cadena){
        try {
            Float.parseFloat(cadena);
            return  true;

        }catch (NumberFormatException e){
            return false;
        }
    }
}
