package listeners.formularios;
import javax.swing.*;

import graficos_v1.MostrarImagen;

import java.awt.*;
import java.awt.event.*;
import java.math.*;
import java.lang.*;
public class FormularioCambioDeColor extends JFrame implements ActionListener{
    public JMenuBar mb=new JMenuBar();
    public JMenu menu1=new JMenu("Opciones");
    public JMenuItem  miRojo=new JMenuItem("Rojo"),
    		miVerde=new JMenuItem("Verde"),
    		miAzul=new JMenuItem("Azul");
  
    private void setear()
	{
    	setLayout(new FlowLayout());
    	setJMenuBar(this.mb);
    	mb.add(menu1);
        miRojo.addActionListener(this);
        miVerde.addActionListener(this);
        miAzul.addActionListener(this);
        menu1.add(this.miRojo);
        menu1.add(this.miVerde);        
        menu1.add(this.miAzul);
	}
    private void mostrar()
	{
    	setear();
    	this.setBounds(10,20,300,200);
    	setVisible(true);
	}
    public void actionPerformed(ActionEvent e) {
    	Container f=this.getContentPane();
        if (e.getSource()==miRojo) {
            f.setBackground(new Color(255,0,0));
        }
        if (e.getSource()==miVerde) {
            f.setBackground(new Color(0,255,0));
        }
        if (e.getSource()==miAzul) {
            f.setBackground(new Color(0,0,255));
        }        
    }
//    private int posicionDelMause()
//	{
//    	int n[2];
//    	Point p = Mau
//    	return 
//	}
//    
    public static void main(String[] ar) {
       (new FormularioCambioDeColor()).mostrar();
       System.out.println("");
    }    
}