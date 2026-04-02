package com.amazon.aps.iva.me;

import android.content.Context;
import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ve.g;
import com.amazon.aps.iva.ve.i;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xb0.p;
/* compiled from: BillingNotificationLauncher.kt */
/* loaded from: classes.dex */
public final class h {
    public final j a;
    public final com.amazon.aps.iva.ve.b b;
    public final p<Context, com.amazon.aps.iva.qe.d, q> c;
    public final p<androidx.fragment.app.h, com.amazon.aps.iva.ue.g, q> d;
    public final p<androidx.fragment.app.h, com.amazon.aps.iva.ne.e, q> e;
    public final l<androidx.fragment.app.h, q> f;
    public final com.amazon.aps.iva.ve.e g;

    /* compiled from: BillingNotificationLauncher.kt */
    /* loaded from: classes.dex */
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

    /* compiled from: BillingNotificationLauncher.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements l<com.amazon.aps.iva.ez.d<? extends com.amazon.aps.iva.ve.g>, q> {
        public final /* synthetic */ androidx.fragment.app.h i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.fragment.app.h hVar) {
            super(1);
            this.i = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.ez.d<? extends com.amazon.aps.iva.ve.g> dVar) {
            com.amazon.aps.iva.ve.g a = dVar.a();
            boolean z = a instanceof g.b;
            androidx.fragment.app.h hVar = this.i;
            h hVar2 = h.this;
            if (z) {
                if (hVar2.a.B()) {
                    hVar2.c.invoke(hVar, new com.amazon.aps.iva.qe.i(((g.b) a).a, hVar2.a.Z()));
                    hVar2.g.h2(true);
                }
            } else if ((a instanceof g.a) && hVar2.a.B()) {
                j jVar = hVar2.a;
                if (jVar.Z()) {
                    hVar2.c.invoke(hVar, new com.amazon.aps.iva.qe.h(((g.a) a).a, jVar.Z()));
                    hVar2.g.T0(true);
                }
            }
            return q.a;
        }
    }

    /* compiled from: BillingNotificationLauncher.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements l<com.amazon.aps.iva.ez.d<? extends com.amazon.aps.iva.ve.i>, q> {
        public final /* synthetic */ androidx.fragment.app.h i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(androidx.fragment.app.h hVar) {
            super(1);
            this.i = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.ez.d<? extends com.amazon.aps.iva.ve.i> dVar) {
            com.amazon.aps.iva.ve.i a = dVar.a();
            boolean z = a instanceof i.b;
            androidx.fragment.app.h hVar = this.i;
            h hVar2 = h.this;
            if (z) {
                if (hVar2.a.V()) {
                    hVar2.d.invoke(hVar, new com.amazon.aps.iva.ue.b(((i.b) a).a));
                    hVar2.g.Y7(true);
                }
            } else if ((a instanceof i.a) && hVar2.a.V()) {
                hVar2.d.invoke(hVar, new com.amazon.aps.iva.ue.a(((i.a) a).a));
                hVar2.g.r6(true);
            }
            return q.a;
        }
    }

    /* compiled from: BillingNotificationLauncher.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements l<com.amazon.aps.iva.ez.d<? extends Boolean>, q> {
        public final /* synthetic */ androidx.fragment.app.h i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(androidx.fragment.app.h hVar) {
            super(1);
            this.i = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.ez.d<? extends Boolean> dVar) {
            h hVar = h.this;
            if (hVar.a.a0()) {
                hVar.f.invoke(this.i);
                hVar.g.K3(true);
            }
            return q.a;
        }
    }

    /* compiled from: BillingNotificationLauncher.kt */
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements l<com.amazon.aps.iva.ve.f, q> {
        public final /* synthetic */ androidx.fragment.app.h i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(androidx.fragment.app.h hVar) {
            super(1);
            this.i = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.ve.f fVar) {
            com.amazon.aps.iva.ve.f fVar2 = fVar;
            com.amazon.aps.iva.yb0.j.f(fVar2, "$this$observeEvent");
            h hVar = h.this;
            hVar.e.invoke(this.i, new com.amazon.aps.iva.ne.e(fVar2.a, fVar2.b));
            hVar.g.Q4(true);
            return q.a;
        }
    }

    public h(j jVar, com.amazon.aps.iva.ve.b bVar, com.amazon.aps.iva.ve.e eVar, l lVar, p pVar, p pVar2, p pVar3) {
        this.a = jVar;
        this.b = bVar;
        this.c = pVar;
        this.d = pVar2;
        this.e = pVar3;
        this.f = lVar;
        this.g = eVar;
    }

    public final void a(androidx.fragment.app.h hVar, com.amazon.aps.iva.u70.j jVar) {
        this.b.g().e(hVar, new a(new i(this, jVar)));
    }

    public final void b(androidx.fragment.app.h hVar) {
        com.amazon.aps.iva.ve.b bVar = this.b;
        bVar.n().e(hVar, new a(new b(hVar)));
        bVar.j().e(hVar, new a(new c(hVar)));
        bVar.i().e(hVar, new a(new d(hVar)));
    }

    public final void c(androidx.fragment.app.h hVar) {
        com.amazon.aps.iva.ez.e.a(this.b.m(), hVar, new e(hVar));
    }
}
