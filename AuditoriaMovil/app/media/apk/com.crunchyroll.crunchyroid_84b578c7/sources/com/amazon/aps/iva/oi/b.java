package com.amazon.aps.iva.oi;

import android.content.res.Configuration;
import com.amazon.aps.iva.el.h0;
import com.amazon.aps.iva.el.i0;
import com.amazon.aps.iva.i5.d0;
import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.rv.e;
import com.amazon.aps.iva.x50.m;
import com.amazon.aps.iva.yb0.f;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.player.presentation.playerview.PlayerViewLayout;
/* compiled from: WatchMusicLayoutPresenter.kt */
/* loaded from: classes.dex */
public final class b extends com.amazon.aps.iva.wy.b<com.amazon.aps.iva.oi.c> {
    public final com.amazon.aps.iva.rv.a b;
    public final i0 c;
    public final m d;

    /* compiled from: WatchMusicLayoutPresenter.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<h0, q> {

        /* compiled from: WatchMusicLayoutPresenter.kt */
        /* renamed from: com.amazon.aps.iva.oi.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public /* synthetic */ class C0575a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[h0.values().length];
                try {
                    iArr[h0.FULL_SCREEN_LOCKED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[h0.FULL_SCREEN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                a = iArr;
            }
        }

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(h0 h0Var) {
            int i;
            h0 h0Var2 = h0Var;
            if (h0Var2 == null) {
                i = -1;
            } else {
                i = C0575a.a[h0Var2.ordinal()];
            }
            b bVar = b.this;
            if (i != 1) {
                if (i != 2) {
                    bVar.d.a();
                    bVar.getView().D0();
                    bVar.getView().o0();
                } else {
                    bVar.d.a();
                    bVar.getView().O1();
                    bVar.getView().o0();
                }
            } else {
                bVar.d.a();
                bVar.getView().O1();
            }
            return q.a;
        }
    }

    /* compiled from: WatchMusicLayoutPresenter.kt */
    /* renamed from: com.amazon.aps.iva.oi.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0576b extends l implements com.amazon.aps.iva.xb0.l<q, q> {
        public C0576b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(q qVar) {
            j.f(qVar, "$this$observeEvent");
            b bVar = b.this;
            bVar.d.a();
            bVar.getView().D0();
            bVar.d.b(new com.amazon.aps.iva.oi.a(bVar), 3000L);
            return q.a;
        }
    }

    /* compiled from: WatchMusicLayoutPresenter.kt */
    /* loaded from: classes.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.l<q, q> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(q qVar) {
            j.f(qVar, "$this$observeEvent");
            b.this.r6();
            return q.a;
        }
    }

    /* compiled from: WatchMusicLayoutPresenter.kt */
    /* loaded from: classes.dex */
    public static final class d implements w, f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public d(a aVar) {
            this.a = aVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof w) || !(obj instanceof f)) {
                return false;
            }
            return j.a(this.a, ((f) obj).getFunctionDelegate());
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
    public b(e eVar, PlayerViewLayout playerViewLayout, m mVar, com.amazon.aps.iva.oi.c cVar) {
        super(cVar, new com.amazon.aps.iva.wy.j[0]);
        j.f(cVar, "view");
        this.b = eVar;
        this.c = playerViewLayout;
        this.d = mVar;
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onConfigurationChanged(Configuration configuration) {
        this.c.jf();
        r6();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        i0 i0Var = this.c;
        i0Var.jf();
        if (!this.b.c()) {
            d0.a(i0Var.getSizeState()).e(getView(), new d(new a()));
            com.amazon.aps.iva.ez.e.a(i0Var.getExitFullscreenByTapEvent(), getView(), new C0576b());
        }
        com.amazon.aps.iva.ez.e.a(i0Var.getFullScreenToggledEvent(), getView(), new c());
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onResume() {
        r6();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onStop() {
        this.d.a();
    }

    public final void r6() {
        if (getView().D()) {
            getView().l1();
            getView().T0();
            getView().Jd();
            getView().y2();
            return;
        }
        com.amazon.aps.iva.rv.a aVar = this.b;
        if (aVar.c()) {
            if (aVar.S0()) {
                getView().M1();
                getView().S1();
            } else {
                getView().f1();
                getView().h1();
            }
        } else {
            getView().f1();
            getView().h1();
        }
        getView().m1();
    }
}
