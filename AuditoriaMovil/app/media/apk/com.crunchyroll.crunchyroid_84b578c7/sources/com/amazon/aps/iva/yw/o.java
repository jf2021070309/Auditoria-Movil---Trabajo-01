package com.amazon.aps.iva.yw;

import com.ellation.crunchyroll.application.CrunchyrollApplication;
/* compiled from: FeaturesProvider.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class o extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<Boolean> {
    public o(CrunchyrollApplication crunchyrollApplication) {
        super(0, crunchyrollApplication, CrunchyrollApplication.class, "isInitialized", "isInitialized()Z", 0);
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Boolean invoke() {
        boolean z;
        if (((CrunchyrollApplication) this.receiver).j == CrunchyrollApplication.b.INITIALIZED) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
