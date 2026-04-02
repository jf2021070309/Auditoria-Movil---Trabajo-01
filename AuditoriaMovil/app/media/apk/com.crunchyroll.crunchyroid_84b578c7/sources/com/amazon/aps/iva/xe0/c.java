package com.amazon.aps.iva.xe0;

import com.amazon.aps.iva.xe0.c;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: ConcurrentLinkedList.kt */
/* loaded from: classes4.dex */
public abstract class c<N extends c<N>> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_next");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_prev");
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ Object _prev;

    public c(N n) {
        this._prev = n;
    }

    public static final Object a(q qVar) {
        return ((c) qVar)._next;
    }

    public abstract boolean b();

    public final boolean c() {
        c cVar;
        Object obj = this._next;
        if (obj == com.amazon.aps.iva.b50.w.h) {
            cVar = null;
        } else {
            cVar = (c) obj;
        }
        if (cVar == null) {
            return true;
        }
        return false;
    }

    public final void d() {
        c cVar;
        while (true) {
            c cVar2 = (c) this._prev;
            while (cVar2 != null && cVar2.b()) {
                cVar2 = (c) cVar2._prev;
            }
            Object obj = this._next;
            s sVar = com.amazon.aps.iva.b50.w.h;
            if (obj == sVar) {
                cVar = null;
            } else {
                cVar = (c) obj;
            }
            com.amazon.aps.iva.yb0.j.c(cVar);
            while (cVar.b()) {
                Object obj2 = cVar._next;
                if (obj2 == sVar) {
                    cVar = null;
                } else {
                    cVar = (c) obj2;
                }
                com.amazon.aps.iva.yb0.j.c(cVar);
            }
            cVar._prev = cVar2;
            if (cVar2 != null) {
                cVar2._next = cVar;
            }
            if (!cVar.b() && (cVar2 == null || !cVar2.b())) {
                return;
            }
        }
    }
}
