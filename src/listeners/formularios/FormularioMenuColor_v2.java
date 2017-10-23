package listeners.formularios;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class FormularioMenuColor_v2 extends FormularioCambioDeColor
{
	public JMenu manu1=new JMenu("Opciones"),
			menu2=new JMenu("Tamano de la ventana"),
			menu3=new JMenu("Color de Fondo");
	public JMenuItem mi1=new JMenuItem("640*480"),
			mi2=new JMenuItem("1024*768"),
			mi3=new JMenuItem("Rojo"),
			mi4=new JMenuItem("Verde");
	public void setear(){
		setLayout(null);
		setJMenuBar(mb);
		this.mb.add(menu1);this.manu1.add(menu2);//mb.add(menu3)
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
