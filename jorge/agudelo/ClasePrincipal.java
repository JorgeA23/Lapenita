package jorge.agudelo;

import java.util.Scanner;

public class ClasePrincipal {

	/* METODO MAIN QUE EL JAVA BUSCA Y EJECUTA CUANDO INICIA*/
	public static void main(String[] args) {

		/* CLASE OBJETO VARIABLE ENCARGADO DE CAPTURAR DATOS */
		Scanner teclado = new Scanner(System.in);

		/* DECLARAMOS VARIABLE OPCION INT */
		int opcion;

		/* PRINT menú de opciones */
		System.out.println("--- CALCULADORA DE PRODUCTOS LA PEÑITA ---");
		System.out.println("[ ¿Qué desea hacer? ]\r\n" + "1) Sumar Productos\r\n" + "2) Multiplicar Productos\r\n"
				+ "3) Promedio Productos");

		/* CAPTURAMOS Y SETEAMOS OPCION */
		opcion = teclado.nextInt();

		/* switch PARA LLAMAR CLASES OPERACIONALES */
		switch (opcion) {
		case 1:
			//SumarProductos claseSumar = new SumarProductos();
			//claseSumar.sumar();
			SumarProductos.sumar();
			break;
		case 2:
			MultiplicarProductos.multiplicar();
			break;
		case 3:
			PromedioProductos.promedio();
			break;
		default:
			System.out.println("Opción invalida");
			break;
		}
		
		teclado.close();

	}

}
