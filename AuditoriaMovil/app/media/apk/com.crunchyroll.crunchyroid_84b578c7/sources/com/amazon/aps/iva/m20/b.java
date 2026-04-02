package com.amazon.aps.iva.m20;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
/* compiled from: UpsellCarouselLayout.kt */
/* loaded from: classes2.dex */
public final class b extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.o70.e, q> {
    public final /* synthetic */ c h;
    public final /* synthetic */ k i;
    public final /* synthetic */ e j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, k kVar, e eVar) {
        super(1);
        this.h = cVar;
        this.i = kVar;
        this.j = eVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(com.amazon.aps.iva.o70.e eVar) {
        com.amazon.aps.iva.o70.e eVar2 = eVar;
        com.amazon.aps.iva.yb0.j.f(eVar2, "$this$setListeners");
        eVar2.X3(new a(this.h, this.i, this.j));
        return q.a;
    }
}
