package com.amazon.aps.iva.o6;

import android.os.Handler;
import com.amazon.aps.iva.a6.b1;
import com.amazon.aps.iva.a6.c1;
import com.amazon.aps.iva.a6.f1;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.o6.z;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: MediaSourceEventListener.java */
/* loaded from: classes.dex */
public interface z {

    /* compiled from: MediaSourceEventListener.java */
    /* loaded from: classes.dex */
    public static class a {
        public final int a;
        public final v.b b;
        public final CopyOnWriteArrayList<C0556a> c;

        /* compiled from: MediaSourceEventListener.java */
        /* renamed from: com.amazon.aps.iva.o6.z$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0556a {
            public final Handler a;
            public final z b;

            public C0556a(Handler handler, z zVar) {
                this.a = handler;
                this.b = zVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public final void a(int i, com.amazon.aps.iva.q5.v vVar, int i2, Object obj, long j) {
            b(new t(1, i, vVar, i2, obj, com.amazon.aps.iva.t5.g0.e0(j), -9223372036854775807L));
        }

        public final void b(t tVar) {
            Iterator<C0556a> it = this.c.iterator();
            while (it.hasNext()) {
                C0556a next = it.next();
                com.amazon.aps.iva.t5.g0.U(next.a, new b1(this, 1, next.b, tVar));
            }
        }

        public final void c(q qVar, int i) {
            d(qVar, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public final void d(q qVar, int i, int i2, com.amazon.aps.iva.q5.v vVar, int i3, Object obj, long j, long j2) {
            e(qVar, new t(i, i2, vVar, i3, obj, com.amazon.aps.iva.t5.g0.e0(j), com.amazon.aps.iva.t5.g0.e0(j2)));
        }

        public final void e(q qVar, t tVar) {
            Iterator<C0556a> it = this.c.iterator();
            while (it.hasNext()) {
                C0556a next = it.next();
                com.amazon.aps.iva.t5.g0.U(next.a, new c1(this, next.b, qVar, tVar, 1));
            }
        }

        public final void f(q qVar, int i) {
            g(qVar, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public final void g(q qVar, int i, int i2, com.amazon.aps.iva.q5.v vVar, int i3, Object obj, long j, long j2) {
            h(qVar, new t(i, i2, vVar, i3, obj, com.amazon.aps.iva.t5.g0.e0(j), com.amazon.aps.iva.t5.g0.e0(j2)));
        }

        public final void h(q qVar, t tVar) {
            Iterator<C0556a> it = this.c.iterator();
            while (it.hasNext()) {
                C0556a next = it.next();
                com.amazon.aps.iva.t5.g0.U(next.a, new f1(this, next.b, qVar, tVar, 1));
            }
        }

        public final void i(q qVar, int i, int i2, com.amazon.aps.iva.q5.v vVar, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
            k(qVar, new t(i, i2, vVar, i3, obj, com.amazon.aps.iva.t5.g0.e0(j), com.amazon.aps.iva.t5.g0.e0(j2)), iOException, z);
        }

        public final void j(q qVar, int i, IOException iOException, boolean z) {
            i(qVar, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
        }

        public final void k(final q qVar, final t tVar, final IOException iOException, final boolean z) {
            Iterator<C0556a> it = this.c.iterator();
            while (it.hasNext()) {
                C0556a next = it.next();
                final z zVar = next.b;
                com.amazon.aps.iva.t5.g0.U(next.a, new Runnable() { // from class: com.amazon.aps.iva.o6.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        z zVar2 = zVar;
                        q qVar2 = qVar;
                        t tVar2 = tVar;
                        IOException iOException2 = iOException;
                        boolean z2 = z;
                        z.a aVar = z.a.this;
                        zVar2.j0(aVar.a, aVar.b, qVar2, tVar2, iOException2, z2);
                    }
                });
            }
        }

        public final void l(q qVar, int i) {
            m(qVar, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public final void m(q qVar, int i, int i2, com.amazon.aps.iva.q5.v vVar, int i3, Object obj, long j, long j2) {
            n(qVar, new t(i, i2, vVar, i3, obj, com.amazon.aps.iva.t5.g0.e0(j), com.amazon.aps.iva.t5.g0.e0(j2)));
        }

        public final void n(final q qVar, final t tVar) {
            Iterator<C0556a> it = this.c.iterator();
            while (it.hasNext()) {
                C0556a next = it.next();
                final z zVar = next.b;
                com.amazon.aps.iva.t5.g0.U(next.a, new Runnable() { // from class: com.amazon.aps.iva.o6.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        z.a aVar = z.a.this;
                        zVar.G(aVar.a, aVar.b, qVar, tVar);
                    }
                });
            }
        }

        public final void o(t tVar) {
            v.b bVar = this.b;
            bVar.getClass();
            Iterator<C0556a> it = this.c.iterator();
            while (it.hasNext()) {
                C0556a next = it.next();
                com.amazon.aps.iva.t5.g0.U(next.a, new x(this, next.b, bVar, tVar, 0));
            }
        }

        public a(CopyOnWriteArrayList<C0556a> copyOnWriteArrayList, int i, v.b bVar) {
            this.c = copyOnWriteArrayList;
            this.a = i;
            this.b = bVar;
        }
    }

    default void N(int i, v.b bVar, t tVar) {
    }

    default void Y(int i, v.b bVar, t tVar) {
    }

    default void G(int i, v.b bVar, q qVar, t tVar) {
    }

    default void T(int i, v.b bVar, q qVar, t tVar) {
    }

    default void U(int i, v.b bVar, q qVar, t tVar) {
    }

    default void j0(int i, v.b bVar, q qVar, t tVar, IOException iOException, boolean z) {
    }
}
