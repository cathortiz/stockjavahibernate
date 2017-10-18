
package com.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Catherin
 */
@Entity
public class Tipo implements Serializable {
    private List<Articulo> articulos = new ArrayList<Articulo>();
    private int id;
    private String des;
    
    @OneToMany(mappedBy = "tipo",cascade = CascadeType.ALL)
    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    @Column(length=50)
    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
    
    
    
}
