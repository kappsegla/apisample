package se.iths.martin.apisample;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Entity
public class Quote {

    private @Id @GeneratedValue Long id;
    private @NonNull String quote;
    private java.time.LocalDateTime dateTime;

    public Quote() {
    }

    public Quote(String quote, LocalDateTime dateTime) {
        this.quote = quote;
        this.dateTime = dateTime;
    }
}
