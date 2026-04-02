package com.amazon.aps.iva.hu;

import com.amazon.aps.iva.du.x;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import java.util.List;
/* compiled from: LocalCommentsPresenter.kt */
/* loaded from: classes2.dex */
public final class d extends l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ List<x> h;
    public final /* synthetic */ e i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(List<x> list, e eVar) {
        super(0);
        this.h = list;
        this.i = eVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        List<x> list = this.h;
        j.e(list, "comments");
        if (!l1.w(list)) {
            this.i.getView().hb();
        }
        return q.a;
    }
}
