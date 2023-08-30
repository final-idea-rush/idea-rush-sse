package com.bid.idearushsse.sse.type;

import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

public record CustomSseEmitter (
        Long id,
        SseEmitter sseEmitter
) {}
