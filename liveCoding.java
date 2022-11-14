import java.util.Scanner;

public class liveCoding {
    public static void main(String[] args) {
        Scanner teguh= new Scanner(System.in);
        int hasil,input1,input2;
        System.out.print("masukan angka : ");
        input1= teguh.nextInt();
        hasil = input1*input1;
        if (hasil>=10&&hasil<=30){
            System.out.println("Hasil : " + hasil);
        }
        System.out.print("masukan bilangan = ");
        int n= teguh.nextInt();
        int i=1;
        int jumlah;

        do{
            System.out.print(i*n + " ");
            i++;
        }while (i<=10);





    }
}
