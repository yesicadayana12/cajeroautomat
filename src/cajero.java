import javax.swing.*;

public class cajero {

    public static void main(String [] args) {
        int opcion;
        final int saldo_inicial = 1000;
        Float ingreso, saldo;
        Float retiro;

        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Hola bienvenido al cajero automatico \n" +
                " 1 . Porfavor ingrese el dinero a la cuenta \n" +
                " 2 . retiro del dinero de la cuenta \n" +
                " 3 . desea salir \n" +
                "============================================================================="));

        switch (opcion) {
            case 1:
                ingreso = Float.parseFloat(JOptionPane.showInputDialog("por favor ingrese la cantidad que quiere a la cuenta: "));

                saldo = saldo_inicial + ingreso;
                JOptionPane.showMessageDialog(null," dienro en la cuenta : " + saldo);
                break;

            case 2:
                retiro = Float.parseFloat(JOptionPane.showInputDialog("ingrese la cantidad  que quieres retirar:"));

                if (retiro > saldo_inicial) {
                    JOptionPane.showInputDialog(null, "Ojo no tenes saldo suficiente para retirar su plata");

                } else {
                    saldo = saldo_inicial - retiro;
                    JOptionPane.showMessageDialog(null, "Dinero en la cuenta : " + saldo);}
                    break;
                    case 3:
                            JOptionPane.showMessageDialog(null, "JAJAJA te equivocaste machi de opcion  de menu");

                }
        }




    }

