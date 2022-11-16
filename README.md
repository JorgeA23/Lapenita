# Lapenita
Este codigo simula las operaciones de Sumar, Multiplicar y promediar el valor de los productos a ingresar, y en comentarios voy indicando la funcionalidad de cada paso:


ClasePrincipal: En esta clase establezco el menú donde esl usuario va a seleccionar la operacionque desea realizar:

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



SumarProductos: Aplico dos opciones, Una donde el usuario puede ingresar los 5 precios donde le indicamos el tipo de dato que acepta, y en la Segunda
opcion puede ingresar la cantidad de precios que desea ingresar pero tomando todos como Double

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

Clase MultiplicarProductos: En esta clase hago uso del FOR para que en cada ciclo solicite el valor y la cantidad por la cual será mulitplicado, y el usuario ingresa la cantidad de operaciones que desea realizar, estableciendo como maximo 5 operaciones: 

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

Clase Promedio: En esta clase hago uso de un arreglo donde almaceno la cantidad de notas que el usuario desea promediar por medio de un FOR, luego con el uso de otro FOR hago la suma de todos lo valores y esl resultado lo divido por el valor que el usuario ingresó con respecto a la cantidad de valores.

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
