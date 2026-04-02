package com.amazon.aps.iva.k40;

import com.amazon.aps.iva.a20.c;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
/* compiled from: SelectedHeaderViewModel.kt */
/* loaded from: classes2.dex */
public final class c extends l implements com.amazon.aps.iva.xb0.l<a, q> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.y30.c, q> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(c.b bVar) {
        super(1);
        this.h = bVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(a aVar) {
        com.amazon.aps.iva.y30.c a = aVar.a();
        if (a != null) {
            this.h.invoke(a);
        }
        return q.a;
    }
}
