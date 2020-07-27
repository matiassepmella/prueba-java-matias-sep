package Prueba;

public class Electrodomestico {

//atributos
	int precioBase = 100000;
	String color = "blanco";
	char consumoEnergetico = 'f'; //(letras entre A y F) //hereda
	int peso = 5;

	//contructores
	//contructor por defecto
	public Electrodomestico() {
	}
	//contructor precio y peso
	public Electrodomestico(int precioBase, int peso) {
		this.precioBase = precioBase;
		this.peso = peso;
	}
	//contructor con todos los atributos
	public Electrodomestico(int precioBase, int peso, char consumoEnergetico, String color) {

		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}
	public int getPrecioBase() {
		return precioBase;
	}
	public String getColor() {
		return color;
	}
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}
	public int getPeso() {
		return peso;
	} 
	//calcular pago:
    public double precioFinal(){
        //Variables:
        double monto = 0;
        //Creamos un switch para que determine el tipo de consumo electrico 
        //(si es tipo A al monto se le suma 100000, si es tipo f se le suma 10000):
        switch (consumoEnergetico) {
            case 'a':
                monto = monto + 100000;
                break;
            case 'b':
                monto = monto + 80000;
                break;
            case 'c':
                monto = monto + 60000;
                break;
            case 'd':
                monto = monto + 50000;
                break;
            case 'e':
                monto = monto + 30000;
                break;
            case 'f':
                monto = monto + 10000;
                break;
        }
        //Creamos el metodo if, el cual permitira que identifiquemos que digitos
        //son de "Peso". Ademas, con el if calcularemos el monto del peso segun 
        //la tabla "Peso del aparato"
        if (peso >= 0 && peso <= 19) {
            monto = monto + 10000;
        } else if (peso == 20 && peso <= 49) {
            monto = monto + 50000;
        } else if (peso == 50 && peso <= 79) {
            monto = monto + 80000;
        }else if (peso > 79) {
            monto = monto + 100000;
        }
        //Creamos un return, donde regresara el valor del precio base y lo sumara
        //con el monto calculado de acuerdo a lo establecido en el ejercicio.
        return precioBase + monto;
    }
	
	
	
}
