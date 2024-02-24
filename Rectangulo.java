package FiguraGeometrica;

import javax.swing.JOptionPane;

public class Rectangulo extends FigurasG{
    
      @Override
    public void AreaF()
    {
        System.out.println("Area del Rectangulo");

        Base=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Base del Rectangulo"));
        AltT=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Altura del Rectangulo"));

        Area = Base * AltT;

        System.out.println("Base:"+Base);
        System.out.println("Altura:"+AltT);

        System.out.println("Formula:(Base * Altura)");

        System.out.println("El area del Rectangulo es:"+Area);



    }

}
