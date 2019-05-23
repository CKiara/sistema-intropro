/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.intropro.docente_auxiliar;

import java.util.List;
import sistema.intropro.AbstractController;

/**
 *
 * @author Cristal
 */
public class DocenteAuxiliarController extends AbstractController {

    public DocenteAuxiliar create(DocenteAuxiliar entity) {
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
        return entity;
    }

    public void edit(Long id, DocenteAuxiliar entity) {
        entityManager.getTransaction().begin();
        entityManager.merge(entity);
        entityManager.getTransaction().commit();
    }

    public void remove(Long id) {
        entityManager.getTransaction().begin();
        DocenteAuxiliar docenteAuxiliar = entityManager.find(DocenteAuxiliar.class, id);
        entityManager.remove(docenteAuxiliar);
        entityManager.getTransaction().commit();
    }

    public DocenteAuxiliar find(Long id) {
        entityManager.getTransaction().begin();
        DocenteAuxiliar entity = entityManager.find(DocenteAuxiliar.class, id);
        entityManager.getTransaction().commit();
        return entity;
    }

    public List<DocenteAuxiliar> findAll() {
        List<DocenteAuxiliar> resultList;
        entityManager.getTransaction().begin();
        resultList = entityManager.createNamedQuery("DocenteAuxiliar.findAll", DocenteAuxiliar.class)
                .getResultList();
        entityManager.getTransaction().commit();
        return resultList;
    }
}
