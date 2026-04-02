package com.amazon.aps.iva.x10;

import android.content.Intent;
import com.amazon.aps.iva.a0.k;
import com.amazon.aps.iva.cg.p;
import com.amazon.aps.iva.cg.y;
import com.amazon.aps.iva.i50.b;
import com.amazon.aps.iva.k50.j;
import com.amazon.aps.iva.x50.q;
import com.amazon.aps.iva.x50.r;
import com.ellation.crunchyroll.presentation.main.home.HomeBottomBarActivity;
/* compiled from: HomeDeeplinkPresenter.kt */
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.wy.b<com.amazon.aps.iva.x10.a> implements b {
    public final q b;
    public final com.amazon.aps.iva.xb0.a<Boolean> c;
    public final com.amazon.aps.iva.xb0.a<Boolean> d;
    public final com.amazon.aps.iva.cg.d e;
    public final com.amazon.aps.iva.i50.b f;
    public final j g;
    public final com.amazon.aps.iva.xh.b h;

    /* compiled from: HomeDeeplinkPresenter.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[y.values().length];
            try {
                iArr[y.GAME_VAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    public c(HomeBottomBarActivity homeBottomBarActivity, r rVar, com.ellation.crunchyroll.presentation.main.home.a aVar, com.ellation.crunchyroll.presentation.main.home.b bVar, com.amazon.aps.iva.cg.e eVar, com.amazon.aps.iva.i50.c cVar, j jVar, com.amazon.aps.iva.xh.b bVar2) {
        super(homeBottomBarActivity, new com.amazon.aps.iva.wy.j[0]);
        this.b = rVar;
        this.c = aVar;
        this.d = bVar;
        this.e = eVar;
        this.f = cVar;
        this.g = jVar;
        this.h = bVar2;
    }

    @Override // com.amazon.aps.iva.x10.b
    public final void P1() {
        p.e eVar;
        int i;
        p pVar = k.c;
        if (pVar instanceof p.e) {
            eVar = (p.e) pVar;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            k.c = null;
            y yVar = eVar.c;
            if (yVar == null) {
                i = -1;
            } else {
                i = a.a[yVar.ordinal()];
            }
            if (i == 1) {
                getView().f2();
                this.e.b(eVar);
            }
        }
    }

    @Override // com.amazon.aps.iva.x10.b
    public final void U2() {
        if (this.b.c()) {
            if (this.d.invoke().booleanValue()) {
                getView().i8();
                return;
            } else {
                getView().T3();
                return;
            }
        }
        getView().Y5();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        q6();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onNewIntent(Intent intent) {
        com.amazon.aps.iva.yb0.j.f(intent, "intent");
        q6();
    }

    public final void q6() {
        boolean z;
        p pVar = k.c;
        if (pVar instanceof p.e) {
            return;
        }
        k.c = null;
        if (pVar != null) {
            boolean z2 = pVar instanceof p.d.b;
            boolean z3 = true;
            if (!z2 && !(pVar instanceof p.m) && !(pVar instanceof p.l)) {
                String str = pVar.a().a;
                boolean z4 = false;
                if (str != null && com.amazon.aps.iva.oe0.q.i0(str, "launch_source=app_widget", false)) {
                    z4 = true;
                }
                if (!z4) {
                    this.e.b(pVar);
                }
            }
            if (pVar instanceof p.q) {
                getView().W8();
            } else if (pVar instanceof p.f.b) {
                b.a.a(this.f, ((p.f) pVar).b(), com.amazon.aps.iva.no.a.DEEP_LINK, null, 12);
            } else if (pVar instanceof p.f.a) {
                getView().t(((p.f) pVar).b());
            } else if (pVar instanceof p.j) {
                getView().e3(((p.j) pVar).c);
            } else if (pVar instanceof p.h) {
                if (this.b.c()) {
                    getView().i8();
                } else {
                    getView().Uf();
                }
            } else if (pVar instanceof p.i) {
                getView().p2();
            } else if (pVar instanceof p.C0173p) {
                if (!this.c.invoke().booleanValue()) {
                    j.a.a(this.g, null, 3);
                }
            } else if (pVar instanceof p.n) {
                getView().Lb(com.amazon.aps.iva.cg.c.SIMULCAST, null);
            } else if (pVar instanceof p.k) {
                getView().E7(((p.k) pVar).c);
            } else if (pVar instanceof p.c) {
                getView().Ea();
            } else if (pVar instanceof p.b.a) {
                getView().Lb(((p.b.a) pVar).b, null);
            } else if (pVar instanceof p.b.C0172b) {
                p.b.C0172b c0172b = (p.b.C0172b) pVar;
                getView().Lb(c0172b.b, c0172b.d);
            } else if (pVar instanceof p.b.c) {
                getView().Lb(((p.b.c) pVar).b, null);
            } else if (pVar instanceof p.d.a) {
                getView().be(((p.d.a) pVar).b);
            } else if (pVar instanceof p.a) {
                getView().d7(((p.a) pVar).c);
            } else if (pVar instanceof p.g) {
                getView().I8(((p.g) pVar).c);
            } else if (pVar instanceof p.o) {
                this.h.a(null);
            } else {
                if (z2) {
                    z = true;
                } else {
                    z = pVar instanceof p.e;
                }
                if (!z) {
                    z3 = pVar instanceof p.m;
                }
                if (!z3) {
                    boolean z5 = pVar instanceof p.l;
                }
            }
            getView().R0();
        }
    }
}
