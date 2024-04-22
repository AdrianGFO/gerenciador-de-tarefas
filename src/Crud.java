import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
public class Crud {

    static ArrayList<String> tarefas = new ArrayList<String>();

    public static String addTarefa() { /**metodo está rodando sem salvar tarefas no ArrayList */
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
        int adtask;
        do {
            System.out.println("qual Tarefa adicionar?");
            String n = scan.nextLine();
            tarefas.add(n);
            System.out.println("Gostaria de adicionar mais um?\n1 - Sim\n2 - Não");
            adtask = scan.nextInt();
            scan.nextLine();
        } while (adtask == 1);
        return null;
    }

}

