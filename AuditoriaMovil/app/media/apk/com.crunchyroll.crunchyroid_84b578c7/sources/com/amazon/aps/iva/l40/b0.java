package com.amazon.aps.iva.l40;
/* compiled from: ShowPagePresenter.kt */
/* loaded from: classes2.dex */
public final class b0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.m00.b, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ v h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(v vVar) {
        super(1);
        this.h = vVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.m00.b bVar) {
        com.amazon.aps.iva.m00.b bVar2 = bVar;
        com.amazon.aps.iva.yb0.j.f(bVar2, "data");
        v vVar = this.h;
        if (vVar.b) {
            v.q6(vVar).uc(bVar2);
            v.q6(vVar).bi();
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
