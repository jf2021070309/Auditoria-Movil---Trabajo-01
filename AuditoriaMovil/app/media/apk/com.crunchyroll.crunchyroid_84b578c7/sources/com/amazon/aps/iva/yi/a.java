package com.amazon.aps.iva.yi;

import android.view.View;
import com.amazon.aps.iva.ab.r;
import com.amazon.aps.iva.kb0.q;
import com.crunchyroll.onboarding.OnboardingV2Activity;
/* compiled from: OnboardingV2Activity.kt */
/* loaded from: classes.dex */
public final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<View, q> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.fs.b, q> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(OnboardingV2Activity.d dVar) {
        super(1);
        this.h = dVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(View view) {
        View view2 = view;
        com.amazon.aps.iva.yb0.j.f(view2, "view");
        this.h.invoke(r.p(view2, null));
        return q.a;
    }
}
