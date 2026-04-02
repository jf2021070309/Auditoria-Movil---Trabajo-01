package com.amazon.aps.iva.yw;

import com.ellation.crunchyroll.api.etp.account.model.AccountApiModel;
/* compiled from: FeaturesProvider.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<String> {
    public final /* synthetic */ d0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d0 d0Var) {
        super(0);
        this.h = d0Var;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final String invoke() {
        AccountApiModel m0 = this.h.a.m0();
        if (m0 != null) {
            return m0.getEmail();
        }
        return null;
    }
}
