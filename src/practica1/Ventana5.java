package practica1;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Ventana5 extends JFrame{
	
	public Ventana5() {
		setSize(500, 500); //tamano de la ventana
		setLocation(0,0); //coordenadas de inicio en la pantalla
		setBounds(100, 100, 500, 500);//tamano del rectangulo
		setTitle("Tienda"); //titulo de la ventana
		setLocationRelativeTo(null); //posicion relativa a un componente, si es null aparece en el centro
		setResizable(true); //ajustar tamano de la ventana con el cursor
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //dejar de ejecutar el programa al cerrar la ventana
		
		//icono de la ventana
		Toolkit tk = Toolkit.getDefaultToolkit();
		Image icono = tk.getImage("src/img/iconoTienda.jpg"); //necesario crear una carpeta img
		setIconImage(icono);
		
		BoxPanel boxPanelito = new BoxPanel();
		add(boxPanelito);
		
		setVisible(true); //visibilidad de la ventana
	}
}
