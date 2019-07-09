package webscanner.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import webscanner.models.HtmlOrdersEntity;

import java.util.List;

@Repository
public interface HtmlOrdersEntityRepository extends CrudRepository<HtmlOrdersEntity, Integer> {

    @Query(value = "SELECT a.\"Id\", a.\"Frequency\", a.\"TargetAddress\", a.\"SubjectOfQuestion\" FROM public.\"HtmlOrders\" a WHERE a.\"Id\" in (SELECT b.\"OrderId\" FROM public.\"UserOrders\" b WHERE b.\"UserId\" =:userId)", nativeQuery = true)
    List<HtmlOrdersEntity> getHtmlOrdersForUser(@Param("userId")String userId);
}