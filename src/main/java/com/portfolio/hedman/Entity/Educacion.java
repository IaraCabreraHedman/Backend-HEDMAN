
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

public class Educacion implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEdu;
    @NotNull
    private String tituloEdu;
    @NotNull
    private String descripcionEdu;
    private String imgEdu;

    public Educacion() {
    }

    public Educacion(Long idEdu, String tituloEdu, String descripcionEdu, String imgEdu) {
        this.idEdu = idEdu;
        this.tituloEdu = tituloEdu;
        this.descripcionEdu = descripcionEdu;
        this.imgEdu = imgEdu;
    }

    
    public Long getIdEdu() {
        return idEdu;
    }

    public void setIdEdu(Long idEdu) {
        this.idEdu = idEdu;
    }

    public String getTituloEdu() {
        return tituloEdu;
    }

    public void setTituloEdu(String tituloEdu) {
        this.tituloEdu = tituloEdu;
    }

    public String getDescripcion() {
        return descripcionEdu;
    }

    public void setDescripcion(String descripcionEdu) {
        this.descripcionEdu = descripcionEdu;
    }

    public String getImgEdu() {
        return imgEdu;
    }

    public void setImgEdu(String imgEdu) {
        this.imgEdu = imgEdu;
    }
    
    
}


