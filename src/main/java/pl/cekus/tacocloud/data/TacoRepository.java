package pl.cekus.tacocloud.data;

import org.springframework.data.repository.CrudRepository;
import pl.cekus.tacocloud.Taco;

public interface TacoRepository extends CrudRepository<Taco, Long> {
}
