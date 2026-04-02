package com.amazon.aps.iva.rd0;

import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.j1;
import com.amazon.aps.iva.ee0.m1;
import com.amazon.aps.iva.ee0.r;
import com.amazon.aps.iva.oc0.h;
import com.amazon.aps.iva.oc0.y0;
/* compiled from: CapturedTypeConstructor.kt */
/* loaded from: classes4.dex */
public final class e extends r {
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(m1 m1Var, boolean z) {
        super(m1Var);
        this.c = z;
    }

    @Override // com.amazon.aps.iva.ee0.m1
    public final boolean b() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.ee0.m1
    public final j1 d(e0 e0Var) {
        j1 d = this.b.d(e0Var);
        y0 y0Var = null;
        if (d == null) {
            return null;
        }
        h k = e0Var.I0().k();
        if (k instanceof y0) {
            y0Var = (y0) k;
        }
        return d.a(d, y0Var);
    }
}
