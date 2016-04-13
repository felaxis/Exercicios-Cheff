public class TesteEscola {
	public static void main(String[] args) {
		EnderecoDaEscola enderecoDaEscola = new EnderecoDaEscola("Avenida Afonso Pena", 111, "Centro", "Sidrolândia", "Mato Grosso do Sul", "Uruguai");
		Escola escola = Escola.criarEscola("EE Anália Franco", 694949196, "analiafranco@sed.gov.br", "(67) 3201-4595", "Adalberto Braga e Braga", enderecoDaEscola);

		if (escola != null) {
			System.out.println("Cadastro realizado com sucesso, seguem dados da escola: ");
			System.out.println(" ");
			System.out.println("Nome: " + escola.retornarNomeDaEscola());

			System.out.println("Diretor: " + escola.retornarNomeDoDiretor());
			System.out.print("Endereço: " +escola.retornarEnderecoDaEscola().retornarRua() +", ");
			System.out.print(escola.retornarEnderecoDaEscola().retornarBairro() + (", "));
			System.out.print(escola.retornarEnderecoDaEscola().retornarCidade() + (", "));
			System.out.print(escola.retornarEnderecoDaEscola().retornarEstado() + (", "));
			System.out.println(escola.retornarEnderecoDaEscola().retornarPais());
			
			System.out.println(escola.retornarquantidadeDeAlunos());
		}
	}
}