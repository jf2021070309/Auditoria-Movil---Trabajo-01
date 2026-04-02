package com.ellation.crunchyroll.application;

import android.content.SharedPreferences;
import com.amazon.aps.iva.b30.m;
import com.amazon.aps.iva.cx.r;
import com.amazon.aps.iva.fz.k;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.mh.a;
import com.amazon.aps.iva.sv.h;
import com.amazon.aps.iva.us.w;
import com.amazon.aps.iva.us.z;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.ys.n;
import com.amazon.aps.iva.yw.d0;
import com.ellation.crunchyroll.application.a;
import com.ellation.crunchyroll.cast.ChromecastUserStatusInteractor;
/* compiled from: SignInDelegate.kt */
/* loaded from: classes2.dex */
public interface g {

    /* compiled from: SignInDelegate.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static n a() {
            SharedPreferences sharedPreferences = e.b().getSharedPreferences("session_state_store", 0);
            j.e(sharedPreferences, "crunchyrollApplication.g…PRIVATE\n                )");
            com.amazon.aps.iva.z50.b bVar = new com.amazon.aps.iva.z50.b(sharedPreferences);
            com.amazon.aps.iva.gz.b bVar2 = e.b().g;
            if (bVar2 != null) {
                com.amazon.aps.iva.bo.f d = e.d();
                z zVar = w.a.a;
                j.f(zVar, "userSessionAnalytics");
                k kVar = new k(bVar2, d, zVar);
                com.amazon.aps.iva.bo.f d2 = e.d();
                com.ellation.crunchyroll.application.a aVar = a.C0959a.a;
                if (aVar != null) {
                    com.amazon.aps.iva.ys.c b = aVar.b();
                    h hVar = h.a.a;
                    if (hVar != null) {
                        com.amazon.aps.iva.sv.k c = hVar.c();
                        ChromecastUserStatusInteractor create = ChromecastUserStatusInteractor.Companion.create();
                        com.amazon.aps.iva.nz.f playheadsSynchronizerAgent = e.c().getPlayheadsSynchronizerAgent();
                        CrunchyrollApplication b2 = e.b();
                        com.ellation.crunchyroll.application.a aVar2 = a.C0959a.a;
                        if (aVar2 != null) {
                            Object c2 = aVar2.c().c(r.class, "terms_of_service");
                            if (c2 != null) {
                                com.amazon.aps.iva.mh.b a = a.C0516a.a(b2, (r) c2);
                                com.amazon.aps.iva.dh.c d3 = ((d0) e.a()).o.d();
                                com.amazon.aps.iva.rd.g gVar = ((d0) e.a()).u.b;
                                m mVar = ((d0) e.a()).i.u;
                                j.f(b, "appConfigUpdater");
                                j.f(c, "downloadsAgent");
                                j.f(create, "chromecastUserStateInteractor");
                                j.f(playheadsSynchronizerAgent, "playheadsSynchronizerAgent");
                                j.f(d3, "inAppReviewEligibilityEventHandler");
                                j.f(gVar, "widgetsUpdateAgent");
                                j.f(mVar, "unverifiedPurchaseMonitor");
                                return new n(d2, bVar, b, c, create, playheadsSynchronizerAgent, kVar, a, d3, gVar, mVar, zVar);
                            }
                            throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.TermsOfServiceConfigImpl");
                        }
                        j.m("instance");
                        throw null;
                    }
                    j.m("instance");
                    throw null;
                }
                j.m("instance");
                throw null;
            }
            j.m("notificationStateStore");
            throw null;
        }
    }

    Object a(com.amazon.aps.iva.ob0.d<? super q> dVar);
}
