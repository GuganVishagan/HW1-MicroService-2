package org.hwskylo.microservice2.Repository;

import org.hwskylo.microservice2.Entity.InboundMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InBoundMessageRepository extends JpaRepository<InboundMessage, Long> {
}
