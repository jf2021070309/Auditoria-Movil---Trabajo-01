package com.amazon.aps.iva.i10;

import com.amazon.aps.iva.kb0.q;
import java.util.List;
/* compiled from: DownloadsFragmentPresenter.kt */
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.d10.i>, q> {
    public final /* synthetic */ i h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar) {
        super(1);
        this.h = iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(List<? extends com.amazon.aps.iva.d10.i> list) {
        l view;
        l view2;
        l view3;
        l view4;
        l view5;
        l view6;
        l view7;
        l view8;
        List<? extends com.amazon.aps.iva.d10.i> list2 = list;
        com.amazon.aps.iva.yb0.j.f(list2, "panels");
        i iVar = this.h;
        view = iVar.getView();
        view.b();
        if (list2.isEmpty()) {
            view5 = iVar.getView();
            view5.V7();
            view6 = iVar.getView();
            view6.eg(iVar.d.a());
            view7 = iVar.getView();
            view7.h();
            view8 = iVar.getView();
            view8.Bb();
        } else {
            view2 = iVar.getView();
            view2.L9();
            view3 = iVar.getView();
            view3.nc(list2);
            view4 = iVar.getView();
            view4.i();
        }
        return q.a;
    }
}
