package Cinema;

import java.util.Scanner;
public class MenuController {
	static String filmeEscolhido2;
	static String sessaoEscolhida2;
	static int quantidadeInteiro2;
	static int quantidadeMeia2;
	static double valorTotal2;

	public static void menuFilme() {
		Filme filme1 = new Filme("The Clockwork Orange", "Stanley Kubrick", "Sci-fi", "136 min");
		Filme filme2 = new Filme("The Godfather", "Francis Ford Coppola", "Crime fiction", "175 min");
		Filme filme3 = new Filme("Forest Gump", "Robert Zemeckis", "Comedy drama", "142 min");
		Filme filme4 = new Filme("Into The Wild", "Sean Penn", "Adventure drama", "148 min");
			filme1.setDescricao("In the future, a sadistic gang leader is imprisoned and volunteers for a conduct-aversion experiment, but it doesn't go as planned.");
			filme2.setDescricao("A mafia family struggles to establish supremacy in the United States after World War II. An assassination attempt leaves boss Vito Corleone incapacitated and forces sons Michael and Sonny to take over the business.");
			filme3.setDescricao("Even with slow thinking, Forrest Gump never felt disadvantaged. Thanks to his mother's support, he had a normal life. Whether on the football field as a sports star, fighting in Vietnam or captaining a shrimp boat, Forrest inspires everyone with his optimism. But the person Forrest loves most may be the hardest to save: his childhood sweetheart, sweet and troubled Jenny.");
			filme4.setDescricao("Christopher McCandless, the son of wealthy parents, graduates from Emory University as a top student and athlete. However, instead of embarking on a prestigious and lucrative career, he chooses to donate his savings to charity, get rid of his belongings and travel to Alaska.");
		
		
		String[] filmes = {"The Clockwork Orange", "The Godfather", "Forest Gump", "Into The Wild"};

		System.out.println("Digite o código do filme desejado: ");
		System.out.println("1 - "+filme1.getNome()+".");
		System.out.println("  Diretor: "+filme1.getDiretor()+".");
		System.out.println("  Descrição: "+filme1.getDescricao()+".");
		System.out.println("  Gênero: "+filme1.getGenero()+".");
		System.out.println("  Duração: "+filme1.getDuracao()+".");
		System.out.println("");
		
		System.out.println("2 - "+filme2.getNome()+".");
		System.out.println("  Diretor: "+filme2.getDiretor()+".");
		System.out.println("  Descrição: "+filme2.getDescricao()+".");
		System.out.println("  Gênero: "+filme2.getGenero()+".");
		System.out.println("  Duração: "+filme2.getDuracao()+".");
		System.out.println("");
		
		System.out.println("3 - "+filme3.getNome()+".");
		System.out.println("  Diretor: "+filme3.getDiretor()+".");
		System.out.println("  Descrição: "+filme3.getDescricao()+".");
		System.out.println("  Gênero: "+filme3.getGenero()+".");
		System.out.println("  Duração: "+filme3.getDuracao()+".");
		System.out.println("");
		
		System.out.println("4 - "+filme4.getNome()+".");
		System.out.println("  Diretor: "+filme4.getDiretor()+".");
		System.out.println("  Descrição: "+filme4.getDescricao()+".");
		System.out.println("  Gênero: "+filme4.getGenero()+".");
		System.out.println("  Duração: "+filme4.getDuracao()+".");
		
		Scanner entrada = new Scanner(System.in);
		int filmeDigitado = entrada.nextInt();
		String filmeNoVetor = filmes[filmeDigitado-1];
		System.out.println("Filme: "+filmeNoVetor);
		filmeEscolhido2 = filmeNoVetor;
	
	}
	public static void menuSessao() {
		String[] horarios = {"13:30","15:10","17:30"};
		System.out.println("Digite o código da sessão desejada:");
		System.out.println("1 - 13:30");
		System.out.println("2 - 15:10");
		System.out.println("3 - 17:30");
		
		Scanner entrada = new Scanner(System.in);
		int sessaoDigitada = entrada.nextInt();
		String sessaoNoVetor = horarios[sessaoDigitada -1];
		System.out.println("Sessão: "+sessaoNoVetor);
		sessaoEscolhida2 = sessaoNoVetor;
	}
	
	public static void menuIngresso() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Valor do Ingresso Integral: R$24,00. Meia Entrada: R$12,00.");
		System.out.println("Digite quantos ingressos inteiros: ");
		int quantidadeInteiro = entrada.nextInt();
		System.out.println("Digite quantos ingressos meia-entrada: ");
		int quantidadeMeia = entrada.nextInt();
		
		double valorInteiro = 24;
		double valorMeia = 12;
		double valorTotal = valorInteiro * quantidadeInteiro + valorMeia * quantidadeMeia;
		System.out.println("Valor total: R$"+valorTotal);
		quantidadeInteiro2 = quantidadeInteiro;
		quantidadeMeia2 = quantidadeMeia;
		valorTotal2 = valorTotal;
	}
	
	public static void resultadoFinal() {
		System.out.println("Ingresso comprado!");
		System.out.println("  Filme: "+ filmeEscolhido2);
		System.out.println("  Sessão: "+ sessaoEscolhida2);
		System.out.println("  Ingressos: ");
		System.out.println("  Inteiros: "+quantidadeInteiro2);
		System.out.println("  Meia entrada: "+quantidadeMeia2);
		System.out.println("  Valor total: R$"+valorTotal2);
	}

}