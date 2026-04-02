package com.amazon.aps.iva.f0;

import com.amazon.aps.iva.ee0.f1;
/* compiled from: IntervalList.kt */
/* loaded from: classes.dex */
public final class t0<T> {
    public final com.amazon.aps.iva.p0.f<d<T>> a = new com.amazon.aps.iva.p0.f<>(new d[16]);
    public int b;
    public d<? extends T> c;

    public final void a(int i) {
        boolean z = false;
        if (i >= 0 && i < this.b) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder d = com.amazon.aps.iva.e4.e.d("Index ", i, ", size ");
        d.append(this.b);
        throw new IndexOutOfBoundsException(d.toString());
    }

    public final void b(int i, int i2, u0 u0Var) {
        boolean z;
        a(i);
        a(i2);
        if (i2 >= i) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            com.amazon.aps.iva.p0.f<d<T>> fVar = this.a;
            int g = f1.g(i, fVar);
            int i3 = fVar.b[g].a;
            while (i3 <= i2) {
                d<T> dVar = fVar.b[g];
                u0Var.invoke(dVar);
                i3 += dVar.b;
                g++;
            }
            return;
        }
        throw new IllegalArgumentException(("toIndex (" + i2 + ") should be not smaller than fromIndex (" + i + ')').toString());
    }

    public final d<T> c(int i) {
        boolean z;
        a(i);
        d dVar = (d<? extends T>) this.c;
        if (dVar != null) {
            int i2 = dVar.b;
            int i3 = dVar.a;
            if (i < i2 + i3 && i3 <= i) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return dVar;
            }
        }
        com.amazon.aps.iva.p0.f<d<T>> fVar = this.a;
        d dVar2 = (d<? extends T>) ((d<T>[]) fVar.b)[f1.g(i, fVar)];
        this.c = dVar2;
        return dVar2;
    }
}
