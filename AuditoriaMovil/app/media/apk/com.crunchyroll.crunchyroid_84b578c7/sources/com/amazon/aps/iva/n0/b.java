package com.amazon.aps.iva.n0;

import android.content.Context;
import android.graphics.Canvas;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.f1.x;
import com.amazon.aps.iva.o0.p3;
import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.o0.v2;
import com.amazon.aps.iva.o0.y1;
import com.amazon.aps.iva.se0.g0;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: Ripple.android.kt */
/* loaded from: classes.dex */
public final class b extends p implements v2 {
    public final boolean c;
    public final float d;
    public final p3<x> e;
    public final p3<h> f;
    public final m g;
    public final y1 h;
    public final y1 i;
    public long j;
    public int k;
    public final a l;

    public b() {
        throw null;
    }

    public b(boolean z, float f, q1 q1Var, q1 q1Var2, m mVar) {
        super(q1Var2, z);
        this.c = z;
        this.d = f;
        this.e = q1Var;
        this.f = q1Var2;
        this.g = mVar;
        this.h = com.amazon.aps.iva.cq.b.c0(null);
        this.i = com.amazon.aps.iva.cq.b.c0(Boolean.TRUE);
        this.j = com.amazon.aps.iva.e1.g.b;
        this.k = -1;
        this.l = new a(this);
    }

    @Override // com.amazon.aps.iva.a0.r0
    public final void a(com.amazon.aps.iva.h1.c cVar) {
        int f0;
        com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
        this.j = cVar.h();
        float f = this.d;
        if (Float.isNaN(f)) {
            f0 = com.amazon.aps.iva.ob0.f.a(l.a(cVar, this.c, cVar.h()));
        } else {
            f0 = cVar.f0(f);
        }
        this.k = f0;
        long j = this.e.getValue().a;
        float f2 = this.f.getValue().d;
        cVar.f1();
        c(cVar, f, j);
        com.amazon.aps.iva.f1.u a = cVar.R0().a();
        ((Boolean) this.i.getValue()).booleanValue();
        o oVar = (o) this.h.getValue();
        if (oVar != null) {
            oVar.e(f2, this.k, cVar.h(), j);
            Canvas canvas = com.amazon.aps.iva.f1.h.a;
            com.amazon.aps.iva.yb0.j.f(a, "<this>");
            oVar.draw(((com.amazon.aps.iva.f1.g) a).a);
        }
    }

    @Override // com.amazon.aps.iva.n0.p
    public final void b(com.amazon.aps.iva.c0.o oVar, g0 g0Var) {
        Object remove;
        com.amazon.aps.iva.yb0.j.f(oVar, "interaction");
        com.amazon.aps.iva.yb0.j.f(g0Var, "scope");
        m mVar = this.g;
        mVar.getClass();
        n nVar = mVar.e;
        nVar.getClass();
        o oVar2 = (o) ((Map) nVar.a).get(this);
        if (oVar2 == null) {
            ArrayList arrayList = mVar.d;
            com.amazon.aps.iva.yb0.j.f(arrayList, "<this>");
            if (arrayList.isEmpty()) {
                remove = null;
            } else {
                remove = arrayList.remove(0);
            }
            oVar2 = (o) remove;
            Map map = nVar.b;
            if (oVar2 == null) {
                int i = mVar.f;
                ArrayList arrayList2 = mVar.c;
                if (i > f1.B(arrayList2)) {
                    Context context = mVar.getContext();
                    com.amazon.aps.iva.yb0.j.e(context, "context");
                    oVar2 = new o(context);
                    mVar.addView(oVar2);
                    arrayList2.add(oVar2);
                } else {
                    oVar2 = (o) arrayList2.get(mVar.f);
                    com.amazon.aps.iva.yb0.j.f(oVar2, "rippleHostView");
                    b bVar = (b) map.get(oVar2);
                    if (bVar != null) {
                        bVar.h.setValue(null);
                        nVar.a(bVar);
                        oVar2.c();
                    }
                }
                int i2 = mVar.f;
                if (i2 < mVar.b - 1) {
                    mVar.f = i2 + 1;
                } else {
                    mVar.f = 0;
                }
            }
            ((Map) nVar.a).put(this, oVar2);
            map.put(oVar2, this);
        }
        oVar2.b(oVar, this.c, this.j, this.k, this.e.getValue().a, this.f.getValue().d, this.l);
        this.h.setValue(oVar2);
    }

    @Override // com.amazon.aps.iva.n0.p
    public final void d(com.amazon.aps.iva.c0.o oVar) {
        com.amazon.aps.iva.yb0.j.f(oVar, "interaction");
        o oVar2 = (o) this.h.getValue();
        if (oVar2 != null) {
            oVar2.d();
        }
    }

    public final void e() {
        m mVar = this.g;
        mVar.getClass();
        this.h.setValue(null);
        n nVar = mVar.e;
        nVar.getClass();
        o oVar = (o) ((Map) nVar.a).get(this);
        if (oVar != null) {
            oVar.c();
            nVar.a(this);
            mVar.d.add(oVar);
        }
    }

    @Override // com.amazon.aps.iva.o0.v2
    public final void onAbandoned() {
        e();
    }

    @Override // com.amazon.aps.iva.o0.v2
    public final void onForgotten() {
        e();
    }

    @Override // com.amazon.aps.iva.o0.v2
    public final void onRemembered() {
    }
}
