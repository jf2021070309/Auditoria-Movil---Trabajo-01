package com.amazon.aps.iva.nc0;

import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.m0;
/* compiled from: JvmBuiltInsCustomizer.kt */
/* loaded from: classes4.dex */
public final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<e0> {
    public final /* synthetic */ k h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(k kVar) {
        super(0);
        this.h = kVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final e0 invoke() {
        m0 f = this.h.a.j().f();
        com.amazon.aps.iva.yb0.j.e(f, "moduleDescriptor.builtIns.anyType");
        return f;
    }
}
