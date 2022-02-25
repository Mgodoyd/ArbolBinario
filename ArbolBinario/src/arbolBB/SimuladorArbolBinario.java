
package arbolBB;

import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JPanel;

/**
 *
 * @author Toloza XD
 */
public class SimuladorArbolBinario {

    ArbolB miArbol = new ArbolB();

    public SimuladorArbolBinario() {
    }

    public boolean insertar(Integer dato) {
        return (this.miArbol.agregar(dato));
    }
    
    public JPanel getDibujo() {
        return this.miArbol.getdibujo();
    }
}
