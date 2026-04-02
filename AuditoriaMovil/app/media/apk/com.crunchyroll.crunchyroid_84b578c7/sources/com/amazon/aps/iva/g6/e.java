package com.amazon.aps.iva.g6;

import android.os.Handler;
import com.amazon.aps.iva.a6.e1;
import com.amazon.aps.iva.a6.i1;
import com.amazon.aps.iva.a6.x0;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.t5.g0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: DrmSessionEventListener.java */
/* loaded from: classes.dex */
public interface e {

    /* compiled from: DrmSessionEventListener.java */
    /* loaded from: classes.dex */
    public static class a {
        public final int a;
        public final v.b b;
        public final CopyOnWriteArrayList<C0291a> c;

        /* compiled from: DrmSessionEventListener.java */
        /* renamed from: com.amazon.aps.iva.g6.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0291a {
            public final Handler a;
            public final e b;

            public C0291a(Handler handler, e eVar) {
                this.a = handler;
                this.b = eVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public final void a(Handler handler, e eVar) {
            this.c.add(new C0291a(handler, eVar));
        }

        public final void b() {
            Iterator<C0291a> it = this.c.iterator();
            while (it.hasNext()) {
                C0291a next = it.next();
                g0.U(next.a, new com.amazon.aps.iva.o4.b(2, this, next.b));
            }
        }

        public final void c() {
            Iterator<C0291a> it = this.c.iterator();
            while (it.hasNext()) {
                C0291a next = it.next();
                g0.U(next.a, new i1(2, this, next.b));
            }
        }

        public final void d() {
            Iterator<C0291a> it = this.c.iterator();
            while (it.hasNext()) {
                C0291a next = it.next();
                g0.U(next.a, new com.amazon.aps.iva.x2.u(3, this, next.b));
            }
        }

        public final void e(int i) {
            Iterator<C0291a> it = this.c.iterator();
            while (it.hasNext()) {
                C0291a next = it.next();
                g0.U(next.a, new e1(this, i, 1, next.b));
            }
        }

        public final void f(Exception exc) {
            Iterator<C0291a> it = this.c.iterator();
            while (it.hasNext()) {
                C0291a next = it.next();
                g0.U(next.a, new x0(this, 1, next.b, exc));
            }
        }

        public final void g() {
            Iterator<C0291a> it = this.c.iterator();
            while (it.hasNext()) {
                C0291a next = it.next();
                g0.U(next.a, new com.amazon.aps.iva.n4.d(4, this, next.b));
            }
        }

        public a(CopyOnWriteArrayList<C0291a> copyOnWriteArrayList, int i, v.b bVar) {
            this.c = copyOnWriteArrayList;
            this.a = i;
            this.b = bVar;
        }
    }

    default void I(int i, v.b bVar) {
    }

    default void Q(int i, v.b bVar) {
    }

    default void a0(int i, v.b bVar) {
    }

    default void f0(int i, v.b bVar) {
    }

    default void R(int i, v.b bVar, int i2) {
    }

    default void S(int i, v.b bVar, Exception exc) {
    }
}
