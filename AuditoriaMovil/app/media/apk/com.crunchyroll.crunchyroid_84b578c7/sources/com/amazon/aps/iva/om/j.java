package com.amazon.aps.iva.om;

import com.amazon.aps.iva.kb0.q;
/* compiled from: ProfilesOnboardingModalContent.kt */
/* loaded from: classes2.dex */
public final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.fs.b, q> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.amazon.aps.iva.xb0.a<q> aVar) {
        super(1);
        this.h = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "it");
        this.h.invoke();
        return q.a;
    }
}
