package com.amazon.aps.iva.ad0;

import com.amazon.aps.iva.ed0.y;
import com.amazon.aps.iva.xc0.z;
import com.amazon.aps.iva.yb0.l;
/* compiled from: context.kt */
/* loaded from: classes4.dex */
public final class b {

    /* compiled from: context.kt */
    /* loaded from: classes4.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<z> {
        public final /* synthetic */ com.amazon.aps.iva.la0.c h;
        public final /* synthetic */ com.amazon.aps.iva.pc0.h i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.la0.c cVar, com.amazon.aps.iva.pc0.h hVar) {
            super(0);
            this.h = cVar;
            this.i = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final z invoke() {
            com.amazon.aps.iva.la0.c cVar = this.h;
            com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
            com.amazon.aps.iva.pc0.h hVar = this.i;
            com.amazon.aps.iva.yb0.j.f(hVar, "additionalAnnotations");
            return ((c) cVar.a).q.b((z) ((com.amazon.aps.iva.kb0.e) cVar.d).getValue(), hVar);
        }
    }

    public static com.amazon.aps.iva.la0.c a(com.amazon.aps.iva.la0.c cVar, com.amazon.aps.iva.oc0.g gVar, y yVar, int i) {
        j jVar;
        if ((i & 2) != 0) {
            yVar = null;
        }
        com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
        com.amazon.aps.iva.yb0.j.f(gVar, "containingDeclaration");
        com.amazon.aps.iva.kb0.e a2 = com.amazon.aps.iva.kb0.f.a(com.amazon.aps.iva.kb0.g.NONE, new com.amazon.aps.iva.ad0.a(cVar, gVar));
        c cVar2 = (c) cVar.a;
        if (yVar != null) {
            jVar = new g(cVar, gVar, yVar, 0);
        } else {
            jVar = (j) cVar.b;
        }
        return new com.amazon.aps.iva.la0.c(cVar2, jVar, a2);
    }

    public static final com.amazon.aps.iva.la0.c b(com.amazon.aps.iva.la0.c cVar, com.amazon.aps.iva.pc0.h hVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
        com.amazon.aps.iva.yb0.j.f(hVar, "additionalAnnotations");
        if (!hVar.isEmpty()) {
            return new com.amazon.aps.iva.la0.c((c) cVar.a, (j) cVar.b, com.amazon.aps.iva.kb0.f.a(com.amazon.aps.iva.kb0.g.NONE, new a(cVar, hVar)));
        }
        return cVar;
    }
}
