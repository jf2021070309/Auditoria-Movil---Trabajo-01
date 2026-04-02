package com.amazon.aps.iva.h50;

import com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus;
/* compiled from: WatchlistItemTogglePresenterImpl.kt */
/* loaded from: classes2.dex */
public final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<WatchlistStatus, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ v h;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(v vVar) {
        super(1);
        this.h = vVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(WatchlistStatus watchlistStatus) {
        WatchlistStatus watchlistStatus2 = watchlistStatus;
        com.amazon.aps.iva.yb0.j.f(watchlistStatus2, "status");
        v vVar = this.h;
        vVar.wg();
        int i = a.a[watchlistStatus2.ordinal()];
        if (i != 1) {
            if (i == 2) {
                vVar.ba();
            }
        } else {
            vVar.th();
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
