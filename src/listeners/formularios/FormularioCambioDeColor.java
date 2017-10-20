package listeners.formularios;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class FormularioCambioDeColor extends JFrame implements ActionListener{
    private JMenuBar mb=new JMenuBar();
    private JMenu menu1=new JMenu("Opciones");
    private JMenuItem  mi1=new JMenuItem("Rojo"),
    		mi2=new JMenuItem("Verde"),
    		mi3=new JMenuItem("Azul");
    public FormularioCambioDeColor() {
        setLayout(null);
        setJMenuBar(mb);
        mb.add(menu1);
        mi1.addActionListener(this);
        mi2.addActionListener(this);
        mi3.addActionListener(this);
        menu1.add(mi1);
        menu1.add(mi2);        
        menu1.add(mi3);               
    }
    public void actionPerformed(ActionEvent e) {
    	Container f=this.getContentPane();
        if (e.getSource()==mi1) {
            f.setBackground(new Color(255,0,0));
        }
        if (e.getSource()==mi2) {
            f.setBackground(new Color(0,255,0));
        }
        if (e.getSource()==mi3) {
            f.setBackground(new Color(0,0,255));
        }        
    }
    
    public static void main(String[] ar) {
        FormularioCambioDeColor formulario1=new FormularioCambioDeColor();
        formulario1.setBounds(10,20,300,200);
        formulario1.setVisible(true);
    }    
}