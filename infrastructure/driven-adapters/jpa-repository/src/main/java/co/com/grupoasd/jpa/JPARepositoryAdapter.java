package co.com.grupoasd.jpa;

import co.com.grupoasd.jpa.entities.RadicacionEntity;
import co.com.grupoasd.jpa.helper.AdapterOperations;
import co.com.grupoasd.model.radicacion.Radicacion;
import co.com.grupoasd.model.radicacion.gateways.RadicacionRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
public class JPARepositoryAdapter extends AdapterOperations<Radicacion, RadicacionEntity, String, JPARepository>
 implements RadicacionRepository
{

    public JPARepositoryAdapter(JPARepository repository, ObjectMapper mapper) {
        /**
         *  Could be use mapper.mapBuilder if your domain model implement builder pattern
         *  super(repository, mapper, d -> mapper.mapBuilder(d,ObjectModel.ObjectModelBuilder.class).build());
         *  Or using mapper.map with the class of the object model
         */
        super(repository, mapper, d -> mapper.map(d, Radicacion.class));
    }
}
