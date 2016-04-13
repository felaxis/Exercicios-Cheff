public class Escola {
	private String nome;
	private int codigoDoInep;
	private String email;
	private int numeroDeAlunos;
	private String telefone;
	private String nomeDoDiretor;
	private EnderecoDaEscola endereco;
	private int alunosDaEscola;
	

	private Escola(String nome, int codigoDoInep, String email, int quantidadeDeAlunos, String telefone, String nomeDoDiretor, EnderecoDaEscola endereco, int alunosDaEscola) {
		this.nome = nome;
		this.codigoDoInep = codigoDoInep;
		this.email = email;
		this.alunosDaEscola = alunosDaEscola;
		this.telefone = telefone;
		this.nomeDoDiretor = nomeDoDiretor;
		this.endereco = endereco;
		this.alunosDaEscola = alunosDaEscola;
	}
	
	public static Escola criarEscola(String nome, int codigoDoInep, String email, String telefone, String nomeDoDiretor, EnderecoDaEscola enderecoDaEscola, alunosDaEscola) {
		if (alunosDaEscola < 100) {
			System.out.println("Não foi possível criar a escola, o número de alunos é muito baixo.");
			return null;
		} else {
			return new Escola(nome, codigoDoInep, email, alunosDaEscola, telefone, nomeDoDiretor, enderecoDaEscola,);
		}
	}

	public String retornarNomeDaEscola() {
		return this.nome;
	}

	public String retornarNomeDoDiretor() {
		return this.nomeDoDiretor;
	}
	public EnderecoDaEscola retornarEnderecoDaEscola(){
		return this.endereco;
	}
	public int retornarquantidadeDeAlunos(){
		return this.numeroDeAlunos;
	}
}