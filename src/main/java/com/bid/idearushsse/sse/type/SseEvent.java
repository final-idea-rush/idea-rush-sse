package com.bid.idearushsse.sse.type;

import com.bid.idearushsse.sse.service.SseService;

public enum SseEvent {
    BID_PRICE_UPDATE(SseConnect.BID),
    NOTICE_BID_END(SseConnect.NOTIFICATION),
    NOTICE_BID_PRICE_UPDATE(SseConnect.NOTIFICATION),
    NOTICE_BID_START_BEFORE(SseConnect.NOTIFICATION);

    private final SseConnect sseConnect;

    SseEvent(SseConnect sseConnect){
        this.sseConnect = sseConnect;
    }

    public SseConnect getSseConnect() {
        return this.sseConnect;
    }
}
