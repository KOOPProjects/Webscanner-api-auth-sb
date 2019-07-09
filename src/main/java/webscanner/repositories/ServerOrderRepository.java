package webscanner.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import webscanner.models.HtmlOrder;
import webscanner.models.ServerOrder;

import java.util.List;
@Repository
public interface ServerOrderRepository extends CrudRepository<ServerOrder, Integer> {
    @Query(value = "SELECT a.\"Id\", a.\"Frequency\", a.\"TargetAddress\" AS \"target_address\", a.\"Question\" AS \"question\" FROM public.\"ServerOrders\" a WHERE a.\"Id\" in (SELECT b.\"OrderId\" FROM public.\"UserOrders\" b WHERE b.\"UserId\" =:userId AND b.\"Type\" = 'Server')", nativeQuery = true)
    List<ServerOrder> getServerOrdersForUser(@Param("userId")String userId);
}
