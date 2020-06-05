package pl.cekus.tacocloud.web.api;

import lombok.Getter;
import org.springframework.hateoas.RepresentationModel;
import pl.cekus.tacocloud.Ingredient;
import pl.cekus.tacocloud.Ingredient.Type;

public class IngredientResource extends RepresentationModel<IngredientResource> {
    @Getter
    private String name;
    @Getter
    private Type type;

    public IngredientResource(Ingredient ingredient) {
        this.name = ingredient.getName();
        this.type = ingredient.getType();
    }
}
