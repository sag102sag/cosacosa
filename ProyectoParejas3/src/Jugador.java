import java.awt.geom.Area;
import java.util.ArrayList;
// CLASE JUGADOR
public class Jugador {
	
// Atributos de la clase Jugador:
	String clase="";
	String nombre = "";
	int hp = 0;
	int hpMax = 0;
	double ataque = 0;
	double defensa = 0;
	int mp = 0;
	int mpMax = 0;
	int regen = 0;
	int veneno= 0;
	int roboVida=0;
	boolean[] objetos;
	int[] contador;
	boolean envenenado=false;
	ArrayList<Hechizo> hechizos = new ArrayList<>();
	String ruta="";
	
// Constructor vacío	
	public Jugador() {
	
	}
// Constructor con parámetros:	
	public Jugador(String clase, String nombre, int hp, int hpMax, int ataque, double defensa, int mp, int mpMax, boolean[] objetos, int regen, int veneno, int roboVida, ArrayList<Hechizo> hechizos, String ruta) {
		this.clase=clase;
		this.nombre = nombre;
		this.objetos = objetos.clone();
		this.hp = hp;
		this.ataque = ataque;
		this.hpMax = hpMax;
		this.defensa = defensa;
		this.mp = mp;
		this.mpMax = mpMax;
		this.contador=new int[objetos.length];
		this.regen=regen;
		this.veneno=veneno;
		this.roboVida=roboVida;
		this.hechizos=hechizos;
		this.ruta=ruta;
		
	}
// Método que toma en cuenta un número recibido y, segun el caso, se le añade un objeto al jugador, con los cambios en estadísticas que eso implica.
	public void comprobarObjetos(int opcion) {
		switch (opcion) {
		case 1:
			objetos[0] = true;
			ataque = ataque +5;
			contador[0]++;
			break;
		case 2:
			objetos[1] = true;
			defensa = defensa +5;
			contador[1]++;
			break;
		case 3:
			objetos[2] = true;
			ataque = ataque +2;
			roboVida= roboVida+2;
			contador[2]++;
			break;
		case 4:
			objetos[3] = true;
			defensa = defensa +2;
			regen=regen+2;
			contador[3]++;
			break;
		case 5:
			objetos[4] = true;
			ataque = ataque +2;
			veneno=veneno+2;
			contador[4]++;
			break;
		case 6:
			objetos[5] = true;
			hpMax= hpMax + 5;
			contador[5]++;
		case 7:
			objetos[6] = true;
			mpMax= mpMax + 5;
			contador[6]++;
		}
	}

	// Método toString que muestra los datos del jugador
	@Override
	public String toString() {
		return "--------------------------------------------------------\n"
				+ "Jugador \nNombre:" + nombre + "\nHP:" + hp + "\nHP Max:" + hpMax + "\nAtaque:" + ataque + "\nDefensa:"
				+ defensa + "\nMP:" + mp + "\nMP Max:" + mpMax + "\nObjetos: " + outObjects() +"\nRegeneración de HP: "+regen
				+"\nAplicación de veneno: "+veneno+"\nRobo de vida: "+roboVida
				+"\n--------------------------------------------------------";
	}
	// Método String que permite ver los objetos obtenidos del jugador así como la cantidad.
	private String outObjects() {
		String algo="";
		if(objetos[0])
		{
			algo+="Espadón x"+contador[0]+" | ";
		}
		if(objetos[1])
		{
			algo+="Escudo Viejo x"+contador[1]+" | ";
		}
		if(objetos[2])
		{
			algo+="Amuleto vampírico x"+contador[2]+" | ";
		}
		if(objetos[3])
		{
			algo+="Colgante perdido x"+contador[3]+" | ";
		}
		if(objetos[4])
		{
			algo+="Daga envenenada x"+contador[4]+" | ";
		}
		return algo;
	}
	

}
