package pl.cekus.tacocloud.data;

import org.springframework.data.repository.CrudRepository;
import pl.cekus.tacocloud.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
