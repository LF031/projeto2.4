import java.util.*;
public class Exercicio2_4 {

	public static void main(String[] args) {
		// 1 - Variaveis
		int votosCandA_S1;
		int votosCandA_S2;
		int votosCandB_S1;
		int votosCandB_S2;
		int votosCandC_S1;
		int votosCandC_S2;
		int totalVotosCandA;
		int totalVotosCandB;
		int totalVotosCandC;
		Scanner leia = new Scanner(System.in);
		
		// 2 - Entrada de dados
		System.out.print("Digite a quantidade de votos do Candidato A na secao 1:");
		votosCandA_S1 = leia.nextInt();
		
		System.out.print("Digite a quantidade de votos do Candidato A na secao 2:");
		votosCandA_S2 = leia.nextInt();
		
		System.out.print("Digite a quantidade de votos do Candidato B na secao 1:");
		votosCandB_S1 = leia.nextInt();
		
		System.out.print("Digite a quantidade de votos do Candidato B na secao 2:");
		votosCandB_S2 = leia.nextInt();
		
		System.out.print("Digite a quantidade de votos do Candidato C na secao 1:");
		votosCandC_S1 = leia.nextInt();
		
		System.out.print("Digite a quantidade de votos do Candidato C na secao 2:");
		votosCandC_S2 = leia.nextInt();
		
		// 3 - calculos
		totalVotosCandA = votosCandA_S1 + votosCandA_S2;
		totalVotosCandB = votosCandB_S1 + votosCandB_S2;
		totalVotosCandC = votosCandC_S1 + votosCandC_S2;
		
		if (totalVotosCandA > totalVotosCandB && totalVotosCandA > totalVotosCandC) {
			System.out.println("O Candidato A foi o vencedor!");
		} else if (totalVotosCandB > totalVotosCandC) {
			System.out.println("O Candidato B foi o vencedor!");
		} else {
			System.out.println("O Candidato C foi o vencedor!");
		}
		
	}

}
