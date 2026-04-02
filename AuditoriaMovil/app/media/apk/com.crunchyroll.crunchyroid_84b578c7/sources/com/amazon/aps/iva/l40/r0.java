package com.amazon.aps.iva.l40;
/* compiled from: ShowPagePresenter.kt */
/* loaded from: classes2.dex */
public final class r0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<f, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ v h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(v vVar) {
        super(1);
        this.h = vVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(f fVar) {
        String str;
        f fVar2 = fVar;
        com.amazon.aps.iva.yb0.j.f(fVar2, "seasons");
        v vVar = this.h;
        if (!vVar.b && (str = vVar.f) != null) {
            v.q6(vVar).K8(str);
        }
        if (!fVar2.b.isEmpty() && vVar.b) {
            v.q6(vVar).L6();
        } else {
            v.q6(vVar).y6();
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
