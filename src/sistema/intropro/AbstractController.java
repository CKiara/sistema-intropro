/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.intropro;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Cristal
 */
public abstract class AbstractController {
    
    @PersistenceContext(unitName = "sistema-IntroProPU")
    protected EntityManager entityManager;
    
    public void setEntityManger(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
