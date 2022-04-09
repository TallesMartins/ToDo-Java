//Talles Silva Martins
/*
 * O programa é simples de utilizar, somente rode normal e passe os comando por terminal, já está com todas as instruções.*/
package com.zgsolucoes.classes;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main{

	public static ArrayList<TaskSet> doList = new ArrayList<TaskSet>();

	public static void main(String[] args) {

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int menuOp = 0;
		MostrarTarefas.Organize(doList);

		while (menuOp != 5) {
			try {
				System.out.println("Bem vindo a sua ToDoList!" + "\nO que deseja fazer?" + "\n1 - Criar Lista"
						+ "\n2 - Acessar Listas" + "\n3 - Deletar Lista" + "\n4 - Atualizar\n5 - Fechar");
				menuOp = Integer.parseInt(scan.readLine());

				switch (menuOp) {
				case 1:
					TaskSet list = new TaskSet();
					doList.add(CriarTarefa.newList(list, scan));
					MostrarTarefas.Organize(doList);
					break;
				case 2:
					MostrarTarefas.mostrarTarefas(doList);
					break;
				case 3:
					System.out.println("Digite o número da Lista que deseja remover:");
					MostrarTarefas.mostrarTarefas(doList);
					int sel = Integer.parseInt(scan.readLine());
					RemoverTask.RemoveTask(doList, sel);
					System.out.println("lista removida.");
					break;
				case 4:
					System.out.println("\nSelecione uma tarefa:\n");
					MostrarTarefas.mostrarTarefas(doList);
					int index = Integer.parseInt(scan.readLine());
					System.out.println("\nselecione o que vai ser atualizado:\n1 - Prioridade\n2 - Nome\n3 - Data\n4 - Categoria\n5 - Status\n6 - Descricao\n");
					int opcao = Integer.parseInt(scan.readLine());
					System.out.println("\nDigite um novo valor:\n");
					String valor = scan.readLine();
					AtualizarLista.AtualizaLista(doList, index,opcao,valor);
					break;
				default:
					throw new IllegalStateException("Valor não aceito: " + menuOp);
				}

			} catch (Exception e) {
				System.out.println(e.getStackTrace());
			}
		}
	}
}

