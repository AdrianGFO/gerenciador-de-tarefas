/**
 mudar tudo da main por métodos
 colocar um banco de dados
 */
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int menu;
        Scanner scan = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<String>();
        StringBuilder listaFormatada = new StringBuilder();

        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("1 - Adicionar Tarefa\n2 - Lista de Tarefas\n3 - Editar Tarefa\n4 - Remover Tarefa\n5 - Sair"));
            switch (menu) {
                case 1:
                    int adtask;
                    do {
                        String n = JOptionPane.showInputDialog("Qual tarefa adicionar?");
                        tarefas.add(n);
                        adtask = Integer.parseInt(JOptionPane.showInputDialog("Gostaria de adicionar mais uma?\n1 - Sim\n2 - Não"));
                    } while (adtask == 1);
                    break;
                case 2:
                    listaFormatada.setLength(0); // Limpar o conteúdo anterior
                    // Adiciona os itens formatados à string
                    for (int i = 0; i < tarefas.size(); i++) {
                        listaFormatada.append((i + 1)).append(" - ").append(tarefas.get(i)).append("\n");
                    }
                    // Exibe a lista form atada em uma caixa de diálogo JOptionPane
                    JOptionPane.showMessageDialog(null, listaFormatada.toString());
                    break;
                case 3:
                    int b = Integer.parseInt(JOptionPane.showInputDialog(listaFormatada.toString() + "Qual deseja alterar: "));
                    String c = JOptionPane.showInputDialog("Nova Tarefa:");
                    tarefas.set(b - 1, c);
                    JOptionPane.showMessageDialog(null, "Tarefa Editada");
                    break;
                case 4:      //falta adicionar a lista de tarefas antes da pergunta.
                    int deltask = Integer.parseInt(JOptionPane.showInputDialog(listaFormatada.toString() + "Qual deseja apagar: "));
                    tarefas.remove(deltask - 1);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Fechando...");
                    break;
            }

        } while(menu != 5);

        scan.close();
    }
}
