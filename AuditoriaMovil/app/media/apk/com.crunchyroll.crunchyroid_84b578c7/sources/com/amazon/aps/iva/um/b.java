package com.amazon.aps.iva.um;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.um.f;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: SwitchProfileScreenContent.kt */
/* loaded from: classes2.dex */
public final class b extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ym.c, q> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<f, q> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(com.amazon.aps.iva.xb0.l<? super f, q> lVar) {
        super(1);
        this.h = lVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(com.amazon.aps.iva.ym.c cVar) {
        com.amazon.aps.iva.ym.c cVar2 = cVar;
        j.f(cVar2, "uiModel");
        this.h.invoke(new f.d(cVar2));
        return q.a;
    }
}
