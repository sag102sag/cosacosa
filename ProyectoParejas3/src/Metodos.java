import java.io.Console;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
// CLASE PRINCIPAL DE M�TODOS
public class Metodos {
	static Random rand = new Random();

	/* M�todo que devuelve un entero seg�n lo elegido. Este m�todo muestra al jugador una selecci�n de 3 objetos aleatorios de entre 7 posibles, sin repetirse entre
	 * s�. Seg�n la opci�n que elija el jugador, se igualar� la variable resupuesta a un n�mero de entre 1 a 7, representando cada uno de ellos un tipo de objeto.  
	 */
	public static int seleccionObjetos() {
		int opcion = 0;
		int respuesta = 0;
		System.out.print(ConsoleColors.WHITE_BOLD_BRIGHT);
		mostrarConRetraso("�Enhorabuena, has encontrado un cofre, pero solo puedes escoger un objeto!\nEscoge sabiamente:\n", 5);
		int num1 = rand.nextInt(7) + 1;
		String objeto1 = "";
		switch (num1) {
		case 1:
			System.out.println("1. Espad�n");
			objeto1 = "espadon";
			break;
		case 2:
			System.out.println("1. Escudo viejo");
			objeto1 = "escudo";
			break;
		case 3:
			System.out.println("1. Amuleto vamp�rico");
			objeto1 = "amuleto";
			break;
		case 4:
			System.out.println("1. Colgante perdido");
			objeto1 = "colgante";
			break;
		case 5:
			System.out.println("1. Daga envenenada");
			objeto1 = "daga";
			break;
		case 6:
			System.out.println("1. Loto Negro");
			objeto1 = "loto";
			break;
		case 7:
			System.out.println("1. Lapisl�zuli");
			objeto1 = "lapislazuli";
			break;
		}
		pausa(600);
		//----------------------------------------------------------------//	

		int num2 = rand.nextInt(7) + 1;

		for (int i = 0; num2 == num1; i++) {
			num2 = rand.nextInt(7) + 1;
		}
		String objeto2 = "";
		switch (num2) {
		case 1:
			System.out.println("2. Espad�n");
			objeto2 = "espadon";
			break;
		case 2:
			System.out.println("2. Escudo viejo");
			objeto2 = "escudo";
			break;
		case 3:
			System.out.println("2. Amuleto vamp�rico");
			objeto2 = "amuleto";
			break;
		case 4:
			System.out.println("2. Colgante perdido");
			objeto2 = "colgante";
			break;
		case 5:
			System.out.println("2. Daga envenenada");
			objeto2 = "daga";
			break;
		case 6:
			System.out.println("2. Loto Negro");
			objeto2 = "loto";
			break;
		case 7:
			System.out.println("2. Lapisl�zuli");
			objeto2 = "lapislazuli";
			break;
		}
		pausa(600);
		//----------------------------------------------------------------//	

		int num3 = rand.nextInt(7) + 1;

		for (int i = 0; num3 == num1 || num3 == num2; i++) {
			num3 = rand.nextInt(7) + 1;
		}
		String objeto3 = "";
		switch (num3) {
		case 1:
			System.out.println("3. Espad�n");
			objeto3 = "espadon";
			break;
		case 2:
			System.out.println("3. Escudo viejo");
			objeto3 = "escudo";
			break;
		case 3:
			System.out.println("3. Amuleto vamp�rico");
			objeto3 = "amuleto";
			break;
		case 4:
			System.out.println("3. Colgante perdido");
			objeto3 = "colgante";
			break;
		case 5:
			System.out.println("3. Daga envenenada");
			objeto3 = "daga";
			break;
		case 6:
			System.out.println("3. Loto Negro");
			objeto3 = "loto";
			break;
		case 7:
			System.out.println("3. Lapisl�zuli");
			objeto3 = "lapislazuli";
			break;
		}
		pausa(600);
// Seg�n la opci�n, muestra el texto explicativo.
		opcion = Entrada.entero();
		String textoEspadon = "�Has obtenido Espad�n! \n(Ataque aumenta)";
		String textoEscudo = "�Has obtenido Escudo viejo! \n(Defensa aumenta)";
		String textoVampirico = "�Has obtenido Amuleto vamp�rico! \n(Ataque aumenta ligeramente)\n(Drenas salud del enemigo)";
		String textoColgante = "�Has obtenido Colgante perdido! \n(Defensa aumenta ligeramente)\n(Recuperaci�n pasiva)";
		String textoDaga = "�Has obtenido Daga envenenada! \n(Ataque aumenta ligeramente)\n(Aplicas envenenamiento al enemigo)";
		String textoLoto = "�Has obtenido Loto Negro! \n(Vida m�xima aumenta)";
		String textoLapislazuli = "�Has obtenido Lapisl�zuli! \n(MP m�ximos aumentan)";
		switch (opcion) {
		case 1:
			if (objeto1.equals("espadon")) {
				respuesta = 1;
				mostrarConRetraso(textoEspadon, 5);
			} else if (objeto1.equals("escudo")) {
				respuesta = 2;
				mostrarConRetraso(textoEscudo, 5);
			} else if (objeto1.equals("amuleto")) {
				respuesta = 3;
				mostrarConRetraso(textoVampirico, 5);
			} else if (objeto1.equals("colgante")) {
				respuesta = 4;
				mostrarConRetraso(textoColgante, 5);
			} else if (objeto1.equals("daga")) {
				respuesta = 5;
				mostrarConRetraso(textoDaga, 5);
			} else if (objeto1.equals("loto")) {
				respuesta = 6;
				mostrarConRetraso(textoLoto, 5);
			} else if (objeto1.equals("lapislazuli")) {
				respuesta = 7;
				mostrarConRetraso(textoLapislazuli, 5);
			}
			break;
		case 2:
			if (objeto2.equals("espadon")) {
				respuesta = 1;
				mostrarConRetraso(textoEspadon, 5);
			} else if (objeto2.equals("escudo")) {
				respuesta = 2;
				mostrarConRetraso(textoEscudo, 5);
			} else if (objeto2.equals("amuleto")) {
				respuesta = 3;
				mostrarConRetraso(textoVampirico, 5);
			} else if (objeto2.equals("colgante")) {
				respuesta = 4;
				mostrarConRetraso(textoColgante, 5);
			} else if (objeto2.equals("daga")) {
				respuesta = 5;
				mostrarConRetraso(textoDaga, 5);
			} else if (objeto2.equals("loto")) {
				respuesta = 6;
				mostrarConRetraso(textoLoto, 5);
			} else if (objeto2.equals("lapislazuli")) {
				respuesta = 7;
				mostrarConRetraso(textoLapislazuli, 5);
			}
			break;
		case 3:
			if (objeto3.equals("espadon")) {
				respuesta = 1;
				mostrarConRetraso(textoEspadon, 5);
			} else if (objeto3.equals("escudo")) {
				respuesta = 2;
				mostrarConRetraso(textoEscudo, 5);
			} else if (objeto3.equals("amuleto")) {
				respuesta = 3;
				mostrarConRetraso(textoVampirico, 5);
			} else if (objeto3.equals("colgante")) {
				respuesta = 4;
				mostrarConRetraso(textoColgante, 5);
			} else if (objeto3.equals("daga")) {
				respuesta = 5;
				mostrarConRetraso(textoDaga, 5);
			} else if (objeto3.equals("loto")) {
				respuesta = 6;
				mostrarConRetraso(textoLoto, 5);
			} else if (objeto3.equals("lapislazuli")) {
				respuesta = 7;
				mostrarConRetraso(textoLapislazuli, 5);
			}
			break;
		}
		return respuesta; // Devuelve la respuesta.
	}
	
// M�todo simple que muestra las clases posibles a elegir y sus estad�sticas, devolver� el entero introducido (1, 2 o 3)
	public static int seleccionClase() {
		int opcion = 0;
		do {
			System.out.print(ConsoleColors.WHITE_BOLD_BRIGHT);
			mostrarConRetraso("\n\nElija su clase: " + "\n(1) Caballero" + "\n(2) Mago" + "\n(3) Ladr�n", 20);
			System.out.println();
			pausa(500);
			System.out.println(
					"////////////////////////////  ////////////////////////////  ////////////////////////////  "
							+ "\n/                          /  /                          /  /                          /  "
							+ "\n/        Caballero         /  /           Mago           /  /          Ladr�n          /  "
							+ "\n/                          /  /                          /  /                          /  "
							+ "\n/  Vida M�xima:      70    /  /  Vida M�xima:      53    /  /  Vida M�xima:      60    /  "
							+ "\n/  Ataque:           17    /  /  Ataque:            8    /  /  Ataque:           15    /  "
							+ "\n/  Defensa:          15    /  /  Defensa:           7    /  /  Defensa:          10    /  "
							+ "\n/  Man�:              7    /  /  Man�:             22    /  /  Man�:             15    /  "
							+ "\n/  Recuperaci�n:      2    /  /  Recuperaci�n:      1    /  /  Recuperaci�n:      1    /  "
							+ "\n/  Veneno:            0    /  /  Veneno:            1    /  /  Veneno:            2    /  "
							+ "\n/  Vampirismo:        0    /  /  Vampirismo:        1    /  /  Vampirismo:        1    /  "
							+ "\n/                          /  /                          /  /                          /  "
							+ "\n////////////////////////////  ////////////////////////////  ////////////////////////////  ");
			try {
				opcion = Entrada.entero();
				if (opcion < 1 || opcion > 3) {
					System.out.println("Opci�n incorrecta.");
				}
			} catch (InputMismatchException e) {
				System.out.println("Error.");
			}
		} while (opcion < 1 || opcion > 3);
		return opcion;
	}

