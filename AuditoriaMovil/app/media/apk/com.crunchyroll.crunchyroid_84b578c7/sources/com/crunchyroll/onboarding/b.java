package com.crunchyroll.onboarding;

import androidx.lifecycle.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.amazon.aps.iva.yi.e;
import com.amazon.aps.iva.yi.m;
import com.crunchyroll.onboarding.d;
/* compiled from: OnboardingV2Activity.kt */
/* loaded from: classes.dex */
public final class b extends l implements com.amazon.aps.iva.xb0.l<p, m> {
    public static final b h = new b();

    public b() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final m invoke(p pVar) {
        j.f(pVar, "it");
        e eVar = d.a.a;
        if (eVar != null) {
            return new m(eVar.f);
        }
        j.m("dependencies");
        throw null;
    }
}
