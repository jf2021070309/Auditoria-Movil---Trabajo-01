package com.amazon.aps.iva.g0;

import android.graphics.Rect;
import android.view.View;
import com.amazon.aps.iva.s1.q;
/* compiled from: BringIntoViewResponder.android.kt */
/* loaded from: classes.dex */
public final class j implements c {
    public final /* synthetic */ com.amazon.aps.iva.u1.f b;

    public j(com.amazon.aps.iva.u1.f fVar) {
        this.b = fVar;
    }

    @Override // com.amazon.aps.iva.g0.c
    public final Object Z(q qVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.e1.e> aVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        com.amazon.aps.iva.e1.e eVar;
        View view = (View) com.amazon.aps.iva.u1.g.a(this.b, androidx.compose.ui.platform.d.f);
        long h = com.amazon.aps.iva.gd0.j.h(qVar);
        com.amazon.aps.iva.e1.e invoke = aVar.invoke();
        if (invoke != null) {
            eVar = invoke.d(h);
        } else {
            eVar = null;
        }
        if (eVar != null) {
            view.requestRectangleOnScreen(new Rect((int) eVar.a, (int) eVar.b, (int) eVar.c, (int) eVar.d), false);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
