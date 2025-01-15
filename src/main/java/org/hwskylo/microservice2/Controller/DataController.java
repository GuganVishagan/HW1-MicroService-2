package org.hwskylo.microservice2.Controller;


import org.hwskylo.microservice2.Entity.InboundMessage;
import org.hwskylo.microservice2.Repository.InBoundMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DataController {
    @Autowired
    private InBoundMessageRepository inBoundMessageRepository;

    @PostMapping("/data")
    public ResponseEntity<String> receiveData(@RequestBody String data) {
        InboundMessage inboundMessage = new InboundMessage();
        inboundMessage.setPayload(data);
        inBoundMessageRepository.save(inboundMessage);


        return ResponseEntity.ok("Data received successfully");
    }
}
