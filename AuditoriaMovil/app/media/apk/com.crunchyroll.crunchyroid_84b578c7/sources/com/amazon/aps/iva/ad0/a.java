package com.amazon.aps.iva.ad0;

import com.amazon.aps.iva.xc0.z;
import com.amazon.aps.iva.yb0.l;
/* compiled from: context.kt */
/* loaded from: classes4.dex */
public final class a extends l implements com.amazon.aps.iva.xb0.a<z> {
    public final /* synthetic */ com.amazon.aps.iva.la0.c h;
    public final /* synthetic */ com.amazon.aps.iva.oc0.g i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.amazon.aps.iva.la0.c cVar, com.amazon.aps.iva.oc0.g gVar) {
        super(0);
        this.h = cVar;
        this.i = gVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final z invoke() {
        com.amazon.aps.iva.pc0.h annotations = this.i.getAnnotations();
        com.amazon.aps.iva.la0.c cVar = this.h;
        com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
        com.amazon.aps.iva.yb0.j.f(annotations, "additionalAnnotations");
        return ((c) cVar.a).q.b((z) ((com.amazon.aps.iva.kb0.e) cVar.d).getValue(), annotations);
    }
}
