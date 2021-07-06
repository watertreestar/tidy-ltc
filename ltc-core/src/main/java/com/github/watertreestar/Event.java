package com.github.watertreestar;

import java.io.Serializable;

/**
 * 消息抽象
 * <p>发送消息到消息队列的抽象</p>
 */
public class Event {
    /**
     * 消息payload
     */
    private Serializable data;
}
