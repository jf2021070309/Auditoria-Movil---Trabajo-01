package com.amazon.aps.iva.mx;

import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xw.x;
import com.amazon.aps.iva.yb0.i;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yi.n;
import com.ellation.crunchyroll.extension.LifecycleExtensionsKt;
/* compiled from: OnboardingV2FeatureFactory.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class c extends i implements l<o, n> {
    public c(h hVar) {
        super(1, hVar, h.class, "createSessionExpiredRouter", "createSessionExpiredRouter(Landroidx/lifecycle/LifecycleOwner;)Lcom/crunchyroll/onboarding/SessionExpiredFlowRouter;", 0);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final n invoke(o oVar) {
        o oVar2 = oVar;
        j.f(oVar2, "p0");
        ((h) this.receiver).getClass();
        x a = LifecycleExtensionsKt.a(oVar2);
        return new g(new com.amazon.aps.iva.s40.h(new com.amazon.aps.iva.u40.a(), new com.amazon.aps.iva.s40.a(new com.crunchyroll.auth.c(false, true, null, null, false, 13)), a));
    }
}
