package application;

public class Program {

	public static void main(String[] args) {
		// equals = mais lento e resposta 100%
		// HashCode = resposta rápida porém não é 100%
		
		String a = "Maria";
		String b = "Alex";
		
		System.out.println(a.equals(b));	
		// b = "Maria";
		System.out.println(a.hashCode());
		System.out.println(b.hashCode()); 
		// Posso ter objetos diferentes mas pode ocorrer o mesmo resultado
		// Regra de ouro do HashCode se os resultados são diferentes então os objetos são diferentes
		
		// Combinando os dois métodos HashCode para buscar os elementos iguais e depois usar o equals para ter a certeza que são iguais
		
		
	}

}
