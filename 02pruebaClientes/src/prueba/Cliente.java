package prueba;

public class Cliente {
	//Atributos
	public String nombre;
	public int saldo;
	//Constructor
	public Cliente(String nombre, int saldo) {
		this.nombre = nombre;
		this.saldo = saldo;
	}
	//Mas metodos
	public void depositar(int cant){
		saldo=saldo+cant;
	}
	public void extraer(int cant){
		saldo=saldo-cant;
	}

	//MODIFICACI�N DE LAS 11:00
	//MODIFICACION DESDE EL SERVIDOR 12:00
	

	public static void main(String[] args) {

		String n1="Pepe";
		int s1=1000;
		Cliente c1= new Cliente(n1,s1);
		//Cliente c1= new Cliente("Pepe",500);
		System.out.println("He creado a "+c1.nombre);
		System.out.println("Saldo inicial: "+c1.saldo);
		c1.depositar(200);
		System.out.println("Saldo tras depositar: "+c1.saldo);
		c1.extraer(50);
		System.out.print("Saldo tras extraer: "+c1.saldo);
		
	}

}
