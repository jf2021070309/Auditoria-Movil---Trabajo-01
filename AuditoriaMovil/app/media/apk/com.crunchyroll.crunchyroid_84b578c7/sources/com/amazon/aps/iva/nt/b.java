package com.amazon.aps.iva.nt;

import android.view.View;
import com.amazon.aps.iva.ab.r;
import com.amazon.aps.iva.kb0.q;
import com.ellation.crunchyroll.model.Panel;
/* compiled from: CardOverflowMenuProvider.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<View, q> {
    public final /* synthetic */ a h;
    public final /* synthetic */ Panel i;
    public final /* synthetic */ o j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, Panel panel, o oVar) {
        super(1);
        this.h = aVar;
        this.i = panel;
        this.j = oVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(View view) {
        View view2 = view;
        com.amazon.aps.iva.yb0.j.f(view2, "clickedView");
        this.h.a.invoke(this.i, this.j, r.p(view2, null));
        return q.a;
    }
}
