package com.amazon.aps.iva.h0;

import com.amazon.aps.iva.a2.c0;
import com.amazon.aps.iva.a2.v;
import com.amazon.aps.iva.a2.y;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: Selectable.kt */
/* loaded from: classes.dex */
public final class b extends l implements com.amazon.aps.iva.xb0.l<c0, q> {
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(boolean z) {
        super(1);
        this.h = z;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(c0 c0Var) {
        c0 c0Var2 = c0Var;
        j.f(c0Var2, "$this$semantics");
        com.amazon.aps.iva.fc0.l<Object>[] lVarArr = y.a;
        v.y.a(c0Var2, y.a[15], Boolean.valueOf(this.h));
        return q.a;
    }
}
