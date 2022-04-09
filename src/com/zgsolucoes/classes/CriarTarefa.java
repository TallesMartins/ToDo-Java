package com.zgsolucoes.classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CriarTarefa {
	
	public static TaskSet newList(TaskSet list, BufferedReader scan) throws ParseException, IOException {
		System.out.println("Insira o nome da Tarefa");
		list.setNameT(scan.readLine());
		System.out.println("Insira a categoria");
		list.setCategory(scan.readLine());
		System.out.println("Insira a descrição");
		list.setDescription(scan.readLine());
		
		novaData(list, scan);
		Prioridade(list, scan);
		Status(list, scan);
		System.out.println("Lista criada com sucesso");
		
		return list;
	}
	
	public static void novaData(TaskSet list, BufferedReader scan) throws ParseException, IOException {
		System.out.println("Insira a data de término: ");
		String day = scan.readLine();
		Date date = new SimpleDateFormat("yyyy-MM-dd").parse(day);
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
}
