package com.amazon.aps.iva.nh;

import androidx.lifecycle.p;
import com.amazon.aps.iva.oh.e;
import com.amazon.aps.iva.oh.h;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: MarkAsWatchedFeatureImpl.kt */
/* loaded from: classes.dex */
public final class f extends l implements com.amazon.aps.iva.xb0.l<p, h> {
    public final /* synthetic */ e h;
    public final /* synthetic */ com.amazon.aps.iva.ls.a i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, com.amazon.aps.iva.ls.a aVar) {
        super(1);
        this.h = eVar;
        this.i = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final h invoke(p pVar) {
        j.f(pVar, "it");
        com.amazon.aps.iva.oh.f a = e.a.a(this.h.getEtpContentService());
        com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
        com.amazon.aps.iva.ls.a aVar = this.i;
        j.f(aVar, "screen");
        return new h(a, new b(cVar, aVar));
    }
}
