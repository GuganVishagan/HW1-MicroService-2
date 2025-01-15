package org.hwskylo.microservice2.Entity;




import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "inbound_messages")
public class InboundMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String payload;
}
