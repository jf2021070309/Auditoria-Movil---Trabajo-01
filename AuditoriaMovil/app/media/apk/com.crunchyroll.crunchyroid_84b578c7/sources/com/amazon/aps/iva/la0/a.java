package com.amazon.aps.iva.la0;

import com.amazon.aps.iva.ga0.b;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: BandwidthMetrics.kt */
/* loaded from: classes4.dex */
public final class a extends l implements com.amazon.aps.iva.xb0.l<v, b.a> {
    public static final a h = new a();

    public a() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final b.a invoke(v vVar) {
        v vVar2 = vVar;
        j.f(vVar2, "trackFormat");
        b.a aVar = new b.a();
        int i = vVar2.i;
        aVar.d = i;
        int i2 = vVar2.r;
        aVar.a = i2;
        int i3 = vVar2.s;
        aVar.b = i3;
        String str = vVar2.j;
        aVar.e = str;
        float f = vVar2.t;
        aVar.c = f;
        aVar.f = i2 + '_' + i3 + '_' + i + '_' + str + '_' + f;
        return aVar;
    }
}
