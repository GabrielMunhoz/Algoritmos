
public class Especial extends Conta {

	private double limite;
public Especial() {
	limite = 300;	
}
public String mostraLimite() {
	
	return "\nLimite : ["+limite+"]";
}

public void sacar(double d) {
	if(d>0) {
		limite -=d;
	}
	
}
	
}
