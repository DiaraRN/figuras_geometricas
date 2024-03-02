import javax.swing.JOptionPane;

public class Triangulo extends FigurasG {
    
    @Override
    public void AreaF()
    {
        System.out.println("Area del triangulo");

        Base=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Base del triangulo"));
        AltT=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Altura del triangulo"));

        Area = (Base * AltT)/ 2;

        System.out.println("Base:"+Base);
        System.out.println("Altura:"+AltT);
        System.out.println("Formula:(Base * Altura)/2");

        System.out.println("El area del triangulo es:"+Area);



    }

}
