
package com.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Catherin
 */
@Entity
public class CompraDet implements Serializable{
    private int id;
    private CompraCab cabecera;
    private Articulo articulo;
    private int cantidad;
    private long importe;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne
    public CompraCab getCabecera() {
        return cabecera;
    }

    public void setCabecera(CompraCab cabecera) {
        this.cabecera = cabecera;
    }

    @ManyToOne
    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public long getImporte() {
        return importe;
    }

    public void setImporte(long importe) {
        this.importe = importe;
    }
    
    

}
