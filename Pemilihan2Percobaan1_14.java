import java.util.Scanner;

public class Pemilihan2Percobaan1_14 {
    public static void main(String[] args) {
        Scanner input14 = new Scanner(System.in);
        
        System.out.print("Masukkan Tahun: ");
        int tahun = input14.nextInt();
        
        if ((tahun % 4)== 0) {
            if ((tahun % 100) != 0)
                System.out.println("tahun" + tahun + " adalah Tahun Kabisat.");
        } else {
            System.out.println("tahun" + tahun + " Bukan Tahun Kabisat.");
        }
        
        input14.close();
    }
}