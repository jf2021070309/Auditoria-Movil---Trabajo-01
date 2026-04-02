package com.amazon.aps.iva.dp;

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
/* compiled from: WatchScreenLayoutPresenter.kt */
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.wy.b<com.amazon.aps.iva.dp.d> {
    public final com.amazon.aps.iva.rv.a b;
    public final i0 c;
    public final m d;

    /* compiled from: WatchScreenLayoutPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<h0, q> {

        /* compiled from: WatchScreenLayoutPresenter.kt */
        /* renamed from: com.amazon.aps.iva.dp.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0203a {
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
                i = C0203a.a[h0Var2.ordinal()];
            }
            c cVar = c.this;
            if (i != 1) {
                if (i != 2) {
                    cVar.d.a();
                    cVar.getView().D0();
                    cVar.getView().o0();
                } else {
                    cVar.d.a();
                    cVar.getView().O1();
                    cVar.getView().o0();
                }
            } else {
                cVar.d.a();
                cVar.getView().O1();
            }
            return q.a;
        }
    }

    /* compiled from: WatchScreenLayoutPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<q, q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(q qVar) {
            j.f(qVar, "$this$observeEvent");
            c cVar = c.this;
            cVar.d.a();
            cVar.getView().D0();
            cVar.d.b(new com.amazon.aps.iva.dp.b(cVar), 3000L);
            return q.a;
        }
    }

    /* compiled from: WatchScreenLayoutPresenter.kt */
    /* renamed from: com.amazon.aps.iva.dp.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0204c extends l implements com.amazon.aps.iva.xb0.l<q, q> {
        public C0204c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(q qVar) {
            j.f(qVar, "$this$observeEvent");
            c.this.r6();
            return q.a;
        }
    }

    /* compiled from: WatchScreenLayoutPresenter.kt */
    /* loaded from: classes2.dex */
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
    public c(e eVar, PlayerViewLayout playerViewLayout, m mVar, com.amazon.aps.iva.dp.d dVar) {
        super(dVar, new com.amazon.aps.iva.wy.j[0]);
        j.f(dVar, "view");
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
            com.amazon.aps.iva.ez.e.a(i0Var.getExitFullscreenByTapEvent(), getView(), new b());
        }
        com.amazon.aps.iva.ez.e.a(i0Var.getFullScreenToggledEvent(), getView(), new C0204c());
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
        getView().S2(getView().D());
        if (getView().D()) {
            getView().l1();
            getView().T0();
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
