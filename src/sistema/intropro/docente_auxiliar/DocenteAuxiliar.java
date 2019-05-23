/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.intropro.docente_auxiliar;

/**
 *
 * @author Cristal
 */
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Cristal
 */
@Entity
@Table(name = "DOCENTE_AUXILIAR")
@NamedQueries({
    @NamedQuery(name = "DocenteAuxiliar.findAll", query = "SELECT da FROM DocenteAuxiliar da"),
    @NamedQuery(name = "DocenteAuxiliar.findById", query = "SELECT da FROM DocenteAuxiliar da WHERE da.id = :id")
})
public class DocenteAuxiliar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DocenteAuxiliar)) {
            return false;
        }
        DocenteAuxiliar other = (DocenteAuxiliar) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "DocenteAuxiliar{" + "id=" + id + ", nombre=" + nombre + '}';
    }
}

