package com.ellation.crunchyroll.application;

import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yw.d0;
import com.ellation.crunchyroll.api.etp.EtpNetworkModule;
import com.ellation.crunchyroll.application.CrunchyrollApplication;
/* compiled from: ApplicationScopeInstancesProvider.kt */
/* loaded from: classes2.dex */
public final class e {
    public static final com.amazon.aps.iva.yw.a a() {
        d0 d0Var = b().h;
        if (d0Var != null) {
            return d0Var;
        }
        j.m("featuresProvider");
        throw null;
    }

    public static final CrunchyrollApplication b() {
        CrunchyrollApplication crunchyrollApplication = CrunchyrollApplication.m;
        return CrunchyrollApplication.a.a();
    }

    public static final EtpNetworkModule c() {
        return b().e();
    }

    public static final com.amazon.aps.iva.bo.f d() {
        return b().b();
    }
}
