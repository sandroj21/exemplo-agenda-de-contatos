package relacionamentoDeClasses;

import java.util.Scanner;

public class Agenda {

	private String nome;
	private Contato[] contatos;
	
	public Agenda() {
		contatos = new Contato[3];
	}
	
	public Agenda(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Contato[] getContato() {
		return contatos;
	}
	
	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}
	
	
}
