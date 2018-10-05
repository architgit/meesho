package com.meesho.eventQueue;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by archit.sharma on 05/10/18.
 */
public class SMSQueue {

    public static List<Long> smsQueue = new ArrayList<>();

    public static List<Long> getSmsQueue() {
        return smsQueue;
    }

    public static void setSmsQueue(List<Long> smsQueue) {
        SMSQueue.smsQueue = smsQueue;
    }

    public SMSQueue() {
    }
}
