
public class Conta {
	private double saldo;
public Conta() {
	this.saldo = 200.00;
}
public void depositar(double d) {
	this.saldo += d;
	
}
public void sacar(double d) {
	this.saldo -= d;
	
}
public String imprime() {
	
	return "Saldo: ["+saldo+"]";
}
}
