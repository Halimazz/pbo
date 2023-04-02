
import java.util.Scanner;
public class praktikum5 {
    public static void main(String[] args) {
        int bilangan, faktorial = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        bilangan = input.nextInt();

        for (int i = 1; i <= bilangan; i++) {
            faktorial *= i;
        }

        System.out.println("Faktorial dari " + bilangan + " adalah: " + faktorial);

            int count = 1;
    
            for (int a = 1; a <= 5; a++) {
                for (int b = 1; b <= 4; b++) {
                    System.out.print(count + " ");
                    count++;
                }
                System.out.println();
            }
            System.out.println("\t\t");
            for (int a = 1; a <= 5; a++) {
                for (int b = 1; b <= 3; b++) {
                    System.out.print(count + " ");
                    count++;
                }
                System.out.println();
            }
        


    }
    
}
