package com.amazon.aps.iva.be0;

import com.amazon.aps.iva.ae0.e;
import com.amazon.aps.iva.ae0.s;
import com.amazon.aps.iva.ae0.t;
import com.amazon.aps.iva.be0.c;
import com.amazon.aps.iva.fc0.f;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.lc0.o;
import com.amazon.aps.iva.oc0.c0;
import com.amazon.aps.iva.oc0.g0;
import com.amazon.aps.iva.oc0.h0;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.e0;
import com.amazon.aps.iva.yb0.h;
import com.amazon.aps.iva.yb0.j;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
/* compiled from: BuiltInsLoaderImpl.kt */
/* loaded from: classes4.dex */
public final class b implements com.amazon.aps.iva.lc0.a {
    public final d b = new d();

    /* compiled from: BuiltInsLoaderImpl.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a extends h implements l<String, InputStream> {
        public a(d dVar) {
            super(1, dVar);
        }

        @Override // com.amazon.aps.iva.yb0.b, com.amazon.aps.iva.fc0.c
        public final String getName() {
            return "loadResource";
        }

        @Override // com.amazon.aps.iva.yb0.b
        public final f getOwner() {
            return e0.a(d.class);
        }

        @Override // com.amazon.aps.iva.yb0.b
        public final String getSignature() {
            return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final InputStream invoke(String str) {
            String str2 = str;
            j.f(str2, "p0");
            ((d) this.receiver).getClass();
            return d.a(str2);
        }
    }

    @Override // com.amazon.aps.iva.lc0.a
    public g0 a(com.amazon.aps.iva.de0.l lVar, c0 c0Var, Iterable<? extends com.amazon.aps.iva.qc0.b> iterable, com.amazon.aps.iva.qc0.c cVar, com.amazon.aps.iva.qc0.a aVar, boolean z) {
        j.f(lVar, "storageManager");
        j.f(c0Var, "builtInsModule");
        j.f(iterable, "classDescriptorFactories");
        j.f(cVar, "platformDependentDeclarationFilter");
        j.f(aVar, "additionalClassPartsProvider");
        Set<com.amazon.aps.iva.nd0.c> set = o.p;
        a aVar2 = new a(this.b);
        j.f(set, "packageFqNames");
        Set<com.amazon.aps.iva.nd0.c> set2 = set;
        ArrayList arrayList = new ArrayList(r.Y(set2));
        for (com.amazon.aps.iva.nd0.c cVar2 : set2) {
            com.amazon.aps.iva.be0.a.q.getClass();
            String a2 = com.amazon.aps.iva.be0.a.a(cVar2);
            InputStream inputStream = (InputStream) aVar2.invoke(a2);
            if (inputStream != null) {
                arrayList.add(c.a.a(cVar2, lVar, c0Var, inputStream, z));
            } else {
                throw new IllegalStateException(com.amazon.aps.iva.oa.a.a("Resource not found in classpath: ", a2));
            }
        }
        h0 h0Var = new h0(arrayList);
        com.amazon.aps.iva.oc0.e0 e0Var = new com.amazon.aps.iva.oc0.e0(lVar, c0Var);
        com.amazon.aps.iva.ae0.o oVar = new com.amazon.aps.iva.ae0.o(h0Var);
        com.amazon.aps.iva.be0.a aVar3 = com.amazon.aps.iva.be0.a.q;
        com.amazon.aps.iva.ae0.l lVar2 = new com.amazon.aps.iva.ae0.l(lVar, c0Var, oVar, new e(c0Var, e0Var, aVar3), h0Var, s.a, t.a.a, iterable, e0Var, aVar, cVar, aVar3.a, null, new com.amazon.aps.iva.wd0.b(lVar), null, 851968);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((c) it.next()).G0(lVar2);
        }
        return h0Var;
    }
}
