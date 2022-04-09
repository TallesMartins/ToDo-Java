package com.zgsolucoes.testes;

import static org.junit.jupiter.api.Assertions.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.zgsolucoes.classes.AtualizarLista;
import com.zgsolucoes.classes.TaskSet;

class TestAtualizarLista {

	@Test
	void test() throws ParseException {
		List<TaskSet> doList = new ArrayList<TaskSet>();
		TaskSet task = new TaskSet();
		
		String modelo = "yyyy-MM-dd";
		SimpleDateFormat data = new SimpleDateFormat(modelo);
		
		Date dataTermino = data.parse("2022-12-25");
		//Given
		task.setNameT("cartao teste");
		
		task.setCategory("teste");
		task.setDescription("descricao teste");
		task.setPrior(1);
		task.setStatus("Para Fazer");
		task.setDateE(dataTermino);
		doList.add(task);
		//When
		AtualizarLista.AtualizaLista(doList,0,2,"cartao teste1");
		//Then
		String resultadoEsperado = "cartao teste1";

		
		assertEquals(resultadoEsperado, task.getNameT());
	}

}
