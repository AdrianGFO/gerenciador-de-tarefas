import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//______________VARIÁVEIS________________

            int resp2, menu;
            Scanner scan = new Scanner(System.in);

//______________VARIÁVEIS________________
            ArrayList<Integer> numero = new ArrayList<Integer>();

            do{System.out.println("Olá, Seja bem vindo ao seu Gerenciador de Tarefas");
                System.out.println("Gostaria de começar adicionando uma Tarefa?\n1 - SIM\n2 - NÃO");
                resp2 = scan.nextInt();

                if(resp2 == 1){
                   Crud.num1();
                }else if(resp2 == 2){System.out.println("Entendo... Foi uma prazer servi-lo.");}
                else{System.out.println("Não existe essa opção.\n\n");}
            }while(resp2 != 1 && resp2 != 2);
        }

    private static void num1() {
    }
}