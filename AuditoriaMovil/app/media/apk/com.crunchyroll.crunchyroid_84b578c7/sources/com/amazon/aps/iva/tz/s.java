package com.amazon.aps.iva.tz;

import com.amazon.aps.iva.j8.f;
/* compiled from: BrowseAllNewestDataSource.kt */
/* loaded from: classes2.dex */
public final class s extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ r h;
    public final /* synthetic */ f.C0407f<Integer> i;
    public final /* synthetic */ f.a<Integer, com.amazon.aps.iva.uz.h> j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(r rVar, f.C0407f<Integer> c0407f, f.a<Integer, com.amazon.aps.iva.uz.h> aVar) {
        super(0);
        this.h = rVar;
        this.i = c0407f;
        this.j = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.q invoke() {
        this.h.j(this.i, this.j);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
