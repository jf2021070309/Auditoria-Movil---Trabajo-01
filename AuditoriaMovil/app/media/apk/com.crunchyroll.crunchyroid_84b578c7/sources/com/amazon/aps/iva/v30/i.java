package com.amazon.aps.iva.v30;

import com.amazon.aps.iva.kb0.q;
import java.util.List;
/* compiled from: SearchResultDetailPresenter.kt */
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.s30.h>, q> {
    public final /* synthetic */ k h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar) {
        super(1);
        this.h = kVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(List<? extends com.amazon.aps.iva.s30.h> list) {
        List<? extends com.amazon.aps.iva.s30.h> list2 = list;
        com.amazon.aps.iva.yb0.j.f(list2, "results");
        k kVar = this.h;
        k.q6(kVar).Eg();
        k.q6(kVar).e8(list2);
        k.q6(kVar).b();
        kVar.e.c();
        return q.a;
    }
}
