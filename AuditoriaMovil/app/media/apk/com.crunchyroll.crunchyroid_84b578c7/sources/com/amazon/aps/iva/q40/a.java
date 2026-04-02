package com.amazon.aps.iva.q40;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.uz.h;
import com.amazon.aps.iva.yb0.l;
/* compiled from: SimilarAdapter.kt */
/* loaded from: classes2.dex */
public final class a extends l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ d h;
    public final /* synthetic */ h.c.C0774c i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, h.c.C0774c c0774c, int i) {
        super(0);
        this.h = dVar;
        this.i = c0774c;
        this.j = i;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        this.h.c.invoke(this.i.c, Integer.valueOf(this.j));
        return q.a;
    }
}