	// M�todo que muestra un texto con un peque�o retraso entre cada uno de los car�cteres, simula un di�logo de un videojuego.
	public static void mostrarConRetraso(String texto, int retraso) {
		try {
			for (char c : texto.toCharArray()) {
				if (c == '.' || c == '?' || c == ',' || c == '!') {
					System.out.print(c);
					Thread.sleep(retraso * 12);
				} else {
					System.out.print(c);
					Thread.sleep(retraso);
				}

			}
			System.out.print(""); // Para imprimir una nueva l�nea al final
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
// M�todo que sirve para que haya una peque�a pausa entre 
	public static void pausa(int ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
// M�todo para generar un enemigo en base a un switch case, en este m�todo se establecen las estad�sticas de los enemigos.
	// Tambi�n se pasan los par�metros de dificultad y ronda para cambiar el tipo de enemigos (cuanta m�s dificultad, m�s desafiantes)
	// La ronda es un multiplicador directo en las caracter�sticas m�s principales de los enemigos.
	public static Enemigo generarEnemigo(int dificultad, double ronda) {

		int eleccion = (int) Math.floor(Math.random() * 4 + 1);
		Enemigo enemigo = null;

		switch (dificultad) {
// DIFICULTAD 1
		case 1: {
			switch (eleccion) {
			case 1: {
				String nombre = "Limo";
				double hpMax = (int) (Math.random() * 10 + 20) * ronda;
				int hp = (int) hpMax;
				double ataque = (int) (Math.random() * 3 + 1) * ronda ;
				double defensa = (int) (Math.random());
				String ruta="./imagenes/limo.jpg";
				int mpMax = 0;
				int mp = mpMax;
				int regen = 1 * (int) ronda;
				int veneno = 0;
				int roboVida = 2;
				String descripcion = "Enemigo com�n que no representa una amenaza importante. su cuerpo gelatinoso le permite regenerar\n"
						+ "su estructura poco a poco, pero puede ser derrotado si se hace con rapidez."
						+ "\nPosee la capacidad de drenar la salud del contrincante."
						+ "\nAlgunos los tienen de mascotas porque tienen un peculiar olor a fresa.";
				enemigo = new Enemigo(nombre, hp, hpMax, ataque, defensa, mp, mpMax, regen, veneno, roboVida,
						descripcion, ruta);
				break;
			}
		
			case 2: {
				String nombre = "Esqueleto";
				double hpMax = (int) (Math.random() * 10 + 30)* ronda;
				int hp = (int) hpMax;
				double ataque = (int) (Math.random() * 4 + 3)* ronda;
				double defensa = (int) (Math.random() * 4 + 3)* ronda;
				String ruta="./imagenes/esqueleto.jpg";
				int mpMax = 0;
				int mp = 0;
				int regen = 0;
				int veneno = 0;
				int roboVida = 0;
				String descripcion = "Vuelto a la vida tras su ca�da en combate, el esqueleto vaga en busca de combate sin raz�n aparente."
						+ "Posee armadura ligera y una espada ajada por sus anteriores combates.";
				enemigo = new Enemigo(nombre, hp, hpMax, ataque, defensa, mp, mpMax, regen, veneno, roboVida,
						descripcion, ruta);
				break;
			}
			case 3: {
				String nombre = "Rata";
				double hpMax = (int) (Math.random() * 9 + 23)* ronda;
				int hp = (int) hpMax;
				double ataque = (int) (Math.random() * 4 + 4)* ronda;
				double defensa = 0;
				String ruta="./imagenes/rata.jpg";
				int mpMax = 0;
				int mp = 0;
				int regen = 0;
				int veneno = 1 * (int) ronda;
				int roboVida = 0;
				String descripcion = "Por alg�n motivo desconocido, �sta clase de roedor muestra aprecio por objetos puntiagudos y afilados."
						+ "\nSi lidiar con una rata ya representa un problema, imag�nala con una daga."
						+ "\nLa daga induce veneno a todo aquel al que alcanza.";
				enemigo = new Enemigo(nombre, hp, hpMax, ataque, defensa, mp, mpMax, regen, veneno, roboVida,
						descripcion, ruta);
				break;
			}
			case 4: {
				String nombre = "Aranya";
				double hpMax = (int) (Math.random() * 10 + 20)* (int) ronda;
				int hp = (int) hpMax;
				double ataque = (int) (Math.random() * 2 + 1) * (int) ronda;
				double defensa = (int) (Math.random() * 2 + 1) * (int) ronda;
				String ruta="./imagenes/aranya.jpg";
				int mpMax = 0;
				int mp = 0;
				int regen = 0;
				int veneno = 3* (int) ronda;
				int roboVida = 1* (int) ronda;
				String descripcion = "Las ara�as son conocidas por inyectar veneno al enemigo mientras drenan salud con sus ataques."
						+ "\nNo son muy resistentes, pero es mejor no perderlas de vista.";
				enemigo = new Enemigo(nombre, hp, hpMax, ataque, defensa, mp, mpMax, regen, veneno, roboVida,
						descripcion, ruta);
				break;
			}
			}
			break;
		}
// DIFICULTAD 2	
		case 2: {
			switch (eleccion) {
			case 1: {
				String nombre = "Murci�lago sagrado";
				double hpMax = (int) (Math.random() * 15 + 45)* (int) ronda;
				int hp = (int) hpMax;
				double ataque = (int) (Math.random() * 6 + 4)* (int) ronda;
				double defensa = (int) (Math.random());
				String ruta="./imagenes/murcielago.jpeg";
				int mpMax = 0;
				int mp = mpMax;
				int regen = 2;
				int veneno = 0;
				int roboVida = 4;
				String descripcion = "Estos murcielagos han obtenido la bendici�n de la luna de Misthaven, por lo que son m�s resistentes que sus hermanos comunes."
						+ "\nSon muy territoriales y no dudan en presentar pelea. "
						+ "\nLa bendici�n les otorga regeneraci�n de salud y mayor drenaje.";
				enemigo = new Enemigo(nombre, hp, hpMax, ataque, defensa, mp, mpMax, regen, veneno, roboVida,
						descripcion, ruta);
				break;
			}
			case 2: {
				String nombre = "Golem de piedra";
				double hpMax = (int) (Math.random() * 20 + 60)* (int) ronda;
				int hp = (int) hpMax;
				double ataque = (int) (Math.random() * 5 + 5)* (int) ronda;
				double defensa = (int) (Math.random() * 5 + 7)* (int) ronda;
				String ruta="./imagenes/golem.jpeg";
				int mpMax = 0;
				int mp = 0;
				int regen = 3* (int) ronda;
				int veneno = 0;
				int roboVida = 0;
				String descripcion = "Seres artificiales y descerebrados cuyo objetivo es proteger antiguos tesoros.\n"
						+ "Toscos y lentos pero fuertes y resistentes, los golem tienen mucha salud y armadura.";
				enemigo = new Enemigo(nombre, hp, hpMax, ataque, defensa, mp, mpMax, regen, veneno, roboVida,
						descripcion, ruta);
				break;
			}
			case 3: {
				String nombre = "Fantasma espectral";
				double hpMax = (int) (Math.random() * 10 + 35)* (int) ronda;
				int hp = (int) hpMax;
				double ataque = (int) (Math.random() * 4 + 12)* (int) ronda;
				double defensa = 0;
				String ruta="./imagenes/fantasma.jpeg";
				int mpMax = 0;
				int mp = 0;
				int regen = 0;
				int veneno = 0;
				int roboVida = 10* (int) ronda;
				String descripcion = "Almas que anta�o eran espiritus en pena, ahora buscan v�ctimas para aumentar su oscuridad interior y as� su poder."
						+ "\nPortan guada�as con capacidades drenativas ejemplares, lo mejor es acabar con ellas cuanto antes.";
				enemigo = new Enemigo(nombre, hp, hpMax, ataque, defensa, mp, mpMax, regen, veneno, roboVida,
						descripcion, ruta);
				break;
			}
			case 4: {
				String nombre = "Tronco maldito";
				double hpMax = (int) (Math.random() * 25 + 55)* (int) ronda;
				int hp = (int) hpMax;
				double ataque = (int) (Math.random() * 2 + 5)* (int) ronda;
				double defensa = (int) (Math.random() * 2 + 6)* (int) ronda;
				String ruta="./imagenes/arbol.jpeg";
				int mpMax = 0;
				int mp = 0;
				int regen = 2* (int) ronda;
				int veneno = 5* (int) ronda;
				int roboVida = 2* (int) ronda;
				String descripcion = "La corrupci�n de Misthaven ha alzanzado la flora del lugar y ha conseguido que los troncos se unan a la oscuridad. "
						+ "\nEst�n cubiertos de una sustancia t�xica que al contacto con la piel, drena salud y libera una potente toxina."
						+ "\nSus ra�ces aunque mustias, a�n son capaces de absorber las pocas sales minerales del suelo.";
				enemigo = new Enemigo(nombre, hp, hpMax, ataque, defensa, mp, mpMax, regen, veneno, roboVida,
						descripcion, ruta);
				break;
			}
			}
			break;
		}
// DIFICULTAD 3	
		case 3: {
			switch (eleccion) {
			case 1: {
				String nombre = "Cazador de almas";
				double hpMax = (int) (Math.random() * 30 + 80)* (int) ronda;
				int hp = (int) hpMax;
				double ataque = (int) (Math.random() * 5 + 9)* (int) ronda;
				double defensa = (int) (Math.random() * 3 + 7)* (int) ronda;
				String ruta="./imagenes/cazador.jpeg";
				int mpMax = 0;
				int mp = mpMax;
				int regen = 4* (int) ronda;
				int veneno = 2* (int) ronda;
				int roboVida = 0;
				String descripcion = "Antiguos cazadores sumidos en la oscuridad, ahora atacan de forma irracional con todo lo que la oscuridad les otorga."
						+ "\nLllamas t�xicas son su principal ataque que combinan con una oz que anta�o era sagrada."
						+ "\nAlta capacidad de regeneraci�n de salud.";
				enemigo = new Enemigo(nombre, hp, hpMax, ataque, defensa, mp, mpMax, regen, veneno, roboVida,
						descripcion, ruta);
				break;
			}
			case 2: {
				String nombre = "Bestia de la niebla";
				double hpMax = (int) (Math.random() * 20 + 80)* (int) ronda;
				int hp = (int) hpMax;
				double ataque = (int) (Math.random() * 7 + 15)* (int) ronda;
				double defensa = (int) (Math.random() * 3 + 3)* (int) ronda;
				String ruta="./imagenes/bestia.jpeg";
				int mpMax = 0;
				int mp = 0;
				int regen = 0;
				int veneno = 0;
				int roboVida = 12* (int) ronda;
				String descripcion = "Enemigos de la oscuridad que lamentablemente no distinguen entre aliado y amenaza."
						+ "\nSu estructura compuesta de niebla les otorga mucha agilidad y peligrosidad."
						+ "\nAlta potencia de ataque y robo de salud, pero baja armadura, ca�ones de cristal.";
				enemigo = new Enemigo(nombre, hp, hpMax, ataque, defensa, mp, mpMax, regen, veneno, roboVida,
						descripcion, ruta);
				break;
			}
			case 3: {
				String nombre = "Grandeza perdida";
				double hpMax = (int) (Math.random() * 25 + 90)* (int) ronda;
				int hp = (int) hpMax;
				double ataque = (int) (Math.random() * 10 + 8)* (int) ronda;
				double defensa = (int) (Math.random() * 4 + 6)* (int) ronda;
				String ruta="./imagenes/grandeza.jpeg";
				int mpMax = 0;
				int mp = 0;
				int regen = 7;
				int veneno = 0;
				int roboVida = 7;
				String descripcion = "Anta�o eran altos cargos de Misthaven que llegaron ah� gracias a sus dotes de combate y estrategia."
						+ "\nLa corrupci�n y la oscuridad de Misthaven han hecho estragos en sus principios y ahora son c�scaras"
						+ "\nvac�as que solo buscan una soluci�n mediante la violencia."
						+ "Equilibrados y con buenas capacidades regenerativas y drenadoras.";
				enemigo = new Enemigo(nombre, hp, hpMax, ataque, defensa, mp, mpMax, regen, veneno, roboVida,
						descripcion, ruta);
				break;
			}
			case 4: {
				String nombre = "Amalgama";
				double hpMax = (int) (Math.random() * 10 + 40)* (int) ronda;
				int hp = (int) hpMax;
				double ataque = (int) (Math.random() * 8 + 20)* (int) ronda;
				double defensa = (int) (Math.random() * 0 + 1)* (int) ronda;
				String ruta="./imagenes/amalgama.jpeg";
				int mpMax = 0;
				int mp = 0;
				int regen = 25* (int) ronda;
				int veneno = 3* (int) ronda;
				int roboVida = 2* (int) ronda;
				String descripcion = "*Desconocido*" + "\nAmenaza: Muy Elevada" + "\nNo hay opci�n de huida.";
				enemigo = new Enemigo(nombre, hp, hpMax, ataque, defensa, mp, mpMax, regen, veneno, roboVida,
						descripcion, ruta);
				break;
			}
			}
			break;
		}

		}
		return enemigo;
	}
// M�todo practicamente id�ntico a generarEnemigo, pero en este dos un nuevos par�metros: hpPlus y danyoPlus, que aumentan la dificultad dependiento de la ronda. 
	public static Enemigo generarJefe(int hpPlus, int danyoPlus, double ronda) {

		int eleccion = (int) Math.floor(Math.random() * 3 + 1);
		Enemigo enemigo = null;
		switch (eleccion) {
		case 1: {
			String nombre = "Lorenzo, la perdici�n de Misthaven";
			double hpMax = (100 + hpPlus) * ronda;
			int hp = (int) hpMax;
			double ataque = (5 + danyoPlus) * ronda;
			double defensa = 2;
			String ruta="./imagenes/lorenzo.jpg";
			int mpMax = 0;
			int mp = mpMax;
			int regen = 0;
			int veneno = 2;
			int roboVida = 2;
			String descripcion = "\r\n" + "Nombre del Jefe: Lorenzo, la Perdici�n de Misthaven\r\n" + "\r\n"
					+ "Descripci�n del Enemigo:\r\n"
					+ "En los desolados confines de Misthaven, acecha una sombra que anta�o fue un cazador prodigioso, ahora conocido solo como Lorenzo, la Perdici�n de Misthaven. Su historia es la de un hombre cuyo coraz�n fue consumido por la oscuridad que se cierne sobre el reino, transform�ndolo en un ser despiadado y sediento de sangre.\r\n"
					+ "\r\n" + "Historia:\r\n"
					+ "Lorenzo fue en otro tiempo un guardi�n de Misthaven, un cazador que proteg�a a los habitantes del reino de las bestias y peligros que acechaban en los bosques sombr�os. Sin embargo, su valent�a y habilidad pronto atrajeron la atenci�n de la oscuridad que permeaba las tierras, corrompiendo su esp�ritu y pervirtiendo su prop�sito noble.\r\n"
					+ "\r\n"
					+ "La corrupci�n se apoder� de �l lentamente, envenenando su mente con pensamientos oscuros y s�dicos. A medida que su alma se oscurec�a, su habilidad con la espada se volv�a m�s letal, convirti�ndolo en un cazador de hombres m�s que de bestias. Ahora, Lorenzo deambula por Misthaven como un espectro de muerte, sembrando el caos y la destrucci�n dondequiera que vaya.\r\n"
					+ "\r\n" + "Amenaza Actual:\r\n"
					+ "Lorenzo representa una amenaza sin igual para los habitantes de Misthaven. Su sed de sangre es insaciable, y su conocimiento de los bosques y las tierras circundantes lo convierte en un enemigo casi imposible de atrapar. Los aldeanos viven con miedo constante de sus incursiones nocturnas, temiendo convertirse en sus pr�ximas v�ctimas.\r\n"
					+ "\r\n"
					+ "Adem�s de su destreza en el combate, Lorenzo ha adquirido poderes oscuros que lo hacen a�n m�s peligroso. Sus habilidades para corromper y manipular la oscuridad han aterrorizado a la poblaci�n, sumiendo al reino en una oscuridad a�n m�s profunda y opresiva.\r\n"
					+ "\r\n"
					+ "Enfrentarse a Lorenzo no solo es una cuesti�n de supervivencia, sino tambi�n de redimir el honor mancillado de Misthaven y devolver la luz a un reino sumido en la desesperaci�n";
			enemigo = new Enemigo(nombre, hp, hpMax, ataque, defensa, mp, mpMax, regen, veneno, roboVida, descripcion, ruta);
			break;
		}
		case 2: {
			String nombre = "Vesselle, dama indemente.";
			double hpMax = (70 + hpPlus) * ronda;
			int hp = (int) hpMax;
			double ataque = (6 + danyoPlus) * ronda;
			double defensa = 0;
			String ruta="./imagenes/veselle.jpg";
			int mpMax = 0;
			int mp = 0;
			int regen = 0;
			int veneno = 0;
			int roboVida = 3;

			String descripcion = "\r\n" + "Nombre del Jefe: Vesselle, la Dama Indemente\r\n" + "\r\n"
					+ "Descripci�n del Enemigo:\r\n"
					+ "En los oscuros rincones de Misthaven, una figura enloquecida y poderosa emerge de las sombras, conocida solo como Vesselle, la Dama Indemente. Anta�o una hechicera respetada y leal al reino, sucumbi� a las tentaciones de las artes oscuras y la nigromancia, renunciando a su posici�n y entreg�ndose a la locura que la consume.\r\n"
					+ "\r\n" + "Historia:\r\n"
					+ "Vesselle era una figura prominente en la corte de Misthaven, una hechicera talentosa cuyo conocimiento y habilidades eran inigualables. Sin embargo, su sed de poder y su curiosidad insaciable la llevaron por un camino peligroso, explorando las artes prohibidas de la nigromancia y la magia oscura.\r\n"
					+ "\r\n"
					+ "A medida que Vesselle se sumerg�a m�s profundamente en la oscuridad, su mente se volv�a cada vez m�s fr�gil, distorsionando la realidad a su alrededor y sumi�ndola en la locura. Abandon� su posici�n en la corte, renunciando a su lealtad al reino y entreg�ndose por completo a las fuerzas oscuras que la seduc�an.\r\n"
					+ "\r\n" + "Amenaza Actual:\r\n"
					+ "Vesselle, la Dama Indemente, es ahora una aliada de las sombras y la oscuridad, una fuerza impredecible y despiadada que siembra el caos y la destrucci�n dondequiera que vaya. Sus poderes nigrom�nticos le permiten controlar a los no muertos y crear criaturas aberrantes que hacen su voluntad.\r\n"
					+ "\r\n"
					+ "Su locura la hace impredecible en el campo de batalla, capaz de lanzar hechizos devastadores con un capricho err�tico. Adem�s, su conocimiento de los secretos oscuros del reino la convierte en una amenaza a�n mayor, ya que utiliza su ingenio retorcido para manipular a los habitantes de Misthaven en su beneficio.\r\n"
					+ "\r\n"
					+ "Enfrentarse a Vesselle no solo es una cuesti�n de detener sus mal�volos planes, sino tambi�n de restaurar la cordura y la paz en un reino asolado por la oscuridad y la locura. Su derrota marcar�a un paso crucial en la lucha por la salvaci�n de Misthaven y el retorno de la luz a sus tierras.";
			enemigo = new Enemigo(nombre, hp, hpMax, ataque, defensa, mp, mpMax, regen, veneno, roboVida, descripcion, ruta);
			break;
		}
		case 3: {
			String nombre = "Zarathos, la llama sin luz";
			double hpMax = (120 + hpPlus) * ronda;
			int hp = (int) hpMax;
			double ataque = (8 + danyoPlus) * ronda;
			double defensa = 2;
			String ruta="./imagenes/dragon.jpg";
			int mpMax = 0;
			int mp = 0;
			int regen = 0;
			int veneno = 1;
			int roboVida = 0;
			String descripcion = "\r\n" + "Nombre del Jefe: Zarathos, la Llama sin Luz\r\n" + "\r\n"
					+ "Descripci�n del Enemigo:\r\n"
					+ "En las profundidades m�s oscuras de Misthaven, un terror ancestral se alza en la forma de Zarathos, la Llama sin Luz. Este drag�n, una vez majestuoso y temido, ha sido corrompido por las fuerzas de la oscuridad, convirti�ndolo en un heraldo de la destrucci�n y la desolaci�n.\r\n"
					+ "\r\n" + "Historia:\r\n"
					+ "Zarathos alguna vez fue venerado como un s�mbolo de poder y majestuosidad en Misthaven, una criatura legendaria cuyas llamas iluminaban el cielo nocturno. Sin embargo, la oscuridad que se cern�a sobre el reino gradualmente se infiltr� en su coraz�n, corrompiendo su esencia y pervirtiendo su prop�sito.\r\n"
					+ "\r\n"
					+ "Anta�o un guardi�n de la luz, Zarathos fue tentado por las promesas de poder oscuro y dominaci�n. Se volvi� contra los habitantes de Misthaven, convirti�ndose en un terror alado que sembraba la destrucci�n en su camino, consumiendo todo a su paso con llamas negras que devoran la luz y la esperanza.\r\n"
					+ "\r\n" + "Amenaza Actual:\r\n"
					+ "Zarathos, la Llama sin Luz, es ahora un instrumento de la oscuridad, una fuerza imparable que amenaza con devorar el reino entero en su sed de destrucci�n. Sus escamas negras brillan con un brillo ominoso, y su aliento ardiente consume todo lo que toca con una voracidad insaciable.\r\n"
					+ "\r\n"
					+ "Su presencia en el cielo oscurece el sol y trae consigo una sombra que se extiende sobre Misthaven, sumiendo el reino en una eterna noche de desesperaci�n y desolaci�n. Sus rugidos retumban como truenos, anunciando la llegada de la perdici�n para aquellos que se atreven a desafiarlo.\r\n"
					+ "\r\n"
					+ "Enfrentarse a Zarathos es una tarea casi imposible, una lucha desesperada contra un enemigo cuya fuerza y ferocidad son incomparables. Solo unidos, los valientes h�roes de Misthaven tienen alguna esperanza de detener su avance y devolver la luz al reino.";
			enemigo = new Enemigo(nombre, hp, hpMax, ataque, defensa, mp, mpMax, regen, veneno, roboVida, descripcion, ruta);
			break;
		}

		}
		return enemigo;
	}
// M�todo igual a generarJefe solo que ahora es con un jefe final, muestra un String y comienza el combate, sus estad�sticas tambi�n escalan seg�n la ronda.
	public static Enemigo jefeFinal(double ronda) {

	
		mostrarConRetraso("Has recorrido un largo camino, pero lamentablemente llega a su fin. Ha sido un placer conocerte....!", 5);
		pausa(500);
		mostrarConRetraso("�Te encuentras con Kaelan, es el �ltimo paso antes de la victoria! �A por todas!", 5);
		String nombre = "Kaelan, �l es el Misthaven";
		double hpMax = 450 * ronda;
		int hp = (int) hpMax;
		double ataque = 25 * ronda;
		double defensa = 20 + ronda/0.1;
		String ruta="./imagenes/kaelan.jpg";
		int mpMax = 0;
		int mp = 0;
		int regen = 0;
		int veneno = 0;
		int roboVida = 8;
		String descripcion = "Nombre del Jefe Final: Kaelan, el Antiguo Rey de Misthaven\r\n" + "\r\n"
				+ "Descripci�n del Enemigo:\r\n"
				+ "En lo m�s alto de la oscura fortaleza de Misthaven, se alza Kaelan, el Antiguo Rey de Misthaven, una figura imponente envuelta en sombras ancestrales. Su poder es legendario, su ira implacable y su sed de venganza insaciable. Kaelan es el �ltimo obst�culo entre la luz y la oscuridad, el guardi�n de un reino que una vez gobern� con sabidur�a y bondad, pero que ahora amenaza con sumergir en la eterna noche de la desesperaci�n.\r\n"
				+ "\r\n" + "Historia:\r\n"
				+ "Hace eones, Misthaven era un reino pr�spero y floreciente, gobernado por el rey Kaelan, un monarca sabio y justo. Bajo su liderazgo, las tierras prosperaron, y sus habitantes vivieron en paz y armon�a. Sin embargo, la envidia y la codicia se arraigaron en el coraz�n de aquellos que anhelaban el poder de Kaelan, y un oscuro complot se teji� en las sombras para derrocar al rey y sumir al reino en la oscuridad.\r\n"
				+ "\r\n"
				+ "Traicionado por aquellos en quienes confiaba, Kaelan fue desterrado de su propio reino y condenado a vagar por las tierras olvidadas de Misthaven, su coraz�n lleno de ira y su esp�ritu emponzo�ado por la traici�n. Durante siglos, se prepar� en las profundidades de las sombras, alimentando su sed de venganza y esperando el d�a en que podr�a reclamar lo que leg�timamente le pertenec�a.\r\n"
				+ "\r\n" + "Amenaza Actual:\r\n"
				+ "Kaelan ha regresado, m�s poderoso y decidido que nunca. Con un ej�rcito de criaturas de la oscuridad a su disposici�n, ha levantado una fortaleza impenetrable en el coraz�n de Misthaven, desde donde planea desatar su ira contra aquellos que lo traicionaron y sumir al reino en una eterna noche de desesperaci�n.\r\n"
				+ "\r\n"
				+ "Sus poderes son vastos y oscuros, alimentados por siglos de resentimiento y odio. Controla las sombras mismas, convocando criaturas de pesadilla y lanzando hechizos devastadores que destruyen todo a su paso. Solo un h�roe valiente, dispuesto a enfrentarse al pasado oscuro de Misthaven y desafiar al antiguo rey en su propio terreno, tiene alguna esperanza de detenerlo y restaurar la luz al reino.";
		Enemigo jefe = new Enemigo(nombre, hp, hpMax, ataque, defensa, mp, mpMax, regen, veneno, roboVida, descripcion, ruta);
		return jefe;
	}

	// M�TODO COMBATE Y PRINCIPAL DEL JUEGO (M�S EXTENSO)

/*
 * 
1. Inicializaci�n y Presentaci�n del Enemigo:
	Variables locales: Se declaran e inicializan opcion, danyoRealizado y roboVida.
	Presentaci�n: Se muestra un mensaje indicando que ha aparecido un enemigo, incluyendo su nombre.
	
2. Estado Inicial:
	Vida del jugador: Se muestra la vida actual del jugador.
	Mana del jugador: Se muestra el mana actual del jugador.
	Vida del enemigo: Se muestra la vida actual del enemigo.
	
3. Bucle del Combate:
	El combate se desarrolla en un bucle do-while que contin�a mientras ambos, jugador y enemigo, tengan vida (hp > 0).
	
4. Opciones del Jugador:
	Se muestra un men� de opciones para el jugador:

		Atacar:
			Jugador ataca: El jugador realiza un ataque, se calcula y muestra el da�o infligido al enemigo.
			Regeneraci�n de mana: Si el jugador se llama "Lolo", recupera 2 MP tras atacar.
			Efectos adicionales: Si el jugador tiene veneno o robo de vida, se aplican y muestran estos efectos.
			Ataque del enemigo: Si el enemigo sigue vivo, ataca al jugador y se aplican los efectos de veneno y robo de vida del enemigo si los tiene.
		Estado:
			Se muestra el estado actual del jugador.
		Hechizos:
			Configuraci�n de hechizos: Dependiendo del nombre del jugador, se configuran sus hechizos.
			Selecci�n de hechizo: El jugador selecciona un hechizo para usar.
			Aplicaci�n del hechizo: Se aplica el hechizo seleccionado, afectando la vida del enemigo y/o del jugador.
			Ataque del enemigo: Si el enemigo sigue vivo, ataca al jugador como en la opci�n de atacar.
		Analizar:
			Se muestra el estado del enemigo.
			
5. Estado Final del Turno:
	Al final de cada turno, se muestra el estado actualizado de la vida y el mana del jugador y la vida del enemigo.
6. Fin del Combate:
	El bucle se termina cuando la vida del jugador o del enemigo llega a cero.
	Resultado: Se determina y muestra si el jugador ha muerto o ha ganado el combate.
 */
	public static void combate(Jugador jugador, Enemigo enemigo) {
		int opcion = 0;
		double danyoRealizado = 0;
		double roboVida = 0;
		System.out.print(ConsoleColors.WHITE_BOLD_BRIGHT);
		mostrarConRetraso("\n�Ha aparecido un/a ",5 ); System.out.print(ConsoleColors.RED_BOLD_BRIGHT); System.out.print(enemigo.nombre); System.out.print(ConsoleColors.WHITE); 
		mostrarConRetraso("!\n", 5);
		System.out.println(ConsoleColors.GREEN_BOLD);
		mostrarConRetraso("\nVida del jugador: " + jugador.hp + "/" + jugador.hpMax + " "
				+ barraVida(1, jugador.hp, enemigo.hp, jugador.hpMax, enemigo.hpMax), 5);
		System.out.println(ConsoleColors.CYAN);
		System.out.println("MP Jugador: " + jugador.mp);
		System.out.print(ConsoleColors.RED_BOLD_BRIGHT);
		mostrarConRetraso("\nVida de " + enemigo.nombre + ": " + enemigo.hp + "/" + enemigo.hpMax + " "
				+ barraVida(2, jugador.hp, enemigo.hp, jugador.hpMax, enemigo.hpMax), 5);
		System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT);
		do {
			String menu = "--------------------------------------" + "\n| 1. Atacar            2. Estado     |"
					+ "\n| 3. Hechizos          4. Analizar   |" + "\n--------------------------------------";
			System.out.println(menu);
			opcion = Entrada.entero();
			switch (opcion) {
			case 1:
			{
				// Ataca el jugador:
				System.out.println(ConsoleColors.GREEN_BOLD);
				mostrarConRetraso("\n�El jugador ataca!", 5);
				danyoRealizado = jugador.ataque - enemigo.defensa * 0.1;
				// Si el da�o realizado por el jugador no supera 1 debido a la defensa del
				// enemigo.
				if (danyoRealizado < 1) {
					danyoRealizado = 1;
				}
				enemigo.hp = (int) (enemigo.hp - (danyoRealizado));
				System.out.println(ConsoleColors.GREEN_BOLD);
				mostrarConRetraso("\n�Has causado: " + danyoRealizado + " de da�o!", 5);
				if(jugador.nombre.equals("Lolo"))
				{
					if(jugador.mp+2>jugador.mpMax)
					{
						System.out.println(ConsoleColors.CYAN_BOLD);
						mostrarConRetraso("\n�Has recuperado: " + (jugador.mpMax-jugador.mp) + " MP", 5);
						jugador.mp=jugador.mpMax;
						System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT);
					}
					else
					{
						jugador.mp+=2;
						System.out.println(ConsoleColors.CYAN_BOLD);
						mostrarConRetraso("\n�Has recuperado: 2 MP", 5);
						System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT);
					}
				}
				// Si tiene veneno lo muestra
				if (jugador.veneno > 0) {
					mostrarConRetraso("\n�Has aplicado " + jugador.veneno + " de veneno!", opcion);
				}
				// Si el jugador tiene robo de vida, roba vida
				if (jugador.roboVida > 0) {
					roboVida = danyoRealizado * (jugador.roboVida * 0.05);
					mostrarConRetraso("\n�Has robado " + roboVida + " de vida al enemigo!", opcion);
					if (jugador.hp + roboVida > jugador.hpMax) {
						jugador.hp = jugador.hpMax;
					} else {
						jugador.hp += roboVida;
					}
				}

				// Si el enemigo sigue vivo, es su turno:
				if (enemigo.hp > 0) 
				{
					double variacion =Math.random()*0.15+0.9;
					System.out.println(ConsoleColors.RED_BOLD_BRIGHT);
					mostrarConRetraso("\n�El enemigo ataca!", 5);
					// Si el da�o realizado por el enemigo no supera 1 debido a la defensa del
					// jugador.
					danyoRealizado = (enemigo.ataque * variacion) - jugador.defensa * 0.1;
					if (danyoRealizado < 1) {
						danyoRealizado = 1;
					}
					jugador.hp = (int) (jugador.hp - (danyoRealizado));
					mostrarConRetraso("\n�Has recibido: " + (int) danyoRealizado + " de da�o!", 5);
					// Si el enemigo tiene veneno lo muestra
					if (enemigo.veneno > 0) {
						mostrarConRetraso("�Has recibido " + enemigo.veneno + " de veneno!", 5);
					}
					// Si el enemigo tiene robo de vida, roba vida
					if (enemigo.roboVida > 0) {
						roboVida = danyoRealizado * (enemigo.roboVida * 0.05);
						mostrarConRetraso("\n�El enemigo te ha robado " + roboVida + " de vida", 5);
						if (enemigo.hp + roboVida > enemigo.hpMax) {
							enemigo.hp = (int) enemigo.hpMax;
						} else {
							enemigo.hp += roboVida;
						}

					}
					System.out.println(ConsoleColors.GREEN_BOLD);
					if (jugador.regen > 0 && jugador.hp + jugador.regen >= jugador.hpMax) {
						jugador.hp = jugador.hpMax;
						mostrarConRetraso("\n�Has recuperado " + (jugador.hpMax - jugador.hp) + " puntos de salud!", 5);
					} else if (jugador.regen > 0) {
						jugador.hp += jugador.regen;
						mostrarConRetraso("\n�Has recuperado " + jugador.regen + " puntos de salud!", 5);
					} else {

					}
					System.out.println(ConsoleColors.RED_BOLD_BRIGHT);
					if (enemigo.regen > 0 && enemigo.hp + enemigo.regen >= enemigo.hpMax) {
						enemigo.hp = (int) enemigo.hpMax;
						mostrarConRetraso("\n�El enemigo ha regenerado " + (enemigo.hpMax - enemigo.hp) + " puntos de salud!", 5);
					} else if (enemigo.regen > 0) {
						enemigo.hp += enemigo.regen;
						mostrarConRetraso("\n�El enemigo ha regenerado " + enemigo.regen + " puntos de salud!", 5);
					} else {

					}
					System.out.println(ConsoleColors.GREEN_BOLD);
					if (jugador.veneno > 0) {
						mostrarConRetraso("\nEl enemigo ha recibido " + jugador.veneno + "de da�o de veneno", 5);
					}
					System.out.println(ConsoleColors.RED_BOLD_BRIGHT);
					if (enemigo.veneno > 0) {
						mostrarConRetraso("\nHas recibido " + enemigo.veneno + "de da�o de veneno", 5);
					}
					jugador.hp -= enemigo.veneno;
					enemigo.hp -= jugador.veneno;
				}
				break;
			}
			case 2:
			{
				System.out.print(ConsoleColors.WHITE_BOLD_BRIGHT);
				mostrarConRetraso(jugador.toString(), 5);
				break;
			}	
			case 3: {
				switch (jugador.nombre) {
				case "Pepe": {
					jugador.hechizos.set(0, Hechizo.golpeGlorioso((int) jugador.ataque));
					jugador.hechizos.set(1, Hechizo.conHonor((int) jugador.hpMax));
					break;
				}
				case "Lolo": {
					jugador.hechizos.set(0, Hechizo.bolaDuFogo((int) jugador.mpMax));
					jugador.hechizos.set(1, Hechizo.aguijonSombrio((int) jugador.mpMax));
					jugador.hechizos.set(2, Hechizo.estallidoVital((int) jugador.mpMax));
					break;
				}
				case "FUFU": {
					jugador.hechizos.set(0, Hechizo.punyaladaToxica((int) jugador.ataque, (int) jugador.veneno));
					jugador.hechizos.set(1, Hechizo.unoConLasSombras((int) jugador.ataque));
					break;
				}
				default:
					break;
				}
				int opcionH=0;
				Hechizo hechizoSelect=null;
				System.out.print(ConsoleColors.WHITE_BOLD_BRIGHT);
				mostrarConRetraso("Hechizos:", 5);
				System.out.println(
						"------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				for (int i = 0; i < jugador.hechizos.size(); i++) {
					System.out.println("| " + (i + 1) + ". " + jugador.hechizos.get(i).nombre);
					System.out.println("| Poder: " + jugador.hechizos.get(i).poder);
					System.out.println("| Coste: " + jugador.hechizos.get(i).coste);
					System.out.println("| Descripci�n: " + jugador.hechizos.get(i).descripcion);
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				}
				do
				{
					opcionH=Entrada.entero();
				}while(opcionH<=0||opcionH>jugador.hechizos.size());
				hechizoSelect=jugador.hechizos.get(opcionH-1);

				if(hechizoSelect.coste>jugador.mp)
				{ 
					mostrarConRetraso("No tienes suficiente mana", 5);
					break;
				}
				switch (hechizoSelect.nombre) 
				{
				case "Golpe glorioso": 
				{
					
					System.out.println(ConsoleColors.GREEN_BOLD);
					mostrarConRetraso("\n�Has utilizado "+hechizoSelect.nombre+"!", 5);
					enemigo.hp-=hechizoSelect.poder;
					mostrarConRetraso("\n�Has causado "+hechizoSelect.poder+" de da�o!", 5);
					break;					
				}
				case "Con honor": 
				{
					
					System.out.println(ConsoleColors.GREEN_BOLD);
					mostrarConRetraso("\n�Has utilizado "+hechizoSelect.nombre+"!", 5);
					if(jugador.hp+(hechizoSelect.curacion)>jugador.hpMax)
					{
						mostrarConRetraso("\nHas recuperado "+(jugador.hpMax-jugador.hp)+" pv.", 5);
						jugador.hp=jugador.hpMax;
					}
					else
					{
						mostrarConRetraso("\nHas recuperado "+(hechizoSelect.curacion)+" pv.", 5);
						jugador.hp+=(hechizoSelect.curacion);
					}
					break;
				}
				case "Bola du Fogo":
				{
					
					System.out.println(ConsoleColors.GREEN_BOLD);
					mostrarConRetraso("\n�Has utilizado "+hechizoSelect.nombre+"!", 5);
					enemigo.hp-=hechizoSelect.poder;
					mostrarConRetraso("\n�Has causado "+hechizoSelect.poder+" de da�o!", 5);
					break;	
				}
				case "Aguijon Sombr�o":
				{
					
					System.out.println(ConsoleColors.GREEN_BOLD);
					mostrarConRetraso("\n�Has utilizado "+hechizoSelect.nombre+"!", 5);
					enemigo.hp-=hechizoSelect.poder;
					mostrarConRetraso("\n�Has causado "+hechizoSelect.poder+" de da�o!", 5);
					if(jugador.hp+(hechizoSelect.poder/2)>jugador.hpMax)
					{
						mostrarConRetraso("Has recuperado "+(jugador.hpMax-jugador.hp)+" pv.", 5);
						jugador.hp=jugador.hpMax;
					}
					else
					{
						mostrarConRetraso("Has recuperado "+(hechizoSelect.poder/2)+" pv.", 5);
						jugador.hp+=(hechizoSelect.poder/2);
					}
					break;
				}
				case "Estallido Vital":
				{
					
					System.out.println(ConsoleColors.GREEN_BOLD);
					mostrarConRetraso("\n�Has utilizado "+hechizoSelect.nombre+"!", 5);
					if(jugador.hp+(hechizoSelect.curacion)>jugador.hpMax)
					{
						mostrarConRetraso("\nHas recuperado "+(jugador.hpMax-jugador.hp)+" pv.", 5);
						jugador.hp=jugador.hpMax;
					}
					else
					{
						mostrarConRetraso("\nHas recuperado "+(hechizoSelect.curacion)+" pv.", 5);
						jugador.hp+=(hechizoSelect.curacion);
					}
					break;
				}
				case "Punyalada Toxica":
				{
					
					System.out.println(ConsoleColors.GREEN_BOLD);
					mostrarConRetraso("\n�Has utilizado "+hechizoSelect.nombre+"!", 5);	
					danyoRealizado = hechizoSelect.poder - enemigo.defensa * 0.1;
					enemigo.hp-=danyoRealizado;
					enemigo.hp-=hechizoSelect.veneno;
					mostrarConRetraso("\n�Has aplicado "+hechizoSelect.veneno+" de da�o de veneno!", 5);
					break;
				}
				case "Uno con las sombras":
				{
					
					System.out.println(ConsoleColors.GREEN_BOLD);
					mostrarConRetraso("\n�Has utilizado "+hechizoSelect.nombre+"! �Te vuelves invulnerable!", 5);	
					// Si el enemigo sigue vivo, es su turno:
					if (enemigo.hp > 0) 
					{
						System.out.println(ConsoleColors.RED_BOLD_BRIGHT);
						mostrarConRetraso("\n�El enemigo ataca!", 5);
						// Si el da�o realizado por el enemigo no supera 1 debido a la defensa del
						// jugador.
						danyoRealizado = 0;
						mostrarConRetraso("\n�Has recibido: " + danyoRealizado + " de da�o!", 5);
						// Si el enemigo tiene veneno lo muestra

						if (jugador.regen > 0 && jugador.hp + jugador.regen >= jugador.hpMax) {
							jugador.hp = jugador.hpMax;
							System.out.println(ConsoleColors.GREEN_BOLD);
							mostrarConRetraso("\n�Has recuperado " + (jugador.hpMax - jugador.hp) + " puntos de salud!", 5);
						} else if (jugador.regen > 0) {
							System.out.println(ConsoleColors.GREEN_BOLD);
							jugador.hp += jugador.regen;
							mostrarConRetraso("\n�Has recuperado " + jugador.regen + " puntos de salud!", 5);
						} else {

						}
						if (enemigo.regen > 0 && enemigo.hp + enemigo.regen >= enemigo.hpMax) {
							enemigo.hp = (int) enemigo.hpMax;
							System.out.println(ConsoleColors.RED_BOLD_BRIGHT);
							mostrarConRetraso("\n�El enemigo ha regenerado " + (enemigo.hpMax - enemigo.hp) + " puntos de salud!", 5);
						} else if (enemigo.regen > 0) {
							enemigo.hp += enemigo.regen;
							System.out.println(ConsoleColors.RED_BOLD_BRIGHT);
							mostrarConRetraso("\n�El enemigo ha regenerado " + enemigo.regen + " puntos de salud!", 5);
						} else {

						}						
					}
					mostrarConRetraso("�Ya son las 5, suena la campana del cole y apu�alas con el navajote al enemigo!", 5);
					System.out.println(ConsoleColors.GREEN_BOLD);
					mostrarConRetraso("�Inflinges "+hechizoSelect.poder+" puntos de da�o al enemigo!", 5);
					System.out.println(ConsoleColors.WHITE);
					enemigo.hp-=hechizoSelect.poder;
					break;

				}
				default: {
					throw new IllegalArgumentException("Unexpected value: " + hechizoSelect.nombre);
				}

				}

				jugador.mp-=hechizoSelect.coste;
				// Si el enemigo sigue vivo, es su turno:
				if (enemigo.hp > 0) {
					double variacion =Math.random()*0.15+0.9;
					System.out.println(ConsoleColors.RED_BOLD_BRIGHT);
					mostrarConRetraso("\n�El enemigo ataca!", 5);
					// Si el da�o realizado por el enemigo no supera 1 debido a la defensa del
					// jugador.
					danyoRealizado = (enemigo.ataque * variacion) - jugador.defensa * 0.1;
					if (danyoRealizado < 1) {
						danyoRealizado = 1;
					}
					jugador.hp = (int) (jugador.hp - (danyoRealizado));
					mostrarConRetraso("\n�Has recibido: " + (int) danyoRealizado + " de da�o!", 5);
					// Si el enemigo tiene veneno lo muestra
					if (enemigo.veneno > 0) {
						mostrarConRetraso("\n�Has recibido " + enemigo.veneno + " de veneno!", 5);
					}
					// Si el enemigo tiene robo de vida, roba vida
					if (enemigo.roboVida > 0) {
						roboVida = danyoRealizado * (enemigo.roboVida * 0.05);
						mostrarConRetraso("\n�El enemigo te ha robado " + roboVida + " de vida", 5);
						if (enemigo.hp + roboVida > enemigo.hpMax) {
							enemigo.hp = (int) enemigo.hpMax;
						} else {
							enemigo.hp += roboVida;
						}
					}
					if (jugador.regen > 0 && jugador.hp + jugador.regen >= jugador.hpMax) {
						jugador.hp = jugador.hpMax;
						System.out.println(ConsoleColors.GREEN_BOLD);
						mostrarConRetraso("\n�Has recuperado " + (jugador.hpMax - jugador.hp) + " puntos de salud!", 5);
						System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT);
					} else if (jugador.regen > 0) {
						System.out.println(ConsoleColors.GREEN_BOLD);
						jugador.hp += jugador.regen;
						mostrarConRetraso("\n�Has recuperado " + jugador.regen + " puntos de salud!", 5);
						System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT);
					} else {

					}
					System.out.println(ConsoleColors.RED_BOLD_BRIGHT);
					if (enemigo.regen > 0 && enemigo.hp + enemigo.regen >= enemigo.hpMax) {
						enemigo.hp = (int) enemigo.hpMax;
						mostrarConRetraso("\n�El enemigo ha regenerado " + (enemigo.hpMax - enemigo.hp) + " puntos de salud!", 5);
					} else if (enemigo.regen > 0) {
						enemigo.hp += enemigo.regen;
						mostrarConRetraso("\n�El enemigo ha regenerado " + enemigo.regen + " puntos de salud!", 5);
					} else {

					}
					if (enemigo.veneno > 0) {
						System.out.println(ConsoleColors.RED_BOLD_BRIGHT);
						mostrarConRetraso("\nHas recibido " + enemigo.veneno + "de da�o de veneno", 5);
						System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT);
					}
					jugador.hp -= enemigo.veneno;
				}
				break;
				//}
			}





