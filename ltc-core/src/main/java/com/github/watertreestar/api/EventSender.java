package com.github.watertreestar.api;

import com.github.watertreestar.Event;

public interface EventSender {
    void send(Event event);

    /**
     * 发送消息
     * @param event
     * @param context
     */
    void send(Event event,Context context);


    /**
     * 消息发送的配置
     * @param <Meta>
     */
    public static class Context<Meta> {
        private Meta meta;
    }
}
