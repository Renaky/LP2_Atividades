package lp2_casa;
import java.lang.Math;
public class Circulo {
	//atributos
    private double  r, pi=3.1416;
    
	
    //Metodos raio e area
    public void setRaio(double r) {
		if(r > 0) {
			this.r = r;
		}
	}
	/*public void setArea(double area) {
		if(area>0) {
			this.area=area;
		}
	}*/
	
	public double calculaArea() {
		double area = pi* (r*r);
		
		return area; 
}
	
	

	
	
}







