/**

 adicionar o JOptionPane USANDO O EXEMPLO NA CLASSE TESTES <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
 mudar tudo da main por métodos
 colocar um banco de dados
 */









import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
//______________VARIÁVEIS________________

        int menu;
        Scanner scan = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<String>();

//______________VARIÁVEIS________________
        do {System.out.println("1 - Adicionar Tarefa\n2 - Lista de Tarefas\n3 - Editar Tarefa\n4 - Remover Tarefa\n5 - Sair");
            menu = scan.nextInt();
            switch (menu) {
                case 1:
                    scan.nextLine();
                    int adtask;
                    do {System.out.println("qual Tarefa adicionar?");
                        String n = scan.nextLine();
                        tarefas.add(n);
                        System.out.println("Gostaria de adicionar mais um?\n1 - Sim\n2 - Não");
                        adtask = scan.nextInt();
                        scan.nextLine();
                    }while(adtask == 1);
                    break;
                case 2:
                    System.out.println("________________________________________________________________________________________________\nLista:\n\n");
                    for (int i=0; i<tarefas.size(); i++) {
                        System.out.println((i + 1)+" - " + tarefas.get(i));
                    }
                    System.out.println("_________________________________________________________________________________________________");
                    break;
                case 3:
                    System.out.println("Qual deseja alterar: ");
                    int b = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Nova Tarefa: ");
                    String c = scan.nextLine();
                    tarefas.set(b-1, c);

                    System.out.println("Tarefa Editada");
                    break;
                case 4:
                    int deltask;
                    System.out.println("Lista: ");
                    for (int i=0; i<tarefas.size(); i++) {
                        System.out.println((i + 1)+" - " + tarefas.get(i));
                    }
                    System.out.println("Qual você deseja apagar: ");
                    deltask = scan.nextInt();
                    tarefas.remove(deltask-1);
                    break;
                case 5:
                    System.out.println("Você escolheu sair");
                    break;
            }

        }while(menu != 5);

        scan.close();
    }
}