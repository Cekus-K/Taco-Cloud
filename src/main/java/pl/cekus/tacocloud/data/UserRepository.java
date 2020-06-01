package pl.cekus.tacocloud.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.cekus.tacocloud.User;

@Repository
public
interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
