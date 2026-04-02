package com.amazon.aps.iva.bd0;

import com.amazon.aps.iva.oc0.s0;
import java.util.Collection;
/* compiled from: LazyJavaClassMemberScope.kt */
/* loaded from: classes4.dex */
public final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nd0.f, Collection<? extends s0>> {
    public final /* synthetic */ k h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar) {
        super(1);
        this.h = kVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Collection<? extends s0> invoke(com.amazon.aps.iva.nd0.f fVar) {
        com.amazon.aps.iva.nd0.f fVar2 = fVar;
        com.amazon.aps.iva.yb0.j.f(fVar2, "it");
        return k.v(this.h, fVar2);
    }
}
