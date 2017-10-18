
package com.entidades;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Catherin
 */
public class VentaDet {
    private int num;
    private Articulo articulo;
    private int cant;
    private int importe;
    private VentaCab ventaCab;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @ManyToOne
    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    @ManyToOne
    public VentaCab getVentaCab() {
        return ventaCab;
    }

    public void setVentaCab(VentaCab ventaCab) {
        this.ventaCab = ventaCab;
    }
    
    
}
