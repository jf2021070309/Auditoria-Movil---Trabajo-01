package com.amazon.aps.iva.p40;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.p40.a;
/* compiled from: SimilarPresenter.kt */
/* loaded from: classes2.dex */
public final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<a, q> {
    public final /* synthetic */ h h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar) {
        super(1);
        this.h = hVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(a aVar) {
        a aVar2 = aVar;
        com.amazon.aps.iva.yb0.j.f(aVar2, "moreLikeThisShowsContainer");
        boolean z = aVar2 instanceof a.b;
        h hVar = this.h;
        if (z) {
            h.q6(hVar).V4();
        } else if (aVar2 instanceof a.C0602a) {
            h.q6(hVar).tg();
        }
        hVar.f = aVar2.a;
        h.q6(hVar).D6(hVar.f);
        h.q6(hVar).m();
        return q.a;
    }
}
