package com.amazon.aps.iva.nh;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.p;
import androidx.lifecycle.u;
import com.amazon.aps.iva.ez.k;
import com.amazon.aps.iva.oh.e;
import com.amazon.aps.iva.oh.g;
import com.amazon.aps.iva.oh.h;
import com.amazon.aps.iva.oh.i;
import com.amazon.aps.iva.xw.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
/* compiled from: MarkAsWatchedFeatureImpl.kt */
/* loaded from: classes.dex */
public final class e implements d, c {
    public final /* synthetic */ c a;

    /* compiled from: MarkAsWatchedFeatureImpl.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<p, h> {
        public final /* synthetic */ com.amazon.aps.iva.ls.a i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.ls.a aVar) {
            super(1);
            this.i = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final h invoke(p pVar) {
            j.f(pVar, "it");
            com.amazon.aps.iva.oh.f a = e.a.a(e.this.getEtpContentService());
            com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
            com.amazon.aps.iva.ls.a aVar = this.i;
            j.f(aVar, "screen");
            return new h(a, new b(cVar, aVar));
        }
    }

    public e(com.amazon.aps.iva.yw.l lVar) {
        this.a = lVar;
    }

    @Override // com.amazon.aps.iva.nh.d
    public final void a(androidx.fragment.app.h hVar, i iVar, g gVar) {
        j.f(hVar, "activity");
        j.f(iVar, "markAsWatchedView");
        j.f(gVar, "markAsWatchedToggleViewModel");
        int i = com.amazon.aps.iva.oh.c.i0;
        com.ellation.crunchyroll.mvp.lifecycle.a.a(new com.amazon.aps.iva.oh.d(iVar, gVar), hVar);
    }

    public final g b(Context context, com.amazon.aps.iva.ls.a aVar) {
        j.f(context, "context");
        j.f(aVar, "screen");
        Activity a2 = q.a(context);
        j.d(a2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        return (g) com.amazon.aps.iva.ez.l.a((androidx.fragment.app.h) a2, h.class, new a(aVar));
    }

    public final g c(com.amazon.aps.iva.n10.j jVar, com.amazon.aps.iva.ls.a aVar) {
        j.f(jVar, "fragment");
        j.f(aVar, "screen");
        return (g) new u(jVar, new k(h.class, new f(this, aVar), jVar)).a(h.class);
    }

    @Override // com.amazon.aps.iva.nh.c
    public final EtpContentService getEtpContentService() {
        return this.a.getEtpContentService();
    }
}
