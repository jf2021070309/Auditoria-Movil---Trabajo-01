package com.amazon.aps.iva.f50;

import com.amazon.aps.iva.b50.f0;
import com.amazon.aps.iva.b60.k;
import com.amazon.aps.iva.b60.m;
import com.amazon.aps.iva.b60.n;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.wy.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.model.Panel;
/* compiled from: RemoveFromWatchlistPresenter.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.wy.b<c> implements com.amazon.aps.iva.f50.a {
    public final boolean b;
    public final d c;
    public final m d;

    /* compiled from: RemoveFromWatchlistPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ Panel i;
        public final /* synthetic */ e j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Panel panel, e eVar) {
            super(0);
            this.i = panel;
            this.j = eVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            b bVar = b.this;
            m mVar = bVar.d;
            e eVar = this.j;
            mVar.c(this.i, eVar.c);
            bVar.c.K7(eVar.a);
            return q.a;
        }
    }

    /* compiled from: RemoveFromWatchlistPresenter.kt */
    /* renamed from: com.amazon.aps.iva.f50.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0241b extends l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ e i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0241b(e eVar) {
            super(0);
            this.i = eVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            b.this.c.m4(this.i.a);
            return q.a;
        }
    }

    public b(com.ellation.crunchyroll.presentation.watchlist.a aVar, boolean z, f0 f0Var, n nVar) {
        super(aVar, new j[0]);
        this.b = z;
        this.c = f0Var;
        this.d = nVar;
    }

    @Override // com.amazon.aps.iva.f50.a
    public final void c2(e eVar) {
        com.amazon.aps.iva.yb0.j.f(eVar, "itemToBeRemoved");
        d dVar = this.c;
        k kVar = eVar.a;
        dVar.M4(kVar);
        Panel panel = kVar.g;
        getView().o8(panel.getMetadata().getParentTitle(), this.b, new a(panel, eVar), new C0241b(eVar));
    }
}
