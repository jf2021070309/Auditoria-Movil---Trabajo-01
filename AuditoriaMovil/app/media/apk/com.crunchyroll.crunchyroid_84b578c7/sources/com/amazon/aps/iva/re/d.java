package com.amazon.aps.iva.re;

import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.k50.l;
import com.amazon.aps.iva.k50.m;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.me.j;
import com.amazon.aps.iva.yb0.f;
import com.crunchyroll.billingnotifications.ingrace.cta.InGraceFeedButton;
/* compiled from: InGraceFeedButtonPresenter.kt */
/* loaded from: classes.dex */
public final class d extends com.amazon.aps.iva.wy.b<e> implements c {
    public final com.amazon.aps.iva.re.a b;
    public final com.amazon.aps.iva.ve.e c;
    public final j d;
    public final l e;

    /* compiled from: InGraceFeedButtonPresenter.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Boolean, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(Boolean bool) {
            Boolean bool2 = bool;
            d dVar = d.this;
            e view = dVar.getView();
            com.amazon.aps.iva.yb0.j.e(bool2, "isInGrace");
            boolean booleanValue = bool2.booleanValue();
            if (dVar.d.x()) {
                if (booleanValue && dVar.c.k3()) {
                    view.eb();
                } else {
                    view.Be();
                }
            }
            return q.a;
        }
    }

    /* compiled from: InGraceFeedButtonPresenter.kt */
    /* loaded from: classes.dex */
    public static final class b implements w, f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public b(a aVar) {
            this.a = aVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof w) || !(obj instanceof f)) {
                return false;
            }
            return com.amazon.aps.iva.yb0.j.a(this.a, ((f) obj).getFunctionDelegate());
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

    public d(InGraceFeedButton inGraceFeedButton, com.amazon.aps.iva.re.b bVar, com.amazon.aps.iva.ve.e eVar, j jVar, m mVar) {
        super(inGraceFeedButton, new com.amazon.aps.iva.wy.j[0]);
        this.b = bVar;
        this.c = eVar;
        this.d = jVar;
        this.e = mVar;
    }

    @Override // com.amazon.aps.iva.re.c
    public final void I(com.amazon.aps.iva.fs.b bVar) {
        this.b.a(bVar);
        this.e.a();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        this.c.r2().e(getView(), new b(new a()));
    }
}