			// Muestra los datos del enemigo:
			case 4:
				mostrarConRetraso(enemigo.toString(), 5);
				System.out.println();
				break;

			}
			// Al final de cada turno siempre muestra la salud resultante de cada uno:
			System.out.println(ConsoleColors.GREEN_BOLD);
			mostrarConRetraso("\nVida del jugador: " + jugador.hp + "/" + jugador.hpMax + " "
					+ barraVida(1, jugador.hp, enemigo.hp, jugador.hpMax, enemigo.hpMax), 5);
			System.out.print(ConsoleColors.RED_BOLD_BRIGHT);
			System.out.println(ConsoleColors.CYAN);
			System.out.println("MP Jugador: " + jugador.mp);
			System.out.print(ConsoleColors.RED_BOLD_BRIGHT);
			mostrarConRetraso("\nVida de " + enemigo.nombre + ": " + enemigo.hp + "/" + enemigo.hpMax + " "
					+ barraVida(2, jugador.hp, enemigo.hp, jugador.hpMax, enemigo.hpMax), 5);
			System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT);

		} while (jugador.hp > 0 && enemigo.hp > 0);
		if (jugador.hp < 1) {
			System.out.println(ConsoleColors.RED_BOLD_BRIGHT);
			System.out.println("Has muerto.");
			System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT);
		} else if (enemigo.hp < 0) {
			System.out.println(ConsoleColors.GREEN_BOLD);
			System.out.println("Has ganado.");
			System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT);
		}
	}

	{

	}
