import javax.swing.*;
import java.awt.*;

public class puntaje40 extends JFrame{
  public JLabel mensaje1,mensaje2,mensaje3;
  public JTextArea ResComp;
  public int valor=0;
  JPanel miPanel;
  JScrollPane scroll;

  public Font fuente1 = new Font("Arial Nova",Font.PLAIN,14);

  public puntaje40(){
    //setLayout(null);
    setTitle("Resultado");
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    setIconImage(new ImageIcon(getClass().getResource("Imagenes/Inhalador.png")).getImage());

    miPanel = new JPanel();
    miPanel.setLayout(null);
    miPanel.setBackground(new Color(245,245,245));

    scroll = new JScrollPane(miPanel);
    miPanel.setPreferredSize(new Dimension(540,500));
    scroll.getVerticalScrollBar().setUnitIncrement(16);
    add(scroll);

    Proyecto ventanaPrincipal = new Proyecto();
    valor = ventanaPrincipal.puntaje;

    mensaje1 = new JLabel("El puntaje que usted obtuvo fue de ");
    mensaje1.setBounds(5,0,225,20);
    mensaje1.setFont(fuente1);
    miPanel.add(mensaje1);

    mensaje2 =new JLabel("");
    mensaje2.setBounds(230,0,20,20);
    mensaje2.setFont(fuente1);
    mensaje2.setText(String.valueOf(valor));
    miPanel.add(mensaje2);

    mensaje3 = new JLabel(" puntos de un total de 44 puntos.");
    mensaje3.setBounds(250,0,210,20);
    mensaje3.setFont(fuente1);
    miPanel.add(mensaje3);

    ResComp = new JTextArea();
    ResComp.setBounds(5,30,550,500);
    ResComp.setEditable(false);
    ResComp.setFont(fuente1);
    ResComp.setBackground(new Color(245,245,245));
    ResComp.setText("Tener una puntuaci�n de 40 puntos o m�s en el test, es considerado como que usted\npadece de asma, ya que muchos de los detonantes y s�ntomas que se presentan\nson focos rojos que normalmente se detectan en las personas que padecen de asma,\ncomo pueden ser las dificultades para respirar, opresi�n en el pecho, falta de aire,\nm�sculos tensos en �reas cercanas a las v�as resp�ratorias y tener mucha tos.\nSe le aconseja que acuda con personal m�dico para comprobar los resultaddos del\ntest, y si es as�, se le recetar�n medicamentos que pueden ayudarle a prevenir\n ataques de asma, as� como medicamentos para reducir la gravedad de los s�ntomas\ndurante un ataque de asma.\n\nSu m�dico le ayudar� a dise�ar un plan de acci�n para realizar durante un ataque de\nasma, dicho plan le ayuda a usted para saber c�mo reaccionar de manera segura\ny adecuada durante dichos ataques, adem�s le indicar� m�s recomendaci�nes\nsobre que hacer para prevenir dichos ataques de asma. Es aconsejable que\n identifique los detonantes que le provoquen los ataques de asma para tener un\ncontacto m�nimo con ellos.\n\nSe le recomienda tambi�n que mantenga siempre limpio su casa y lugar de trabajo ya\nque una de las causas que provocan los ataques de asma son el polvo y los acaros.\n\nLas personas que padecen de asma tienen que vacunarse contra la influenza una vez\n al a�o, ya que son m�s propensas a contraer esta enfermedad por los s�ntomas que\nya padecen y porque con el asma, esta combinaci�n de enfermedades puede ser muy\ngrave.");
    miPanel.add(ResComp);
  }

  public static void main(String args[]){
    puntaje40 ventana40 = new puntaje40();
    ventana40.setBounds(300,250,600,400);
    ventana40.setVisible(true);
    ventana40.setResizable(false);
  }
}