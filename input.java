import java.util.Scanner;

public class input{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double Gaji, tarifperjam, tapera, gajitotal;

        System.out.println("jumlah gaji");
        Gaji = input.nextDouble();
        System.out.println("tarif");
        tarifperjam = input.nextDouble();
        
        gajitotal = Gaji*tarifperjam;
        tapera = (gajitotal/100);
        gajitotal= gajitotal/tapera;

   System.out.println("totalgaji"+ gajitotal);
        

    }
}