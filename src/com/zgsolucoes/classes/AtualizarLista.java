package com.zgsolucoes.classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


public class AtualizarLista {
	public static void AtualizaLista(List<TaskSet> lista, int index,Integer opcao,String valor) throws NumberFormatException,  ParseException{
			if(opcao == 1) {
				int escolherPrioridade = Integer.parseInt(valor);
				((TaskSet) lista.get(index)).setPrior(escolherPrioridade);
			} else if(opcao == 2) {	
				((TaskSet) lista.get(index)).setNameT(valor);
			} else if(opcao == 3) {
				String modelo = "yyyy-MM-dd";
				SimpleDateFormat data = new SimpleDateFormat(modelo);
				Date dataTermino = data.parse(valor);
				((TaskSet) lista.get(index)).setDateE(dataTermino);
			} else if(opcao == 4) {
				((TaskSet) lista.get(index)).setNameT(valor);
			}else if(opcao == 5) {
				int escolha = Integer.parseInt(valor);
				if(escolha == 1) {
					((TaskSet) lista.get(index)).setStatus("Para fazer");
				} else if(escolha == 2) {
					((TaskSet) lista.get(index)).setStatus("Sendo feito");
				} else if(escolha == 3) {
					((TaskSet) lista.get(index)).setStatus("Concluido");
				}
			}else if(opcao == 6) {
				((TaskSet) lista.get(index)).setDescription(valor);
		}
	}
}
