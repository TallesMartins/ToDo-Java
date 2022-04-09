package com.zgsolucoes.testes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.zgsolucoes.classes.RemoverTask;
import com.zgsolucoes.classes.TaskSet;

class TestRemoveTask {

	@Test
	void TestRemoverTarefaDaLista(){
		
		List<TaskSet> doList = new ArrayList<TaskSet>();
		//Given
		TaskSet task = new TaskSet(5,"cartao teste",new Date(),"teste","Para fazer","descricao teste");
		TaskSet task1 = new TaskSet(2,"cartao teste2",new Date(),"programacao","Para fazer","descricao teste2");
		TaskSet task2 = new TaskSet(2,"cartao teste3",new Date(),"programacao","Para fazer","descricao teste3");
		doList.add(task);
		doList.add(task1);
		doList.add(task2);
		
		//When
		RemoverTask.RemoveTask(doList, 2);
		//Then
		int resultadoEsperado = 2;
		
		assertEquals(resultadoEsperado, doList.size());
		
	}

}
