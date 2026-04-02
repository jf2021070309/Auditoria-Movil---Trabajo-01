package com.amazon.aps.iva.g1;

import com.amazon.aps.iva.a6.k1;
import com.amazon.aps.iva.b6.b;
import com.amazon.aps.iva.b8.m0;
import com.amazon.aps.iva.b8.p1;
import com.amazon.aps.iva.b8.q;
import com.amazon.aps.iva.b8.t;
import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.q5.l0;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.t5.o;
import com.amazon.aps.iva.x6.e;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.common.collect.ImmutableList;
import java.util.List;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements j, o.a, e.d, t.c, m0.g, p1.e, OnCompleteListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // com.amazon.aps.iva.x6.e.d
    public final long a(long j) {
        com.amazon.aps.iva.x6.w wVar = (com.amazon.aps.iva.x6.w) this.c;
        return g0.j((j * wVar.e) / 1000000, 0L, wVar.j - 1);
    }

    @Override // com.amazon.aps.iva.b8.m0.g
    public final void b(q.d dVar) {
        ((m0) this.c).b.o.v();
    }

    @Override // com.amazon.aps.iva.b8.p1.e
    public final Object e(com.amazon.aps.iva.b8.t tVar, q.d dVar, int i) {
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 8:
                int i3 = p1.i;
                return tVar.h((ImmutableList) obj);
            default:
                int i4 = p1.i;
                return tVar.h(ImmutableList.of((b0) obj));
        }
    }

    @Override // com.amazon.aps.iva.g1.j
    public final double f(double d) {
        v vVar = (v) this.c;
        com.amazon.aps.iva.yb0.j.f(vVar, "$function");
        double d2 = vVar.e;
        double d3 = vVar.d;
        if (d >= d2 * d3) {
            return (Math.pow(d, 1.0d / vVar.a) - vVar.c) / vVar.b;
        }
        return d / d3;
    }

    @Override // com.amazon.aps.iva.b8.t.c
    public final void g(q.c cVar, int i) {
        int i2 = com.amazon.aps.iva.b8.t.u;
        cVar.s(i, (l0.a) this.c);
    }

    @Override // com.amazon.aps.iva.t5.o.a
    public final void invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 2:
                int i2 = com.amazon.aps.iva.a6.m0.o0;
                ((l0.c) obj).b(((k1) obj2).i.d);
                return;
            case 3:
                ((l0.c) obj).W((List) obj2);
                return;
            default:
                ((com.amazon.aps.iva.b6.b) obj).R((b.a) obj2);
                return;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        String str;
        boolean z;
        com.amazon.aps.iva.ds.a aVar = (com.amazon.aps.iva.ds.a) this.c;
        com.amazon.aps.iva.yb0.j.f(aVar, "$analyticsGateway");
        com.amazon.aps.iva.yb0.j.f(task, "task");
        if (task.isSuccessful()) {
            if (((String) task.getResult()) != null && (!com.amazon.aps.iva.oe0.m.b0(str))) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Object result = task.getResult();
                com.amazon.aps.iva.yb0.j.e(result, "task.result");
                aVar.b(new com.amazon.aps.iva.us.m((String) result));
            }
        }
    }
}
