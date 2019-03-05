package se.iths.martin.apisample;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Quote {

    private @Id @GeneratedValue Long id;
    private String quote;
    private java.time.LocalDateTime dateTime;
}
