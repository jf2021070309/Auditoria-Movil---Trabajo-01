package com.amazon.aps.iva.mx;

import com.amazon.aps.iva.yb0.l;
/* compiled from: OnboardingV2FeatureFactory.kt */
/* loaded from: classes2.dex */
public final class d extends l implements com.amazon.aps.iva.xb0.a<Boolean> {
    public static final d h = new d();

    public d() {
        super(0);
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Boolean invoke() {
        boolean z;
        if (com.ellation.crunchyroll.application.e.d().m0() != null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
