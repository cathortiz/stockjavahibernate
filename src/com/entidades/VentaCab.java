/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class VentaCab implements Serializable {
    private List<VentaDet> ventaDets = new ArrayList<VentaDet>();
    private int num;
    private Cliente cliente;
    private Funcionario funcionario;
    private Calendar fecha;
    private String hora;
    private long total;

    @OneToMany(mappedBy = "ventaCab", cascade = CascadeType.ALL)
    public List<VentaDet> getVentaDets() {
        return ventaDets;
    }

    public void setVentaDets(List<VentaDet> ventaDets) {
        this.ventaDets = ventaDets;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @ManyToOne
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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
