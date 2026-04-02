package com.amazon.aps.iva.ei;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
/* compiled from: FeaturedMusicListAdapter.kt */
/* loaded from: classes.dex */
public final class a extends l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ d h;
    public final /* synthetic */ com.amazon.aps.iva.fi.a i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, com.amazon.aps.iva.fi.a aVar) {
        super(0);
        this.h = dVar;
        this.i = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        this.h.b.invoke(this.i);
        return q.a;
    }
}
