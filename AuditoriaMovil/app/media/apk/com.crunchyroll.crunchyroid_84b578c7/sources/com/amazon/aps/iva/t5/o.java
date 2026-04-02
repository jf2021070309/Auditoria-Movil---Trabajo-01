package com.amazon.aps.iva.t5;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.amazon.aps.iva.q5.u;
import com.amazon.aps.iva.t5.o;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: ListenerSet.java */
/* loaded from: classes.dex */
public final class o<T> {
    public final d a;
    public final l b;
    public final b<T> c;
    public final CopyOnWriteArraySet<c<T>> d;
    public final ArrayDeque<Runnable> e;
    public final ArrayDeque<Runnable> f;
    public final Object g;
    public boolean h;
    public final boolean i;

    /* compiled from: ListenerSet.java */
    /* loaded from: classes.dex */
    public interface a<T> {
        void invoke(T t);
    }

    /* compiled from: ListenerSet.java */
    /* loaded from: classes.dex */
    public interface b<T> {
        void c(T t, com.amazon.aps.iva.q5.u uVar);
    }

    /* compiled from: ListenerSet.java */
    /* loaded from: classes.dex */
    public static final class c<T> {
        public final T a;
        public u.a b = new u.a();
        public boolean c;
        public boolean d;

        public c(T t) {
            this.a = t;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && c.class == obj.getClass()) {
                return this.a.equals(((c) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    public o(Looper looper, d dVar, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, dVar, bVar, true);
    }

    public final void a() {
        f();
        ArrayDeque<Runnable> arrayDeque = this.f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        l lVar = this.b;
        if (!lVar.b()) {
            lVar.g(lVar.c(0));
        }
        ArrayDeque<Runnable> arrayDeque2 = this.e;
        boolean z = !arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (z) {
            return;
        }
        while (!arrayDeque2.isEmpty()) {
            arrayDeque2.peekFirst().run();
            arrayDeque2.removeFirst();
        }
    }

    public final void b(int i, a<T> aVar) {
        f();
        this.f.add(new n(new CopyOnWriteArraySet(this.d), i, 0, aVar));
    }

    public final void c() {
        f();
        synchronized (this.g) {
            this.h = true;
        }
        Iterator<c<T>> it = this.d.iterator();
        while (it.hasNext()) {
            c<T> next = it.next();
            b<T> bVar = this.c;
            next.d = true;
            if (next.c) {
                next.c = false;
                bVar.c(next.a, next.b.b());
            }
        }
        this.d.clear();
    }

    public final void d(T t) {
        f();
        CopyOnWriteArraySet<c<T>> copyOnWriteArraySet = this.d;
        Iterator<c<T>> it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            c<T> next = it.next();
            if (next.a.equals(t)) {
                next.d = true;
                if (next.c) {
                    next.c = false;
                    com.amazon.aps.iva.q5.u b2 = next.b.b();
                    this.c.c(next.a, b2);
                }
                copyOnWriteArraySet.remove(next);
            }
        }
    }

    public final void e(int i, a<T> aVar) {
        b(i, aVar);
        a();
    }

    public final void f() {
        boolean z;
        if (!this.i) {
            return;
        }
        if (Thread.currentThread() == this.b.e().getThread()) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.C(z);
    }

    public o(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, d dVar, b<T> bVar, boolean z) {
        this.a = dVar;
        this.d = copyOnWriteArraySet;
        this.c = bVar;
        this.g = new Object();
        this.e = new ArrayDeque<>();
        this.f = new ArrayDeque<>();
        this.b = dVar.b(looper, new Handler.Callback() { // from class: com.amazon.aps.iva.t5.m
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                o oVar = o.this;
                Iterator it = oVar.d.iterator();
                while (it.hasNext()) {
                    o.c cVar = (o.c) it.next();
                    if (!cVar.d && cVar.c) {
                        com.amazon.aps.iva.q5.u b2 = cVar.b.b();
                        cVar.b = new u.a();
                        cVar.c = false;
                        oVar.c.c(cVar.a, b2);
                    }
                    if (oVar.b.b()) {
                        return true;
                    }
                }
                return true;
            }
        });
        this.i = z;
    }
}
