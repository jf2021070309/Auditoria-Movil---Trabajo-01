package com.amazon.aps.iva.kp;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.kp.b;
import com.amazon.aps.iva.yb0.l;
/* compiled from: Configuration.kt */
/* loaded from: classes2.dex */
public final class e extends l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ b.a h;
    public final /* synthetic */ com.amazon.aps.iva.dr.e i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b.a aVar, com.amazon.aps.iva.dr.e eVar) {
        super(0);
        this.h = aVar;
        this.i = eVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        b.a aVar = this.h;
        aVar.d = b.d.c.b(aVar.d, null, 0.0f, this.i, null, false, 1007);
        return q.a;
    }
}
