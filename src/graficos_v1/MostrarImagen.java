package graficos_v1;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MostrarImagen extends JFrame
{
	private JPanel contentPane =new JPanel();
	private void setear()
	{
		   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setBounds(100, 100, 450, 300);
	        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	        contentPane.setLayout(new BorderLayout(0, 0));
	        setContentPane(contentPane);
	        setBounds(0,0,800,600);
	}
	@Override
	public void paint(Graphics g)
	{
		super.paint(g);
        Toolkit t = Toolkit.getDefaultToolkit();
        
        Image imagen = t.getImage ("Desert.jpg");
//        Desktop.getDesktop().open(imagen);
        g.drawImage (imagen, 0, 0, this);
	}
	private void mostrar()
	{
		this.setear();
		setVisible(true);
	}
}
