package modul3;
import java.util.Scanner;
public class Binary {
    public static void main(String[] args){
        System.out.println("**** Binary Search ****"+"\n");
        
        int A[]= {2, 4, 8, 10, 12, 14, 16, 18, 20};
        Scanner Scan = new Scanner(System.in);
        System.out.println("masukan data yang dicari :");
        int cari = Scan.nextInt();
        int N = cari;
        int batasbawah = N - 1;
        int batasatas = 0;
        boolean ketemu = false;
        int tengah = 0;
        
        System.out.print("isi data adakah ; ");
        for (int i=0; i<A.length; i++){
            System.out.print(A[i]+ " ");
        }
        System.out.println(" ");
        
        System.out.println("Aqshal Sayyidina");
    }
    
    
    
}