// M�todo que recibe varios par�metros y muestra la salud del jugador y la del enemigo de forma m�s visual y legible, ambas vidas se dividen en 20 partes iguales 
// representadas por un asterisco, cuando esa parte es 0, se cambia a un gui�n, simulando que es salud faltante.
	public static String barraVida(int opcion, int vidaJ, int vidaE, int vidaJMax, double vidaEMax) {
		String respuesta = "";
		double pv= (vidaJ*20)/vidaJMax;
		double pv2= (vidaE*20)/vidaEMax;


		switch (opcion) {
		case 1:
			respuesta += "[";
			for (int i = 1; i <= 20; i++) {

				if (i<=pv) 
				{
					respuesta += "*";
				} 
				else 
				{
					respuesta += "-";
				}

			}
			respuesta += "]";
			break;
		case 2:
			respuesta += "[";
			for (int i = 1; i <= 20; i++) {
				if (i<=pv2) 
				{
					respuesta += "*";
				} 
				else 
				{
					respuesta += "-";
				}

			}
			respuesta += "]";
			break;
		}
		return respuesta;
	}
// M�todo boolean que comprueba si el jugador est� o no muerto. Si lo est� (hp del jugador<=0) el boolean es true, si no, es false.
	public static boolean muelto(Jugador jugador)
	{
		boolean muelto=false;
		if(jugador.hp<=0)
		{
			muelto=true;
		}
		return muelto;
	}
	// M�todo para cambiar el color de los prints.
	public static void printColor(String color, String text) {
		System.out.print(color + text + ConsoleColors.RESET);
	}
	
