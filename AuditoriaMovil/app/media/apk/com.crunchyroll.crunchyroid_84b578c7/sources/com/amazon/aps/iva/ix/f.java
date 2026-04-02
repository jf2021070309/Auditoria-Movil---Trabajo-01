package com.amazon.aps.iva.ix;
/* compiled from: HomeFeedFeatureFactory.kt */
/* loaded from: classes2.dex */
public final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Boolean> {
    public static final f h = new f();

    public f() {
        super(0);
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Boolean invoke() {
        return Boolean.valueOf(com.ellation.crunchyroll.application.f.a(null, 3).getHasPremiumBenefit());
    }
}
