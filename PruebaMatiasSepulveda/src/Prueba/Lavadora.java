package Prueba;

public class Lavadora extends Electrodomestico {
	int carga = 5;
	
//constructor por defecto
	public Lavadora() {

	}
	
//contructor con todos los atributos de lavadora
	public Lavadora(int precioBase, int peso) {
    super(precioBase,peso);
	}

public Lavadora(int precioBase, int peso, char consumoEnergetico, String color, int carga) {
	super(precioBase, peso, consumoEnergetico, color);
	this.carga = carga;
}

public int getCarga() {
	return carga;
}
//calcular pago:
public double precioFinal(){
    //Variables: Invocamos el método precioFinal de la clase Electrodomestico
    double monto = super.precioFinal();
    //Creamos el condicional if:
    if (carga > 30 ) {
        monto = monto + 50000;
    }
    return monto;
}
}
		
