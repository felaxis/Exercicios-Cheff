public class EnderecoDaEscola {
	private String rua;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String pais;

	public EnderecoDaEscola(String rua, int numero, String bairro, String cidade, String estado, String pais) {
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
	}

	public String retornarRua()
	{
		return this.rua;
	}
	public int retornarNumero()
	{
		return this.numero;
	}
	public String retornarBairro()
	{
		return this.bairro;
	}
	public String retornarCidade()
	{
		return this.cidade;
	}
	public String retornarEstado()
	{
		return this.estado;
	}
	public String retornarPais()
	{
		return this.pais;
	}
}