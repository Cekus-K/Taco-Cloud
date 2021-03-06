package pl.cekus.tacocloud;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.crypto.password.PasswordEncoder;

import pl.cekus.tacocloud.data.IngredientRepository;
import pl.cekus.tacocloud.data.TacoRepository;
import pl.cekus.tacocloud.data.UserRepository;
import pl.cekus.tacocloud.Ingredient.Type;

@Profile("!prod")
@Configuration
public class DevelopmentConfig {

    @Bean
    public CommandLineRunner dataLoader(IngredientRepository repo,
                                        UserRepository userRepo, PasswordEncoder encoder, TacoRepository tacoRepo) { // Repozytorium użytkownika do przetestowania wraz z profilem użytkownika wbudowanego
        return args -> {
            Ingredient flourTortilla = new Ingredient("FLTO", "pszenna", Type.WRAP);
            Ingredient cornTortilla = new Ingredient("COTO", "kukurydziana", Type.WRAP);
            Ingredient groundBeef = new Ingredient("GRBF", "mielona wołowina", Type.PROTEIN);
            Ingredient carnitas = new Ingredient("CARN", "kawałki mięsa", Type.PROTEIN);
            Ingredient tomatoes = new Ingredient("TMTO", "pomidory pokrojone w kostkę", Type.VEGGIES);
            Ingredient lettuce = new Ingredient("LETC", "sałata", Type.VEGGIES);
            Ingredient cheddar = new Ingredient("CHED", "cheddar", Type.CHEESE);
            Ingredient jack = new Ingredient("JACK", "Monterrey Jack", Type.CHEESE);
            Ingredient salsa = new Ingredient("SLSA", "pikantny sos pomidorowy", Type.SAUCE);
            Ingredient sourCream = new Ingredient("SRCR", "śmietana", Type.SAUCE);
            repo.save(flourTortilla);
            repo.save(cornTortilla);
            repo.save(groundBeef);
            repo.save(carnitas);
            repo.save(tomatoes);
            repo.save(lettuce);
            repo.save(cheddar);
            repo.save(jack);
            repo.save(salsa);
            repo.save(sourCream);


            userRepo.save(new User("habuma", encoder.encode("password"),
                    "Jan Kowalski", "ul. Dobra 123", "Gliwice", "TX",
                    "76227", "123-123-1234"));

            Taco taco1 = new Taco();
            taco1.setName("Carnivore");
            taco1.setIngredients(Arrays.asList(flourTortilla, groundBeef, carnitas, sourCream, salsa, cheddar));
            tacoRepo.save(taco1);

            Taco taco2 = new Taco();
            taco2.setName("Bovine Bounty");
            taco2.setIngredients(Arrays.asList(cornTortilla, groundBeef, cheddar, jack, sourCream));
            tacoRepo.save(taco2);

            Taco taco3 = new Taco();
            taco3.setName("Veg-Out");
            taco3.setIngredients(Arrays.asList(flourTortilla, cornTortilla, tomatoes, lettuce, salsa));
            tacoRepo.save(taco3);
        };
    }
}
