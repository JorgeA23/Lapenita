package jorge.agudelo;

import java.util.Scanner;

public class SumarProductos {

	public static void sumar() {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Opción (1) seleccionada: por favor seleccione el tipo de oparación: \r\n"
				+ "1) Sumar 5 productos (2 precio numerico y 3 precio decimal)\r\n"
				+ "2) Sumar la cantidad de productos deseada");
		int subOpcion = teclado.nextInt();

		switch (subOpcion) {
		case 1:
			sumar5Productos();
			break;
		case 2:
			sumarProductos();
			break;
		default:
			System.out.println("Opción invalida.");
			break;
		}
		teclado.close();

	}

	/**
	 * SUMA 5 PRODUCTOS, 2 NUMERICOS Y 3 DECIMALES Y RETORNA/PRINT RESULTADO
	 */
	private static double sumar5Productos() {

		/* OBJETO LEER TECLADO */
		Scanner teclado = new Scanner(System.in);
		/* DECLARACIÓN DE VARIABLES */
		int producto1, producto2;
		double producto3, producto4, producto5;
		/* VARIABLE SUMATORIA TOTAL PRODUCTOS */
		float sumatoriaProductos;
		/* LEER VALOR PRODUCTOS */
		System.out.println("Digite el valor del primer producto numerico: ");
		producto1 = teclado.nextInt();
		System.out.println("Digite el valor del segundo producto numerico: ");
		producto2 = teclado.nextInt();
		System.out.println("Digite el valor del tercer producto decimal: ");
		producto3 = teclado.nextDouble();
		System.out.println("Digite el valor del cuarto producto decimal: ");
		producto4 = teclado.nextDouble();
		System.out.println("Digite el valor del quinto producto decimal: ");
		producto5 = teclado.nextDouble();

		/* DEJAR DE LEER TECLADO */
		teclado.close();
		/* OPERACIÓN DE SUMAS Y LO CONVERTIMOS A FLOAT */
		sumatoriaProductos = (float) (producto1 + producto2 + producto3 + producto4 + producto5);
		/* RETORNAR Y MOSTRAR SUMA */
		System.out.println("La sumatoria de 5 productos: [" + producto1 + " , " + producto2 + " , " + producto3 + " , "
				+ producto4 + " - " + producto5 + "] es: " + sumatoriaProductos);
		return sumatoriaProductos;
	}

	/**
	 * SUMA CANTIDAD X DE PRODUCTOS Y RETORNA/PRINT RESULTADO
	 */
	private static void sumarProductos() {

		/* DECLARACIÓN DE VARIABLES */
		int cantidadProductos;
		/* VARIABLE SUMATORIA TOTAL PRODUCTOS */
		double sumatoriaProductos = 0;
		/*
		 * VAIRIABLE PARA CONCATENAR EL VALOR DE PRODUCTOS Y MOSTRARLOS AL FINAL EN
		 * TEXTO
		 */
		String productosTexto = "";
		/* OBJETO LEER TECLADO */
		Scanner teclado = new Scanner(System.in);

		/* SABER CUANTOS PRODUCTOS EL USUARIO DIGITA */
		System.out.println("CUANTOS PRODUCTOS DESEA DIGITAR? ");
		cantidadProductos = teclado.nextInt();

		/*
		 * ARRAY DE DOUBLE(Los valores genericos son decimales) PARA ALMECENAR LA
		 * X(cantidadProductos) CANTIDAD DE PRODUCTOS
		 */
		double[] productos = new double[cantidadProductos];

		/*
		 * FOR ENCARGADO DE CAPTURAR EL VALOR DE CADA PRODUCTO BASADO EN LA CANTIDAD QUE
		 * INGRESÓ EL USUARIO
		 */
		for (int i = 0; i < cantidadProductos; i++) {
			System.out.println("Digite el valor del producto #" + (i + 1) + ": ");
			productos[i] = teclado.nextDouble();
		}
		/*
		 * YA NO NECESITAMOS QUE EL TECLADO ESTE LEYENDO LA TERMINAL, ENTONCES LA
		 * DESACTIVAMOS
		 */
		teclado.close();

		/*
		 * FOR ENCARGADO DE SUMAR CADA PRODUCTO INGRESADO Y ALMACENADO Y ADICIONAL, PARA
		 * MOSTRARLOS LOS CONCATENAMOS EN UNA VARIABLE
		 */
		for (int i = 0; i < cantidadProductos; i++) {
			// sumamos
			sumatoriaProductos = productos[i] + sumatoriaProductos;
			// para mostrarlos, los almacenamos en la variable texto
			productosTexto = productosTexto + " , " + productos[i];
		}

		/* PRINT RESULTADOS */
		System.out.println("La sumatoria de " + cantidadProductos + " productos [" + productosTexto + " ] es: "
				+ sumatoriaProductos);

	}

}
