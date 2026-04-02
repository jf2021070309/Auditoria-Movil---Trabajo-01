package com.amazon.aps.iva.i10;

import com.amazon.aps.iva.kb0.q;
import java.util.List;
/* compiled from: DownloadsFragmentPresenter.kt */
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.d10.i>, q> {
    public final /* synthetic */ i h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar) {
        super(1);
        this.h = iVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(List<? extends com.amazon.aps.iva.d10.i> list) {
        l view;
        view = this.h.getView();
        view.a();
        return q.a;
    }
}
