import java.util.Scanner;

public class Pemilihan2Percobaan1_14Modif {
    public static void main(String[] args) {
        Scanner input14 = new Scanner(System.in);
        
        System.out.print("Masukkan tahun: ");
        int tahun = input14.nextInt();
        
        if ((tahun % 4 == 0 && tahun % 100 != 0) || tahun % 400 == 0) {
            System.out.println("Tahun " + tahun + " adalah tahun kabisat.");
        } else {
            System.out.println("Tahun " + tahun + " bukan tahun kabisat.");
        }
        
        input14.close();
    }
}