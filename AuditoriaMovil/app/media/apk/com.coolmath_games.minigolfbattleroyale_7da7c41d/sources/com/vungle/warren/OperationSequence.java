package com.vungle.warren;

import com.vungle.warren.AdLoader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class OperationSequence {
    private final PriorityQueue<Entry> queue = new PriorityQueue<>(11, new Comparator<Entry>() { // from class: com.vungle.warren.OperationSequence.1
        @Override // java.util.Comparator
        public int compare(Entry entry, Entry entry2) {
            int compareTo = Integer.valueOf(entry.operation.priority).compareTo(Integer.valueOf(entry2.operation.priority));
            return compareTo == 0 ? Integer.valueOf(entry.order).compareTo(Integer.valueOf(entry2.order)) : compareTo;
        }
    });

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class Entry {
        private static final AtomicInteger seq = new AtomicInteger();
        AdLoader.Operation operation;
        private final int order = seq.incrementAndGet();

        /* JADX INFO: Access modifiers changed from: package-private */
        public Entry(AdLoader.Operation operation) {
            this.operation = operation;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Entry remove(AdRequest adRequest) {
        Entry entry;
        Iterator<Entry> it = this.queue.iterator();
        while (true) {
            if (!it.hasNext()) {
                entry = null;
                break;
            }
            entry = it.next();
            if (entry.operation.request.equals(adRequest)) {
                break;
            }
        }
        this.queue.remove(entry);
        return entry;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean offer(Entry entry) {
        return this.queue.offer(entry);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Entry poll() {
        return this.queue.poll();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Entry> removeAll() {
        ArrayList arrayList = new ArrayList();
        while (!this.queue.isEmpty()) {
            Entry poll = this.queue.poll();
            if (poll != null) {
                arrayList.add(poll);
            }
        }
        return arrayList;
    }
}
