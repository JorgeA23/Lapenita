package jorge.agudelo;

import java.util.Scanner;

public class MultiplicarProductos {

	public static void multiplicar() {
		/*DECLARACIÓN VARIABLES */
		Scanner teclado = new Scanner(System.in);
		int cantidadProductos;
		/*IMPRIME */
		System.out.println("Seleccionó la optión (2) Multiplicar: ");
		System.out.println("Cuantos productos desea ingresar: (Maximo 5)");
		cantidadProductos = teclado.nextInt();		
		
		/* VALIDA QUE EL VALOR CAPTURADO CUMPLA ENTRE 1 Y 5*/
		if (cantidadProductos > 0 && cantidadProductos <= 5) {
			/* FOR PARA MULTIPLICAR CADA PRODUCTO CON LO QUE INGRESE EL USUARIO */
			for (int i = 0; i < cantidadProductos; i++) {
				System.out.println("_______________________________");
				System.out.println("Ingrese el valor del producto #"+(i+1)+": ");
				double valorProducto = teclado.nextDouble();
				System.out.println("Cantidad de productos "+(i+1)+": ");
				int cantidadProducto = teclado.nextInt();
				/*CALCULO EN PRINT */
				System.out.println("Valor total: "+(valorProducto*cantidadProducto));
			}
			System.out.println("FIN (2)");
		}
		else {
			System.out.println("Valor ingresado invalido: Cantidad maxima 5, minima 1.");
		}
		teclado.close();
	}

}
