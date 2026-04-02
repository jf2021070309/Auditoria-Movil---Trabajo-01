package com.amazon.aps.iva.hy;

import android.view.View;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.amazon.aps.iva.yx.g;
/* compiled from: ContinueWatchingOverflowMenuProvider.kt */
/* loaded from: classes2.dex */
public final class d extends l implements com.amazon.aps.iva.xb0.l<View, q> {
    public final /* synthetic */ e h;
    public final /* synthetic */ g i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, g gVar) {
        super(1);
        this.h = eVar;
        this.i = gVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(View view) {
        j.f(view, "it");
        this.h.b.r0(this.i.a.getId());
        return q.a;
    }
}
