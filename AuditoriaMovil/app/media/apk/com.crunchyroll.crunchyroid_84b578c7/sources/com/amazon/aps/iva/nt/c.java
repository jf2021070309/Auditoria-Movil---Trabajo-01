package com.amazon.aps.iva.nt;

import android.view.View;
import com.amazon.aps.iva.kb0.q;
import com.ellation.crunchyroll.model.Panel;
/* compiled from: CardOverflowMenuProvider.kt */
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<View, q> {
    public final /* synthetic */ a h;
    public final /* synthetic */ Panel i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, Panel panel) {
        super(1);
        this.h = aVar;
        this.i = panel;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(View view) {
        com.amazon.aps.iva.yb0.j.f(view, "it");
        this.h.c.invoke(this.i);
        return q.a;
    }
}
