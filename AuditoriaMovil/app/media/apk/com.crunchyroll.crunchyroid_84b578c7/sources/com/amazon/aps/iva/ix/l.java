package com.amazon.aps.iva.ix;

import android.app.Activity;
import com.amazon.aps.iva.i50.b;
import com.amazon.aps.iva.k50.n;
import com.ellation.crunchyroll.model.Panel;
/* compiled from: HomeFeedRoutersFactoryImpl.kt */
/* loaded from: classes2.dex */
public final class l implements n {
    public final com.amazon.aps.iva.i50.c a;

    public l(Activity activity) {
        this.a = new com.amazon.aps.iva.i50.c(activity, new com.amazon.aps.iva.i50.a(activity, true));
    }

    @Override // com.amazon.aps.iva.k50.n
    public final void a(long j, Panel panel, boolean z) {
        com.amazon.aps.iva.yb0.j.f(panel, "panel");
        this.a.c(panel, com.amazon.aps.iva.no.a.HOME_WATCHLIST_ITEM, Long.valueOf(j), Boolean.valueOf(z));
    }

    @Override // com.amazon.aps.iva.k50.n
    public final void b(Panel panel) {
        com.amazon.aps.iva.yb0.j.f(panel, "panel");
        b.a.a(this.a, panel, com.amazon.aps.iva.no.a.OVERFLOW_WATCH_NOW, null, 12);
    }

    @Override // com.amazon.aps.iva.k50.n
    public final void c(long j, Panel panel, boolean z) {
        com.amazon.aps.iva.yb0.j.f(panel, "panel");
        this.a.c(panel, com.amazon.aps.iva.no.a.HOME_CONTINUE_WATCHING_ITEM, Long.valueOf(j), Boolean.valueOf(z));
    }

    @Override // com.amazon.aps.iva.k50.n
    public final void d(Panel panel) {
        com.amazon.aps.iva.yb0.j.f(panel, "panel");
        b.a.a(this.a, panel, com.amazon.aps.iva.no.a.HOME_WATCH_BUTTON, null, 12);
    }
}
