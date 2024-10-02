package com.mycompany.automovil;
import com.mycompany.automovil.igu.Principal;


public class Automovil {

    public static void main(String[] args) {
        Principal princ = new Principal();
        princ.setVisible(true); //Hace visible la pantallita
        princ.setLocationRelativeTo(null);//Funciona para que la pantallita aparezca en el medio
    }
}
