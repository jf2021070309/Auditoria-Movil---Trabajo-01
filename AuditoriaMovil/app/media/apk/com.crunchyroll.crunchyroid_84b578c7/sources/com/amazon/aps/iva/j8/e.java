package com.amazon.aps.iva.j8;

import com.amazon.aps.iva.j8.g;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: DataSource.java */
/* loaded from: classes.dex */
public abstract class e<Key, Value> {
    public final AtomicBoolean b = new AtomicBoolean(false);

    /* compiled from: DataSource.java */
    /* loaded from: classes.dex */
    public static class a<T> {
        public final int a;
        public final e b;
        public final g.a<T> c;
        public Executor e;
        public final Object d = new Object();
        public boolean f = false;

        /* compiled from: DataSource.java */
        /* renamed from: com.amazon.aps.iva.j8.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0406a implements Runnable {
            public final /* synthetic */ g b;

            public RunnableC0406a(g gVar) {
                this.b = gVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                aVar.c.a(aVar.a, this.b);
            }
        }

        public a(e eVar, int i, Executor executor, g.a<T> aVar) {
            this.b = eVar;
            this.a = i;
            this.e = executor;
            this.c = aVar;
        }

        public static void c(int i, int i2, List list) {
            if (i >= 0) {
                if (list.size() + i <= i2) {
                    if (list.size() == 0 && i2 > 0) {
                        throw new IllegalArgumentException("Initial result cannot be empty if items are present in data set.");
                    }
                    return;
                }
                throw new IllegalArgumentException("List size + position too large, last item in list beyond totalCount.");
            }
            throw new IllegalArgumentException("Position must be non-negative");
        }

        public final boolean a() {
            if (this.b.e()) {
                b(g.f);
                return true;
            }
            return false;
        }

        public final void b(g<T> gVar) {
            Executor executor;
            synchronized (this.d) {
                if (!this.f) {
                    this.f = true;
                    executor = this.e;
                } else {
                    throw new IllegalStateException("callback.onResult already called, cannot call again.");
                }
            }
            if (executor != null) {
                executor.execute(new RunnableC0406a(gVar));
            } else {
                this.c.a(this.a, gVar);
            }
        }
    }

    public e() {
        new CopyOnWriteArrayList();
    }

    public abstract boolean d();

    public boolean e() {
        return this.b.get();
    }
}
