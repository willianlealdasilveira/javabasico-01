package br.fai.projeto01;

public class Main {

	public static void main(String[] args) {
		
		Main app = new Main();
		app.start();

	}

	 private void start()
	 {
		int idade = 15;
		System.out.println("A idade �  de  "+idade+ " anos.");
		idade+=5;
		idade*=2;
		System.out.println("resultado1 " +idade);
		idade-=5;
		System.out.println("resultado2 "+idade);
		
		if (idade>20) {
			
			System.out.println("A idade � maior que 20 ");
		}else {
			System.out.println("A idade � menor que 20");
			
		}
		
	 }
}
