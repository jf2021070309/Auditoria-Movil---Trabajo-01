package com.fyber.inneractive.sdk.util;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
/* loaded from: classes.dex */
public final class j<T> {
    private final Queue<T> a = new ConcurrentLinkedQueue();
    private a<T> b;

    /* loaded from: classes.dex */
    public interface a<TT> {
        TT a();
    }

    public j(int i, a<T> aVar) {
        for (int i2 = 0; i2 < i; i2++) {
            this.a.offer(aVar.a());
        }
        this.b = aVar;
    }

    public final T a() {
        T poll = this.a.poll();
        return poll == null ? this.b.a() : poll;
    }

    public final void a(T t) {
        this.a.offer(t);
    }
}
