package com.amazon.aps.iva.e0;

import com.amazon.aps.iva.o0.w1;
/* compiled from: LazyListScrollPosition.kt */
/* loaded from: classes.dex */
public final class f0 {
    public final w1 a;
    public final w1 b;
    public boolean c;
    public Object d;
    public final com.amazon.aps.iva.f0.x e;

    public f0(int i, int i2) {
        this.a = com.amazon.aps.iva.e.w.J(i);
        this.b = com.amazon.aps.iva.e.w.J(i2);
        this.e = new com.amazon.aps.iva.f0.x(i);
    }

    public final void a(int i, int i2) {
        boolean z;
        if (i >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.a.e(i);
            com.amazon.aps.iva.f0.x xVar = this.e;
            if (i != xVar.c) {
                xVar.c = i;
                int i3 = (i / 30) * 30;
                xVar.b.setValue(com.amazon.aps.iva.aq.j.T(Math.max(i3 - 100, 0), i3 + 30 + 100));
            }
            this.b.e(i2);
            return;
        }
        throw new IllegalArgumentException(("Index should be non-negative (" + i + ')').toString());
    }
}
