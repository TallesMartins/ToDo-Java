package com.zgsolucoes.classes;

import java.util.List;

public class RemoverTask {
	public static void RemoveTask(List<TaskSet> lista, int index){
		lista.remove(index - 1);
	}
}
