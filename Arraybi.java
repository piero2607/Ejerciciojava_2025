import java.util.ArrayList;
import java.util.Scanner;

public class Arraybi {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matriz=new ArrayList<>();
        int l=5;
        for (int i = 0; i <l ; i++) {
            matriz.add(new ArrayList<Integer>());
            for (int j = 0; j <l ; j++) {
                if (i+j==l-1){
                    matriz.get(i).add(1);
                }else {
                    matriz.get(i).add(0);
                }
            }
        }
        Mostrararraylist(matriz);
    }
    public static void Mostrararraylist(ArrayList<ArrayList<Integer>> matriz){
        for (ArrayList<Integer> fila:matriz){
            System.out.println(fila);
        }
    }
    public static void Agrgardelantero(){
        Scanner sc=new Scanner(System.in);
        System.out.println("dima el numero de los delanteros:\n");
        int N_delantero=sc.nextInt();
    }
}
