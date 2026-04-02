package com.amazon.aps.iva.o6;

import android.os.Handler;
import com.amazon.aps.iva.b6.p1;
import com.amazon.aps.iva.g6.e;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.o6.z;
import com.amazon.aps.iva.q5.r0;
import java.io.IOException;
import java.util.HashMap;
/* compiled from: CompositeMediaSource.java */
/* loaded from: classes.dex */
public abstract class g<T> extends com.amazon.aps.iva.o6.a {
    public final HashMap<T, b<T>> h = new HashMap<>();
    public Handler i;
    public com.amazon.aps.iva.w5.y j;

    /* compiled from: CompositeMediaSource.java */
    /* loaded from: classes.dex */
    public final class a implements z, com.amazon.aps.iva.g6.e {
        public final T b;
        public z.a c;
        public e.a d;

        public a(T t) {
            this.c = g.this.o(null);
            this.d = new e.a(g.this.d.c, 0, null);
            this.b = t;
        }

        @Override // com.amazon.aps.iva.o6.z
        public final void G(int i, v.b bVar, q qVar, t tVar) {
            if (a(i, bVar)) {
                this.c.n(qVar, b(tVar));
            }
        }

        @Override // com.amazon.aps.iva.g6.e
        public final void I(int i, v.b bVar) {
            if (a(i, bVar)) {
                this.d.c();
            }
        }

        @Override // com.amazon.aps.iva.o6.z
        public final void N(int i, v.b bVar, t tVar) {
            if (a(i, bVar)) {
                this.c.o(b(tVar));
            }
        }

        @Override // com.amazon.aps.iva.g6.e
        public final void Q(int i, v.b bVar) {
            if (a(i, bVar)) {
                this.d.d();
            }
        }

        @Override // com.amazon.aps.iva.g6.e
        public final void R(int i, v.b bVar, int i2) {
            if (a(i, bVar)) {
                this.d.e(i2);
            }
        }

        @Override // com.amazon.aps.iva.g6.e
        public final void S(int i, v.b bVar, Exception exc) {
            if (a(i, bVar)) {
                this.d.f(exc);
            }
        }

        @Override // com.amazon.aps.iva.o6.z
        public final void T(int i, v.b bVar, q qVar, t tVar) {
            if (a(i, bVar)) {
                this.c.h(qVar, b(tVar));
            }
        }

        @Override // com.amazon.aps.iva.o6.z
        public final void U(int i, v.b bVar, q qVar, t tVar) {
            if (a(i, bVar)) {
                this.c.e(qVar, b(tVar));
            }
        }

        @Override // com.amazon.aps.iva.o6.z
        public final void Y(int i, v.b bVar, t tVar) {
            if (a(i, bVar)) {
                this.c.b(b(tVar));
            }
        }

        public final boolean a(int i, v.b bVar) {
            v.b bVar2;
            T t = this.b;
            g gVar = g.this;
            if (bVar != null) {
                bVar2 = gVar.u(t, bVar);
                if (bVar2 == null) {
                    return false;
                }
            } else {
                bVar2 = null;
            }
            int w = gVar.w(i, t);
            z.a aVar = this.c;
            if (aVar.a != w || !com.amazon.aps.iva.t5.g0.a(aVar.b, bVar2)) {
                this.c = new z.a(gVar.c.c, w, bVar2);
            }
            e.a aVar2 = this.d;
            if (aVar2.a != w || !com.amazon.aps.iva.t5.g0.a(aVar2.b, bVar2)) {
                this.d = new e.a(gVar.d.c, w, bVar2);
                return true;
            }
            return true;
        }

        @Override // com.amazon.aps.iva.g6.e
        public final void a0(int i, v.b bVar) {
            if (a(i, bVar)) {
                this.d.g();
            }
        }

        public final t b(t tVar) {
            long j = tVar.f;
            g gVar = g.this;
            T t = this.b;
            long v = gVar.v(j, t);
            long j2 = tVar.g;
            long v2 = gVar.v(j2, t);
            if (v == tVar.f && v2 == j2) {
                return tVar;
            }
            return new t(tVar.a, tVar.b, tVar.c, tVar.d, tVar.e, v, v2);
        }

        @Override // com.amazon.aps.iva.g6.e
        public final void f0(int i, v.b bVar) {
            if (a(i, bVar)) {
                this.d.b();
            }
        }

        @Override // com.amazon.aps.iva.o6.z
        public final void j0(int i, v.b bVar, q qVar, t tVar, IOException iOException, boolean z) {
            if (a(i, bVar)) {
                this.c.k(qVar, b(tVar), iOException, z);
            }
        }
    }

    /* compiled from: CompositeMediaSource.java */
    /* loaded from: classes.dex */
    public static final class b<T> {
        public final v a;
        public final v.c b;
        public final g<T>.a c;

        public b(v vVar, f fVar, a aVar) {
            this.a = vVar;
            this.b = fVar;
            this.c = aVar;
        }
    }

    @Override // com.amazon.aps.iva.o6.v
    public void j() throws IOException {
        for (b<T> bVar : this.h.values()) {
            bVar.a.j();
        }
    }

    @Override // com.amazon.aps.iva.o6.a
    public final void p() {
        for (b<T> bVar : this.h.values()) {
            bVar.a.e(bVar.b);
        }
    }

    @Override // com.amazon.aps.iva.o6.a
    public final void q() {
        for (b<T> bVar : this.h.values()) {
            bVar.a.m(bVar.b);
        }
    }

    @Override // com.amazon.aps.iva.o6.a
    public void t() {
        HashMap<T, b<T>> hashMap = this.h;
        for (b<T> bVar : hashMap.values()) {
            bVar.a.n(bVar.b);
            v vVar = bVar.a;
            g<T>.a aVar = bVar.c;
            vVar.f(aVar);
            vVar.i(aVar);
        }
        hashMap.clear();
    }

    public abstract v.b u(T t, v.b bVar);

    public abstract void x(T t, v vVar, r0 r0Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.amazon.aps.iva.o6.v$c, com.amazon.aps.iva.o6.f] */
    public final void y(final T t, v vVar) {
        HashMap<T, b<T>> hashMap = this.h;
        com.amazon.aps.iva.cq.b.t(!hashMap.containsKey(t));
        ?? r1 = new v.c() { // from class: com.amazon.aps.iva.o6.f
            @Override // com.amazon.aps.iva.o6.v.c
            public final void b(v vVar2, r0 r0Var) {
                g.this.x(t, vVar2, r0Var);
            }
        };
        a aVar = new a(t);
        hashMap.put(t, new b<>(vVar, r1, aVar));
        Handler handler = this.i;
        handler.getClass();
        vVar.g(handler, aVar);
        Handler handler2 = this.i;
        handler2.getClass();
        vVar.a(handler2, aVar);
        com.amazon.aps.iva.w5.y yVar = this.j;
        p1 p1Var = this.g;
        com.amazon.aps.iva.cq.b.D(p1Var);
        vVar.d(r1, yVar, p1Var);
        if (!(!this.b.isEmpty())) {
            vVar.e(r1);
        }
    }

    public long v(long j, Object obj) {
        return j;
    }

    public int w(int i, Object obj) {
        return i;
    }
}
