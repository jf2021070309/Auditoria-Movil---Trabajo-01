package com.amazon.aps.iva.b6;

import android.os.Handler;
import com.amazon.aps.iva.b6.b;
import com.amazon.aps.iva.b8.a2;
import com.amazon.aps.iva.b8.p1;
import com.amazon.aps.iva.b8.q;
import com.amazon.aps.iva.b8.t;
import com.amazon.aps.iva.b8.v1;
import com.amazon.aps.iva.s6.g;
import com.amazon.aps.iva.t5.o;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements o.a, g.AbstractC0697g.a, t.c, p1.e {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // com.amazon.aps.iva.s6.g.AbstractC0697g.a
    public final ImmutableList a(int i, com.amazon.aps.iva.q5.s0 s0Var, int[] iArr) {
        g.c cVar = (g.c) this.b;
        String str = (String) this.c;
        Ordering<Integer> ordering = com.amazon.aps.iva.s6.g.k;
        ImmutableList.Builder builder = ImmutableList.builder();
        for (int i2 = 0; i2 < s0Var.b; i2++) {
            builder.add((ImmutableList.Builder) new g.f(i, s0Var, i2, cVar, iArr[i2], str));
        }
        return builder.build();
    }

    @Override // com.amazon.aps.iva.b8.p1.e
    public final Object e(final com.amazon.aps.iva.b8.t tVar, final q.d dVar, int i) {
        p1.e eVar = (p1.e) this.b;
        final p1.d dVar2 = (p1.d) this.c;
        int i2 = com.amazon.aps.iva.b8.p1.i;
        if (tVar.g()) {
            return Futures.immediateFuture(new a2(-100));
        }
        return com.amazon.aps.iva.t5.g0.d0((ListenableFuture) eVar.e(tVar, dVar, i), new AsyncFunction() { // from class: com.amazon.aps.iva.b8.e1
            @Override // com.google.common.util.concurrent.AsyncFunction
            public final ListenableFuture apply(Object obj) {
                t tVar2 = t.this;
                Handler handler = tVar2.j;
                com.amazon.aps.iva.a6.x0 a = tVar2.a(dVar, new androidx.fragment.app.c(tVar2, 3, dVar2, (q.e) obj));
                a2 a2Var = new a2(0);
                SettableFuture create = SettableFuture.create();
                com.amazon.aps.iva.t5.g0.U(handler, new com.amazon.aps.iva.n4.h(create, 1, a, a2Var));
                return create;
            }
        });
    }

    @Override // com.amazon.aps.iva.b8.t.c
    public final void g(q.c cVar, int i) {
        int i2 = com.amazon.aps.iva.b8.t.u;
        cVar.x(i, (v1) this.b, (v1) this.c);
    }

    @Override // com.amazon.aps.iva.t5.o.a
    public final void invoke(Object obj) {
        ((b) obj).T((b.a) this.b, (com.amazon.aps.iva.q5.j0) this.c);
    }
}
