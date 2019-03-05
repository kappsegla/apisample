package se.iths.martin.apisample;

public class QuoteNotFoundException extends RuntimeException {

    public QuoteNotFoundException(String not_found) {
        super(not_found);
    }
}
