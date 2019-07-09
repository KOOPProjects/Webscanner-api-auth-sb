package webscanner.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import webscanner.models.Response;

import java.util.List;

@Repository
public interface ResponseRepository extends CrudRepository<Response, Integer> {
    List<Response> getResponsesByOrderIdAndType(int orderId, String type);
}
