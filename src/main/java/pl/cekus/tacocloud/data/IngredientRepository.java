package pl.cekus.tacocloud.data;

import org.springframework.data.repository.CrudRepository;
import pl.cekus.tacocloud.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
