import javax.swing.*;
/**Creacion de la clase Numero
     * @author Manuel Abelino Roberto : numControl 18161174
     * @version 1.0
     * La problematica que se plantea es el saber si un numero es positivo, negativo o si es 0
     */
public class Numero
{
    /**Metodo main
     * simple para poder correr el programa
     */
    public static void main(String[] args){
        double n=0;  
      while(true)
        try{
       n = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero"));
       break;
       }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null,"Lo que acabas de ingresar no es un numero, reintentalo de nuevo");
        }
        if(n>0)
        JOptionPane.showMessageDialog(null, "el numero ingresado es positivo");
      else if(n<0)
       JOptionPane.showMessageDialog(null, "el numero ingresado es negativo");
       else
       JOptionPane.showMessageDialog(null,"el numero ingresado es 0");
    }
}