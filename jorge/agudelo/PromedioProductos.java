package jorge.agudelo;

import java.util.Scanner;

public class PromedioProductos {

	public static void promedio() {
		/* DECLARACIÓN DE VARIABLES */
		Scanner teclado = new Scanner(System.in);
		int cantidadProductos;
		double sumatoriaProductos = 0;
		double primedioProductos;
		String productosTexto = "";
		/* IMPRIME PRINT */
		System.out.println("Seleccionó la optión (3) Promedio: ");
		System.out.println("Cuantos productos desea ingresar: (Maximo 5)");
		cantidadProductos = teclado.nextInt();
		
		/* ARRAY DOUBLE LISTA PARA ALMECENAR VALOR PRODUCTOS */
		double preciosProductos[] = new double[cantidadProductos];
		
		/* VALIDA QUE EL VALOR CAPTURADO CUMPLA ENTRE 1 Y 5*/
		if (cantidadProductos > 0 && cantidadProductos <= 5) {
			/* SE CAPTURA Y ALMACENA EN ARRAY VALOR PRODUCTO */
			for (int i = 0; i < cantidadProductos; i++) {
				System.out.println("Ingrese el valor del producto #"+(i+1)+": ");
				preciosProductos[i] = teclado.nextDouble();
			}
			
			for (int i = 0; i < preciosProductos.length; i++) {
				// sumamos
				sumatoriaProductos = preciosProductos[i] + sumatoriaProductos;
				// para mostrarlos, los almacenamos en la variable texto
				productosTexto = productosTexto + " , " + preciosProductos[i];
			}
			/*CALCULAMOS PROMEDIO */
			primedioProductos = sumatoriaProductos / cantidadProductos;
			/* IMPRIMIMOS */
			System.out.println("Primedio de productos ["+productosTexto+"] es: ");
			System.out.println(primedioProductos);
			
			System.out.println("FIN (3)");
		}
		else {
			System.out.println("Valor ingresado invalido: Cantidad maxima 5, minima 1.");
		}
		teclado.close();
	}

}
