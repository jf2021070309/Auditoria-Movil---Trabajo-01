package com.amazon.aps.iva.fo;

import com.amazon.aps.iva.go.b;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.xb0.l;
import com.ellation.crunchyroll.api.etp.auth.model.WatchDataStatus;
/* compiled from: WatchDataNotificationMonitor.kt */
/* loaded from: classes2.dex */
public final class h implements g {
    public final c a;
    public final com.amazon.aps.iva.co.d b;
    public final v<com.amazon.aps.iva.ez.d<WatchDataStatus>> c = new v<>();
    public final v<com.amazon.aps.iva.ez.d<WatchDataStatus>> d = new v<>();
    public final v<WatchDataStatus> e = new v<>();

    /* compiled from: WatchDataNotificationMonitor.kt */
    /* loaded from: classes2.dex */
    public static final class a implements w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ l a;

        public a(l lVar) {
            this.a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof w) || !(obj instanceof com.amazon.aps.iva.yb0.f)) {
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

    public h(d dVar, com.amazon.aps.iva.co.d dVar2) {
        this.a = dVar;
        this.b = dVar2;
    }

    @Override // com.amazon.aps.iva.fo.g
    public final void a(o oVar, b.a aVar) {
        com.amazon.aps.iva.yb0.j.f(oVar, "lifecycleOwner");
        if (this.b.isEnabled()) {
            this.e.e(oVar, new a(new k(aVar)));
        }
    }

    @Override // com.amazon.aps.iva.fo.g
    public final void b(WatchDataStatus watchDataStatus) {
        this.e.i(watchDataStatus);
    }

    @Override // com.amazon.aps.iva.fo.g
    public final void c(WatchDataStatus watchDataStatus) {
        com.amazon.aps.iva.yb0.j.f(watchDataStatus, "watchDataStatus");
        this.d.i(new com.amazon.aps.iva.ez.d<>(watchDataStatus));
    }

    @Override // com.amazon.aps.iva.fo.g
    public final void d(WatchDataStatus watchDataStatus) {
        com.amazon.aps.iva.yb0.j.f(watchDataStatus, "watchDataStatus");
        this.c.k(new com.amazon.aps.iva.ez.d<>(watchDataStatus));
    }

    public final void e(androidx.fragment.app.h hVar, com.amazon.aps.iva.u70.j jVar, com.amazon.aps.iva.ls.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "segmentAnalyticsScreen");
        if (this.b.isEnabled()) {
            this.d.e(hVar, new a(new i(jVar, this, aVar)));
        }
    }

    public final void f(androidx.fragment.app.h hVar, com.amazon.aps.iva.u70.j jVar) {
        if (this.b.isEnabled()) {
            this.c.e(hVar, new a(new j(jVar, this)));
        }
    }
}
