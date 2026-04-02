package com.amazon.aps.iva.uz;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.uz.h;
import com.amazon.aps.iva.yb0.l;
/* compiled from: BrowseAllAdapter.kt */
/* loaded from: classes2.dex */
public final class a extends l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ c h;
    public final /* synthetic */ h i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i, c cVar, h hVar) {
        super(0);
        this.h = cVar;
        this.i = hVar;
        this.j = i;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        this.h.d.invoke(((h.c.a) this.i).c, Integer.valueOf(this.j));
        return q.a;
    }
}
