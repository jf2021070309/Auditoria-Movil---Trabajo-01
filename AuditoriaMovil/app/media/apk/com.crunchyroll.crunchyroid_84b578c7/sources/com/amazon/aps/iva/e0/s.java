package com.amazon.aps.iva.e0;

import com.amazon.aps.iva.o0.p3;
import com.amazon.aps.iva.o0.q1;
/* compiled from: LazyListItemProvider.kt */
/* loaded from: classes.dex */
public final class s extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<i> {
    public final /* synthetic */ p3<com.amazon.aps.iva.xb0.l<e0, com.amazon.aps.iva.kb0.q>> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(q1 q1Var) {
        super(0);
        this.h = q1Var;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final i invoke() {
        return new i(this.h.getValue());
    }
}
