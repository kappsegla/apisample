package se.iths.martin.apisample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@RestController
public class ApiController {

    Logger logger = LoggerFactory.getLogger(ApiController.class);

    private QuoteRepository quoteRepository;

    public ApiController(QuoteRepository quoteRepository) {
        this.quoteRepository = quoteRepository;
    }

    @GetMapping("/quotes")
    public Iterable<Quote> getAll() {
        logger.info("Request for all quotes.");
        return quoteRepository.findAll();
    }

    @GetMapping("/quotes/{id}")
    public Quote getOne(@PathVariable Long id) {
        logger.info("Request for quote " + id);
        return quoteRepository.findById(id)
                .orElseThrow(() -> new QuoteNotFoundException("Not found"));
    }

    @PostMapping("/quotes")
    public void postNew(@RequestBody Quote quote) {
        logger.info("New quote added.");
        quote.setDateTime(LocalDateTime.now());
        quoteRepository.save(quote);
    }


    @GetMapping("/help")
    public String help() {
        return "This service is used for storing and retrieving quotes. -API Sample";
    }


}
