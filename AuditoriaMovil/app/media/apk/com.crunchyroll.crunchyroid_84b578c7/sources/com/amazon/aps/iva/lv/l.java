package com.amazon.aps.iva.lv;

import com.amazon.aps.iva.lb0.z;
import java.util.List;
/* compiled from: CrunchylistsPresenter.kt */
/* loaded from: classes2.dex */
public final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.yu.x, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ o h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar) {
        super(1);
        this.h = oVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.yu.x xVar) {
        v view;
        com.amazon.aps.iva.yu.x xVar2 = xVar;
        com.amazon.aps.iva.yb0.j.f(xVar2, "data");
        o oVar = this.h;
        view = oVar.getView();
        view.x0();
        oVar.getView().d4();
        List<com.amazon.aps.iva.nv.b> list = xVar2.a;
        if (list.isEmpty()) {
            oVar.getView().h();
            oVar.getView().L();
            oVar.getView().W();
            oVar.getView().R6();
            oVar.getView().U();
            oVar.getView().T1(z.b);
        } else {
            oVar.getView().i();
            oVar.getView().T();
            int size = list.size();
            int i = xVar2.b;
            oVar.getView().d1(size, i);
            oVar.getView().T1(list);
            if (list.size() == i) {
                oVar.getView().Fe();
            } else {
                oVar.getView().B9();
            }
        }
        oVar.f.c();
        return com.amazon.aps.iva.kb0.q.a;
    }
}
