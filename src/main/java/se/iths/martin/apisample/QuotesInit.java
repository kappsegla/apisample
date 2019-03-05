package se.iths.martin.apisample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuotesInit {

    @Bean
    public CommandLineRunner initDatabase(QuoteRepository repository) {
        return args -> {
            repository.save(new Quote("Doing nothing is hard, you never know when you're done."));
            repository.save(new Quote("I am not lazy, I am on energy saving mode."));
            repository.save(new Quote("If two wrongs don't make a right, try three."));
            repository.save(new Quote("Life is short, smile while you still have teeth."));
            repository.save(new Quote("A balanced diet means a cupcake in each hand."));
            repository.save(new Quote("Sorry for the mean, awful, accurate things I said."));
            repository.save(new Quote("I’m sorry, if you were right, I’d agree with you."));
            repository.save(new Quote("People say nothing is impossible, but I do nothing every day"));
            repository.save(new Quote("An apple a day keeps anyone away if you throw it hard enough."));
            repository.save(new Quote("The more you weight the harder you are to kidnap. Stay safe, eat cake."));
            repository.save(new Quote("The best and most beautiful things in the world cannot be seen or even touched - they must be felt with the heart. -Helen Keller"));
        };
    }
}
