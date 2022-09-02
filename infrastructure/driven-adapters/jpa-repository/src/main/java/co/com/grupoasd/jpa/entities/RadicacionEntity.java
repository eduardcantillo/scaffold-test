package co.com.grupoasd.jpa.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "radicaciones")
@Data
public class RadicacionEntity implements Serializable {

    @Id
    private String id;
    private LocalDate fecha;
    private String hash;
    private String nombre;
    private String tipo;
    private String observacion;
    private String url;
    private Estado estado;

}
