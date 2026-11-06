package com.alexandrel5.ws.emailnotification.io;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "processed_events")
public class ProcessedEventEntity implements Serializable {

    private static final long serialVersionUID = 3687553269742697084L;

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false, unique = true)
    private String messageId;

    @Column(nullable = false, unique = true)
    private String productId;

    public ProcessedEventEntity() {}


    public ProcessedEventEntity(String messageId, String productId) {
        this.productId = productId;
        this.messageId = messageId;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}
