import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        List<String> tarefas = new ArrayList<>();

        System.out.println("Adicionar Tarefa:");
        String novaTarefa = scanner.nextLine();
        tarefas.add(novaTarefa);
        System.out.println("Tarefa Adicionada:" + novaTarefa);



        
        scanner.close();
    }
}