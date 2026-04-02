package com.amazon.aps.iva.d10;

import com.amazon.aps.iva.d10.k;
import java.util.List;
/* compiled from: DownloadedPanelsInteractor.kt */
/* loaded from: classes2.dex */
public final class m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<k.a, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ List<i> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(List<i> list) {
        super(1);
        this.h = list;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(k.a aVar) {
        k.a aVar2 = aVar;
        com.amazon.aps.iva.yb0.j.f(aVar2, "$this$notify");
        aVar2.a.invoke(this.h);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
