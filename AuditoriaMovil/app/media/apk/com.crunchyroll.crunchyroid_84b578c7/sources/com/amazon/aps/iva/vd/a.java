package com.amazon.aps.iva.vd;

import android.app.Activity;
import android.content.Context;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.mh.j;
import com.amazon.aps.iva.wy.h;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import com.ellation.crunchyroll.api.etp.auth.EtpAccountAuthService;
import com.ellation.crunchyroll.api.etp.auth.RefreshTokenProvider;
import com.ellation.crunchyroll.api.etp.auth.UserTokenInteractor;
import com.ellation.crunchyroll.api.etp.index.EtpIndexProvider;
import com.ellation.crunchyroll.api.notifications.NotificationSettingsInteractor;
/* compiled from: AuthFeatureDependencies.kt */
/* loaded from: classes.dex */
public interface a {
    com.amazon.aps.iva.pm.b a();

    com.amazon.aps.iva.bo.f b();

    l<Context, q> c();

    NotificationSettingsInteractor d();

    com.amazon.aps.iva.xb0.q<Context, h, com.amazon.aps.iva.ls.a, j> e();

    f f();

    void g(String str);

    EtpAccountAuthService getAccountAuthService();

    EtpAccountService getAccountService();

    EtpIndexProvider getEtpIndexProvider();

    RefreshTokenProvider getRefreshTokenProvider();

    UserTokenInteractor getUserTokenInteractor();

    p<Activity, String, q> h();

    com.amazon.aps.iva.bo.a i();

    l<com.amazon.aps.iva.ob0.d<? super q>, Object> j();
}
