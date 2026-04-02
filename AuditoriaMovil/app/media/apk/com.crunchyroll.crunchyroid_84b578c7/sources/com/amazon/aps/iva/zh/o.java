package com.amazon.aps.iva.zh;

import java.util.List;
/* compiled from: ArtistPresenter.kt */
/* loaded from: classes.dex */
public final class o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<t, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ m h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(m mVar) {
        super(1);
        this.h = mVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(t tVar) {
        t tVar2 = tVar;
        com.amazon.aps.iva.yb0.j.f(tVar2, "uiModel");
        m mVar = this.h;
        m.q6(mVar).N();
        m.q6(mVar).G1();
        m.q6(mVar).gd(tVar2.c);
        u q6 = m.q6(mVar);
        com.amazon.aps.iva.ai.a aVar = tVar2.b;
        q6.f7(aVar);
        if (!m.q6(mVar).E()) {
            m.q6(mVar).c1(aVar.a);
        }
        List<com.amazon.aps.iva.ci.h> list = tVar2.f;
        boolean z = !list.isEmpty();
        List<com.amazon.aps.iva.ci.h> list2 = tVar2.g;
        v vVar = mVar.b;
        if (z && (!list2.isEmpty())) {
            mVar.getView().s1();
            mVar.getView().Th();
            mVar.getView().qd();
            vVar.k7();
            mVar.getView().da();
            mVar.getView().tf();
        } else if (list.isEmpty() && list2.isEmpty()) {
            mVar.getView().lb();
            mVar.getView().v2();
            if (mVar.g.isEnabled()) {
                mVar.getView().m4();
            } else {
                mVar.getView().e6();
            }
        } else {
            mVar.getView().da();
            mVar.getView().Th();
            mVar.getView().v2();
            mVar.getView().g8();
            if (!list.isEmpty()) {
                mVar.getView().M8();
                vVar.k7();
            } else {
                mVar.getView().ta();
                vVar.N6();
            }
            mVar.getView().tf();
        }
        mVar.h.c(tVar2);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
