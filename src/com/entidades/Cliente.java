
package com.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Catherin
 */
public class Cliente implements Serializable{
    private List<VentaCab> ventaCabs = new ArrayList<VentaCab>();
    private int id;
    private String des;
    private String dir;
    private String tel;
    private String cuit;

    @OneToMany(mappedBy = "cliente")
    public List<VentaCab> getVentaCabs() {
        return ventaCabs;
    }

    public void setVentaCabs(List<VentaCab> ventaCabs) {
        this.ventaCabs = ventaCabs;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }
    
    
}
