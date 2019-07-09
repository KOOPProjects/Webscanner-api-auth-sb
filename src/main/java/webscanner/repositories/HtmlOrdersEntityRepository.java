package webscanner.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import webscanner.models.HtmlOrdersEntity;

import java.util.List;

@Repository
public interface HtmlOrdersEntityRepository extends CrudRepository<HtmlOrdersEntity, Integer> {

    @Query(value = "SELECT a.\"Id\", a.\"Frequency\", a.\"TargetAddress\" AS \"target_address\", a.\"SubjectOfQuestion\" AS \"subject_of_question\" FROM public.\"HtmlOrders\" a WHERE a.\"Id\" in (SELECT b.\"OrderId\" FROM public.\"UserOrders\" b WHERE b.\"UserId\" =:userId)", nativeQuery = true)
    List<HtmlOrdersEntity> getHtmlOrdersEntityForUser(@Param("userId")String userId);
}
