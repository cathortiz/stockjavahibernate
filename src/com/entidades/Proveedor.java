
package com.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
public class Proveedor implements Serializable{
    private List<CompraCab> compraCabs = new ArrayList<CompraCab>();
    private int id;
    private String des;
    private String dir;
    private String tel;
    private String cuit;


    @OneToMany(mappedBy = "proveedor")
    public List<CompraCab> getCompraCabs() {
        return compraCabs;
    }

    public void setCompraCabs(List<CompraCab> compraCabs) {
        this.compraCabs = compraCabs;
    }
    
       public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
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
    
    
}
