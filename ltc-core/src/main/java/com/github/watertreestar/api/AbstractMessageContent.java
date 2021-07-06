package com.github.watertreestar.api;

/**
 * 消息实体
 * <p>发送消息到消息的content实现该抽象类，以提供JSON序列化的能力</p>
 */
public abstract class AbstractMessageContent {
    public String encode(){
        return "";
    }

    public Object decode(String json) {
        return null;
    }
}
