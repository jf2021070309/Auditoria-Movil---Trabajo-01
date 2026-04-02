package com.amazon.aps.iva.y40;

import android.view.View;
import com.amazon.aps.iva.ab.r;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: TermsUpdatedDialog.kt */
/* loaded from: classes2.dex */
public final class b extends l implements p<View, String, q> {
    public final /* synthetic */ d h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar) {
        super(2);
        this.h = dVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(View view, String str) {
        View view2 = view;
        String str2 = str;
        j.f(view2, "view");
        j.f(str2, "text");
        this.h.c.C1(r.p(view2, str2));
        return q.a;
    }
}
