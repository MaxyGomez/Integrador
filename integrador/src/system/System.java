
package system;
import controlador.Controlador;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JFrame;
import dao.Persistencia;
import vista.VentanaPrincipal;

/**
 *
 * @author tincho
 */
public class System {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("integradorPU");
        // creo objeto de Persistencia (DAO)
        Persistencia persistencia = new Persistencia(emf);
        // creo controlador y asocio (inyecto) al controlador el objeto de Persistencia (DAO)
        Controlador c = new Controlador(persistencia);
        
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal(c);
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setLocationRelativeTo(null);
        ventanaPrincipal.setVisible(true);
        
        
    }
    
}
