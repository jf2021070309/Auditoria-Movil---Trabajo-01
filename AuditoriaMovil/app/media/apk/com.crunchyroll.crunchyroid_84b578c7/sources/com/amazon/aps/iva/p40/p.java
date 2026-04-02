package com.amazon.aps.iva.p40;

import com.amazon.aps.iva.kb0.q;
import java.util.ArrayList;
import java.util.List;
/* compiled from: SimilarViewModel.kt */
/* loaded from: classes2.dex */
public final class p extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Integer, q> {
    public final /* synthetic */ List<Integer> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ArrayList arrayList) {
        super(1);
        this.h = arrayList;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(Integer num) {
        this.h.add(Integer.valueOf(num.intValue()));
        return q.a;
    }
}
