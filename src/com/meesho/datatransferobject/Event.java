package com.meesho.datatransferobject;

import com.meesho.domainValue.NotificationType;

/**
 * Created by archit.sharma on 05/10/18.
 */
public class Event {

    public Long orderId;

    NotificationType notificationType;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public NotificationType getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(NotificationType notificationType) {
        this.notificationType = notificationType;
    }

    public Event(Long orderId, NotificationType notificationType) {
        this.orderId = orderId;
        this.notificationType = notificationType;
    }

}

