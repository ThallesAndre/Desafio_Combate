package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Champion champion1,champion2;
		int N;

		System.out.println("Digite os dados do primeiro campeao:");
		System.out.print("Nome: ");
		String name = sc.next();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		System.out.print("Armadura: ");
		int armor = sc.nextInt();
		champion1 = new Champion (name,life,attack,armor);
		System.out.println("");
		
		
		System.out.println("Digite os dados do primeiro campeao:");
		System.out.print("Nome: ");
		 name = sc.next();
		System.out.print("Vida inicial: ");
		life = sc.nextInt();
		System.out.print("Ataque: ");
		attack = sc.nextInt();
		System.out.print("Armadura: ");
		armor = sc.nextInt();
		champion2 = new Champion (name,life,attack,armor);
		System.out.println("");
		System.out.print("Quantos turnos voce deseja executar? ");
		
		N = sc.nextInt();
		System.out.println();
		
		int i = 1;
		while (i <= N && champion1.getLife() > 0 && champion2.getLife() > 0) {
			System.out.println("Resultado do turno " + i + ":");
			champion1.takeDamage(champion2);
			System.out.println(champion1.status()); 
			champion2.takeDamage(champion1);
			System.out.println(champion2.status());
			System.out.println();
			i++;
		}
		
		System.out.println("FIM DO COMBATE");
		
		sc.close();
	}
		
	
	
}