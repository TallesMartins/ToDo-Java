import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.*;
import java.util.Date;

public class Main {

	static ArrayList<TaskSet> doList = new ArrayList<TaskSet>();

	public static void main(String[] args) {

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int menuOp = 0;
		Organize(doList);

		while (menuOp != 4) {
			try {
				System.out.println("Bem vindo a sua ToDoList!" + "\nO que deseja fazer?" + "\n1 - Criar Lista"
						+ "\n2 - Acessar Listas" + "\n3 - Deletar Lista" + "\n4 - Fechar");
				menuOp = Integer.parseInt(scan.readLine());

				switch (menuOp) {
				case 1:
					TaskSet list = new TaskSet();
					doList.add(newList(list, scan));
					Organize(doList);
					break;
				case 2:
					ShowList(doList);
					break;
				case 3:
					RemoveTask(doList, scan);
					break;
				default:
					throw new IllegalStateException("Valor não aceito: " + menuOp);
				}

			} catch (Exception e) {
				System.out.println(e.getStackTrace());
			}

		}

	}

	public static TaskSet newList(TaskSet list, BufferedReader scan) throws ParseException, IOException {
		System.out.println("Insira o nome da Tarefa");
		list.setNameT(scan.readLine());
		System.out.println("Insira a categoria");
		list.setCategory(scan.readLine());
		System.out.println("Insira a descrição");
		list.setDescription(scan.readLine());
		newDate(list, scan);
		Prioridade(list, scan);
		Status(list, scan);
		System.out.println("Lista criada com sucesso");

		return list;
	}

	public static void newDate(TaskSet list, BufferedReader scan) throws ParseException, IOException {
		System.out.println("Insira a data de término: ");
		String day = scan.readLine();
		Date date = new SimpleDateFormat("dd/MM/yyyy").parse(day);
		list.setDateE(date);
	}

	public static void Status(TaskSet list, BufferedReader scan) throws NumberFormatException, IOException {
		System.out.println("Status da tarefa:\n 1 - Para fazer\n 2 - Sendo feito\n 3 - Concluido");
		int Op = 0;
		Op = Integer.parseInt(scan.readLine());

		if (Op == 1) {
			list.setStatus("Para fazer");
		} else if (Op == 2) {
			list.setStatus("Sendo feito");
		} else if (Op == 3) {
			list.setStatus("Concluido");
		} else {
			System.out.println("Oops... Algo deu errado, tente novamente.");
			Status(list, scan);
		}

	}

	public static void RemoveTask(ArrayList<TaskSet> doList, BufferedReader scan)
			throws NumberFormatException, IOException {
		System.out.println("Digite o número da Lista que deseja remover:");
		ShowList(doList);
		int sel = Integer.parseInt(scan.readLine());
		doList.remove(sel - 1);
		System.out.println("lista removida.");
	}

	public static void Prioridade(TaskSet list, BufferedReader scan) throws NumberFormatException, IOException {
		System.out.println("Insira o nivel de prioridade (1-5)");
		int PriNum = 0;
		PriNum = Integer.parseInt(scan.readLine());
		if (PriNum >= 1 && PriNum <= 5) {
			list.setPrior(PriNum);
		} else {
			System.out.println("Oops... Deu algo errado, Tente novamente.");
			Prioridade(list, scan);
		}
	}

	public static void ShowList(ArrayList<TaskSet> doList) {
		for (Object obj : doList) {
			System.out.println(obj);
		}
	}

	public static void Organize(ArrayList<TaskSet> doList) {
		Collections.sort(doList);
	}
}

