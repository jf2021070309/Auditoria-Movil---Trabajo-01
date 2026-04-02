package com.amazon.aps.iva.xq;

import com.amazon.aps.iva.e4.l1;
/* compiled from: RumViewScope.kt */
/* loaded from: classes2.dex */
public final class o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.vq.a, Boolean> {
    public final /* synthetic */ k h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(k kVar) {
        super(1);
        this.h = kVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Boolean invoke(com.amazon.aps.iva.vq.a aVar) {
        boolean z;
        com.amazon.aps.iva.vq.a aVar2 = aVar;
        com.amazon.aps.iva.yb0.j.f(aVar2, "currentContext");
        k kVar = this.h;
        if (com.amazon.aps.iva.yb0.j.a(aVar2.b, kVar.k)) {
            if (!com.amazon.aps.iva.yb0.j.a(aVar2.c, kVar.l)) {
                l1.y(com.amazon.aps.iva.dq.c.a, "Trying to update global RUM context when StopView event arrived, but the context doesn't reference this view.");
                z = false;
                return Boolean.valueOf(z);
            }
        }
        z = true;
        return Boolean.valueOf(z);
    }
}
