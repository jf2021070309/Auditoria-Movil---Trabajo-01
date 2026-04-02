package com.amazon.aps.iva.mx;

import android.content.Context;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.i;
import com.amazon.aps.iva.yb0.j;
/* compiled from: OnboardingV2FeatureFactory.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class a extends i implements p<Context, o, com.amazon.aps.iva.yi.f> {
    public a(h hVar) {
        super(2, hVar, h.class, "createOnboardingV2FlowRouter", "createOnboardingV2FlowRouter(Landroid/content/Context;Landroidx/lifecycle/LifecycleOwner;)Lcom/crunchyroll/onboarding/OnboardingV2FlowRouter;", 0);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.yi.f invoke(Context context, o oVar) {
        Context context2 = context;
        o oVar2 = oVar;
        j.f(context2, "p0");
        j.f(oVar2, "p1");
        h hVar = (h) this.receiver;
        return new f(hVar.a.b(oVar2), hVar, context2);
    }
}
