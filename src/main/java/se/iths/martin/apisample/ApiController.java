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
        logger.error("This is an error");
        return quoteRepository.findAll();
    }

    @GetMapping("/quotes/{id}")
    public Quote getOne(@PathVariable Long id) {
        logger.debug("Request for id: " + id);
        return quoteRepository.findById(id)
                .orElseThrow(() -> new QuoteNotFoundException("Not found"));
    }

    @PostMapping("/quotes")
    public void postNew(@RequestBody Quote quote) {
        quote.setDateTime(LocalDateTime.now());
        quoteRepository.save(quote);
    }
}
