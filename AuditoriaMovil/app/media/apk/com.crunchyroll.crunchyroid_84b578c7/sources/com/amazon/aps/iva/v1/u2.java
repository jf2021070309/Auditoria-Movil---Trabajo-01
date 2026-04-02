package com.amazon.aps.iva.v1;
/* compiled from: ViewCompositionStrategy.android.kt */
/* loaded from: classes.dex */
public final class u2 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ androidx.lifecycle.g h;
    public final /* synthetic */ androidx.lifecycle.j i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(androidx.lifecycle.g gVar, androidx.lifecycle.j jVar) {
        super(0);
        this.h = gVar;
        this.i = jVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.q invoke() {
        this.h.removeObserver(this.i);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
