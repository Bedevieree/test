import java.util.Scanner;

public class ks {

    public static void main(String []args){

        int jumlah,pilihan;
        double harga,total,tempo;
        String ulang;
do {
        Scanner input =  new Scanner  (System.in);
        System.out.print( "List harga barang");
        System.out.print("pilih 1/2/3/4");
       
        switch(pilihan) {
            case 1 :
            harga=4000;
            break;
            case 2 :
            harga=2500;
            break;
            case 3 :
            harga=1000;
            break;
            case 4 :
            harga=2500;
            break;

            default:
            System.out.println("try again");

        }
   total =harga*jumlah;
   tempo+=total;
   System.out.println("apakah anada ingin memebeli lagi?\n(ya/tidak)");

    }while  (ulang.equalsIgnoreCase("ya"));

System.out.println("total yang di bayar"+ tempo);

}

   
}
