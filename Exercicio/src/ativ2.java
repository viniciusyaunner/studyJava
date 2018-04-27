import java.util.ArrayList;
import java.util.Scanner;

public class ativ2 {

	public static void main(String[] args) {
		ArrayList carros = new ArrayList();
		Scanner le = new Scanner(System.in);
		System.out.println("digite o o nome do carro: ");
		String C = le.nextLine();
		System.out.println("digite o o nome do carro: ");
		String C2 = le.nextLine();
		System.out.println("digite o o nome do carro: ");
		String C3 = le.nextLine();
		System.out.println("digite o o nome do carro: ");
		String C4 = le.nextLine();
		carros.add(C);
		carros.add(C2);
		carros.add(C3);
		carros.add(C4);

		carros.add("Celta");
		for (int i =0; i <carros.size(); i++){
			System.out.println("O CARRO É: " + carros.get(i));
		}
	}
}
