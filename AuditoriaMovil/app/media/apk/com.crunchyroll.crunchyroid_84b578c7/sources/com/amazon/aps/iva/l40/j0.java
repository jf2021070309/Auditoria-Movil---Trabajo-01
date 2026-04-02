package com.amazon.aps.iva.l40;
/* compiled from: ShowPagePresenter.kt */
/* loaded from: classes2.dex */
public final class j0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.r40.a, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ v h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(v vVar) {
        super(1);
        this.h = vVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.r40.a aVar) {
        com.amazon.aps.iva.r40.a aVar2 = aVar;
        com.amazon.aps.iva.yb0.j.f(aVar2, "showSummary");
        v vVar = this.h;
        v.q6(vVar).G1();
        if (vVar.b) {
            v.q6(vVar).s1();
        } else {
            v.q6(vVar).v2();
        }
        v.q6(vVar).g0();
        v.q6(vVar).A5(aVar2);
        if (!v.q6(vVar).E()) {
            v.q6(vVar).c1(aVar2.a);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
