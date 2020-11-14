package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuentes;
import entities.fisica;
import entities.juridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Contribuentes> list = new ArrayList<>();
		
		System.out.println("Entre com numero de contribuentes: ");
		int n = sc.nextInt();
		for (int i = 1; i<=n; i++) {
			System.out.println("Conta PF (i) ou PJ (c) ?");
			char ch = sc.next().charAt(0);
			if (ch == 'i') {
				System.out.println("Digite o pagador " + i + ":");
				sc.nextLine();
				String name = sc.nextLine();
				
				System.out.println("Digite a renda: ");
				double renda = sc.nextDouble();
				System.out.println("Digite os gastos com saude: ");
				double gastosSaude = sc.nextDouble();
				
				list.add(new fisica(name,renda,gastosSaude));
			}
			
			else {
				System.out.println("Digite o nome da empresa: ");
				sc.nextLine();
				String name = sc.nextLine();
				
				System.out.println("Digite a receita da empresa: ");
				double renda = sc.nextDouble();
				System.out.println("Digite a quantidade de funcionarios: ");
				int numeroFuncionarios = sc.nextInt();
				
				list.add(new juridica(name,renda,numeroFuncionarios));
			}
			
		}
		System.out.println("Taxas que foram pagas:");
		
		double soma = 0.0;
				
		for (Contribuentes com : list ) {
			double tax = com.taxa();
			System.out.println(com.getName() + ": $ " + String.format("%.2f", tax));
			soma +=tax;
			
		}
		
		System.out.println("Total das taxas pagas: " + soma);
		
		for (Contribuentes nome : list ) {
			System.out.println(nome.getName());
		}
		
		
		
		
		
		
	sc.close();
	}

	

}
