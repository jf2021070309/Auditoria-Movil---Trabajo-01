package com.amazon.aps.iva.ce0;

import com.amazon.aps.iva.lb0.x;
import java.util.List;
/* compiled from: DeserializedClassDescriptor.kt */
/* loaded from: classes4.dex */
public final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<List<? extends com.amazon.aps.iva.pc0.c>> {
    public final /* synthetic */ d h;
    public final /* synthetic */ com.amazon.aps.iva.id0.f i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, com.amazon.aps.iva.id0.f fVar) {
        super(0);
        this.h = dVar;
        this.i = fVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final List<? extends com.amazon.aps.iva.pc0.c> invoke() {
        d dVar = this.h;
        return x.X0(dVar.m.a.e.c(dVar.x, this.i));
    }
}
