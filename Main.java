import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===================================================================");
        System.out.println("||                                                               ||");
        System.out.println("||                DATA PASIEN UKS SMA NEGERI 1                   ||");
        System.out.println("||                                                               ||");
        System.out.println("===================================================================");
        System.out.println("||  Menu :                                                       ||");
        System.out.println("||  1. Masukan data pasien                                       ||");
        System.out.println("||  2. Lihat data pasien                                         ||");
        System.out.println("===================================================================");
        System.out.print("Pilih menu : ");
        int menuu = input.nextInt();

        if(menuu == 1){
            System.out.println("Pasien : ");
            System.out.println("1. Pelajar");
            System.out.println("2. Karyawan");
            System.out.print("Kategori pasien : ");
            int ktgri = input.nextInt();
            if(ktgri == 1){
                Pelajar a = new Pelajar();
                a.pasienbaru();
                a.chek_in();
                a.chek_out();
            }
            else {
                Karyawan x = new Karyawan();
                x.pasienbaru();
                x.chek_in();
                x.chek_out();
            }

        }

    }
}

