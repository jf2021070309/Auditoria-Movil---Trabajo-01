package com.amazon.aps.iva.b50;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.h50.a;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.application.CrunchyrollApplication;
import com.ellation.crunchyroll.presentation.watchlist.sorting.a;
/* compiled from: WatchlistModule.kt */
/* loaded from: classes2.dex */
public final class x implements com.amazon.aps.iva.mn.k {
    public final com.amazon.aps.iva.mn.j b;
    public final c0 c;
    public final com.amazon.aps.iva.b60.n d;
    public final com.amazon.aps.iva.kb0.m e;
    public final com.amazon.aps.iva.kb0.m f;

    /* compiled from: WatchlistModule.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.h50.a> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.h50.a invoke() {
            x xVar = x.this;
            xVar.getClass();
            CrunchyrollApplication crunchyrollApplication = CrunchyrollApplication.m;
            return a.C0324a.a(CrunchyrollApplication.a.a().e().getEtpContentService(), xVar.d);
        }
    }

    /* compiled from: WatchlistModule.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<n> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final n invoke() {
            x.this.getClass();
            CrunchyrollApplication crunchyrollApplication = CrunchyrollApplication.m;
            EtpContentService etpContentService = CrunchyrollApplication.a.a().e().getEtpContentService();
            com.amazon.aps.iva.yb0.j.f(etpContentService, "contentService");
            return new s(etpContentService);
        }
    }

    public x() {
        a.e eVar = a.e.f;
        this.b = new com.amazon.aps.iva.mn.j(f1.K(eVar, a.c.f, a.d.f, a.b.f, a.C0974a.f), i.e, new com.amazon.aps.iva.mn.o(eVar, null), i.f);
        com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
        this.c = new c0();
        com.amazon.aps.iva.ls.a aVar = com.amazon.aps.iva.ls.a.WATCHLIST;
        com.amazon.aps.iva.yb0.j.f(aVar, "screen");
        this.d = new com.amazon.aps.iva.b60.n(aVar);
        this.e = com.amazon.aps.iva.kb0.f.b(new b());
        this.f = com.amazon.aps.iva.kb0.f.b(new a());
    }

    @Override // com.amazon.aps.iva.mn.k
    public final com.amazon.aps.iva.mn.j a() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.mn.k
    public final com.amazon.aps.iva.mn.h d() {
        return this.c;
    }
}
