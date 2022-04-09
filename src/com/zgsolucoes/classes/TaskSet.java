package com.zgsolucoes.classes;
import java.util.Date;

public class TaskSet implements Comparable<TaskSet>{
	
	int prior;
	String nameT, category, status,description;
	Date dateE;
	public TaskSet(int prior, String nameT, Date dateE, String category, String status, String description) {
		super();
		this.prior = prior;
		this.nameT = nameT;
		this.dateE = dateE;
		this.category = category;
		this.status = status;
		this.description = description;
	}
	
	public TaskSet() {
		
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrior() {
		return prior;
	}
	public void setPrior(int prior) {
		this.prior = prior;
	}
	public String getNameT() {
		return nameT;
	}
	public void setNameT(String nameT) {
		this.nameT = nameT;
	}
	public Date getDateE() {
		return dateE;
	}
	public void setDateE(Date date) {
		this.dateE = date;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String toString() {
		return "Lista [Nome = " + nameT + ",\n Categoria = " + category + ",\n Prioridade = " + prior + ",\n Status = " + status
				+ ",\n Descrição = " + description + ",\n Data de término=" + dateE + "]";
	}
	
	public int compareTo(TaskSet o) {
		if(prior > o.prior) {
			return 1;
		}if(prior < o.prior) {
			return -1;
		}else {
			return 0;
		}
	}
	
	
	
}
