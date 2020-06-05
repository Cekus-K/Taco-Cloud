package pl.cekus.tacocloud.data;

import org.springframework.data.repository.PagingAndSortingRepository;
import pl.cekus.tacocloud.Taco;

public interface TacoRepository extends PagingAndSortingRepository<Taco, Long> {
}
