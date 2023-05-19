package relacionamentoDeClasses;

import java.util.Scanner;

public class SistemaAgenda {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.println("Por favor, digite o nome da agenda: ");
		String nome = leitor.nextLine();

		Agenda agenda = new Agenda();
		int quantContatosAdd = 0;

		agenda.setNome(nome);

		Contato[] contatos = new Contato[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("Digite o nome do contato " + (i + 1) + ":");
			nome = leitor.nextLine();

			System.out.println("Digite o telefone do contato:");
			String numero = leitor.nextLine();

			System.out.println("Digite o email do contato: ");
			String email = leitor.nextLine();

			Contato c = new Contato();

			c.setNome(nome);
			c.setTelefone(numero);
			c.setEmail(email);

			contatos[i] = c;

			quantContatosAdd++;

		}
		
		String listaDeContatos = listarContatos(agenda, contatos, quantContatosAdd);
		System.out.println(listaDeContatos);

	}

	public static String listarContatos(Agenda agenda, Contato[] contatos, int quantContatosAdd) {
			String junto = "";
			
			for(int i = 0; i < quantContatosAdd; i++) {
				String lista = "\n" +
						"Nome do contato " + (i+1) + ": "+ contatos[i].getNome() + "\n" +
						"Email do contato " + (i+1) + ": "+ contatos[i].getEmail() + "\n" + 
						"Telefone do contato " + (i+1) + ": "+ contatos[i].getTelefone() + "\n";
				junto += lista;
			}
			return "\n" + "Nome da agenda: " + agenda.getNome() + "\n" + junto;
		}
}


