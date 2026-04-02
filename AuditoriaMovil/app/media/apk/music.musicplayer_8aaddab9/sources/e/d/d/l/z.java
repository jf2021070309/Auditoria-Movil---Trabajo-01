package e.d.d.l;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class z implements e.d.d.q.d, e.d.d.q.c {
    public final Map<Class<?>, ConcurrentHashMap<e.d.d.q.b<Object>, Executor>> a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public Queue<e.d.d.q.a<?>> f7130b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    public final Executor f7131c;

    public z(Executor executor) {
        this.f7131c = executor;
    }

    @Override // e.d.d.q.d
    public <T> void a(Class<T> cls, e.d.d.q.b<? super T> bVar) {
        b(cls, this.f7131c, bVar);
    }

    @Override // e.d.d.q.d
    public synchronized <T> void b(Class<T> cls, Executor executor, e.d.d.q.b<? super T> bVar) {
        Objects.requireNonNull(cls);
        Objects.requireNonNull(bVar);
        Objects.requireNonNull(executor);
        if (!this.a.containsKey(cls)) {
            this.a.put(cls, new ConcurrentHashMap<>());
        }
        this.a.get(cls).put(bVar, executor);
    }

    public void c() {
        Queue<e.d.d.q.a<?>> queue;
        Set<Map.Entry<e.d.d.q.b<Object>, Executor>> emptySet;
        synchronized (this) {
            queue = this.f7130b;
            if (queue != null) {
                this.f7130b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (final e.d.d.q.a<?> aVar : queue) {
                Objects.requireNonNull(aVar);
                synchronized (this) {
                    Queue<e.d.d.q.a<?>> queue2 = this.f7130b;
                    if (queue2 != null) {
                        queue2.add(aVar);
                    } else {
                        synchronized (this) {
                            ConcurrentHashMap<e.d.d.q.b<Object>, Executor> concurrentHashMap = this.a.get(null);
                            emptySet = concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
                        }
                        for (final Map.Entry<e.d.d.q.b<Object>, Executor> entry : emptySet) {
                            entry.getValue().execute(new Runnable() { // from class: e.d.d.l.h
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Map.Entry entry2 = entry;
                                    ((e.d.d.q.b) entry2.getKey()).a(aVar);
                                }
                            });
                        }
                    }
                }
            }
        }
    }
}
