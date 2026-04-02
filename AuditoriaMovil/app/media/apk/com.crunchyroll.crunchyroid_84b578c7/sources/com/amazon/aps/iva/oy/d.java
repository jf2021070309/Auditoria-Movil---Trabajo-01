package com.amazon.aps.iva.oy;

import android.os.Handler;
import android.os.Looper;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.oy.a;
import com.amazon.aps.iva.q.j1;
import com.amazon.aps.iva.se0.c2;
import com.amazon.aps.iva.se0.g0;
import com.ellation.crunchyroll.application.d;
import com.google.android.play.core.install.InstallException;
import okhttp3.internal.ws.WebSocketProtocol;
/* compiled from: InAppUpdatesManager.kt */
/* loaded from: classes2.dex */
public final class d implements com.amazon.aps.iva.oy.b, f {
    public final com.amazon.aps.iva.my.a b;
    public final k c;
    public final e d;
    public final f e;
    public final com.amazon.aps.iva.xb0.a<Boolean> f;
    public final g0 g;
    public final com.amazon.aps.iva.fg.f h;
    public final com.ellation.crunchyroll.application.d i;
    public final Handler j;
    public final v<com.amazon.aps.iva.ez.d<q>> k;
    public c2 l;

    /* compiled from: InAppUpdatesManager.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.inappupdates.manager.InAppUpdatesManagerImpl$installNow$1", f = "InAppUpdatesManager.kt", l = {70}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            try {
                if (i != 0) {
                    if (i == 1) {
                        x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    x.i0(obj);
                    e eVar = d.this.d;
                    this.h = 1;
                    if (eVar.b(this) == aVar) {
                        return aVar;
                    }
                }
            } catch (InstallException e) {
                com.amazon.aps.iva.mf0.a.a.m(e);
            }
            return q.a;
        }
    }

    /* compiled from: InAppUpdatesManager.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<Boolean, q> {
        public b(d dVar) {
            super(1, dVar, d.class, "installUpdateIfAppropriate", "installUpdateIfAppropriate(Z)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            d dVar = (d) this.receiver;
            if (com.amazon.aps.iva.yb0.j.a(dVar.q4().d(), a.e.i) && !booleanValue && !dVar.f.invoke().booleanValue()) {
                dVar.I3();
            }
            return q.a;
        }
    }

    public d() {
        throw null;
    }

    public d(com.amazon.aps.iva.kx.a aVar, l lVar, p pVar, i iVar, com.amazon.aps.iva.kx.d dVar, com.amazon.aps.iva.xe0.d dVar2, com.amazon.aps.iva.fg.f fVar) {
        com.ellation.crunchyroll.application.d a2 = d.a.a();
        Handler handler = new Handler(Looper.getMainLooper());
        com.amazon.aps.iva.yb0.j.f(fVar, "syncStatusUpdateProvider");
        com.amazon.aps.iva.yb0.j.f(a2, "appLifecycle");
        this.b = aVar;
        this.c = lVar;
        this.d = pVar;
        this.e = iVar;
        this.f = dVar;
        this.g = dVar2;
        this.h = fVar;
        this.i = a2;
        this.j = handler;
        this.k = new v<>();
        a2.Lf(this);
    }

    @Override // com.amazon.aps.iva.oy.b
    public final void I3() {
        c2 c2Var = this.l;
        if (c2Var != null) {
            c2Var.a(null);
        }
        this.l = com.amazon.aps.iva.se0.i.d(this.g, null, null, new a(null), 3);
    }

    @Override // com.amazon.aps.iva.oy.b
    /* renamed from: a */
    public final v<com.amazon.aps.iva.oy.a> q4() {
        return this.e.a();
    }

    @Override // com.amazon.aps.iva.oy.b
    public final void m1() {
        com.amazon.aps.iva.se0.i.d(this.g, null, null, new c(this, WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY, null), 3);
    }

    @Override // com.amazon.aps.iva.oy.b
    public final v n4() {
        return this.k;
    }

    @Override // com.amazon.aps.iva.ys.d
    public final void onAppCreate() {
    }

    @Override // com.amazon.aps.iva.ys.d
    public final void onAppResume(boolean z) {
        if (z) {
            this.h.a(null);
            this.j.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.amazon.aps.iva.ys.d
    public final void onAppStop() {
        if (com.amazon.aps.iva.yb0.j.a(q4().d(), a.e.i)) {
            this.j.postDelayed(new j1(this, 7), com.amazon.aps.iva.gr.n.z(this.b.a()));
        }
    }

    @Override // com.amazon.aps.iva.oy.b
    public final void r5() {
        this.k.i(new com.amazon.aps.iva.ez.d<>(q.a));
    }

    @Override // com.amazon.aps.iva.oy.b
    public final void s5() {
        q4().k(a.e.i);
    }

    @Override // com.amazon.aps.iva.oy.b
    public final void u1(a.i iVar) {
        com.amazon.aps.iva.yb0.j.f(iVar, "inAppUpdateStatus");
        q4().k(a.c.i);
        this.c.a(iVar.i);
    }
}
