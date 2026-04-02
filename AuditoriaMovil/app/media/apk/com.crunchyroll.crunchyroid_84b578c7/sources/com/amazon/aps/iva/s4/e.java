package com.amazon.aps.iva.s4;

import android.os.Build;
import com.amazon.aps.iva.lb0.i0;
import com.amazon.aps.iva.q4.c;
/* compiled from: ApplyAction.kt */
/* loaded from: classes.dex */
public final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.q4.c, com.amazon.aps.iva.q4.c> {
    public final /* synthetic */ h h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar) {
        super(1);
        this.h = hVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.q4.c invoke(com.amazon.aps.iva.q4.c cVar) {
        com.amazon.aps.iva.q4.c cVar2 = cVar;
        com.amazon.aps.iva.yb0.j.f(cVar2, "params");
        if (Build.VERSION.SDK_INT < 31) {
            com.amazon.aps.iva.q4.d dVar = new com.amazon.aps.iva.q4.d(i0.b0(cVar2.a()));
            c.a<Boolean> aVar = u.a;
            this.h.getClass();
            dVar.d(aVar, Boolean.TRUE);
            return dVar;
        }
        return cVar2;
    }
}
