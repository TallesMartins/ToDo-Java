package com.zgsolucoes.testes;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.zgsolucoes.classes.TaskSet;

class TestCriarTarefa {

	@Test
	void test() throws ParseException {
		List<TaskSet> doList = new ArrayList<TaskSet>();
		TaskSet task = new TaskSet();
		//Given
		String modelo = "yyyy-MM-dd";
		SimpleDateFormat data = new SimpleDateFormat(modelo);
		
		Date dataTermino = data.parse("2022-12-25");
		
		//When
		task.setNameT("cartao teste");
		task.setCategory("teste");
		task.setDescription("descricao teste");
		task.setPrior(1);
		task.setStatus("Para Fazer");
		task.setDateE(dataTermino);
		doList.add(task);
		//Then
		String resultadoEsperado = "cartao teste";
		assertEquals(resultadoEsperado, doList.get(0).getNameT());
	}

}
