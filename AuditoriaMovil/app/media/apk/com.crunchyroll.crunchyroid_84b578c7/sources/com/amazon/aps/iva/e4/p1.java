package com.amazon.aps.iva.e4;

import java.io.IOException;
import java.util.Arrays;
/* compiled from: UnknownFieldSetLiteSchema.java */
/* loaded from: classes.dex */
public final class p1 extends n1<o1, o1> {
    @Override // com.amazon.aps.iva.e4.n1
    public final void a(o1 o1Var, int i, int i2) {
        o1Var.b((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // com.amazon.aps.iva.e4.n1
    public final void b(o1 o1Var, int i, long j) {
        o1Var.b((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.amazon.aps.iva.e4.n1
    public final void c(o1 o1Var, int i, o1 o1Var2) {
        o1Var.b((i << 3) | 3, o1Var2);
    }

    @Override // com.amazon.aps.iva.e4.n1
    public final void d(o1 o1Var, int i, i iVar) {
        o1Var.b((i << 3) | 2, iVar);
    }

    @Override // com.amazon.aps.iva.e4.n1
    public final void e(o1 o1Var, int i, long j) {
        o1Var.b((i << 3) | 0, Long.valueOf(j));
    }

    @Override // com.amazon.aps.iva.e4.n1
    public final o1 f(Object obj) {
        x xVar = (x) obj;
        o1 o1Var = xVar.unknownFields;
        if (o1Var == o1.f) {
            o1 o1Var2 = new o1();
            xVar.unknownFields = o1Var2;
            return o1Var2;
        }
        return o1Var;
    }

    @Override // com.amazon.aps.iva.e4.n1
    public final o1 g(Object obj) {
        return ((x) obj).unknownFields;
    }

    @Override // com.amazon.aps.iva.e4.n1
    public final int h(o1 o1Var) {
        return o1Var.a();
    }

    @Override // com.amazon.aps.iva.e4.n1
    public final int i(o1 o1Var) {
        o1 o1Var2 = o1Var;
        int i = o1Var2.d;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < o1Var2.a; i3++) {
                i2 += l.c(3, (i) o1Var2.c[i3]) + l.u(2, o1Var2.b[i3] >>> 3) + (l.t(1) * 2);
            }
            o1Var2.d = i2;
            return i2;
        }
        return i;
    }

    @Override // com.amazon.aps.iva.e4.n1
    public final void j(Object obj) {
        ((x) obj).unknownFields.e = false;
    }

    @Override // com.amazon.aps.iva.e4.n1
    public final o1 k(Object obj, Object obj2) {
        o1 o1Var = (o1) obj;
        o1 o1Var2 = (o1) obj2;
        if (!o1Var2.equals(o1.f)) {
            int i = o1Var.a + o1Var2.a;
            int[] copyOf = Arrays.copyOf(o1Var.b, i);
            System.arraycopy(o1Var2.b, 0, copyOf, o1Var.a, o1Var2.a);
            Object[] copyOf2 = Arrays.copyOf(o1Var.c, i);
            System.arraycopy(o1Var2.c, 0, copyOf2, o1Var.a, o1Var2.a);
            return new o1(i, copyOf, copyOf2, true);
        }
        return o1Var;
    }

    @Override // com.amazon.aps.iva.e4.n1
    public final o1 m() {
        return new o1();
    }

    @Override // com.amazon.aps.iva.e4.n1
    public final void n(Object obj, o1 o1Var) {
        ((x) obj).unknownFields = o1Var;
    }

    @Override // com.amazon.aps.iva.e4.n1
    public final void o(Object obj, o1 o1Var) {
        ((x) obj).unknownFields = o1Var;
    }

    @Override // com.amazon.aps.iva.e4.n1
    public final o1 q(Object obj) {
        o1 o1Var = (o1) obj;
        o1Var.e = false;
        return o1Var;
    }

    @Override // com.amazon.aps.iva.e4.n1
    public final void r(Object obj, m mVar) throws IOException {
        o1 o1Var = (o1) obj;
        o1Var.getClass();
        mVar.getClass();
        if (w1.ASCENDING == w1.DESCENDING) {
            int i = o1Var.a;
            while (true) {
                i--;
                if (i >= 0) {
                    mVar.l(o1Var.b[i] >>> 3, o1Var.c[i]);
                } else {
                    return;
                }
            }
        } else {
            for (int i2 = 0; i2 < o1Var.a; i2++) {
                mVar.l(o1Var.b[i2] >>> 3, o1Var.c[i2]);
            }
        }
    }

    @Override // com.amazon.aps.iva.e4.n1
    public final void s(Object obj, m mVar) throws IOException {
        ((o1) obj).c(mVar);
    }

    @Override // com.amazon.aps.iva.e4.n1
    public final void p() {
    }
}
