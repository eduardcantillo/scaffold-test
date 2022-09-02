package co.com.grupoasd.model.radicacion;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data

@NoArgsConstructor
public class Radicacion {

    private String id;
    private LocalDate fecha;
    private String hash;
    private String nombre;
    private String tipo;
    private String observacion;
    private String url;
    private Estado estado;

}
