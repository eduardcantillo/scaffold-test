package co.com.grupoasd.usecase.saveradication;

import co.com.grupoasd.model.radicacion.Radicacion;
import co.com.grupoasd.model.radicacion.gateways.RadicacionRepository;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@RequiredArgsConstructor
public class SaveRadicationUseCase {

    private final RadicacionRepository repository;

    public Radicacion save(Radicacion radicacion){

        radicacion.setId(UUID.randomUUID().toString());
        radicacion.setFecha(LocalDate.now());
        return  repository.save(radicacion);
    }
}
