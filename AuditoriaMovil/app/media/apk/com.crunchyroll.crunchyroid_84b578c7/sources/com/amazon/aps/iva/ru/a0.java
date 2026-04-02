package com.amazon.aps.iva.ru;

import com.amazon.aps.iva.m70.a;
/* compiled from: CommentRepliesPresenter.kt */
/* loaded from: classes2.dex */
public final class a0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ w h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(w wVar) {
        super(1);
        this.h = wVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Integer num) {
        int intValue = num.intValue();
        w wVar = this.h;
        if (intValue == 0) {
            w.q6(wVar).h();
        } else if (wVar.getView().j1() instanceof a.C0505a) {
            wVar.getView().i();
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
