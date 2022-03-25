package lp2_casa;

public class Triangulo {

    private double  base;
    private double altura;
	
	// Métodos
	
    
	public void setBase(double base) {
		if(base > 0) {
			this.base = base;
		}
	}
	public void setAltura(double altura) {
		if(altura>0) {
			this.altura=altura;
			
			
			
		}
	}
	
		
		
		
		
		// metodo calculador de area
		public double calculaArea() {
		double area = (base * altura)/2;
		
		return area; 
		}
		//Metodo Desenha 2 triangulos retangulos, formando 1 triangulo equilatero (ou não)
		public void desenhar() {
				
				
			for(double i=1 ; i<=altura; i++){
							
						for(double j= 1; j<=i; j++){

								System.out.print("*");
							}
					                System.out.println("");                    
						}
				for(double i= altura-1; i>=1; i--){
					
					for(double j= i; j>=1; j--){

						System.out.print("*");
					}
			                System.out.println("");                    
				}
		
}
		
}


