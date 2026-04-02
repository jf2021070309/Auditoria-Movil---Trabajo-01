package com.amazon.aps.iva.bd0;

import com.amazon.aps.iva.lb0.m0;
import java.util.Set;
/* compiled from: LazyJavaClassMemberScope.kt */
/* loaded from: classes4.dex */
public final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Set<? extends com.amazon.aps.iva.nd0.f>> {
    public final /* synthetic */ k h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k kVar) {
        super(0);
        this.h = kVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Set<? extends com.amazon.aps.iva.nd0.f> invoke() {
        k kVar = this.h;
        return m0.Q(kVar.a(), kVar.d());
    }
}
