package com.ellation.crunchyroll.presentation.main.home;

import com.amazon.aps.iva.yb0.i;
import com.ellation.crunchyroll.application.CrunchyrollApplication;
/* compiled from: HomeBottomBarActivity.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class b extends i implements com.amazon.aps.iva.xb0.a<Boolean> {
    public b(CrunchyrollApplication crunchyrollApplication) {
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
