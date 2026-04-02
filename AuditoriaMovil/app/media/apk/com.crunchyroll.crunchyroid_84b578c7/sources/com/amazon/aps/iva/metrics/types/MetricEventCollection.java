package com.amazon.aps.iva.metrics.types;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class MetricEventCollection implements EventCollection {
    private List<Event> eventList;

    public MetricEventCollection(List<Event> list) {
        this.eventList = new ArrayList(list);
    }
}
