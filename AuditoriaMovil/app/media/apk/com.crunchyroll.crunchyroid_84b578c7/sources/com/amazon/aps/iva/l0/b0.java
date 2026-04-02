package com.amazon.aps.iva.l0;

import com.amazon.aps.iva.j0.g1;
import com.amazon.aps.iva.j0.p2;
import com.amazon.aps.iva.j0.q2;
import com.amazon.aps.iva.l0.k;
import com.amazon.aps.iva.o0.y1;
import com.amazon.aps.iva.v1.k2;
import com.amazon.aps.iva.v1.m2;
/* compiled from: TextFieldSelectionManager.kt */
/* loaded from: classes.dex */
public final class b0 implements g1 {
    public final /* synthetic */ c0 a;
    public final /* synthetic */ boolean b;

    public b0(c0 c0Var, boolean z) {
        this.a = c0Var;
        this.b = z;
    }

    @Override // com.amazon.aps.iva.j0.g1
    public final void a() {
        com.amazon.aps.iva.j0.h0 h0Var;
        boolean z = this.b;
        if (z) {
            h0Var = com.amazon.aps.iva.j0.h0.SelectionStart;
        } else {
            h0Var = com.amazon.aps.iva.j0.h0.SelectionEnd;
        }
        c0 c0Var = this.a;
        c0.b(c0Var, h0Var);
        c0Var.p.setValue(new com.amazon.aps.iva.e1.c(o.a(c0Var.i(z))));
    }

    @Override // com.amazon.aps.iva.j0.g1
    public final void b(long j) {
        com.amazon.aps.iva.j0.h0 h0Var;
        c0 c0Var = this.a;
        boolean z = this.b;
        long a = o.a(c0Var.i(z));
        c0Var.l = a;
        c0Var.p.setValue(new com.amazon.aps.iva.e1.c(a));
        c0Var.n = com.amazon.aps.iva.e1.c.b;
        if (z) {
            h0Var = com.amazon.aps.iva.j0.h0.SelectionStart;
        } else {
            h0Var = com.amazon.aps.iva.j0.h0.SelectionEnd;
        }
        c0Var.o.setValue(h0Var);
        p2 p2Var = c0Var.d;
        if (p2Var != null) {
            p2Var.k = false;
        }
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
        int b;
        int m;
        c0 c0Var = this.a;
        c0Var.n = com.amazon.aps.iva.e1.c.f(c0Var.n, j);
        p2 p2Var = c0Var.d;
        if (p2Var != null && (c = p2Var.c()) != null && (yVar = c.a) != null) {
            boolean z = this.b;
            com.amazon.aps.iva.e1.c cVar = new com.amazon.aps.iva.e1.c(com.amazon.aps.iva.e1.c.f(c0Var.l, c0Var.n));
            y1 y1Var = c0Var.p;
            y1Var.setValue(cVar);
            if (z) {
                com.amazon.aps.iva.e1.c cVar2 = (com.amazon.aps.iva.e1.c) y1Var.getValue();
                com.amazon.aps.iva.yb0.j.c(cVar2);
                b = yVar.m(cVar2.a);
            } else {
                com.amazon.aps.iva.i2.q qVar = c0Var.b;
                long j2 = c0Var.j().b;
                int i = com.amazon.aps.iva.c2.z.c;
                b = qVar.b((int) (j2 >> 32));
            }
            int i2 = b;
            if (z) {
                m = c0Var.b.b(com.amazon.aps.iva.c2.z.c(c0Var.j().b));
            } else {
                com.amazon.aps.iva.e1.c cVar3 = (com.amazon.aps.iva.e1.c) y1Var.getValue();
                com.amazon.aps.iva.yb0.j.c(cVar3);
                m = yVar.m(cVar3.a);
            }
            c0.c(c0Var, c0Var.j(), i2, m, z, k.a.a);
        }
        p2 p2Var2 = c0Var.d;
        if (p2Var2 != null) {
            p2Var2.k = false;
        }
    }

    @Override // com.amazon.aps.iva.j0.g1
    public final void onStop() {
        c0 c0Var = this.a;
        m2 m2Var = null;
        c0.b(c0Var, null);
        c0.a(c0Var, null);
        p2 p2Var = c0Var.d;
        if (p2Var != null) {
            p2Var.k = true;
        }
        k2 k2Var = c0Var.h;
        if (k2Var != null) {
            m2Var = k2Var.getStatus();
        }
        if (m2Var == m2.Hidden) {
            c0Var.n();
        }
    }

    @Override // com.amazon.aps.iva.j0.g1
    public final void onCancel() {
    }
}
