import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		double lado, area;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o lado do quadrado ");
		lado = teclado.nextDouble();
		
		area = lado*lado;
		
		System.out.println("O dobro da area do quadrado e "+ (area*2));
		
		teclado.close();
	}

}
