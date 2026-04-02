package com.crunchyroll.billingnotifications.card;

import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.k50.l;
import com.amazon.aps.iva.k50.m;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.me.j;
import com.amazon.aps.iva.yb0.f;
import com.crunchyroll.billingnotifications.card.c;
/* compiled from: BillingNotificationCardPresenter.kt */
/* loaded from: classes.dex */
public final class b extends com.amazon.aps.iva.wy.b<com.amazon.aps.iva.oe.c> {
    public final com.amazon.aps.iva.ve.e b;
    public final j c;
    public final com.amazon.aps.iva.oe.a d;
    public final com.amazon.aps.iva.t50.c e;
    public final com.amazon.aps.iva.we.a f;
    public final l g;
    public c h;

    /* compiled from: BillingNotificationCardPresenter.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Boolean, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(Boolean bool) {
            c.f fVar;
            Boolean bool2 = bool;
            b bVar = b.this;
            long time = bVar.b.n5().getTime() - bVar.e.a();
            com.amazon.aps.iva.yb0.j.e(bool2, "isInGrace");
            if (bool2.booleanValue()) {
                if (bVar.c.Z()) {
                    fVar = bVar.f.a(time);
                } else {
                    fVar = c.b.c;
                }
                bVar.h = new d(fVar);
                com.amazon.aps.iva.oe.c q6 = b.q6(bVar);
                c cVar = bVar.h;
                if (cVar != null) {
                    q6.L3(cVar);
                    b.q6(bVar).show();
                } else {
                    com.amazon.aps.iva.yb0.j.m("uiModel");
                    throw null;
                }
            } else {
                b.q6(bVar).hide();
            }
            return q.a;
        }
    }

    /* compiled from: BillingNotificationCardPresenter.kt */
    /* renamed from: com.crunchyroll.billingnotifications.card.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0952b implements w, f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public C0952b(com.amazon.aps.iva.xb0.l lVar) {
            this.a = lVar;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(j jVar, com.amazon.aps.iva.oe.b bVar, com.amazon.aps.iva.oe.c cVar, com.amazon.aps.iva.ve.e eVar, com.amazon.aps.iva.we.a aVar, m mVar, com.amazon.aps.iva.t50.c cVar2) {
        super(cVar, new com.amazon.aps.iva.wy.j[0]);
        com.amazon.aps.iva.yb0.j.f(cVar, "view");
        this.b = eVar;
        this.c = jVar;
        this.d = bVar;
        this.e = cVar2;
        this.f = aVar;
        this.g = mVar;
    }

    public static final /* synthetic */ com.amazon.aps.iva.oe.c q6(b bVar) {
        return bVar.getView();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        j jVar = this.c;
        boolean B = jVar.B();
        com.amazon.aps.iva.ve.e eVar = this.b;
        if (B) {
            eVar.r2().e(getView(), new C0952b(new a()));
        }
        if (jVar.V()) {
            eVar.x7().e(getView(), new C0952b(new com.crunchyroll.billingnotifications.card.a(this)));
        }
    }
}
