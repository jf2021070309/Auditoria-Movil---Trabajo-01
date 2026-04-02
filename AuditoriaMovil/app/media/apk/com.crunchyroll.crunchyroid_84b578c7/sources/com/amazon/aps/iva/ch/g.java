package com.amazon.aps.iva.ch;

import android.app.Activity;
import com.amazon.aps.iva.dh.h;
import com.amazon.aps.iva.es.r;
import com.amazon.aps.iva.gr.n;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.t50.c;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: InAppReviewLauncherImpl.kt */
/* loaded from: classes.dex */
public final class g {
    public final com.amazon.aps.iva.dh.g a;
    public final com.amazon.aps.iva.t50.c b;
    public final com.amazon.aps.iva.ch.a c;
    public final com.amazon.aps.iva.dh.e d;
    public final com.amazon.aps.iva.ih.c e;
    public final com.amazon.aps.iva.ds.a f;

    /* compiled from: InAppReviewLauncherImpl.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<Boolean, q> {
        public final /* synthetic */ Activity i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Activity activity) {
            super(1);
            this.i = activity;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(Boolean bool) {
            Boolean bool2 = bool;
            j.e(bool2, "isEligible");
            if (bool2.booleanValue()) {
                g gVar = g.this;
                gVar.f.e(new r());
                e eVar = new e(gVar);
                f fVar = new f(com.amazon.aps.iva.mf0.a.a);
                gVar.e.f(this.i, eVar, fVar);
            }
            return q.a;
        }
    }

    /* compiled from: InAppReviewLauncherImpl.kt */
    /* loaded from: classes.dex */
    public static final class b implements w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public b(a aVar) {
            this.a = aVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof w) || !(obj instanceof com.amazon.aps.iva.yb0.f)) {
                return false;
            }
            return j.a(this.a, ((com.amazon.aps.iva.yb0.f) obj).getFunctionDelegate());
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

    public g(h hVar, com.amazon.aps.iva.ch.a aVar, com.amazon.aps.iva.dh.e eVar) {
        c.b bVar = c.b.a;
        n nVar = n.b;
        com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
        j.f(hVar, "inAppReviewStore");
        j.f(aVar, "config");
        j.f(eVar, "monitor");
        this.a = hVar;
        this.b = bVar;
        this.c = aVar;
        this.d = eVar;
        this.e = nVar;
        this.f = cVar;
    }

    public final void a(Activity activity) {
        j.f(activity, "activity");
        this.d.b().e((o) activity, new b(new a(activity)));
    }
}
