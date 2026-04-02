package com.amazon.aps.iva.rc0;

import com.amazon.aps.iva.oc0.d1;
import com.amazon.aps.iva.rc0.v0;
import java.util.List;
/* compiled from: ValueParameterDescriptorImpl.kt */
/* loaded from: classes4.dex */
public final class u0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<List<? extends d1>> {
    public final /* synthetic */ v0.a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(v0.a aVar) {
        super(0);
        this.h = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final List<? extends d1> invoke() {
        return (List) this.h.m.getValue();
    }
}
