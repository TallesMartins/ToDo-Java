package com.zgsolucoes.classes;

import java.util.Collections;
import java.util.List;

public class MostrarTarefas {
	public static void mostrarTarefas(List<TaskSet> lista) {
		for (Object obj : lista) {
			System.out.println(obj);
		}
	}
	public static void Organize(List<TaskSet> list) {
		Collections.sort(list);
	}
}
