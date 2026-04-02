package com.amazon.aps.iva.d50;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: FavoriteTogglePresenter.kt */
/* loaded from: classes2.dex */
public final class b extends l implements com.amazon.aps.iva.xb0.l<Throwable, q> {
    public final /* synthetic */ c h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar) {
        super(1);
        this.h = cVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(Throwable th) {
        j.f(th, "it");
        c cVar = this.h;
        if (cVar.q6().d) {
            cVar.getView().showSnackbar(e.b);
        } else {
            cVar.getView().showSnackbar(f.b);
        }
        cVar.q6().d = !cVar.q6().d;
        cVar.getView().setSelected(cVar.q6().d);
        cVar.getView().setEnabled(true);
        return q.a;
    }
}
