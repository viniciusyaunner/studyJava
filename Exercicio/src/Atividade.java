import java.util.Scanner;

public class Atividade{


	public static void main(String[] args) {
	 Scanner leitor = new Scanner(System.in);
	/*	//LER UM TEXTO
		System.out.println("Nome:");
		String nome = leitor.nextLine();
		//LER UM NÚMERO
		System.out.println("Idade:");
		int idade = leitor.nextInt();
		//LER UM CARACTER
		System.out.println("Sexo:");
		char sexo = (char) leitor.next().charAt(0);
		System.out.println("Nome:" +nome + ",Idade:" +idade+",Sexo:"+sexo);
		
		*/
		System.out.println("digite o Valor 1:");
		double valor1 = leitor.nextDouble();
		
		System.out.println("digite o Valor 2:");
		double valor2 = leitor.nextDouble();
		System.out.println("media= "+(valor1+valor2)/2);
	}
}