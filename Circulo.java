package FiguraGeometrica;

import javax.swing.JOptionPane; 

public class Circulo extends FigurasG {
   

     @Override
    public  void AreaF()
    {
        //lectura de area circulo 
        System.out.println("Area del circulo");
        Radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo"));

        Area = Math.PI * Math.pow(Radio,2);
        Area += 1;

        System.out.println("Radio" +Radio);
        System.out.println("Formula= PI * Radio^2 ");
 
        System.out.println("El area del Circulo es: " +Area);




    }
    
}
