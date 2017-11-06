
package com.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author Catherin
 */
@Entity
public class CompraCab implements Serializable{
    private List<CompraDet> compraDets = new ArrayList<CompraDet>();
    private int id;
    private int num;
    private Proveedor proveedor;
    private Funcionario funcionario;
    private Calendar fecha;
    private String hora;
    private long total;

    @OneToMany(mappedBy = "cabecera", cascade = CascadeType.ALL)
    public List<CompraDet> getCompraDets() {
        return compraDets;
    }

    public void setCompraDets(List<CompraDet> compraDets) {
        this.compraDets = compraDets;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @ManyToOne
    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    @ManyToOne
    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Temporal(javax.persistence.TemporalType.DATE)
    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}
