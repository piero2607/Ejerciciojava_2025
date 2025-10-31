import java.io.IOException;
import java.io.InputStream;

public class LanzamientoComandosCmd {
    public static void main(String[] args) {
        ProcessBuilder constructorProceso=new ProcessBuilder("cmd","/c","dir");
        Process proceso=null;
        int c;
        try{
            proceso= constructorProceso.start();
            InputStream chorro=proceso.getErrorStream();
            c=chorro.read();
            while (c!=-1){
                System.out.println((char) c);
                c=chorro.read();
            }
            chorro.close();
            int codigoSalidaProceso=proceso.waitFor();
            System.out.println("El valor de la salida es: " +codigoSalidaProceso);
        }catch (IOException|InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
