package com.amazon.aps.iva.so;

import android.content.Context;
import com.amazon.aps.iva.lo.c;
import com.amazon.aps.iva.x50.t;
import com.crunchyroll.watchscreen.screen.assets.WatchScreenAssetsLayout;
import com.ellation.crunchyroll.mvp.lifecycle.LifecycleAwareLazy;
/* compiled from: WatchScreenAssetsModule.kt */
/* loaded from: classes2.dex */
public final class c {
    public final g a;
    public final LifecycleAwareLazy b;

    /* compiled from: WatchScreenAssetsModule.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.wo.f> {
        public final /* synthetic */ com.amazon.aps.iva.so.a h;
        public final /* synthetic */ c i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.so.a aVar, c cVar) {
            super(0);
            this.h = aVar;
            this.i = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.wo.f invoke() {
            com.amazon.aps.iva.lo.d dVar = c.a.a;
            if (dVar != null) {
                com.amazon.aps.iva.ff.a h = dVar.h();
                com.amazon.aps.iva.lo.d dVar2 = c.a.a;
                if (dVar2 != null) {
                    return new com.amazon.aps.iva.wo.f(h, dVar2.l(), this.h.a, this.i.a);
                }
                com.amazon.aps.iva.yb0.j.m("dependencies");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    public c(WatchScreenAssetsLayout watchScreenAssetsLayout, com.amazon.aps.iva.so.a aVar) {
        Context context = watchScreenAssetsLayout.getContext();
        com.amazon.aps.iva.yb0.j.d(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        b bVar = aVar.e;
        boolean z = aVar.c;
        t tVar = aVar.d;
        com.amazon.aps.iva.yb0.j.f(tVar, "resourceType");
        this.a = new g(bVar, watchScreenAssetsLayout, (n) com.amazon.aps.iva.ez.l.a((androidx.fragment.app.h) context, n.class, null), tVar, z);
        this.b = com.amazon.aps.iva.aq.j.F(watchScreenAssetsLayout, new a(aVar, this));
    }
}
