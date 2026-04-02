package com.amazon.aps.iva.s50;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
/* compiled from: ShowRatingPresenter.kt */
/* loaded from: classes2.dex */
public final class c extends l implements com.amazon.aps.iva.xb0.l<f, q> {
    public final /* synthetic */ e h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar) {
        super(1);
        this.h = eVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(f fVar) {
        f fVar2 = fVar;
        com.amazon.aps.iva.yb0.j.f(fVar2, "data");
        e eVar = this.h;
        eVar.getView().Oc();
        float f = fVar2.c;
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        float f2 = fVar2.a;
        if (i > 0) {
            eVar.getView().ka(f);
            if (eVar.getView().Re()) {
                eVar.getView().je();
            } else {
                eVar.getView().s6();
            }
        } else {
            eVar.getView().M9(f2);
            eVar.getView().je();
        }
        eVar.getView().Lh();
        eVar.r6();
        if (f2 > 0.0f) {
            eVar.r6();
            eVar.getView().wd(String.valueOf(f2));
            eVar.getView().Tc(eVar.c.b(fVar2.b));
        } else {
            eVar.getView().r3();
            eVar.getView().Mf();
        }
        return q.a;
    }
}
