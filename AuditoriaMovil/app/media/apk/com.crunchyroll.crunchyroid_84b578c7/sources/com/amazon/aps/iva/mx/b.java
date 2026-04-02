package com.amazon.aps.iva.mx;

import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xw.x;
import com.amazon.aps.iva.yb0.i;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.extension.LifecycleExtensionsKt;
/* compiled from: OnboardingV2FeatureFactory.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class b extends i implements l<o, com.amazon.aps.iva.yi.d> {
    public b(h hVar) {
        super(1, hVar, h.class, "createOnboardingV2AuthRouter", "createOnboardingV2AuthRouter(Landroidx/lifecycle/LifecycleOwner;)Lcom/crunchyroll/onboarding/OnboardingV2AuthenticationFlowRouter;", 0);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.yi.d invoke(o oVar) {
        o oVar2 = oVar;
        j.f(oVar2, "p0");
        ((h) this.receiver).getClass();
        x a = LifecycleExtensionsKt.a(oVar2);
        com.amazon.aps.iva.s40.h hVar = new com.amazon.aps.iva.s40.h(new com.ellation.crunchyroll.presentation.signing.signup.a(), new com.amazon.aps.iva.s40.b(new com.crunchyroll.auth.c(false, false, null, null, true, 15)), a);
        x a2 = LifecycleExtensionsKt.a(oVar2);
        return new e(hVar, new com.amazon.aps.iva.s40.h(new com.amazon.aps.iva.u40.a(), new com.amazon.aps.iva.s40.a(new com.crunchyroll.auth.c(false, false, null, null, false, 15)), a2));
    }
}
