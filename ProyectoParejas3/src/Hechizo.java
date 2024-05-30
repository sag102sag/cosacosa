// CLASE HECHIZO
public class Hechizo {
// Atributos de la clase hechizo
String nombre="";
int poder=0;
int coste=0;
int veneno=0;
int robo=0;
int curacion=0;
boolean efecto=false;
String descripcion="";


// Constructor con parámetros para los hechizos
public Hechizo(String nombre, int poder, int coste, int veneno, int robo, int curacion, boolean efecto,
		String descripcion)
{
	super();
	this.nombre = nombre;
	this.poder = poder;
	this.coste = coste;
	this.veneno = veneno;
	this.robo = robo;
	this.curacion = curacion;
	this.efecto = efecto;
	this.descripcion = descripcion;
}

//-------------------------------------------------------------------  HECHIZOS PREDEFINIDOS  -----------------------------------------------------------------------

public static Hechizo golpeGlorioso(int ataque)
{
	String nombre="Golpe glorioso";
	int poder=(int) (30+(ataque*0.2));
	int coste=5;
	int veneno=0;
	int robo=5;
	int curacion=0;
	boolean efecto=false;
	String descripcion="Arremete con la espada verticalmente y aprovecha la vitalidad del enemigo en tu favor.";
	Hechizo hechizo=new Hechizo(nombre, poder, coste, veneno, robo, curacion, efecto, descripcion);
	return hechizo;
}
public static Hechizo conHonor(int ataque)
{
	String nombre="Con honor";
	int poder=0;
	int coste=5;
	int veneno=0;
	int robo=0;
	int curacion=(int) (25+(ataque*0.2));
	boolean efecto=false;
	String descripcion="Golpea el torso de la armadura con un puñetazo contundente para recobrar su vitalidad y espríritu de lucha";
	Hechizo hechizo=new Hechizo(nombre, poder, coste, veneno, robo, curacion, efecto, descripcion);
	return hechizo;
}
public static Hechizo bolaDuFogo(int mana)
{
	String nombre="Bola du Fogo";
	int poder=(int) (34+(mana*0.6)); //40 de poder original
	int coste=8;
	int veneno=0;
	int robo=0;
	int curacion=0;
	boolean efecto=false;
	String descripcion="Um projétil flamejante que envolve o alvo em chamas ao impacto, causando queimaduras intensas.";
	Hechizo hechizo=new Hechizo(nombre, poder, coste, veneno, robo, curacion, efecto, descripcion);
	return hechizo;
}
public static Hechizo aguijonSombrio(int mana)
{
	String nombre="Aguijon Sombrío";
	int poder=(int) (17+(mana*0.6));
	int coste=7;
	int veneno=7;
	int robo=0;
	int curacion=0;
	boolean efecto=false;
	String descripcion="Un hechizo que dispara una aguja de sombra hacia el objetivo. Al impactar, libera una toxina mágica que causa dolor y debilitamiento progresivo.";
	Hechizo hechizo=new Hechizo(nombre, poder, coste, veneno, robo, curacion, efecto, descripcion);
	return hechizo;
}
public static Hechizo estallidoVital(int mana)
{
	String nombre="Estallido Vital";
	int poder=0;
	int coste=6;
	int veneno=0;
	int robo=0;
	int curacion=(int) (35+(mana*0.6));
	boolean efecto=false;
	String descripcion="Un hechizo que utiliza dotes arcanas para regenerar el cuerpo";
	Hechizo hechizo=new Hechizo(nombre, poder, coste, veneno, robo, curacion, efecto, descripcion);
	return hechizo;
}
public static Hechizo punyaladaToxica(int ataque, int veneno2)
{
	String nombre="Punyalada Toxica";
	int poder=0;
	int coste=15;
	int veneno=(int) (veneno2*10);
	int robo=0;
	int curacion=0;
	boolean efecto=false;
	String descripcion="Impregna el filo del puñal con una toxina letal y corta al enemigo tan limpiamente que ni sangra"
			+ "\n(Daña al enemigo en base a tu poder de veneno multiplicado por 10).";
	Hechizo hechizo=new Hechizo(nombre, poder, coste, veneno, robo, curacion, efecto, descripcion);
	return hechizo;
}
public static Hechizo unoConLasSombras(int ataque)
{
	String nombre="Uno con las sombras";
	int poder=(int) (35+(ataque*0.2));
	int coste=6;
	int veneno=0;
	int robo=0;
	int curacion=0;
	boolean efecto=true;
	String descripcion="A las 5 en el parque.";
	Hechizo hechizo=new Hechizo(nombre, poder, coste, veneno, robo, curacion, efecto, descripcion);
	return hechizo;
}

}

