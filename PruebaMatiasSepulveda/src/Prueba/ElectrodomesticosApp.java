package Prueba;

public class ElectrodomesticosApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        //Creamos un array de Electrodomesticos
        Electrodomestico listaElectrodomesticos[]=new Electrodomestico[10];
   
        //Asignamos cada una de las posiciones como queramos
        listaElectrodomesticos[0]=new Electrodomestico(200000, 60, 'C', "Verde");
        listaElectrodomesticos[1]=new Lavadora(150000, 30);
        listaElectrodomesticos[2]=new Televisor(500000, 80, 'E', "negro", 42, false);
        listaElectrodomesticos[3]=new Electrodomestico();
        listaElectrodomesticos[4]=new Electrodomestico(600000, 20, 'D', "gris");
        listaElectrodomesticos[5]=new Lavadora(300000, 40, 'Z', "blanco", 40);
        listaElectrodomesticos[6]=new Televisor(250000, 70);
        listaElectrodomesticos[7]=new Lavadora(400000, 100, 'A', "verde", 15);
        listaElectrodomesticos[8]=new Televisor(200000, 60, 'C', "naranja", 30, true);
        listaElectrodomesticos[9]=new Electrodomestico(50000, 10);
   
        //Creamos las variables que usaremos para almacenar la suma de los precios
        double sumaElectrodomesticos=0;
        double sumaTelevisores=0;
        double sumaLavadoras=0;
   
        //Recorremos el array invocando el metodo precioFinal
        for(int i=0;i<listaElectrodomesticos.length;i++){
            /*
             * Cuando una Television o una Lavadora este en la posicion del array actual,
             * pasara por su clase y por la de electrodomestico, ya que una television es un electrodomestico.
             * Ejecutamos en cada uno su propia version del metodo precioFinal
             */
   
            if(listaElectrodomesticos[i] instanceof Electrodomestico){
                sumaElectrodomesticos = sumaElectrodomesticos + listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Lavadora){
                sumaLavadoras = sumaLavadoras + listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Televisor){
                sumaTelevisores = sumaTelevisores + listaElectrodomesticos[i].precioFinal();
            }
        }
   
        //Mostramos los resultados
        System.out.println("La suma del precio de los electrodomesticos es de "+sumaElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es de "+sumaLavadoras);
        System.out.println("La suma del precio de las televisiones es de "+sumaTelevisores);
   
    }
   
}