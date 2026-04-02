package com.amazon.aps.iva.nu;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
/* compiled from: CommentsCountPresenter.kt */
/* loaded from: classes2.dex */
public final class c extends l implements com.amazon.aps.iva.xb0.l<Integer, q> {
    public final /* synthetic */ d h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar) {
        super(1);
        this.h = dVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(Integer num) {
        int intValue = num.intValue();
        d dVar = this.h;
        if (intValue > 0) {
            dVar.getView().p6(dVar.b.a(intValue));
        } else {
            dVar.getView().r9();
        }
        return q.a;
    }
}
