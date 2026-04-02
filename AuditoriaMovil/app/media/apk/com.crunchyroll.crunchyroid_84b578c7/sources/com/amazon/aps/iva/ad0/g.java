package com.amazon.aps.iva.ad0;

import com.amazon.aps.iva.bd0.z;
import com.amazon.aps.iva.ed0.x;
import com.amazon.aps.iva.ed0.y;
import com.amazon.aps.iva.oc0.k;
import com.amazon.aps.iva.oc0.y0;
import com.amazon.aps.iva.yb0.l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
/* compiled from: resolvers.kt */
/* loaded from: classes4.dex */
public final class g implements j {
    public final com.amazon.aps.iva.la0.c a;
    public final k b;
    public final int c;
    public final LinkedHashMap d;
    public final com.amazon.aps.iva.de0.h<x, z> e;

    /* compiled from: resolvers.kt */
    /* loaded from: classes4.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<x, z> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final z invoke(x xVar) {
            x xVar2 = xVar;
            com.amazon.aps.iva.yb0.j.f(xVar2, "typeParameter");
            g gVar = g.this;
            Integer num = (Integer) gVar.d.get(xVar2);
            if (num != null) {
                int intValue = num.intValue();
                com.amazon.aps.iva.la0.c cVar = gVar.a;
                com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
                com.amazon.aps.iva.la0.c cVar2 = new com.amazon.aps.iva.la0.c((c) cVar.a, gVar, (com.amazon.aps.iva.kb0.e) cVar.c);
                k kVar = gVar.b;
                return new z(b.b(cVar2, kVar.getAnnotations()), xVar2, gVar.c + intValue, kVar);
            }
            return null;
        }
    }

    public g(com.amazon.aps.iva.la0.c cVar, k kVar, y yVar, int i) {
        com.amazon.aps.iva.yb0.j.f(cVar, "c");
        com.amazon.aps.iva.yb0.j.f(kVar, "containingDeclaration");
        com.amazon.aps.iva.yb0.j.f(yVar, "typeParameterOwner");
        this.a = cVar;
        this.b = kVar;
        this.c = i;
        ArrayList<Object> typeParameters = yVar.getTypeParameters();
        com.amazon.aps.iva.yb0.j.f(typeParameters, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i2 = 0;
        for (Object obj : typeParameters) {
            linkedHashMap.put(obj, Integer.valueOf(i2));
            i2++;
        }
        this.d = linkedHashMap;
        this.e = this.a.b().h(new a());
    }

    @Override // com.amazon.aps.iva.ad0.j
    public final y0 a(x xVar) {
        com.amazon.aps.iva.yb0.j.f(xVar, "javaTypeParameter");
        z invoke = this.e.invoke(xVar);
        if (invoke == null) {
            return ((j) this.a.b).a(xVar);
        }
        return invoke;
    }
}
