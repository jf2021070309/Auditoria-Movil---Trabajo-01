package com.amazon.aps.iva.h50;

import com.amazon.aps.iva.ez.g;
import com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus;
import com.ellation.crunchyroll.model.ContentContainer;
/* compiled from: WatchlistItemTogglePresenterImpl.kt */
/* loaded from: classes2.dex */
public final class u extends com.amazon.aps.iva.wy.b<v> implements h {
    public final ContentContainer b;
    public final w c;
    public final com.amazon.aps.iva.b60.m d;

    /* compiled from: WatchlistItemTogglePresenterImpl.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[WatchlistStatus.values().length];
            try {
                iArr[WatchlistStatus.IN_WATCHLIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WatchlistStatus.NOT_IN_WATCHLIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* compiled from: WatchlistItemTogglePresenterImpl.kt */
    /* loaded from: classes2.dex */
    public static final class b implements com.amazon.aps.iva.i5.w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public b(l lVar) {
            this.a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof com.amazon.aps.iva.i5.w) || !(obj instanceof com.amazon.aps.iva.yb0.f)) {
                return false;
            }
            return com.amazon.aps.iva.yb0.j.a(this.a, ((com.amazon.aps.iva.yb0.f) obj).getFunctionDelegate());
        }

        @Override // com.amazon.aps.iva.yb0.f
        public final com.amazon.aps.iva.kb0.a<?> getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // com.amazon.aps.iva.i5.w
        public final /* synthetic */ void onChanged(Object obj) {
            this.a.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(g gVar, ContentContainer contentContainer, x xVar, com.amazon.aps.iva.b60.n nVar) {
        super(gVar, new com.amazon.aps.iva.wy.j[0]);
        com.amazon.aps.iva.yb0.j.f(gVar, "view");
        com.amazon.aps.iva.yb0.j.f(nVar, "watchlistItemAnalytics");
        this.b = contentContainer;
        this.c = xVar;
        this.d = nVar;
        xVar.e.e(gVar, new b(new l(gVar)));
        com.amazon.aps.iva.ez.e.a(xVar.f, gVar, new p(gVar, this));
        com.amazon.aps.iva.ez.e.a(xVar.g, gVar, new t(gVar, this));
    }

    @Override // com.amazon.aps.iva.h50.h
    public final void S4(com.amazon.aps.iva.fs.b bVar) {
        WatchlistStatus watchlistStatus;
        g.c a2;
        w wVar = this.c;
        com.amazon.aps.iva.ez.g gVar = (com.amazon.aps.iva.ez.g) wVar.k4().d();
        if (gVar == null || (a2 = gVar.a()) == null || (watchlistStatus = (WatchlistStatus) a2.a) == null) {
            watchlistStatus = WatchlistStatus.NOT_IN_WATCHLIST;
        }
        int i = a.a[watchlistStatus.ordinal()];
        ContentContainer contentContainer = this.b;
        com.amazon.aps.iva.b60.m mVar = this.d;
        if (i != 1) {
            if (i == 2) {
                mVar.j(contentContainer, bVar);
                wVar.Z3();
                return;
            }
            return;
        }
        mVar.i(contentContainer, bVar);
        wVar.p7();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        this.c.b5();
    }
}
