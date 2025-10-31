import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class lanzadordelanzadorComando {
    public static void main(String[] args) {
        ProcessBuilder constructorProceso=new ProcessBuilder("java","LanzamientoComandoCmd");
        Process proceso=null;
        File directorio=new File(".\\out/production/untitled");
        constructorProceso.directory(directorio);
        System.out.println("directorioo de trabajo" +constructorProceso.directory());
        int c;
        try{
            proceso=constructorProceso.start();
            InputStream chorro=proceso.getInputStream();
            c=chorro.read();
            while (c!=-1){
                System.out.println((char) c);
                c=chorro.read();
            }
            chorro.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
