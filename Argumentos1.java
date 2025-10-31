
public class Argumentos1 {

    public static boolean isnumeric(String cadena){
        try {
            Integer.parseInt(cadena);
            return true;

        }catch (NumberFormatException e){
            return false;
        }
    }

    static void main(String[] args) {
        if (args.length==0){
            System.exit(1);
        } else if (isnumeric(args[0])) {
            if (Integer.parseInt(args[0])<0){
                System.exit(3);
            }
            System.exit(2);
        }
    }
}
