import javax.swing.*;
import java.awt.*;

public class puntaje3 extends JFrame{
  public JLabel mensaje1,mensaje2,mensaje3;
  public JTextArea ResComp;
  public int valor=0;
  JPanel miPanel;
  JScrollPane scroll;

  public Font fuente1 = new Font("Arial Nova",Font.PLAIN,14);

  public puntaje3(){
    //setLayout(null);
    setTitle("Resultado");
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    setIconImage(new ImageIcon(getClass().getResource("Imagenes/Inhalador.png")).getImage());

    miPanel = new JPanel();
    miPanel.setLayout(null);
    miPanel.setBackground(new Color(245,245,245));

    scroll = new JScrollPane(miPanel);
    miPanel.setPreferredSize(new Dimension(540,530));
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
    ResComp.setBounds(5,30,550,550);
    ResComp.setEditable(false);
    ResComp.setFont(fuente1);
    ResComp.setBackground(new Color(245,245,245));
    ResComp.setText("Tener una puntuaci?n igual o menor a 3 puntos en el test es considerado como que\n usted no padece de asma, aunque tambi?n puede darse el caso de que usted sea\nde las personas que solo necesitan de un detonante en espec?fico para presentar los\ns?ntomas de asma. Si usted no ha tenido ning?n s?ntoma de asma con alguno de estos\n u otros detonantes, entonces no tiene nada de qu? preocuparse ya que lo m?s\nprobable es que usted no tenga asma.\n\nSi en cambio usted alguna vez a tenido alguno de estos s?ntomas, es aconsejable que\nacuda con personal m?dico para que le realicen la prueba de asma, y si es as?, se le\nrecetar?n medicamentos que pueden ayudarle a prevenir ataques de asma, as? como\nmedicamentos para reducir la gravedad de los s?ntomas durante un ataque de asma.\n\nSu m?dico le ayudar? a dise?ar un plan de acci?n para realizar durante un ataque de\nasma, dicho plan le ayuda a usted para saber c?mo reaccionar de manera segura\ny adecuada durante dichos ataques, adem?s le indicar? m?s recomendaci?nes\nsobre que hacer para prevenir dichos ataques de asma. Es aconsejable que\n identifique los detonantes que le provoquen los ataques de asma para tener un\ncontacto m?nimo con ellos.\n\nSe le recomienda tambi?n que mantenga siempre limpio su casa y lugar de trabajo ya\nque una de las causas que provocan los ataques de asma son el polvo y los acaros.\n\nLas personas que padecen de asma tienen que vacunarse contra la influenza una vez\n al a?o, ya que son m?s propensas a contraer esta enfermedad por los s?ntomas que\nya padecen y porque con el asma, esta combinaci?n de enfermedades puede ser muy\ngrave.");
    miPanel.add(ResComp);
  }

  public static void main(String args[]){
    puntaje3 ventana3 = new puntaje3();
    ventana3.setBounds(300,250,600,400);
    ventana3.setVisible(true);
    ventana3.setResizable(false);
  }
}