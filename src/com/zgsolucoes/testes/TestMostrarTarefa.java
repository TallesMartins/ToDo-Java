package com.zgsolucoes.testes;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.jupiter.api.Test;
import com.zgsolucoes.classes.MostrarTarefas;
import com.zgsolucoes.classes.TaskSet;

class TestMostrarTarefa {

	@Test
	void test() {
		List<TaskSet> doList = new ArrayList<TaskSet>();
		//Given
		TaskSet task = new TaskSet(5,"cartao teste",new Date(),"teste","Para fazer","descricao teste");
		TaskSet task1 = new TaskSet(2,"cartao teste2",new Date(),"programacao","Para fazer","descricao teste2");
		TaskSet task2 = new TaskSet(3,"cartao teste3",new Date(),"programacao","Para fazer","descricao teste3");
		doList.add(task);
		doList.add(task1);
		doList.add(task2);
		//When
		MostrarTarefas.Organize(doList);
		//Then
		int resultadoEsperado = task1.getPrior();
		
		assertEquals(resultadoEsperado, doList.get(0).getPrior());
	}
}
