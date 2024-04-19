import java.util.Scanner;

public class testeEstrutura {
    public static void main(String[] args) {
        int menu;
        Scanner oi = new Scanner(System.in);

        do {
            System.out.println("menu:\n1 - adicionar\n2 - alterar\n3 - excluir\n4 - Sair");
            menu = oi.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Você escolheu adicionar");
                    break;
                case 2:
                    System.out.println("Você escolheu alterar");
                    break;
                case 3:
                    System.out.println("Você escolheu remover");
                    break;
                case 4:
                    System.out.println("Você escolheu sair");
                    break;
            }

    }while(menu != 4);

        oi.close();
    }
}
