package com.amazon.aps.iva.gm;

import java.util.List;
/* compiled from: LazyDsl.kt */
/* loaded from: classes2.dex */
public final class u extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Integer, Object> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.l h;
    public final /* synthetic */ List i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.amazon.aps.iva.pe0.a aVar, t tVar) {
        super(1);
        this.h = tVar;
        this.i = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Object invoke(Integer num) {
        return this.h.invoke(this.i.get(num.intValue()));
    }
}
