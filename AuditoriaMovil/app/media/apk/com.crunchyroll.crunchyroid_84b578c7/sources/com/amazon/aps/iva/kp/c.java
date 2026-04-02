package com.amazon.aps.iva.kp;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.kp.b;
import com.amazon.aps.iva.yb0.l;
/* compiled from: Configuration.kt */
/* loaded from: classes2.dex */
public final class c extends l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ b.a h;
    public final /* synthetic */ float i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b.a aVar, float f) {
        super(0);
        this.h = aVar;
        this.i = f;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        b.a aVar = this.h;
        aVar.d = b.d.c.b(aVar.d, null, this.i, null, null, false, 1019);
        return q.a;
    }
}
