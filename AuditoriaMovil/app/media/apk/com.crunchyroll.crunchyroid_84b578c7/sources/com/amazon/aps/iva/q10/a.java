package com.amazon.aps.iva.q10;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.q10.e;
import com.amazon.aps.iva.yb0.l;
/* compiled from: SubgenreCarouselAdapter.kt */
/* loaded from: classes2.dex */
public final class a extends l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ d h;
    public final /* synthetic */ e i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, e eVar, int i) {
        super(0);
        this.h = dVar;
        this.i = eVar;
        this.j = i;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        this.h.d.invoke(((e.c) this.i).a, Integer.valueOf(this.j));
        return q.a;
    }
}
