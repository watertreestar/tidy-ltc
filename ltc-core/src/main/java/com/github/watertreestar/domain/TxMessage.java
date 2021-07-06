package com.github.watertreestar.domain;

import java.util.Date;

/**
 * 本地消息表记录
 */
public class TxMessage {
    /**
     * 消息id
     */
    private String id;
    /**
     * 消息对于的业务主键
     * @return
     */
    private String bizId;
    /**
     * 发送消息的topicName
     */
    private String topicName;
    /**
     * 消息路由的key
     */
    private String routeKey;
    /**
     * 消息发送的content
     */
    private String content;
    /**
     * 消息的状态
     * INIT -> PUBLISHED -> SUCCESS (PROCESSED) (FAILED)
     */
    private String messageStatus;
    /**
     * 投递的次数
     * 可以作为报警的阈值，如果第N次投递，还是PUBLISHED状态，就可以报警了，然后标记为失败，等待人工介入
     */
    private Integer sendCount;
    /**
     * 消息创建时间
     */
    private Date createTime;
    /**
     * 上一次投递的时间
     */
    private Date lastSendTime;
    /**
     * 最新一次的更新时间
     */
    private Date updateTime;
}
