import java.util.Scanner;
import java.util.ArrayList;

public class testeEstrutura {
    public static void main(String[] args) {

        int menu;
        Scanner scan = new Scanner(System.in);
        ArrayList<String> nome = new ArrayList<String>();


        do {System.out.println("1 - Adicionar Tarefa\n2 - Lista de Tarefas\n3 - Editar Tarefa\n4 - Remover Tarefa\n5 - Sair");
            menu = scan.nextInt();

            switch (menu) {
                case 1:
                    scan.nextLine();

                    int adtask;
                    do {System.out.println("qual Tarefa adicionar?");
                        String n = scan.nextLine();
                        nome.add(n);
                        System.out.println("Gostaria de adicionar mais um?\n1 - Sim\n2 - Não");
                        adtask = scan.nextInt();
                        scan.nextLine();
                    }while(adtask == 1);
                    break;
                case 2:
                    System.out.println("________________________________________________________________________________________________\nLista:");
                    for (int i=0; i<nome.size(); i++) {
                        System.out.println((i + 1)+" - " + nome.get(i));
                    }
                    System.out.println("_________________________________________________________________________________________________");
                    break;
                case 3:
                    System.out.println("Qual deseja alterar: ");
                    int b = scan.nextInt();
                    System.out.println("Novo nome: ");
                    String c = scan.next();
                    nome.set(b-1, c);

                    System.out.println("Lista Atual: " + nome);
                    break;
                case 4:
                    System.out.println("Você escolheu remover");
                    break;
                case 5:
                    System.out.println("Você escolheu sair");
                    break;
            }

    }while(menu != 5);

        scan.close();
    }
}
