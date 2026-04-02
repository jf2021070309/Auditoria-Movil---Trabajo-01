package com.amazon.aps.iva.vt;

import com.amazon.aps.iva.m70.a;
/* compiled from: CommentsPresenter.kt */
/* loaded from: classes2.dex */
public final class p extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ l h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(l lVar) {
        super(1);
        this.h = lVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Integer num) {
        int intValue = num.intValue();
        l lVar = this.h;
        if (intValue == 0) {
            l.q6(lVar).h();
        } else if (lVar.getView().j1() instanceof a.C0505a) {
            lVar.getView().i();
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
