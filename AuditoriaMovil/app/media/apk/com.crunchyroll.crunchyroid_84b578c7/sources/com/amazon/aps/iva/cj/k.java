package com.amazon.aps.iva.cj;

import com.ellation.crunchyroll.api.drm.DrmProxyService;
import com.ellation.crunchyroll.api.etp.auth.EtpAuthInterceptor;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.api.etp.playback.PlayService;
import com.ellation.crunchyroll.application.CrunchyrollApplication;
import com.ellation.crunchyroll.cast.CastFeature;
import okhttp3.OkHttpClient;
/* compiled from: PlayerDependencies.kt */
/* loaded from: classes.dex */
public interface k {
    CastFeature a();

    com.amazon.aps.iva.pm.a b();

    com.amazon.aps.iva.ph.a c();

    com.amazon.aps.iva.dh.c d();

    com.amazon.aps.iva.aj.f e();

    com.amazon.aps.iva.nx.b f(androidx.fragment.app.h hVar);

    CrunchyrollApplication g();

    EtpAuthInterceptor getAuthInterceptor();

    DrmProxyService getDrmProxyService();

    EtpContentService getEtpContentService();

    PlayService getPlayService();

    com.amazon.aps.iva.ye.j getSessionManagerProvider();

    com.amazon.aps.iva.cx.q h();

    com.amazon.aps.iva.nx.h i();

    com.amazon.aps.iva.nx.d j();

    com.amazon.aps.iva.nx.e k();

    com.amazon.aps.iva.nx.c l();

    com.amazon.aps.iva.cx.n m();

    com.amazon.aps.iva.k50.j n(androidx.fragment.app.h hVar);

    OkHttpClient o();
}
