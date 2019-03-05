package se.iths.martin.apisample;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
@RequiredArgsConstructor
public class Quote {

    private @Id @GeneratedValue Long id;
    private @NonNull String quote;
    private java.time.LocalDateTime dateTime;
}
