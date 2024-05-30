// CLASE ENEMIGO 
public class Enemigo {
	
// Atributos del enemigo
	String nombre = "";
	int hp = 0;
	double hpMax = 0;
	double ataque = 0;
	double defensa = 0;
	int mp = 0;
	int mpMax = 0;
	int regen = 0;
	int veneno= 0;
	int roboVida=0;
	String descripcion="";
	String ruta="";
	
	
// Constructor vacío	
	public Enemigo() {
		super();
	}
	
// Constructor con parámetros
	public Enemigo(String nombre, int hp, double hpMax, double ataque, double defensa, int mp, int mpMax, int regen,
			int veneno, int roboVida, String descripcion, String ruta) 
	{
		this.nombre = nombre;
		this.hp = hp;
		this.hpMax = hpMax;
		this.ataque = ataque;
		this.defensa = defensa;
		this.mp = mp;
		this.mpMax = mpMax;
		this.regen = regen;
		this.veneno = veneno;
		this.roboVida=roboVida;
		this.descripcion=descripcion;
		this.ruta=ruta;
	}
// Método toString para mostrar los datos del enemigo si es necesario
	@Override
	public String toString() 
	{
	    return "Nombre: " + nombre + "\n" +
	           "HP: " + hp + "/" + hpMax + "\n" +
	           "Ataque: " + ataque + "\n" +
	           "Defensa: " + defensa + "\n" +
	           "MP: " + mp + "/" + mpMax + "\n" +
	           "Regeneración: " + regen + "\n" +
	           "Veneno: " + veneno + "\n" +
	           "Robo de Vida: " + roboVida + "\n" +
	           "Descripción:\n" + descripcion;
	}
	
	
	
}
