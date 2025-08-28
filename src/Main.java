//Os File Main.
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> tarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        //Começo do código.

        System.out.println("------Lista de Tarefas!------");

        //Menu principal.
        while(true){
            System.out.println("\nEscolha uma opção");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Listar Tarefas");
            System.out.println("3. Excluir Tarefa");
            System.out.println("4. Sair");
            System.out.println("Digite o número da opção desejada: ");
            //Ler opção do usuário
            int opcao = scanner.nextInt();
            scanner.nextLine();

            //Lógica de cada opção:
            switch(opcao){
                case 1:
                    System.out.println("Digite uma nova tarefa: ");
                    String tarefa = scanner.nextLine();
                    tarefas.add(tarefa);
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;

                case 2:
                    System.out.println("\n------ SUAS TAREFAS -------");
                    if(tarefas.isEmpty()){
                        System.out.println("Nenhuma tarefa adicionada!");
                    }else {
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println((i + 1) + ". " + tarefas.get(i));
                        }
                    }
                    System.out.println("----------------");
                    break;

                case 3:
                    System.out.println("Digite o número da tarefa que deseja excluir: ");
                    int tarefaExcluir = scanner.nextInt();
                    scanner.nextLine();

                    if(tarefaExcluir > 0 && tarefaExcluir <= tarefas.size()){
                        //Usuário digita 1, mas na lista a tarefa está na posição 0
                        tarefas.remove(tarefaExcluir - 1);
                        System.out.println("Tarefa removida com sucesso!");
                    }else {
                        System.out.println("Número de tarefa não encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("To-List do FelipeSexMaker foi encerrado, até mais!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente com um número existente porra.");
                    break;
            }


        }

    }
}
