package com.amazon.aps.iva.h50;

import com.amazon.aps.iva.b50.f0;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.watchlist.a;
/* compiled from: EtpWatchlistInteractor.kt */
/* loaded from: classes2.dex */
public interface a extends com.amazon.aps.iva.wy.j {

    /* compiled from: EtpWatchlistInteractor.kt */
    /* renamed from: com.amazon.aps.iva.h50.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0324a {
        public static b a(EtpContentService etpContentService, com.amazon.aps.iva.b60.n nVar) {
            com.ellation.crunchyroll.watchlist.a.u0.getClass();
            com.ellation.crunchyroll.watchlist.a aVar = a.C0975a.b;
            com.amazon.aps.iva.yb0.j.f(etpContentService, "contentService");
            com.amazon.aps.iva.yb0.j.f(nVar, "watchlistItemAnalytics");
            com.amazon.aps.iva.yb0.j.f(aVar, "watchlistChangeRegister");
            return new b(etpContentService, nVar, aVar);
        }
    }

    Object l(String str, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar);

    void p1(Panel panel, boolean z, com.amazon.aps.iva.d50.a aVar, com.amazon.aps.iva.d50.b bVar);

    Object s(String str, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar);

    Enum t1(String str, com.amazon.aps.iva.ob0.d dVar);

    void y1(String str, f0.c cVar, f0.d dVar);
}
