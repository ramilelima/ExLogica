import java.util.Scanner;

public class Ex4 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int quantidadeSandPorHora = 120;
		int funcionariosTrabalhando = 4;
		int futurosFuncionarios;
		int futuraProdFunc;
		int futuraProducao;
		
		System.out.println("Informe a quantidade de funcionarios que deseja contratar ");
		futurosFuncionarios = teclado.nextInt();
		
		futuraProdFunc = (futurosFuncionarios + funcionariosTrabalhando);
		
		futuraProducao = (futuraProdFunc * quantidadeSandPorHora);
		
		System.out.println("Sua nova produção de pães com " + futuraProdFunc + " será de " + futuraProducao);
		
	}

}
