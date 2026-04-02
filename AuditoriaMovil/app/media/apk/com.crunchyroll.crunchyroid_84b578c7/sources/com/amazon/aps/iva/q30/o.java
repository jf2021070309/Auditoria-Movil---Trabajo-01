package com.amazon.aps.iva.q30;

import android.content.Context;
import com.amazon.aps.iva.p30.f;
import com.amazon.aps.iva.q30.k;
import com.amazon.aps.iva.ws.d;
import com.ellation.crunchyroll.presentation.search.recent.RecentSearchesLayout;
/* compiled from: RecentSearchesView.kt */
/* loaded from: classes2.dex */
public final class o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ RecentSearchesLayout h;
    public final /* synthetic */ Context i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(RecentSearchesLayout recentSearchesLayout, Context context) {
        super(0);
        this.h = recentSearchesLayout;
        this.i = context;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        Context context = this.i;
        com.amazon.aps.iva.yb0.j.f(context, "context");
        v vVar = new v(new com.amazon.aps.iva.i50.c(context, new com.amazon.aps.iva.i50.a(context, true)), new com.amazon.aps.iva.ii.a(context), new t(context));
        m a = k.a.a();
        x xVar = (x) com.amazon.aps.iva.ez.l.a((androidx.fragment.app.h) context, y.class, n.h);
        com.amazon.aps.iva.p30.g a2 = f.a.a(new com.amazon.aps.iva.yh.d(new com.amazon.aps.iva.yh.b(context)), d.a.a(com.amazon.aps.iva.ls.a.SEARCH));
        RecentSearchesLayout recentSearchesLayout = this.h;
        com.amazon.aps.iva.yb0.j.f(recentSearchesLayout, "view");
        r rVar = new r(vVar, a, xVar, a2, recentSearchesLayout);
        com.ellation.crunchyroll.mvp.lifecycle.a.b(rVar, recentSearchesLayout);
        return rVar;
    }
}
