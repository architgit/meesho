package com.meesho.controller;

import com.meesho.datatransferobject.Event;
import com.meesho.domainValue.NotificationType;
import com.meesho.exchange.EventExchange;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by archit.sharma on 05/10/18.
 */
public class Producer {


    public static void main(String argsp[]){
        Producer producer = new Producer();
        List<Event>events =  producer.prepareEvents();
        producer.emmitEvents(events);

    }


    private  List<Event> prepareEvents(){
        List<Event>events = new ArrayList<>();
        events.add(new Event(100l , NotificationType.SMS));
        events.add(new Event(100l , NotificationType.EMAIL));
        events.add(new Event(100l , NotificationType.INVOICE));
        events.add(new Event(101l , NotificationType.SMS));
        events.add(new Event(102l , NotificationType.SMS));
        events.add(new Event(103l , NotificationType.EMAIL));
        return events;
    }

    private void emmitEvents(List<Event>events){
        for (int counter = 0; counter < events.size(); counter++) {
            System.out.println();
            EventExchange exchange = new EventExchange(events.get(counter));
            exchange.pushEventBasedOnBindingKey();
        }

    }





}
