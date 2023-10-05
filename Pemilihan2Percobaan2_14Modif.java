import java.util.Scanner;

public class Pemilihan2Percobaan2_14Modif {
    public static void main(String[] args) {
        Scanner input14 = new Scanner(System.in);
        
        System.out.print("Masukkan Besar Sudut 1 = ");
        float sudut1 = input14.nextFloat();
        System.out.print("Masukkan Besar Sudut 2 = ");
        float sudut2 = input14.nextFloat();
        System.out.print("Masukkan Besar Sudut 3 = ");
        float sudut3 = input14.nextFloat();

        float totalSudut = sudut1 + sudut2 + sudut3;
        
        if (totalSudut ==180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) {
                System.out.println("Segitiga tersebut adalah Segitiga Siku-Siku.");
            } else if (sudut1 == 60 && sudut2 == 60 && sudut3 == 60) {
                System.out.println("Ini adalah segitiga sama sisi.");
            } else if (sudut1 == sudut2 || sudut1 == sudut3 || sudut2 == sudut3) {
                System.out.println("Ini adalah segitiga Sama Kaki.");
            } else {
                System.out.println("Ini adalah segitiga Sembarang.");
            }
        } else {
            System.out.println("Bukan Segitiga.");
        }
        
        input14.close();
    }
}