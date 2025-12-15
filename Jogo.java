package Projeto;

import java.util.Scanner;

public class Jogo {
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		//sistema de batalha
		int hp, hpInimigo, escolha;
		
		
		System.out.println("Segurança Roger está te chamando pra briga\n\n");
		
		//Criar metodo EscolherGolpe(); aonde tem os HPs
		//Essa metodo chama outroMetodo do Golpe que atualiza os HPs
		//Criar metodo Verificar HP;
		
	do { 
		
		
		System.out.println("HP Inimigo:"+ hpInimigo);
		System.out.println("HP:"+hp);
		
		System.out.println("\n\nO que deseja fazer ?");
		
		System.out.println("1 - Soco Rapido");
		System.out.println("2 - Chute Lateral");
		System.out.println("3 - Recuperar Folego");
		 escolha = input.nextInt();
		
	
	if(escolha == 1 || escolha == 2 || escolha == 3 ) {		
		
	
		switch (escolha) {
		case 1:
			hpInimigo = SocoRapido(hpInimigo);
			break;
		
		case 2:
			hpInimigo = ChuteLateral(hpInimigo);
			break;
			
		case 3:	
			hp= RecuperarFolego(hp);
			}
	}else {
			System.out.println("\nErrou o golpe");
		}
	


	
	}while(hp >1 || hpInimigo>1);
	
	}

	private static int RecuperarFolego(int hp) {
		System.out.println("Você está se concentrando e recuperando o folego");
		int retorno = hp+8;
		return retorno;
	}

	private static int ChuteLateral(int hpInimigo) {
		System.out.println("Você usou Chute Lateral");
		int retorno = hpInimigo - 10;
		return hpInimigo;
	}

	private static int SocoRapido(int hpInimigo) {
		System.out.println("Você usou Soco Rapido");
		int retorno = hpInimigo - 5;
		return hpInimigo;
	}
}