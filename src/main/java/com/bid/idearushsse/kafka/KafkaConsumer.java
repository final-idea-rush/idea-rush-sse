package com.bid.idearushsse.kafka;

import com.bid.idearushsse.sse.service.SseService;
import com.bid.idearushsse.sse.type.SseConnect;
import com.bid.idearushsse.sse.type.SseEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaConsumer {

    private final SseService sseService;

    @KafkaListener(topics = "bid")
    public void listen(String message) {
        SseEvent sseEvent = SseEvent.valueOf(message.split("#")[0]);
        String content = message.split("#")[1];
        Long id = Long.valueOf(message.split("#")[2]);

        sseService.send(sseEvent.getSseConnect(), sseEvent, id, content);
    }
}