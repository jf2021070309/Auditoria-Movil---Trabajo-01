package com.amazon.aps.iva.se0;
/* compiled from: JobSupport.kt */
/* loaded from: classes4.dex */
public final class a2 extends n1 {
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> f;

    public a2(n nVar) {
        this.f = nVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final /* bridge */ /* synthetic */ com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        q(th);
        return com.amazon.aps.iva.kb0.q.a;
    }

    @Override // com.amazon.aps.iva.se0.y
    public final void q(Throwable th) {
        this.f.resumeWith(com.amazon.aps.iva.kb0.q.a);
    }
}
