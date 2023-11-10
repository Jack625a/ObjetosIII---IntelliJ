//VENTANAS EN JAVA
import javax.swing.JFrame; //Clase para crear ventanas
import javax.swing.JPanel; //Clase para crear paneles
import java.awt.*;
import javax.swing.JLabel; //Clase para crear label
import javax.swing.JTextField; //Clase para Entrada de datos por teclado
import javax.swing.JTextArea;
import javax.swing.JButton; //Clase para crear Botones
import javax.swing.JCheckBox; //Clase para crear Casillas de Verificacion
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup; //Clase para agrupar botones
import javax.swing.JComboBox; //Clase para crear listas desplegables
public class prueba {
    public static void main(String[] args){
        JFrame ventana=new JFrame("Introduccion Interfaz Grafica");
        ventana.setSize(400,400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Paneles
        JPanel contendor1=new JPanel();
        contendor1.setBackground(Color.ORANGE);
        ventana.add(contendor1);
        //LABEL
        JLabel titulo=new JLabel("Titulo Introduccion JAVAX");
        contendor1.add(titulo);
        //Lectura de Datos
        JTextField nombre=new JTextField("Ingres su nombre");
        contendor1.add(nombre);
        //Lectura de Datos mayor rango
        JTextArea descripcion=new JTextArea("Ingrese la descripcion",5,5);
        contendor1.add(descripcion);
        //Botones
        JButton boton1=new JButton("Boton 1");
        contendor1.add(boton1);
        JButton boton2=new JButton("Boton 2");
        contendor1.add(boton2);
        //Casillas de Verificacion
        JCheckBox opcion1=new JCheckBox("Opcion1");
        JCheckBox opcion2=new JCheckBox("Opcion2");
        JCheckBox opcion3=new JCheckBox("Opcion3");
        JCheckBox opcion4=new JCheckBox("Opcion4");
        JCheckBox opcion5=new JCheckBox("Opcion5");

        contendor1.add(opcion1);
        contendor1.add(opcion2);
        contendor1.add(opcion3);
        contendor1.add(opcion4);
        contendor1.add(opcion5);
        //RADIO BUTTON
        JRadioButton opciones=new JRadioButton("Opcion1");
        JRadioButton opciones2=new JRadioButton("Opcion2");
        JRadioButton opciones3=new JRadioButton("Opcion3");

        ButtonGroup seleccion=new ButtonGroup();
        seleccion.add(opciones);
        seleccion.add(opciones2);
        seleccion.add(opciones3);

        contendor1.add(opciones);
        contendor1.add(opciones2);
        contendor1.add(opciones3);

        //Listas desplegables
        String[] colores={"ROJO","VERDE","AZUL","AMARILLO","CAFE"};
        JComboBox<String> listaColores=new JComboBox<>(colores);
        contendor1.add(listaColores);





        ventana.setVisible(true);
    }
}
