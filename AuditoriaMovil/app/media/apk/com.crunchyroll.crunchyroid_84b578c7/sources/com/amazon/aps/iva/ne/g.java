package com.amazon.aps.iva.ne;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.wy.j;
import com.crunchyroll.billingnotifications.cancelled.CancellationCompleteActivity;
import com.crunchyroll.billingnotifications.card.c;
/* compiled from: CancellationCompletePresenter.kt */
/* loaded from: classes.dex */
public final class g extends com.amazon.aps.iva.wy.b<h> implements f {
    public final e b;
    public final com.amazon.aps.iva.we.a c;
    public final c d;
    public final com.amazon.aps.iva.xb0.a<q> e;

    public g(e eVar, com.amazon.aps.iva.we.a aVar, c cVar, com.amazon.aps.iva.xb0.a aVar2, CancellationCompleteActivity cancellationCompleteActivity) {
        super(cancellationCompleteActivity, new j[0]);
        this.b = eVar;
        this.c = aVar;
        this.d = cVar;
        this.e = aVar2;
    }

    @Override // com.amazon.aps.iva.ne.f
    public final void c() {
        getView().close();
        this.e.invoke();
    }

    @Override // com.amazon.aps.iva.ne.f
    public final void m() {
        getView().close();
        this.e.invoke();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        c.g a = this.c.a(this.b.c);
        if (a instanceof c.e) {
            getView().O4((c.e) a);
        } else {
            getView().pf(a);
        }
        c cVar = this.d;
        cVar.c();
        cVar.w();
    }
}
