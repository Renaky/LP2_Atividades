/**
 * 
 */
package lp2_casa;

/**
 * @author Emerson Renaki de Paiva
 *
 */
public class Main {

	public static void main(String[] args) {

		// Teste da classe Quadrado
		Quadrado primeiroQuadrado = new Quadrado();
		primeiroQuadrado.setLado(12);
		
		double areaPrimeiroQuadrado = primeiroQuadrado.calculaArea();
		System.out.println("Area quadrado: " + areaPrimeiroQuadrado);
		
		System.out.println("Desenho quadrado: ");
		primeiroQuadrado.desenhar();
		
		
		//Teste da classe Retangulo
		Retangulo primeiroRetangulo = new Retangulo();
		primeiroRetangulo.setAltura(8);
		primeiroRetangulo.setLado(20);
		
		double areaPrimeiroRetangulo = primeiroRetangulo.calculaArea();
		System.out.println("\nArea Retangulo: "+ areaPrimeiroRetangulo);
		//desenha retangulo
		System.out.println("Desenho Retangulo: ");
		primeiroRetangulo.desenhar();
		
		//------- Fim Retangulo ----------------------
		
		//Teste da classe Triangulo 
		Triangulo primeiroTriangulo = new Triangulo();
		primeiroTriangulo.setBase(10);
		primeiroTriangulo.setAltura(8);
		
		double areaPrimeiroTriangulo = primeiroTriangulo.calculaArea();
		System.out.println("\nArea Triangulo:  "+ areaPrimeiroTriangulo);
		
		//Desenha Triangulo
		System.out.println("Desenho Triangulo: \n ");
		primeiroTriangulo.desenhar();
		//---------------- Fim Triangulo------------------- 
		
		//------------Teste Classe Circulo-----------------
		
		Circulo primeiroCirculo = new Circulo();
		primeiroCirculo.setRaio(12);
		
		double areaPrimeiroCirculo = primeiroCirculo.calculaArea();
		System.out.println("\nArea do Circulo:  "+ areaPrimeiroCirculo);
		//Desenha Circulo
		System.out.println("Desenha Circulo: \n");
		
		
	}
}