package com.amazon.aps.iva.v9;

import com.amazon.aps.iva.v9.a;
import com.google.common.util.concurrent.ListenableFuture;
/* compiled from: SettableFuture.java */
/* loaded from: classes.dex */
public final class c<V> extends a<V> {
    public final boolean h(V v) {
        if (v == null) {
            v = (V) a.h;
        }
        if (a.g.b(this, null, v)) {
            a.b(this);
            return true;
        }
        return false;
    }

    public final boolean i(Throwable th) {
        th.getClass();
        if (a.g.b(this, null, new a.c(th))) {
            a.b(this);
            return true;
        }
        return false;
    }

    public final boolean j(ListenableFuture<? extends V> listenableFuture) {
        a.c cVar;
        listenableFuture.getClass();
        Object obj = this.b;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!a.g.b(this, null, a.e(listenableFuture))) {
                    return false;
                }
                a.b(this);
            } else {
                a.f fVar = new a.f(this, listenableFuture);
                if (a.g.b(this, null, fVar)) {
                    try {
                        listenableFuture.addListener(fVar, b.INSTANCE);
                    } catch (Throwable th) {
                        try {
                            cVar = new a.c(th);
                        } catch (Throwable unused) {
                            cVar = a.c.b;
                        }
                        a.g.b(this, fVar, cVar);
                    }
                } else {
                    obj = this.b;
                }
            }
            return true;
        }
        if (!(obj instanceof a.b)) {
            return false;
        }
        listenableFuture.cancel(((a.b) obj).a);
        return false;
    }
}
