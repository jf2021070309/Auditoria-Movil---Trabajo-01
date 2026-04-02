package com.amazon.aps.iva.k2;

import android.graphics.Typeface;
import com.amazon.aps.iva.h2.q0;
import com.amazon.aps.iva.h2.t;
import com.amazon.aps.iva.h2.u;
import com.amazon.aps.iva.h2.y;
import com.amazon.aps.iva.xb0.r;
import com.amazon.aps.iva.yb0.l;
/* compiled from: AndroidParagraphIntrinsics.android.kt */
/* loaded from: classes.dex */
public final class c extends l implements r<com.amazon.aps.iva.h2.k, y, t, u, Typeface> {
    public final /* synthetic */ d h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar) {
        super(4);
        this.h = dVar;
    }

    @Override // com.amazon.aps.iva.xb0.r
    public final Typeface K(com.amazon.aps.iva.h2.k kVar, y yVar, t tVar, u uVar) {
        y yVar2 = yVar;
        int i = tVar.a;
        int i2 = uVar.a;
        com.amazon.aps.iva.yb0.j.f(yVar2, "fontWeight");
        d dVar = this.h;
        q0 a = dVar.e.a(kVar, yVar2, i, i2);
        if (!(a instanceof q0.b)) {
            j jVar = new j(a, dVar.j);
            dVar.j = jVar;
            Object obj = jVar.c;
            com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type android.graphics.Typeface");
            return (Typeface) obj;
        }
        Object value = a.getValue();
        com.amazon.aps.iva.yb0.j.d(value, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) value;
    }
}
