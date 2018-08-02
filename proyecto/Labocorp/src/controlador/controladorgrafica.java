/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.graficas;

/**
 *
 * @author GLOBAL
 */
public class controladorgrafica {
     public void controladoraccion(String evento, graficas unagrafica ){
        switch(evento){
            case "Insertar":
              unagrafica.insertar();
              break;
        }
    }
}
