package com.amazon.aps.iva.rx;

import com.amazon.aps.iva.co.i;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.ys.o;
import com.amazon.aps.iva.ys.p;
import com.ellation.crunchyroll.api.etp.auth.RefreshTokenProvider;
/* compiled from: UserMigrationSignOutInteractorImpl.kt */
/* loaded from: classes2.dex */
public final class e implements i {
    public final o a;
    public final RefreshTokenProvider b;

    public e(RefreshTokenProvider refreshTokenProvider, p pVar) {
        j.f(refreshTokenProvider, "refreshTokenProvider");
        this.a = pVar;
        this.b = refreshTokenProvider;
    }

    @Override // com.amazon.aps.iva.co.i
    public final void d() {
        this.a.d();
        RefreshTokenProvider.DefaultImpls.signOut$default(this.b, false, null, null, 7, null);
    }
}
