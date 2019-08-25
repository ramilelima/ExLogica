import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args) {
		 
		Scanner teclado = new Scanner(System.in);
		
		int quantidadeQuilometragem = 240;
		int quantidadeLitros = 20;
		int quantidadeKmDesejado;
		int gasolinaparaviagem;
		
		System.out.println("Informe a quantidade de km que deseja percorrer ");
		quantidadeKmDesejado = teclado.nextInt();
		
		gasolinaparaviagem = (quantidadeKmDesejado * quantidadeQuilometragem) / quantidadeLitros;
		
		System.out.println("Para percorrer " + quantidadeKmDesejado + " você vai precisar de " + gasolinaparaviagem + " litros" );
			
	}

}
