package Cinema;

public class Filme {
	private String nome;
	private String diretor;
	private String descricao;
	private String genero;
	private String duracao;
	
	public Filme(String nome, String diretor, String genero, String duracao) {
		this.nome = nome;
		this.diretor = diretor;
		this.genero = genero;
		this.duracao = duracao;
	}
	
	public String getNome() {
		return nome;
	}
	public String getDiretor() {
		return diretor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getGenero() {
		return genero;
	}
	public String getDuracao() {
		return duracao;
	}
}