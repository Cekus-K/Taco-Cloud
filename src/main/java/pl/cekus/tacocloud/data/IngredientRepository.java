package pl.cekus.tacocloud.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import pl.cekus.tacocloud.Ingredient;

@CrossOrigin(origins="*")
public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