/*
 *  Otro de los m�todos principales de esta clase. Este se efectua por cada dificultad de la partida: 1, 2 y 3. En cada dificultad, aparecen 3 enemigos de dicha
 *  dificultad de forma aleatoria mediante un bucle y, despu�s, un jefe para esa secci�n. 
 *  
 *  FUNCIONAMIENTO: 
 *  3 combates contra enemigos normales (dificultad 1) y 1 jefe 
 *  // Aumenta dificultad // 
 *  3 combates contra enemigos normales (dificultad 2) y 1 jefe 
 *  // Aumenta dificultad // 
 *  3 combates contra enemigos normales (dificultad 3) y 1 jefe 
 *  // JEFE FINAL //
 *  
 *  Cada vez que termina un combate, si comprueba si el jugador est� muerto o no con el m�todo muelto. Si lo est�, termina, si no, continua con lo siguiente.
 *  Al terminar cada combate de forma victoriosa, aparece el m�todo comprobarObjetos con el parametro seleccionObjetos, que le permite al jugador recibir su
 *  recompensa en forma de objetos.
 */
	public static void partidica(Jugador player1, int dificultad,  double ronda, int vidaJPlus, int danyoJPlus, ArrayList<Enemigo> enemigos,  ArrayList<LocalDateTime> tiempos) {
		for(int i=0; Metodos.muelto(player1)==false && i<3; i++)
		{

			Enemigo enemigo= new Enemigo();
			enemigo = Metodos.generarEnemigo(dificultad, ronda);
			enemigos.add(enemigo);
			Metodos.combate(player1, enemigo);
			if(Metodos.muelto(player1)==false)
			{
				LocalDateTime tiempo = LocalDateTime.now();
				tiempos.add(tiempo);
				if(player1.mp+(player1.mpMax/2)>player1.mpMax)
				{
					System.out.println("Has restablecido tus MP por completo");
					player1.mp=player1.mpMax;
				}
				else {
					System.out.println("Has restablecido"+player1.mpMax/2+" MP");
					player1.mp+=(player1.mpMax/2);
				}
				player1.comprobarObjetos(Metodos.seleccionObjetos());
				System.out.println("\n\n");
			}
			else 
			{
				System.out.println("\u001B[33m FIN DEL JUEGO");
				break;
			}
		}
		
		if(Metodos.muelto(player1)==false)
		{
			Enemigo enemigo= new Enemigo();
			enemigo = Metodos.generarJefe(vidaJPlus, danyoJPlus, ronda);
			enemigos.add(enemigo);
			
			Metodos.combate(player1, enemigo) ;
			if(Metodos.muelto(player1)==false)
			{
				LocalDateTime tiempo = LocalDateTime.now();
				tiempos.add(tiempo);
				if(player1.mp+(player1.mpMax/2)>player1.mpMax)
				{
					System.out.println("Has restablecido tus MP por completo");
					player1.mp=player1.mpMax;
				}
				else {
					System.out.println("Has restablecido"+player1.mpMax/2+" MP");
					player1.mp+=(player1.mpMax/2);
				}
				player1.comprobarObjetos(Metodos.seleccionObjetos());
				System.out.println("\n\n");		
			}
			else 
			{
				System.out.println("\u001B[33mFIN DEL JUEGO");
			}
		}
	}
	// Este m�todo es el �ltimo en ejecutarse, pone en marcha un combate entre el jefe final y el jugador. Tambi�n se guardan mediante el paso por referencia
	// todos los elementos generados en el m�todo.
	public static void combateJefe (Jugador player1, ArrayList<Enemigo> enemigos,  ArrayList<LocalDateTime> tiempos, double ronda)
	{
		Enemigo jefe = jefeFinal(ronda);
		enemigos.add(jefe);
		Metodos.combate(player1, jefe) ;
		if(Metodos.muelto(player1)==false)
		{
			LocalDateTime tiempo = LocalDateTime.now();
			tiempos.add(tiempo);
			if(player1.mp+(player1.mpMax/2)>player1.mpMax)
			{
				System.out.println("Has restablecido tus MP por completo");
				player1.mp=player1.mpMax;
			}
			else {
				System.out.println("Has restablecido"+player1.mpMax/2+" MP");
				player1.mp+=(player1.mpMax/2);
			}
			player1.comprobarObjetos(Metodos.seleccionObjetos());
			System.out.println("\n\n");			
		}
		else 
		{
			System.out.println("\u001B[33mFIN DEL JUEGO");
		}
	}
}
