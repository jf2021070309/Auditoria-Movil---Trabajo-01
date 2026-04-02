package com.amazon.aps.iva.m0;

import com.amazon.aps.iva.z.m0;
/* compiled from: ProgressIndicator.kt */
/* loaded from: classes.dex */
public final class r2 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<m0.b<Float>, com.amazon.aps.iva.kb0.q> {
    public static final r2 h = new r2();

    public r2() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(m0.b<Float> bVar) {
        m0.b<Float> bVar2 = bVar;
        com.amazon.aps.iva.yb0.j.f(bVar2, "$this$keyframes");
        bVar2.a = 1332;
        m0.a a = bVar2.a(0, Float.valueOf(0.0f));
        com.amazon.aps.iva.z.s sVar = v2.h;
        com.amazon.aps.iva.yb0.j.f(sVar, "easing");
        a.b = sVar;
        bVar2.a(666, Float.valueOf(290.0f));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
