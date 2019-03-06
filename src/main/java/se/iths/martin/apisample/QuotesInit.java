package se.iths.martin.apisample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
public class QuotesInit {

    @Bean
    public CommandLineRunner initDatabase(QuoteRepository repository) {
        return args -> init(repository);
    }

    public void init(QuoteRepository repository)
    {
        LocalDateTime dateTime = LocalDateTime.now();
        repository.save(new Quote("Always place your latest code first.", dateTime));
        repository.save(new Quote("Doing nothing is hard, you never know when you're done.", dateTime));
        repository.save(new Quote("I am not lazy, I am on energy saving mode.", dateTime));
        repository.save(new Quote("If two wrongs don't make a right, try three.", dateTime));
        repository.save(new Quote("Life is short, smile while you still have teeth.", dateTime));
        repository.save(new Quote("A balanced diet means a cupcake in each hand.", dateTime));
        repository.save(new Quote("Sorry for the mean, awful, accurate things I said.", dateTime));
        repository.save(new Quote("I’m sorry, if you were right, I’d agree with you.", dateTime));
        repository.save(new Quote("People say nothing is impossible, but I do nothing every day", dateTime));
        repository.save(new Quote("An apple a day keeps anyone away if you throw it hard enough.", dateTime));
        repository.save(new Quote("The more you weight the harder you are to kidnap. Stay safe, eat cake.", dateTime));
        repository.save(new Quote("The best and most beautiful things in the world cannot be seen or even touched - they must be felt with the heart. -Helen Keller", dateTime));
    }
}
