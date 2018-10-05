package com.meesho.eventQueue;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by archit.sharma on 05/10/18.
 */
public class EmailQueue {

    public static List<Long> getEmailQueue() {
        return emailQueue;
    }

    public static void setEmailQueue(List<Long> emailQueue) {
        EmailQueue.emailQueue = emailQueue;
    }

    public static List<Long> emailQueue = new ArrayList<>();

    public EmailQueue() {
    }
}
