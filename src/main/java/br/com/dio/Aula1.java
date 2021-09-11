package br.com.dio;

import br.com.dio.model.Gato;

public class Aula1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gato gato = new Gato();
		Livro livro = new Livro();
		System.out.println(gato);
		System.out.println(livro);
		/*int a = 5;
		int b = 6;
		System.out.println("Hello World " + (a + b));*/
	}

}
/*Uma class pode ser criada dentro do mesmo modulo não predisa ser importada.*/

class Livro {
	private String nome;
	private String nropag;
}
