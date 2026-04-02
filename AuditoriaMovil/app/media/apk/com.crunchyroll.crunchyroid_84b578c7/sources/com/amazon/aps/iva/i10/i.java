package com.amazon.aps.iva.i10;

import android.content.Intent;
import android.content.res.Configuration;
import com.amazon.aps.iva.d10.k;
import com.amazon.aps.iva.d10.p;
import com.amazon.aps.iva.d10.r;
import com.amazon.aps.iva.d10.t;
import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.k50.n;
import com.amazon.aps.iva.kb0.q;
import com.ellation.crunchyroll.model.Panel;
import java.util.List;
/* compiled from: DownloadsFragmentPresenter.kt */
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.wy.b<l> implements f {
    public final com.amazon.aps.iva.d10.k b;
    public final r c;
    public final com.amazon.aps.iva.h10.d d;
    public final com.amazon.aps.iva.k50.h e;
    public final n f;
    public final com.amazon.aps.iva.g10.b g;
    public k.a h;

    /* compiled from: DownloadsFragmentPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.d10.i>>, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.d10.i>> gVar) {
            com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.d10.i>> gVar2 = gVar;
            i iVar = i.this;
            gVar2.c(new g(iVar));
            gVar2.e(new h(iVar));
            return q.a;
        }
    }

    /* compiled from: DownloadsFragmentPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b implements w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public b(a aVar) {
            this.a = aVar;
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

    public i(p pVar, t tVar, com.amazon.aps.iva.h10.e eVar, com.amazon.aps.iva.k50.h hVar, n nVar, com.amazon.aps.iva.g10.b bVar, l lVar) {
        super(lVar, pVar);
        this.b = pVar;
        this.c = tVar;
        this.d = eVar;
        this.e = hVar;
        this.f = nVar;
        this.g = bVar;
    }

    @Override // com.amazon.aps.iva.i10.f
    public final void D3(com.amazon.aps.iva.d10.i iVar) {
        com.amazon.aps.iva.yb0.j.f(iVar, "downloadPanel");
        Panel panel = iVar.a;
        if (iVar.c > 0) {
            this.f.b(panel);
        } else {
            this.e.t(panel);
        }
    }

    @Override // com.amazon.aps.iva.i10.f
    public final void L1() {
        getView().eg(this.d.a());
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onConfigurationChanged(Configuration configuration) {
        getView().Va();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        this.c.c();
        this.g.r8().e(getView(), new b(new a()));
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onNewIntent(Intent intent) {
        com.amazon.aps.iva.yb0.j.f(intent, "intent");
        this.c.onNewIntent(intent);
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onPause() {
        this.c.p(false);
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onResume() {
        this.c.p(true);
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onStart() {
        com.amazon.aps.iva.g10.b bVar = this.g;
        this.h = this.b.L0(new j(bVar), new k(bVar));
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onStop() {
        this.b.A(this.h);
        this.h = null;
    }
}
