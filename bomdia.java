import java.sql.SQLOutput;
import java.util.Scanner;

public class bomdia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("quantas horas?");
        double hora = sc.nextDouble();

        if (hora>=6&&hora<12){
            System.out.println("bom dia");
        } else if (hora>=12&& hora<=18) {
            System.out.println("boa tarde");
        } else if (hora>18&& hora<=24) {
            System.out.println("boa noite");
        }else if (hora>24&&hora<6){
            System.out.println("vai dormir");
        }else if (hora>=25){
            System.out.println("hora invalida");
        }
        sc.close();
        
    }
}
