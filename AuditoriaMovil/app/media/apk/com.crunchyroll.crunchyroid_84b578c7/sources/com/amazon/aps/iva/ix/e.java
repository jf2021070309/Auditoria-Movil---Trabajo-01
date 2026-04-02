package com.amazon.aps.iva.ix;

import com.ellation.crunchyroll.api.etp.subscription.model.BenefitKt;
/* compiled from: HomeFeedFeatureFactory.kt */
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Boolean> {
    public static final e h = new e();

    public e() {
        super(0);
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Boolean invoke() {
        return Boolean.valueOf(BenefitKt.hasBentoBenefit(com.ellation.crunchyroll.application.f.a(null, 3).q()));
    }
}
