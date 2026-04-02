package com.amazon.aps.iva.v4;

import java.io.IOException;
import java.util.Arrays;
/* compiled from: UnknownFieldSetLiteSchema.java */
/* loaded from: classes.dex */
public final class m1 extends k1<l1, l1> {
    @Override // com.amazon.aps.iva.v4.k1
    public final void a(l1 l1Var, int i, int i2) {
        l1Var.b((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // com.amazon.aps.iva.v4.k1
    public final void b(l1 l1Var, int i, long j) {
        l1Var.b((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.amazon.aps.iva.v4.k1
    public final void c(l1 l1Var, int i, l1 l1Var2) {
        l1Var.b((i << 3) | 3, l1Var2);
    }

    @Override // com.amazon.aps.iva.v4.k1
    public final void d(l1 l1Var, int i, h hVar) {
        l1Var.b((i << 3) | 2, hVar);
    }

    @Override // com.amazon.aps.iva.v4.k1
    public final void e(l1 l1Var, int i, long j) {
        l1Var.b((i << 3) | 0, Long.valueOf(j));
    }

    @Override // com.amazon.aps.iva.v4.k1
    public final l1 f(Object obj) {
        w wVar = (w) obj;
        l1 l1Var = wVar.unknownFields;
        if (l1Var == l1.f) {
            l1 l1Var2 = new l1();
            wVar.unknownFields = l1Var2;
            return l1Var2;
        }
        return l1Var;
    }

    @Override // com.amazon.aps.iva.v4.k1
    public final l1 g(Object obj) {
        return ((w) obj).unknownFields;
    }

    @Override // com.amazon.aps.iva.v4.k1
    public final int h(l1 l1Var) {
        return l1Var.a();
    }

    @Override // com.amazon.aps.iva.v4.k1
    public final int i(l1 l1Var) {
        l1 l1Var2 = l1Var;
        int i = l1Var2.d;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < l1Var2.a; i3++) {
                i2 += k.c(3, (h) l1Var2.c[i3]) + k.u(2, l1Var2.b[i3] >>> 3) + (k.t(1) * 2);
            }
            l1Var2.d = i2;
            return i2;
        }
        return i;
    }

    @Override // com.amazon.aps.iva.v4.k1
    public final void j(Object obj) {
        ((w) obj).unknownFields.e = false;
    }

    @Override // com.amazon.aps.iva.v4.k1
    public final l1 k(Object obj, Object obj2) {
        l1 l1Var = (l1) obj;
        l1 l1Var2 = (l1) obj2;
        if (!l1Var2.equals(l1.f)) {
            int i = l1Var.a + l1Var2.a;
            int[] copyOf = Arrays.copyOf(l1Var.b, i);
            System.arraycopy(l1Var2.b, 0, copyOf, l1Var.a, l1Var2.a);
            Object[] copyOf2 = Arrays.copyOf(l1Var.c, i);
            System.arraycopy(l1Var2.c, 0, copyOf2, l1Var.a, l1Var2.a);
            return new l1(i, copyOf, copyOf2, true);
        }
        return l1Var;
    }

    @Override // com.amazon.aps.iva.v4.k1
    public final l1 m() {
        return new l1();
    }

    @Override // com.amazon.aps.iva.v4.k1
    public final void n(Object obj, l1 l1Var) {
        ((w) obj).unknownFields = l1Var;
    }

    @Override // com.amazon.aps.iva.v4.k1
    public final void o(Object obj, l1 l1Var) {
        ((w) obj).unknownFields = l1Var;
    }

    @Override // com.amazon.aps.iva.v4.k1
    public final l1 q(Object obj) {
        l1 l1Var = (l1) obj;
        l1Var.e = false;
        return l1Var;
    }

    @Override // com.amazon.aps.iva.v4.k1
    public final void r(Object obj, l lVar) throws IOException {
        l1 l1Var = (l1) obj;
        l1Var.getClass();
        lVar.getClass();
        if (t1.ASCENDING == t1.DESCENDING) {
            int i = l1Var.a;
            while (true) {
                i--;
                if (i >= 0) {
                    lVar.l(l1Var.b[i] >>> 3, l1Var.c[i]);
                } else {
                    return;
                }
            }
        } else {
            for (int i2 = 0; i2 < l1Var.a; i2++) {
                lVar.l(l1Var.b[i2] >>> 3, l1Var.c[i2]);
            }
        }
    }

    @Override // com.amazon.aps.iva.v4.k1
    public final void s(Object obj, l lVar) throws IOException {
        ((l1) obj).c(lVar);
    }

    @Override // com.amazon.aps.iva.v4.k1
    public final void p() {
    }
}
