package com.amazon.aps.iva.ve0;
/* compiled from: Builders.kt */
/* loaded from: classes4.dex */
public class c<T> extends com.amazon.aps.iva.we0.f<T> {
    public final com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.ue0.q<? super T>, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> e;

    /* JADX WARN: Multi-variable type inference failed */
    public c(com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.ue0.q<? super T>, ? super com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, ? extends Object> pVar, com.amazon.aps.iva.ob0.g gVar, int i, com.amazon.aps.iva.ue0.e eVar) {
        super(gVar, i, eVar);
        this.e = pVar;
    }

    @Override // com.amazon.aps.iva.we0.f
    public final String toString() {
        return "block[" + this.e + "] -> " + super.toString();
    }
}
