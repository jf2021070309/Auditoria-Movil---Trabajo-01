package com.amazon.aps.iva.l0;

import com.amazon.aps.iva.j0.g1;
import com.amazon.aps.iva.j0.p2;
import com.amazon.aps.iva.j0.q2;
import com.amazon.aps.iva.o0.y1;
/* compiled from: TextFieldSelectionManager.kt */
/* loaded from: classes.dex */
public final class a0 implements g1 {
    public final /* synthetic */ c0 a;

    public a0(c0 c0Var) {
        this.a = c0Var;
    }

    @Override // com.amazon.aps.iva.j0.g1
    public final void a() {
        com.amazon.aps.iva.j0.h0 h0Var = com.amazon.aps.iva.j0.h0.Cursor;
        c0 c0Var = this.a;
        c0.b(c0Var, h0Var);
        c0Var.p.setValue(new com.amazon.aps.iva.e1.c(o.a(c0Var.i(true))));
    }

    @Override // com.amazon.aps.iva.j0.g1
    public final void b(long j) {
        c0 c0Var = this.a;
        long a = o.a(c0Var.i(true));
        c0Var.l = a;
        c0Var.p.setValue(new com.amazon.aps.iva.e1.c(a));
        c0Var.n = com.amazon.aps.iva.e1.c.b;
        c0Var.o.setValue(com.amazon.aps.iva.j0.h0.Cursor);
    }

    @Override // com.amazon.aps.iva.j0.g1
    public final void c() {
        c0 c0Var = this.a;
        c0.b(c0Var, null);
        c0.a(c0Var, null);
    }

    @Override // com.amazon.aps.iva.j0.g1
    public final void d(long j) {
        q2 c;
        com.amazon.aps.iva.c2.y yVar;
        c0 c0Var = this.a;
        c0Var.n = com.amazon.aps.iva.e1.c.f(c0Var.n, j);
        p2 p2Var = c0Var.d;
        if (p2Var != null && (c = p2Var.c()) != null && (yVar = c.a) != null) {
            com.amazon.aps.iva.e1.c cVar = new com.amazon.aps.iva.e1.c(com.amazon.aps.iva.e1.c.f(c0Var.l, c0Var.n));
            y1 y1Var = c0Var.p;
            y1Var.setValue(cVar);
            com.amazon.aps.iva.i2.q qVar = c0Var.b;
            com.amazon.aps.iva.e1.c cVar2 = (com.amazon.aps.iva.e1.c) y1Var.getValue();
            com.amazon.aps.iva.yb0.j.c(cVar2);
            int a = qVar.a(yVar.m(cVar2.a));
            long f = com.amazon.aps.iva.ab.x.f(a, a);
            if (com.amazon.aps.iva.c2.z.a(f, c0Var.j().b)) {
                return;
            }
            com.amazon.aps.iva.l1.a aVar = c0Var.i;
            if (aVar != null) {
                aVar.a();
            }
            c0Var.c.invoke(c0.e(c0Var.j().a, f));
        }
    }

    @Override // com.amazon.aps.iva.j0.g1
    public final void onStop() {
        c0 c0Var = this.a;
        c0.b(c0Var, null);
        c0.a(c0Var, null);
    }

    @Override // com.amazon.aps.iva.j0.g1
    public final void onCancel() {
    }
}
