package practica1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class BorderPanel extends JPanel{
	public BorderPanel() {
		setLayout(new BorderLayout());
		setBackground(Color.BLUE);
		Border emptyBorder = BorderFactory.createEmptyBorder(20,10,20,10);
		setBorder(emptyBorder);
		
		JPanel panelSuperior = new JPanel();
		add(panelSuperior, BorderLayout.NORTH);
		
		JButton b = new JButton("hola");
		add(b, BorderLayout.NORTH);
		
		JButton b2 = new JButton("boton 2");
		add(b2, BorderLayout.NORTH);
		
		JButton botonCentro = new JButton("centro");
		add(botonCentro, BorderLayout.CENTER);
		
		crearPanelCentro();
	}
	
	public void crearPanelCentro() {
		JPanel panelCentro = new JPanel(new BorderLayout());
		panelCentro.setBackground(Color.RED);
		
		JPanel panelCentroSur = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panelCentro.add(panelCentroSur, BorderLayout.SOUTH);
		panelCentroSur.setBackground(Color.GREEN);
		
		JButton btnInicio = new JButton("iniciar sesion");
		panelCentroSur.add(btnInicio);
		
		JButton btnCancelar = new JButton("cancelar");
		panelCentroSur.add(btnCancelar);
		
		add(panelCentro, BorderLayout.CENTER);
	}
}
