import javax.swing.*;
import java.awt.desktop.SystemSleepEvent;

public class cajer {

        public static void main(String [] args) {
            int opcion = 0;
            int saldo = 1000;
            Float ingreso;
            Float retiro;
            while (opcion != 3) {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Hola bienvenido al cajero automatico \n" +
                        " 1 . Porfavor ingrese el dinero a la cuenta \n" +
                        " 2 . retiro del dinero de la cuenta \n" +
                        " 3 . desea salir \n" +
                        "============================================================================="));

                switch (opcion) {
                    case 1:
                        ingreso = Float.parseFloat(JOptionPane.showInputDialog("por favor ingrese la cantidad que quiere a la cuenta: "));
                        saldo = (int) (saldo + ingreso);
                        JOptionPane.showMessageDialog(null, " dienro en la cuenta : " + saldo);
                        break;

                    case 2:
                        retiro = Float.parseFloat(JOptionPane.showInputDialog("ingrese la cantidad  que quieres retirar:"));

                        if (retiro > saldo) {
                            JOptionPane.showInputDialog(null, "Ojo no tenes saldo suficiente para retirar su plata");

                        }
                        else {
                            saldo = (int) (saldo - retiro);
                            JOptionPane.showMessageDialog(null, "Dinero en la cuenta : " + saldo);


                            break;


                        }   default:
                                JOptionPane.showMessageDialog(null, "salir del siste :)");
                                break;
                }
            }
        }
}









