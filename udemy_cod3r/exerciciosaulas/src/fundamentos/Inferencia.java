package fundamentos;

public class Inferencia {
//	 JAVA LINGUAGEM FORTEMENTE TIPADA!!!!!!
	public static void main(String[] args) {
		var b = 4.5;
		var c = "Texto";
		c = "Outro Texto";
		
//		 c = 4.5; ERRADO!
//		 B = "Texto"; ERRADO! dps de inferir um tipo n pode mudar
		
		b = 12; // FICARÁ DEFINIDO COMO DOUBLE: 12.0;
		System.out.println(b + c);
		
		
//		 var e; errado!, NA INFERENCIA JA TEM Q INICIALIZAR
//		 var e = valorX; CORRETO!
		
//		TIPOS PRIMITIVOS EM JAVA:
//			8 TIPOS:
//				6 TIPOS NUMERICOS:
//					4 TIPOS INTEIROS:
//						Byte = 1 byte = 8 bits -> MENOR TIPO INTEIRO EM JAVA: -128 ate +127
//						Short = 2 bytes = 16bits -> + ou - 32k
//						Int = 4 bytes = 32bits 
//						Long = 8 bytes = 64 bits
//					2 Tipos Flutuantes
//						Float = 4 bytes
//						Double = 8 byte
//				* REPRESENTAÇÃO DE UM BYTE: 
//					|+-|||||||| -> O primeiro digito (bit mais significativo) representa um numero negativo(1)/positivo(0)
//				OUTRO TIPO CHAR:
//					Caractere = 1byte = 'a', '1'
//				OUTRO TIPO BOOLEAN:
//					true or false = 1 or 0; 
			
	}

}
