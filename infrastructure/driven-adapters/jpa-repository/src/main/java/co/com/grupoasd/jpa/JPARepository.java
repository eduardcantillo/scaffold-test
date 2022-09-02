package co.com.grupoasd.jpa;

import co.com.grupoasd.jpa.entities.RadicacionEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface JPARepository extends CrudRepository<RadicacionEntity, String>, QueryByExampleExecutor<RadicacionEntity> {
}
