package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		// equals = mais lento e resposta 100%
		// HashCode = resposta rápida porém não é 100%
		
		//String a = "Maria";
		//String b = "Alex";
		
		//System.out.println(a.equals(b));	
		// b = "Maria";
		//System.out.println(a.hashCode());
		//System.out.println(b.hashCode()); 
		// Posso ter objetos diferentes mas pode ocorrer o mesmo resultado
		// Regra de ouro do HashCode se os resultados são diferentes então os objetos são diferentes
		
		// Combinando os dois métodos HashCode para buscar os elementos iguais e depois usar o equals para ter a certeza que são iguais
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		String s1 = "Test";
		String s2 = "Test";
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2); // == vai comparar as referencias de memória
		// São objetos com posições diferentes na memória == ;
		System.out.println(s1 == s2);
		
		
	}

}
