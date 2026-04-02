package com.google.firebase.components;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
class g implements Publisher, Subscriber {
    private final Map<Class<?>, ConcurrentHashMap<EventHandler<Object>, Executor>> a = new HashMap();
    private Queue<Event<?>> b = new ArrayDeque();
    private final Executor c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(Executor executor) {
        this.c = executor;
    }

    @Override // com.google.firebase.events.Publisher
    public void publish(Event<?> event) {
        Preconditions.checkNotNull(event);
        synchronized (this) {
            if (this.b != null) {
                this.b.add(event);
                return;
            }
            for (Map.Entry<EventHandler<Object>, Executor> entry : a(event)) {
                entry.getValue().execute(h.a(entry, event));
            }
        }
    }

    private synchronized Set<Map.Entry<EventHandler<Object>, Executor>> a(Event<?> event) {
        ConcurrentHashMap<EventHandler<Object>, Executor> concurrentHashMap;
        concurrentHashMap = this.a.get(event.getType());
        return concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
    }

    @Override // com.google.firebase.events.Subscriber
    public synchronized <T> void subscribe(Class<T> cls, Executor executor, EventHandler<? super T> eventHandler) {
        Preconditions.checkNotNull(cls);
        Preconditions.checkNotNull(eventHandler);
        Preconditions.checkNotNull(executor);
        if (!this.a.containsKey(cls)) {
            this.a.put(cls, new ConcurrentHashMap<>());
        }
        this.a.get(cls).put(eventHandler, executor);
    }

    @Override // com.google.firebase.events.Subscriber
    public <T> void subscribe(Class<T> cls, EventHandler<? super T> eventHandler) {
        subscribe(cls, this.c, eventHandler);
    }

    @Override // com.google.firebase.events.Subscriber
    public synchronized <T> void unsubscribe(Class<T> cls, EventHandler<? super T> eventHandler) {
        Preconditions.checkNotNull(cls);
        Preconditions.checkNotNull(eventHandler);
        if (this.a.containsKey(cls)) {
            ConcurrentHashMap<EventHandler<Object>, Executor> concurrentHashMap = this.a.get(cls);
            concurrentHashMap.remove(eventHandler);
            if (concurrentHashMap.isEmpty()) {
                this.a.remove(cls);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        Queue<Event<?>> queue = null;
        synchronized (this) {
            if (this.b != null) {
                queue = this.b;
                this.b = null;
            }
        }
        if (queue != null) {
            for (Event<?> event : queue) {
                publish(event);
            }
        }
    }
}
