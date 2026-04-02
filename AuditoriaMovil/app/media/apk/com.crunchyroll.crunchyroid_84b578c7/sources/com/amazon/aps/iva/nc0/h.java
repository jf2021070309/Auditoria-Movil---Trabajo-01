package com.amazon.aps.iva.nc0;

import com.amazon.aps.iva.nc0.g;
/* compiled from: JvmBuiltIns.kt */
/* loaded from: classes4.dex */
public final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<g.b> {
    public final /* synthetic */ g h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar) {
        super(0);
        this.h = gVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final g.b invoke() {
        g gVar = this.h;
        com.amazon.aps.iva.xb0.a<g.b> aVar = gVar.f;
        if (aVar != null) {
            g.b invoke = aVar.invoke();
            gVar.f = null;
            return invoke;
        }
        throw new AssertionError("JvmBuiltins instance has not been initialized properly");
    }
}
