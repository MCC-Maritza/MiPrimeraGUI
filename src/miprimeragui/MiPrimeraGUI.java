
package miprimeragui;
import javax.swing.JFrame;

/**
 *
 * @author maryse
 * 
 * GUI
 * Creación de mi primera interfaz gráfica en Java
 */

public class MiPrimeraGUI extends JFrame{

    //Contructor --> Propiedades de la ventana
    public MiPrimeraGUI(){
        setTitle("Mi primera ventana"); //Establece el título de la ventana
        setSize(800, 580); //Dimenciona la ventana (largo y ancho)
        Componentes(); //Llamada al método que contiene los componentes que conforman el  formulario
        this.setResizable(false); //Cambiar el tamaño del marco
        setLocationRelativeTo(null); //Posiciona la ventana en el centro
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Operación que se va a realizar, cuando se cierre la ventana
        setVisible(true); //Hace visible la ventana 
        
    }
    
    //Métodos con los elementos que conforman la ventana
    public void Componentes(){
        
    }
    
    //Método que ejecuta la aplicación --> main
    public static void main(String args[]){
        MiPrimeraGUI ventana= new MiPrimeraGUI();
        //ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //ventana.setVisible(true);
    }
    
}
