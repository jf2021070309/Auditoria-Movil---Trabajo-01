package com.amazon.aps.iva.ux;

import com.amazon.aps.iva.yb0.l;
/* compiled from: WidgetsFeatureFactory.kt */
/* loaded from: classes2.dex */
public final class b extends l implements com.amazon.aps.iva.xb0.a<Boolean> {
    public final /* synthetic */ com.amazon.aps.iva.x50.e h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.amazon.aps.iva.x50.e eVar) {
        super(0);
        this.h = eVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Boolean invoke() {
        return Boolean.valueOf(this.h.b());
    }
}
