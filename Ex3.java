import java.util.Scanner;

public class Ex3 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int votovalido;
		int votobranco;
		int votonulo;
		int totalDeEleitores;
		
		System.out.println("Informe a quantidade de votos v�lidos ");
		votovalido = teclado.nextInt();
		
		System.out.println("Informe a quantidade de votos brancos ");
		votobranco =  teclado.nextInt();
		
		System.out.println("Informe a quantidade de votos nulos");
		votonulo = teclado.nextInt();
		
		totalDeEleitores = votovalido + votobranco + votonulo;
		
		System.out.println("A quantidade total de votos � de " + totalDeEleitores);
		
		double percVotoValido;
		double percVotoBranco;
		double percVotoNulo;
		
		percVotoValido = (votovalido * 100) / totalDeEleitores;
	
		System.out.println("A porcentagem da quantidade de votos v�lidos � de " + percVotoValido);
		
		percVotoBranco = (votobranco * 100) / totalDeEleitores;
		
		System.out.println("A porcentagem da quantidade de votos brancos � de " + percVotoBranco);
		
		percVotoNulo = (votonulo * 100) / totalDeEleitores;
		
		System.out.println("A porcentagem da quantidade de votos nulos � de " + percVotoBranco);
		
	}

}
