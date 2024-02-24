package  FiguraGeometrica;

import javax.swing.JOptionPane;
//operaciones del codigo
public class Principal {
     public static void main(String[] args) {
        
     
        int op;
        do
        {
        op = Integer.parseInt(JOptionPane.showInputDialog(null,"CALCULAR EL AREA DE LAS FIGURAS GEOMETRICAS\n"
            + "Seleccione una opcion: \n"
            + " 1. Triangulo\n"
            + " 2. Circulo\n"
            + " 3. Rectangulo\n"
            + " 4. Salir"));

            switch (op) {
                case 1:
                    Triangulo Nia= new Triangulo();
                    Nia.AreaF();
                    System.out.println("");
                    break;

                case 2 :
                    Circulo Nia2= new Circulo();
                    Nia2.AreaF();
                    System.out.println("");
                    break;

                 case 3 :
                    Rectangulo Nia3= new Rectangulo();
                    Nia3.AreaF();
                    System.out.println("");
                    break;

                case 4 :
                JOptionPane.showMessageDialog(null,"QUE TENGA BUEN DIA");System.exit(0);
                
                    break;

            
                default:JOptionPane.showMessageDialog(null,"Eliga una opcion Valida");
                System.out.println("");
                    break;
            }
        }while(op!=4);
    }

    
}