import java.util.Scanner;

public class Ex1 {
	
	public static void main(String[] args) {
		
		 Scanner teclado = new Scanner(System.in);
		 
		 int quantidadePaesProduzidos = 100;
		 int quantidadeHorasProducao = 4;
		 int quantidadeHorasTrabalhadas;
		 int producaoTotalDePaes;
		 
		 System.out.println("Informe a quantidade de horas que deseja ");
		 quantidadeHorasTrabalhadas = teclado.nextInt();
		 
		 producaoTotalDePaes = (quantidadeHorasTrabalhadas * quantidadePaesProduzidos) / quantidadeHorasProducao;
		 
		 System.out.println("Sua produção com " + quantidadeHorasTrabalhadas + " será de " + producaoTotalDePaes + " pães");
		 
		 
	}

}
