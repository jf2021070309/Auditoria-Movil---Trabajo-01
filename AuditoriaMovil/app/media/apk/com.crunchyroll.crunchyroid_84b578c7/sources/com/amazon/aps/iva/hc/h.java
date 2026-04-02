package com.amazon.aps.iva.hc;

import android.graphics.drawable.Drawable;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.se0.r0;
/* compiled from: GlideModifier.kt */
/* loaded from: classes.dex */
public final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ e h;
    public final /* synthetic */ com.amazon.aps.iva.ec.f<Drawable> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(e eVar, com.amazon.aps.iva.ec.f<Drawable> fVar) {
        super(0);
        this.h = eVar;
        this.i = fVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        boolean z;
        e eVar = this.h;
        com.amazon.aps.iva.ec.f<Drawable> fVar = eVar.o;
        if (fVar != null) {
            com.amazon.aps.iva.ec.f<Drawable> fVar2 = this.i;
            if (com.amazon.aps.iva.yb0.j.a(fVar, fVar2)) {
                if (eVar.w == null) {
                    z = true;
                } else {
                    z = false;
                }
                defpackage.i.k(z, "");
                g0 i1 = eVar.i1();
                com.amazon.aps.iva.ye0.c cVar = r0.a;
                eVar.w = com.amazon.aps.iva.se0.i.d(new com.amazon.aps.iva.xe0.d(i1.getCoroutineContext().plus(com.amazon.aps.iva.xe0.k.a.C())), null, null, new g(eVar, fVar2, null), 3);
            }
            return q.a;
        }
        com.amazon.aps.iva.yb0.j.m("requestBuilder");
        throw null;
    }
}
