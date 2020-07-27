package Prueba;

public class Televisor extends Electrodomestico {
	//atributos
	int resolucion = 20;
	boolean tdt = false;
	
	//constructor por defecto
	public Televisor() {
	}

	
	//Constructor precio y peso
	public Televisor(int precioBase, int peso) {
		super(precioBase,peso);
	}


//constructor resolucion y tdt y heredado
	public Televisor(int precioBase, int peso, char consumoEnergetico, String color, int resolucion, boolean tdt) {
		super(precioBase, peso, consumoEnergetico, color);
		this.resolucion = resolucion;
		this.tdt = tdt;
	}
	
	//metodo get	 
    public int getResolucion() {
		return resolucion;
	}

	public boolean isTdt() {
		return tdt;
	}

	public double precioFinal(){
        //Variables: Invocamos el método precioFinal de la clase Electrodomestico
        double monto = super.precioFinal();
        //Condicional if:
        if (resolucion > 40 ) {
            monto = monto + precioBase*0.3;
        }
        if (tdt=true) {
        	monto = monto + 50000;
        }
        return monto;
    }
		
}
