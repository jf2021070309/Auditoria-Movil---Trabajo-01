package com.amazon.aps.iva.mt;

import java.util.List;
/* compiled from: LazyDsl.kt */
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Integer, Object> {
    public final /* synthetic */ List h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(List list) {
        super(1);
        this.h = list;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Object invoke(Integer num) {
        this.h.get(num.intValue());
        return null;
    }
}
