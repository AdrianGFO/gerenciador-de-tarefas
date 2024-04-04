import java.util.Scanner;
import java.util.ArrayList;
public class Crud {
    static ArrayList<Integer> numero = new ArrayList<Integer>();
    
public static int num1(){
    Scanner scan = new Scanner(System.in);
    int menu = 0;
    int esc1, esc2;
    int y = 0;
    
    do{ System.out.println("Atual lista:\n___________________________________");

        for (int i = 0; i < numero.size(); i++) {
            System.out.println(numero.get(i));ArrayList<Integer> numero = new ArrayList<Integer>();
        }

        System.out.println("___________________________________");


        System.out.println("continuar? (1 - SIM  2 - NÃO)");

        esc1 = scan.nextInt();

        if(esc1 == 1){


            for(int g = 0; g == y; g++){

                System.out.println("você deseja adicionar um numero? (1 sim 2 não)");
                esc2 = scan.nextInt();

                if(esc2 == 1){
                    System.out.println("qual numero adicionar?");
                    int n = scan.nextInt();
                    numero.add(n);
                }else if (esc2 == 2){
                    y++;
                }else{
                    System.out.println("Opção inexistente.");
                }
            }
        }
    }while(esc1 == 1);
    
    scan.close();


        return menu;
    }

}
