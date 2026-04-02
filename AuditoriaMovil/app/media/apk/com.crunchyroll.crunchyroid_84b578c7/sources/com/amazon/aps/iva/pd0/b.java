package com.amazon.aps.iva.pd0;

import com.amazon.aps.iva.lb0.j0;
import com.amazon.aps.iva.oc0.f0;
import com.amazon.aps.iva.oc0.y0;
import java.util.ArrayList;
/* compiled from: ClassifierNamePolicy.kt */
/* loaded from: classes4.dex */
public interface b {

    /* compiled from: ClassifierNamePolicy.kt */
    /* loaded from: classes4.dex */
    public static final class a implements b {
        public static final a a = new a();

        @Override // com.amazon.aps.iva.pd0.b
        public final String a(com.amazon.aps.iva.oc0.h hVar, com.amazon.aps.iva.pd0.c cVar) {
            com.amazon.aps.iva.yb0.j.f(cVar, "renderer");
            if (hVar instanceof y0) {
                com.amazon.aps.iva.nd0.f name = ((y0) hVar).getName();
                com.amazon.aps.iva.yb0.j.e(name, "classifier.name");
                return cVar.t(name, false);
            }
            com.amazon.aps.iva.nd0.d g = com.amazon.aps.iva.qd0.i.g(hVar);
            com.amazon.aps.iva.yb0.j.e(g, "getFqName(classifier)");
            return cVar.s(g);
        }
    }

    /* compiled from: ClassifierNamePolicy.kt */
    /* renamed from: com.amazon.aps.iva.pd0.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0610b implements b {
        public static final C0610b a = new C0610b();

        @Override // com.amazon.aps.iva.pd0.b
        public final String a(com.amazon.aps.iva.oc0.h hVar, com.amazon.aps.iva.pd0.c cVar) {
            boolean z;
            com.amazon.aps.iva.yb0.j.f(cVar, "renderer");
            if (hVar instanceof y0) {
                com.amazon.aps.iva.nd0.f name = ((y0) hVar).getName();
                com.amazon.aps.iva.yb0.j.e(name, "classifier.name");
                return cVar.t(name, false);
            }
            ArrayList arrayList = new ArrayList();
            com.amazon.aps.iva.oc0.h hVar2 = hVar;
            do {
                arrayList.add(hVar2.getName());
                com.amazon.aps.iva.oc0.k d = hVar2.d();
                z = d instanceof com.amazon.aps.iva.oc0.e;
                hVar2 = d;
            } while (z);
            return com.amazon.aps.iva.aq.j.I(new j0(arrayList));
        }
    }

    /* compiled from: ClassifierNamePolicy.kt */
    /* loaded from: classes4.dex */
    public static final class c implements b {
        public static final c a = new c();

        public static String b(com.amazon.aps.iva.oc0.h hVar) {
            String str;
            com.amazon.aps.iva.nd0.f name = hVar.getName();
            com.amazon.aps.iva.yb0.j.e(name, "descriptor.name");
            String H = com.amazon.aps.iva.aq.j.H(name);
            if (hVar instanceof y0) {
                return H;
            }
            com.amazon.aps.iva.oc0.k d = hVar.d();
            com.amazon.aps.iva.yb0.j.e(d, "descriptor.containingDeclaration");
            if (d instanceof com.amazon.aps.iva.oc0.e) {
                str = b((com.amazon.aps.iva.oc0.h) d);
            } else if (d instanceof f0) {
                com.amazon.aps.iva.nd0.d i = ((f0) d).c().i();
                com.amazon.aps.iva.yb0.j.e(i, "descriptor.fqName.toUnsafe()");
                str = com.amazon.aps.iva.aq.j.I(i.f());
            } else {
                str = null;
            }
            if (str != null && !com.amazon.aps.iva.yb0.j.a(str, "")) {
                return str + '.' + H;
            }
            return H;
        }

        @Override // com.amazon.aps.iva.pd0.b
        public final String a(com.amazon.aps.iva.oc0.h hVar, com.amazon.aps.iva.pd0.c cVar) {
            com.amazon.aps.iva.yb0.j.f(cVar, "renderer");
            return b(hVar);
        }
    }

    String a(com.amazon.aps.iva.oc0.h hVar, com.amazon.aps.iva.pd0.c cVar);
}
