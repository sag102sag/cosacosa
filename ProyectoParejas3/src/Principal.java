import java.io.FileInputStream;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;

import org.apache.commons.compress.utils.IOUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.ss.usermodel.Drawing;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Principal {
// Método para poner imágenes en el Excel saliente
	public static void ponerImagen(Workbook workbook, Sheet sheet, Row row, String inputImageName) {
        row.setHeight((short) 1000);
        Drawing<?> imagen = sheet.createDrawingPatriarch();
        try (InputStream inputImageStream = new FileInputStream(inputImageName)) {
            byte[] inputImageBytes = IOUtils.toByteArray(inputImageStream);
            int inputImagePictureID = workbook.addPicture(inputImageBytes, Workbook.PICTURE_TYPE_JPEG);
            ClientAnchor anchor = workbook.getCreationHelper().createClientAnchor();
            anchor.setCol1(row.getPhysicalNumberOfCells());
            anchor.setRow1(row.getRowNum());
            
            anchor.setCol2(row.getLastCellNum() + 1);
            anchor.setRow2(row.getRowNum() + 1);
            
            anchor.setAnchorType(ClientAnchor.AnchorType.DONT_MOVE_AND_RESIZE);
            
            imagen.createPicture(anchor, inputImagePictureID);
            
        } catch(Exception e) {
            System.out.println("NO HAY FOTO");
        }
    }
// MÉTODO PRINCIPAL DONDE SE EJECUTA EL JUEGO	
	public static void main(String[] args) {
		
		
		Workbook workbook = new HSSFWorkbook();
		Sheet hoja = workbook.createSheet("Misthaven");
		
		 // Creación de la primera fila y definición del archivo de salida
		Row fila = hoja.createRow(0);
		File archivo = new File("Misthaven.xls");
		Cell celda;
		
		 // Estilo para el encabezado de la tabla
		CellStyle estiloEncabezado = workbook.createCellStyle();
        estiloEncabezado.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
        estiloEncabezado.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
        // Arrays de String que almacenarán los valores de las cabeceras de las tablas del Excel
		String[] cabecera1 = {"Clase", "HP", "Atq", "Defensa", "MP","Regeneración","Robo de vida","Veneno","Ilustracion"};
		String[] cabecera3 = {"Nombre", "HP", "Ataque", "Defensa", "Robo de vida", "Veneno", "Regeneración", "Ilustración", "Descripción", "Hora Muelto"};
		
		// Algunos Arrays y ArrayList necesarios para los objetos Jugador
		boolean[] objetos=new boolean[7];
		int[] contador= new int[5];
		ArrayList<Hechizo> hechizos = new ArrayList<Hechizo>();
		ArrayList<Row> filas = new ArrayList<Row>();
		
		// TÍTULO DEL JUEGO
		System.out.print(ConsoleColors.WHITE_BOLD_BRIGHT);
		System.out.println("/////////////////////////////////////////////////////////////////////////////////////\n");
		System.out.println("888       888                        888                                  \r\n"
				+ "888   o   888                        888                                  \r\n"
				+ "888  d8b  888                        888                                  \r\n"
				+ "888 d888b 888  8888b.  88888b.   .d88888  .d88b.  888d888 .d88b.  888d888 \r\n"
				+ "888d88888b888     \"88b 888 \"88b d88\" 888 d8P  Y8b 888P\"  d8P  Y8b 888P\"   \r\n"
				+ "88888P Y88888 .d888888 888  888 888  888 88888888 888    88888888 888     \r\n"
				+ "8888P   Y8888 888  888 888  888 Y88b 888 Y8b.     888    Y8b.     888     \r\n"
				+ "888P     Y888 \"Y888888 888  888  \"Y88888  \"Y8888  888     \"Y8888  888     \r\n"
				+ "                                                                          ");
		System.out.println("/////////////////////////////////////////////////////////////////////////////////////");
		
		// Nuevo objeto jugador "player1"
		Jugador player1 =new Jugador();
		
		// Switch para seleccionar clase según la opción recibida del método seleccionClase
		switch(Metodos.seleccionClase())
		{
		// Clase 1: CABALLERO
		case 1:
			player1 =new Jugador("Caballero", "Pepe", 70, 70, 17, 15, 12, 12, objetos, 2, 0, 0, hechizos, "./imagenes/caballero.jpg");
			hechizos.add(Hechizo.golpeGlorioso((int) player1.ataque));
			hechizos.add(Hechizo.conHonor((int) player1.hpMax));
			System.out.print("\u001B[33m");
			Metodos.mostrarConRetraso("Has elegido Caballero ", 20);
			System.out.print("\u001B[37m");
			break;
		// Clase 2: MAGO
		case 2:
			player1 =new Jugador("Mago", "Lolo", 53, 53, 8, 7, 22, 22, objetos, 1, 1, 1, hechizos, "./imagenes/mago.jpg");
			hechizos.add(Hechizo.bolaDuFogo(player1.mpMax));
			hechizos.add(Hechizo.aguijonSombrio(player1.mpMax));
			hechizos.add(Hechizo.estallidoVital(player1.mpMax));
			Metodos.mostrarConRetraso("Has elegido", 20);
			System.out.print("\u001B[36m Mago\u001B[37m");
			System.out.print(ConsoleColors.WHITE);
			Metodos.mostrarConRetraso(".", 20);
			break;
		// Clase 3: LADRÓN
		case 3:
			player1 =new Jugador("Ladron", "FUFU", 60, 60, 15, 10, 15, 15, objetos, 1, 2, 1, hechizos, "./imagenes/ladron.jpg");
			hechizos.add(Hechizo.punyaladaToxica((int) player1.ataque, (int) player1.veneno));
			hechizos.add(Hechizo.unoConLasSombras((int) player1.ataque));
			Metodos.mostrarConRetraso("Has elegido ", 20);
			System.out.print("\u001B[32m Ladrón\u001B[37m");
			System.out.print(ConsoleColors.WHITE);
			Metodos.mostrarConRetraso(".", 20);
			break;
		}	
		// Bucle para crear todas las filas del Excel y almacenarlas en un ArrayList
		for(int i=0; i<20; i++)
		{
			filas.add(hoja.createRow(i));
		}
		
		// Cabecera de Excel
		celda=filas.get(0).createCell(0);
		celda.setCellStyle(estiloEncabezado);
		celda.setCellValue("Estats iniciales");
		for(int i=0; i<cabecera1.length; i++)
		{
			
			celda = filas.get(1).createCell(i);
			celda.setCellStyle(estiloEncabezado);
			celda.setCellValue(cabecera1[i]);
		}
		// Tabla para representar al jugador al inicio de la partida
		celda=filas.get(2).createCell(0);
		celda.setCellValue(player1.clase);
		celda=filas.get(2).createCell(1);
		celda.setCellValue(player1.hpMax);
		celda=filas.get(2).createCell(2);
		celda.setCellValue(player1.ataque);
		celda=filas.get(2).createCell(3);
		celda.setCellValue(player1.defensa);
		celda=filas.get(2).createCell(4);
		celda.setCellValue(player1.mpMax);
		celda=filas.get(2).createCell(5);
		celda.setCellValue(player1.regen);
		celda=filas.get(2).createCell(6);
		celda.setCellValue(player1.roboVida);
		celda=filas.get(2).createCell(7);
		celda.setCellValue(player1.veneno);
		ponerImagen(workbook, hoja, filas.get(2), player1.ruta);
		
		
		// ArrayLists necesarias para enviar al mátodo partidíca, gracias al paso por referencia, se almacenan directamente los datos recibidos en los ArrayLists.
		LocalDateTime inicio = LocalDateTime.now();
		ArrayList<Enemigo> enemigos = new ArrayList<>();
		ArrayList<LocalDateTime> tiempos = new ArrayList<>();
		
		// Dificultad 1
		Metodos.partidica(player1, 1, 1, 0, 0, enemigos, tiempos);
		// Dificultad 2
		if(player1.hp>0)
		{
		Metodos.partidica(player1, 2, 1, 30, 8, enemigos, tiempos);
		}
		// Dificultad 3
		if(player1.hp>0)
		{
		Metodos.partidica(player1, 3, 1, 50, 15, enemigos, tiempos);
		}
		// Jefe final:
		if(player1.hp>0)
		{
		Metodos.combateJefe(player1, enemigos, tiempos, 1);
		}
		if(player1.hp>0)
		{
			System.out.println("¡Enhorabuena, has ganado!");
		}
		else 
		{
			System.out.println("FIN DEL JUEGO");
		}
		
		// Muestra los tiempos de cada animal.
		System.out.println("Inicio: "+inicio.getHour()+":"+inicio.getMinute()+":"+inicio.getSecond());
		System.out.println();
		for( int i = 0; i<tiempos.size(); i++)
		{
			System.out.println("Enemigo: "+(i+1));
			System.out.println(tiempos.get(i).getHour()+":"+tiempos.get(i).getMinute()+":"+tiempos.get(i).getSecond());
			System.out.println();			
		}
		

		
		// Cabecera de Excel
		celda=filas.get(4).createCell(0);
		celda.setCellStyle(estiloEncabezado);
		celda.setCellValue("Estats Finales");
		for(int i=0; i<cabecera1.length; i++)
		{
			celda = filas.get(5).createCell(i);
			celda.setCellStyle(estiloEncabezado);
			celda.setCellValue(cabecera1[i]);
		}
		// Tabla con las estadísticas finales del jugador
		celda=filas.get(6).createCell(0);
		celda.setCellValue(player1.clase);
		celda=filas.get(6).createCell(1);
		celda.setCellValue(player1.hpMax);
		celda=filas.get(6).createCell(2);
		celda.setCellValue(player1.ataque);
		celda=filas.get(6).createCell(3);
		celda.setCellValue(player1.defensa);
		celda=filas.get(6).createCell(4);
		celda.setCellValue(player1.mpMax);
		celda=filas.get(6).createCell(5);
		celda.setCellValue(player1.regen);
		celda=filas.get(6).createCell(6);
		celda.setCellValue(player1.roboVida);
		celda=filas.get(6).createCell(7);
		celda.setCellValue(player1.veneno);
		ponerImagen(workbook, hoja, filas.get(6), player1.ruta);
		
		
		// Muestra los enemigos matados en la dificultad 1:
		fila=hoja.createRow(8);
		celda=fila.createCell(0);
		celda.setCellStyle(estiloEncabezado);
		celda.setCellValue("Dificultad 1");		
		
		fila= hoja.createRow(9);
		for(int i=0; i<cabecera3.length; i++)
		{
			celda = fila.createCell(i);
			celda.setCellStyle(estiloEncabezado);
			celda.setCellValue(cabecera3[i]);
		}
		for(int i=0; i<4; i++)
		{
			fila=hoja.createRow(10+i);
			celda=fila.createCell(0);
			try {
				celda.setCellValue(enemigos.get(i).nombre);
				celda=fila.createCell(1);
				celda.setCellValue(enemigos.get(i).hpMax);
				celda=fila.createCell(2);
				celda.setCellValue(enemigos.get(i).ataque);
				celda=fila.createCell(3);
				celda.setCellValue(enemigos.get(i).defensa);
				celda=fila.createCell(4);
				celda.setCellValue(enemigos.get(i).roboVida);
				celda=fila.createCell(5);
				celda.setCellValue(enemigos.get(i).veneno);
				celda=fila.createCell(6);
				celda.setCellValue(enemigos.get(i).regen);
				ponerImagen(workbook, hoja, fila, enemigos.get(i).ruta);
				celda=fila.createCell(8);
				celda.setCellValue(enemigos.get(i).descripcion);
				celda=fila.createCell(9);
				celda.setCellValue(tiempos.get(i).getHour()+":"+tiempos.get(i).getMinute()+":"+tiempos.get(i).getSecond());		
			} catch (IndexOutOfBoundsException e) {
				System.out.println(e);
			}
		}
		// Muestra los enemigos matados en la dificultad 2:
		fila=hoja.createRow(15);
		celda=fila.createCell(0);
		celda.setCellStyle(estiloEncabezado);
		celda.setCellValue("Dificultad 2");		
		
		fila= hoja.createRow(16);
		for(int i=0; i<cabecera3.length; i++)
		{
			celda = fila.createCell(i);
			celda.setCellStyle(estiloEncabezado);
			celda.setCellValue(cabecera3[i]);
		}
		for(int i=0; i<4; i++)
		{
			fila=hoja.createRow(17+i);
			celda=fila.createCell(0);
			try {
				celda.setCellValue(enemigos.get(i+4).nombre);
				celda=fila.createCell(1);
				celda.setCellValue(enemigos.get(i+4).hpMax);
				celda=fila.createCell(2);
				celda.setCellValue(enemigos.get(i+4).ataque);
				celda=fila.createCell(3);
				celda.setCellValue(enemigos.get(i+4).defensa);
				celda=fila.createCell(4);
				celda.setCellValue(enemigos.get(i+4).roboVida);
				celda=fila.createCell(5);
				celda.setCellValue(enemigos.get(i+4).veneno);
				celda=fila.createCell(6);
				celda.setCellValue(enemigos.get(i+4).regen);
				ponerImagen(workbook, hoja, fila, enemigos.get(i+4).ruta);
				celda=fila.createCell(8);
				celda.setCellValue(enemigos.get(i+4).descripcion);
				celda=fila.createCell(9);
				celda.setCellValue(tiempos.get(i+4).getHour()+":"+tiempos.get(i+4).getMinute()+":"+tiempos.get(i+4).getSecond());
			} catch (IndexOutOfBoundsException e) {
				System.out.println(e);
			}				
		}
		// Muestra los enemigos matados en la dificultad 3:
		fila=hoja.createRow(22);
		celda=fila.createCell(0);
		celda.setCellStyle(estiloEncabezado);
		celda.setCellValue("Dificultad 3");		
		
		fila= hoja.createRow(23);
		for(int i=0; i<cabecera3.length; i++)
		{
			celda = fila.createCell(i);
			celda.setCellStyle(estiloEncabezado);
			celda.setCellValue(cabecera3[i]);
		}
		for(int i=0; i<4; i++)
		{
			fila=hoja.createRow(24+i);
			celda=fila.createCell(0);
			try {
				celda.setCellValue(enemigos.get(i+8).nombre);
				celda=fila.createCell(1);
				celda.setCellValue(enemigos.get(i+8).hpMax);
				celda=fila.createCell(2);
				celda.setCellValue(enemigos.get(i+8).ataque);
				celda=fila.createCell(3);
				celda.setCellValue(enemigos.get(i+8).defensa);
				celda=fila.createCell(4);
				celda.setCellValue(enemigos.get(i+8).roboVida);
				celda=fila.createCell(5);
				celda.setCellValue(enemigos.get(i+8).veneno);
				celda=fila.createCell(6);
				celda.setCellValue(enemigos.get(i+8).regen);
				ponerImagen(workbook, hoja, fila, enemigos.get(i+8).ruta);
				celda=fila.createCell(8);
				celda.setCellValue(enemigos.get(i+8).descripcion);
				celda=fila.createCell(9);
				celda.setCellValue(tiempos.get(i+8).getHour()+":"+tiempos.get(i+8).getMinute()+":"+tiempos.get(i+8).getSecond());
			} catch (IndexOutOfBoundsException e) {
				System.out.println(e);
			}
		}
		
		//-----------------tabla objetos-----------------
		//encabezado
		celda = filas.get(0).createCell(12);
		celda.setCellStyle(estiloEncabezado);
		celda.setCellValue("Objeto");
		celda = filas.get(0).createCell(13);
		celda.setCellStyle(estiloEncabezado);
		celda.setCellValue("Cantidad");
		
		//datos
		celda=filas.get(1).createCell(12);
		celda.setCellValue("Espadon");
		celda=filas.get(1).createCell(13);
		celda.setCellValue(player1.contador[0]);
		
		celda=filas.get(2).createCell(12);
		celda.setCellValue("Escudo viejo");
		celda=filas.get(2).createCell(13);
		celda.setCellValue(player1.contador[1]);
		
		celda=filas.get(3).createCell(12);
		celda.setCellValue("Amuleto vampirico");
		celda=filas.get(3).createCell(13);
		celda.setCellValue(player1.contador[2]);
		
		celda=filas.get(4).createCell(12);
		celda.setCellValue("Amuleto perdido");
		celda=filas.get(4).createCell(13);
		celda.setCellValue(player1.contador[3]);
		
		celda=filas.get(5).createCell(12);
		celda.setCellValue("Daga envenenada");
		celda=filas.get(5).createCell(13);
		celda.setCellValue(player1.contador[4]);
		
		celda=filas.get(6).createCell(12);
		celda.setCellValue("Loto negro");
		celda=filas.get(6).createCell(13);
		celda.setCellValue(player1.contador[5]);
		
		celda=filas.get(7).createCell(12);
		celda.setCellValue("Lapislazuli");
		celda=filas.get(7).createCell(13);
		celda.setCellValue(player1.contador[6]);
		//-----------------fin tabla objetos-----------------
		
		
		//----------------TABLA JEFE FINAL-------------------
		fila=hoja.createRow(29);
		celda=fila.createCell(0);
		celda.setCellStyle(estiloEncabezado);
		celda.setCellValue("Jefe final");
		
		fila=hoja.createRow(30);
		for(int i=0; i<cabecera3.length; i++) {
			celda=fila.createCell(i);
			celda.setCellStyle(estiloEncabezado);
			celda.setCellValue(cabecera3[i]);
		}
		
		
		fila=hoja.createRow(31);
		celda=fila.createCell(0);
		try {
			celda.setCellValue(enemigos.get(enemigos.size()-1).nombre);
			celda=fila.createCell(1);
			celda.setCellValue(enemigos.get(enemigos.size()-1).hpMax);
			celda=fila.createCell(2);
			celda.setCellValue(enemigos.get(enemigos.size()-1).ataque);
			celda=fila.createCell(3);
			celda.setCellValue(enemigos.get(enemigos.size()-1).defensa);
			celda=fila.createCell(4);
			celda.setCellValue(enemigos.get(enemigos.size()-1).roboVida);
			celda=fila.createCell(5);
			celda.setCellValue(enemigos.get(enemigos.size()-1).veneno);
			celda=fila.createCell(6);
			celda.setCellValue(enemigos.get(enemigos.size()-1).regen);
			ponerImagen(workbook, hoja, fila, enemigos.get(enemigos.size()-1).ruta);
			celda=fila.createCell(8);
			celda.setCellValue(enemigos.get(enemigos.size()-1).descripcion);
			celda=fila.createCell(9);
			celda.setCellValue(tiempos.get(enemigos.size()-1).getHour()+":"+tiempos.get(enemigos.size()-1).getMinute()+":"+tiempos.get(enemigos.size()-1).getSecond());
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e);
		}
		//----------------FIN TABLA JEFE FINAL-------------------
		
		  try {
	            // Escribir el libro de trabajo en el archivo de salida
	            FileOutputStream out = new FileOutputStream(archivo);
	            workbook.write(out);
	            out.close();
	            workbook.close();
	            System.out.println("Archivo creado exitosamente!");

	        } catch (IOException e) {
	            System.out.println("Error de escritura");
	            e.printStackTrace();
	        }
	
		
		
		
		
		/*int opcionRep=0;
		System.out.println("Quieres seguir?");
		System.out.println("(1) Sí");
		System.out.println("(2) No");
		opcionRep=Entrada.entero();
		boolean repetir=true;
		if(opcionRep==1)
		{
			repetir=true;
		}
		else {
			repetir=false;
		}
		double i=1.5;
		while(repetir) 
		{
			Metodos.partidica(player1, 1, 1+i, 0, 0);
			Metodos.partidica(player1, 2, 1+i, 30, 8);
			Metodos.partidica(player1, 3, 1+i, 50, 15);
			Metodos.combate(player1, Metodos.jefeFinal(i));	
			System.out.println("Quieres seguir?");
			System.out.println("(1) Sí");
			System.out.println("(2) No");
			opcionRep=Entrada.entero();
			if(opcionRep==1)
			{
				repetir=true;
				i=+0.5;
			}
			else {
				repetir=false;
			}*/
		}
		

		
	}




