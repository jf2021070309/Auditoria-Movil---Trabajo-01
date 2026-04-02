package com.ellation.crunchyroll.presentation.signing.signin;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.us.n;
import com.amazon.aps.iva.wy.j;
import com.ellation.crunchyroll.api.etp.auth.RefreshTokenProvider;
import com.ellation.crunchyroll.api.etp.index.EtpIndexProvider;
import com.ellation.crunchyroll.application.g;
/* compiled from: SignInInteractor.kt */
/* loaded from: classes2.dex */
public interface f extends j {

    /* compiled from: SignInInteractor.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static com.amazon.aps.iva.u40.b a(com.amazon.aps.iva.bo.d dVar, EtpIndexProvider etpIndexProvider, RefreshTokenProvider refreshTokenProvider, n nVar) {
            com.amazon.aps.iva.ys.n a = g.a.a();
            com.amazon.aps.iva.yb0.j.f(etpIndexProvider, "etpIndexProvider");
            com.amazon.aps.iva.yb0.j.f(refreshTokenProvider, "refreshTokenProvider");
            com.amazon.aps.iva.yb0.j.f(nVar, "loginAnalytics");
            return new com.amazon.aps.iva.u40.b(dVar, etpIndexProvider, refreshTokenProvider, nVar, a);
        }
    }

    Object I(String str, com.amazon.aps.iva.ob0.d<? super q> dVar);

    Object signIn(String str, String str2, com.amazon.aps.iva.ob0.d<? super q> dVar);
}
