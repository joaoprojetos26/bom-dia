import java.sql.SQLOutput;
import java.util.Scanner;

public class bomdia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hora = sc.nextDouble();

        if (hora>=6.00&&hora<12.00){
            System.out.println("bom dia");
        } else if (hora>=12.00 && hora<=18.00) {
            System.out.println("boa tarde");
        } else if (hora>18.00  ) {
            System.out.println("boa noite");
        }else if (hora>=00.00&&hora<6.00){
            System.out.println("vai dormir");
        }
        sc.close();
    }
}
