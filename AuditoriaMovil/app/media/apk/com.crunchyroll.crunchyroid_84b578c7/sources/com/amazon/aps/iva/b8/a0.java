package com.amazon.aps.iva.b8;

import com.amazon.aps.iva.b8.m0;
import com.amazon.aps.iva.b8.p1;
import com.amazon.aps.iva.b8.q;
import com.amazon.aps.iva.n5.b;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a0(m0 m0Var, int i, b.C0529b c0529b, m0.g gVar) {
        this.d = m0Var;
        this.c = i;
        this.e = c0529b;
        this.f = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        int i2 = this.c;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                m0 m0Var = (m0) obj3;
                b.C0529b c0529b = (b.C0529b) obj2;
                m0.g gVar = (m0.g) obj;
                t tVar = m0Var.b;
                if (!tVar.g()) {
                    if (!m0Var.g.a.a.isActive()) {
                        int i3 = c0529b.a.b;
                        com.amazon.aps.iva.t5.p.g();
                        return;
                    }
                    q.d g = m0Var.g(c0529b);
                    if (g != null && m0Var.a.h(i2, g)) {
                        tVar.c.b(tVar.i, g, i2);
                        tVar.a(g, new com.amazon.aps.iva.o4.c(2, gVar, g)).run();
                        return;
                    }
                    return;
                }
                return;
            default:
                int i4 = p1.i;
                ((p1.e) obj3).e((t) obj2, (q.d) obj, i2);
                return;
        }
    }

    public /* synthetic */ a0(p1.e eVar, t tVar, q.d dVar, int i) {
        this.d = eVar;
        this.e = tVar;
        this.f = dVar;
        this.c = i;
    }
}
