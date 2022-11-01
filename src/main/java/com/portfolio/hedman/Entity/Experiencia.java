
package com.portfolio.hedman.Entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


/**
 *
 * @author iara-
 */
@Entity
public class Experiencia implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idExp;
    @NotNull
    private String tituloExp;
    @NotNull
    private String descripcionExp;
    private String imgExp;

    public Experiencia() {
    }

    public Experiencia(Long idExp, String tituloExp, String descripcionExp, String imgExp) {
        this.idExp = idExp;
        this.tituloExp = tituloExp;
        this.descripcionExp = descripcionExp;
        this.imgExp = imgExp;
    }

    public Long getIdExp() {
        return idExp;
    }

    public void setIdExp(Long idExp) {
        this.idExp = idExp;
    }

    public String getTituloExp() {
        return tituloExp;
    }

    public void setTituloExp(String tituloExp) {
        this.tituloExp = tituloExp;
    }

    public String getDescripcionExp() {
        return descripcionExp;
    }

    public void setDescripcionExp(String descripcionExp) {
        this.descripcionExp = descripcionExp;
    }

    public String getImgExp() {
        return imgExp;
    }

    public void setImgExp(String imgExp) {
        this.imgExp = imgExp;
    }
    
    
    
}
