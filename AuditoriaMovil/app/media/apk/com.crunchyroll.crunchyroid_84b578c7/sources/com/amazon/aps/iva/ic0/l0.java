package com.amazon.aps.iva.ic0;

import java.lang.reflect.Type;
import java.util.List;
/* compiled from: KTypeImpl.kt */
/* loaded from: classes4.dex */
public final class l0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<List<? extends Type>> {
    public final /* synthetic */ k0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(k0 k0Var) {
        super(0);
        this.h = k0Var;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final List<? extends Type> invoke() {
        Type c = this.h.c();
        com.amazon.aps.iva.yb0.j.c(c);
        return com.amazon.aps.iva.uc0.d.c(c);
    }
}
