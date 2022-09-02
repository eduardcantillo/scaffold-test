package co.com.grupoasd.jpa.entities;

public enum Estado {

    RADICADO ("Radicado"),
    RECIBIDO("Recibido"),
    DESCIFRADO("Descifrado"),
    ERROR("Error"),
    PUBLICADO("Publicado");

    private final String estado;
    Estado(String estado){
        this.estado=estado;
    }

    @Override
    public String toString() {
        return  estado ;
    }
}
