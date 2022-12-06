package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		// informações de um funcionario
		
		// Tipos Numericos Inteiros
		// os casos de letra no final, por mais q se especifique o tipo no começo tem q colocar a letra
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 2_134_845_223; // é possivel separar um numero usando underline == 2.134.845.223
		// long pontosAcumulados2 = 3_134_845_223L; // por padrao todo numero do tipo long ainda é int, portanto tem q colocar L no final, literal do tipo long 
		
		// Tipos Numéricos Reais
		float salario = 11_880.2F; // por padrao todo numero ponto flutuante é do tipo double, portando tem que colocar F no final 
		double vendasAcumuladas = 2_991_797_103.01;
			// a notação abaixo também é válida
				// double teste = 291797103.01;
		
		// tipo booleano
		boolean estaDeFerias = false; // true
		
		// tipo caractere
		char status = 'A'; // Ativo
		// char statusCode = '\u0010'; // codigo para um caractere, precisa do \\u
			// exemplos do que não pode ser feito:
				// char teste2 = "AT"; -> tipo char aceita somente um caracter
				
		// dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// numeros de viagens
		System.out.println(numeroDeVoos / 2);
		
		// pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Ferias: " + estaDeFerias);
		System.out.println("Status: " + status);
			
		
	}

}
