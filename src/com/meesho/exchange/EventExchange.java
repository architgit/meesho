package com.meesho.exchange;

import com.meesho.datatransferobject.Event;
import com.meesho.domainValue.NotificationType;
import com.meesho.eventQueue.EmailQueue;
import com.meesho.eventQueue.InvoiceQueue;
import com.meesho.eventQueue.SMSQueue;
import com.sun.org.apache.bcel.internal.generic.PUSH;

/**
 * Created by archit.sharma on 05/10/18.
 */
public class EventExchange {

    private Event event;

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public EventExchange(Event event) {
        this.event = event;
    }

    public void pushEventBasedOnBindingKey(){
        Event event = this.getEvent();
        switch (event.getNotificationType()){
            case SMS:
                SMSQueue.getSmsQueue().add(event.getOrderId());
                break;

            case EMAIL:
                EmailQueue.getEmailQueue().add(event.getOrderId());
                break;

            case INVOICE:
                InvoiceQueue.getInvoiceQueue().add(event.getOrderId());
                break;

        }


    }
}
