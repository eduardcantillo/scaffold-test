package co.com.grupoasd.api;
import co.com.grupoasd.model.radicacion.Radicacion;
import co.com.grupoasd.usecase.saveradication.SaveRadicationUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {
    private final SaveRadicationUseCase useCase;


    @PostMapping(path = "/receptor")
    public Object commandName(@RequestBody Radicacion radicacion) {
//      return useCase.doAction();
        return useCase.save(radicacion);
    }
}
