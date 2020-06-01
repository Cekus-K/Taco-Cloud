package pl.cekus.tacocloud.data;

import org.springframework.data.repository.CrudRepository;
import pl.cekus.tacocloud.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
