/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.intropro;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author Cristal
 */
public final class SistemaIntroPro {

    private static final String PERSISTENCE_UNIT_NAME = "sistema-IntroProPU";
    private final EntityManagerFactory factory;

    public SistemaIntroPro() {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        initialComponent(factory.createEntityManager());
    }

    public void initialComponent(EntityManager entityManager) {
        Main main = new Main(entityManager);
        main.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            UIManager.put("swing.boldMetal", Boolean.FALSE);
            SistemaIntroPro sistema = new SistemaIntroPro();            
        });

    }

}
