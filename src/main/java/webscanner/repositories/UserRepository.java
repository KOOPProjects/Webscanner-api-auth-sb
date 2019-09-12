package webscanner.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import webscanner.models.SbusersEntity;

public interface UserRepository extends CrudRepository<SbusersEntity, Integer> {
    SbusersEntity getSbusersEntityByLogin(String login);

}
