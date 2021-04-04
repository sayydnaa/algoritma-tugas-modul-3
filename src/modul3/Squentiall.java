package modul3;
import java.util.Scanner;
public class Squentiall {
 public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
     String[] angka = {"Gellio", "Archimedez", "alkhawarizmi", "aljabar", "Pagit krisnandi", "tesla"};
     int found = 0;
     System.out.println("nama-nama orang yang berpengaruh:\n");
     for (int i=0; i<angka.length; i++){
     System.out.print("I"+angka[1]+"I");
     
     }
     
     System.out.println("\n\nmasukan nama yang akan dicari:");
     String key = input.nextLine();
     
     for (int i=0; i<angka.length; i++){
         if (key.equalsIgnoreCase(angka[i])){
             found = 1;
             System.out.println("nama: "+key+", pada indeks ke-"+1);
             break;
             
         }
     }
     if (found == 11){
         System.out.println("data telah ditemukan");
         
     }
     else{
         System.out.println("data tidak ditemukan");
     }
     System.out.println();
 }
 }
 

