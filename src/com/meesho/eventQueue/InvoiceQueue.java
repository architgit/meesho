package com.meesho.eventQueue;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by archit.sharma on 05/10/18.
 */
public class InvoiceQueue {

    public static List<Long> invoiceQueue = new ArrayList<>();

    public static List<Long> getInvoiceQueue() {
        return invoiceQueue;
    }

    public static void setInvoiceQueue(List<Long> invoiceQueue) {
        InvoiceQueue.invoiceQueue = invoiceQueue;
    }

    public InvoiceQueue() {
    }
}
