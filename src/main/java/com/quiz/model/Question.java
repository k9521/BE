package com.quiz.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import javax.persistence.Id;

@Entity
@Table(name="pytania")
public class Question implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4736005731972980239L;

	@Id private long id;
	
	@Column(name="pytanie")
	private String pytanie;
	
	@Column(name="opcja1")
	private String opcja1;
	
	@Column(name="opcja2")
	private String opcja2;
	
	@Column(name="opcja3")
	private String opcja3;
	
	@Column(name="opcja4")
	private String opcja4;
	
	@Column(name="opcja_poprawna")
	private long opcja_poprawna;
	
	
	protected Question()
	{}
	
	public Question(String pytanie, String opcja1, String opcja2, String opcja3, String opcja4, long opcja_poprawna) {
		this.pytanie=pytanie;
		this.opcja1=opcja1;
		this.opcja2=opcja2;
		this.opcja3=opcja3;
		this.opcja4=opcja4;
		this.opcja_poprawna=opcja_poprawna;
	}
	@Override
	public String toString() {
		return String.format("Question[id=%d, pytanie='%s', opcja1='%s', opcja2='%s', opcja3='%s', opcja4='%s', opcja_poprawna='%s']", id, pytanie, opcja1,opcja2,opcja3,opcja4,opcja_poprawna);
	}

}
