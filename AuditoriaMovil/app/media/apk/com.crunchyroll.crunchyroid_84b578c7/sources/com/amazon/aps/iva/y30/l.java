package com.amazon.aps.iva.y30;

import com.ellation.crunchyroll.api.etp.auth.RefreshTokenProvider;
/* compiled from: SettingsInteractor.kt */
/* loaded from: classes2.dex */
public final class l extends com.amazon.aps.iva.wy.a implements k {
    public final RefreshTokenProvider b;
    public final com.amazon.aps.iva.ys.o c;

    public l(RefreshTokenProvider refreshTokenProvider, com.amazon.aps.iva.ys.o oVar) {
        com.amazon.aps.iva.yb0.j.f(oVar, "signOutDelegate");
        this.b = refreshTokenProvider;
        this.c = oVar;
    }

    @Override // com.amazon.aps.iva.y30.k
    public final void d() {
        this.c.d();
        RefreshTokenProvider.DefaultImpls.signOut$default(this.b, false, null, null, 7, null);
    }
}
