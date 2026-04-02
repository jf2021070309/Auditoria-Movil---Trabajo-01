package com.amazon.aps.iva.fd0;

import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.fe0.b;
import com.amazon.aps.iva.xc0.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: AbstractSignatureParts.kt */
/* loaded from: classes4.dex */
public abstract class a<TAnnotation> {

    /* compiled from: AbstractSignatureParts.kt */
    /* renamed from: com.amazon.aps.iva.fd0.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0248a {
        public final com.amazon.aps.iva.he0.h a;
        public final z b;
        public final com.amazon.aps.iva.he0.m c;

        public C0248a(com.amazon.aps.iva.he0.h hVar, z zVar, com.amazon.aps.iva.he0.m mVar) {
            this.a = hVar;
            this.b = zVar;
            this.c = mVar;
        }
    }

    public static void a(Object obj, ArrayList arrayList, d dVar) {
        arrayList.add(obj);
        Iterable<? extends C0248a> invoke = dVar.invoke(obj);
        if (invoke != null) {
            for (C0248a c0248a : invoke) {
                a(c0248a, arrayList, dVar);
            }
        }
    }

    public static k c(com.amazon.aps.iva.he0.h hVar) {
        m0 i;
        m0 i2;
        com.amazon.aps.iva.yb0.j.f(hVar, "<this>");
        com.amazon.aps.iva.ee0.y g = b.a.g(hVar);
        if (g == null || (i = b.a.W(g)) == null) {
            i = b.a.i(hVar);
            com.amazon.aps.iva.yb0.j.c(i);
        }
        if (b.a.N(i)) {
            return k.NULLABLE;
        }
        com.amazon.aps.iva.ee0.y g2 = b.a.g(hVar);
        if (g2 == null || (i2 = b.a.h0(g2)) == null) {
            i2 = b.a.i(hVar);
            com.amazon.aps.iva.yb0.j.c(i2);
        }
        if (!b.a.N(i2)) {
            return k.NOT_NULL;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final l b(com.amazon.aps.iva.he0.m mVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        ?? arrayList;
        boolean z6;
        k kVar;
        if (!(mVar instanceof com.amazon.aps.iva.bd0.z)) {
            return null;
        }
        List z7 = b.a.z(mVar);
        List<com.amazon.aps.iva.he0.h> list = z7;
        boolean z8 = list instanceof Collection;
        boolean z9 = false;
        if (!z8 || !list.isEmpty()) {
            for (com.amazon.aps.iva.he0.h hVar : list) {
                if (!b.a.J(hVar)) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (z) {
            return null;
        }
        if (!z8 || !list.isEmpty()) {
            for (com.amazon.aps.iva.he0.h hVar2 : list) {
                if (c(hVar2) != null) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    z3 = true;
                    break;
                }
            }
        }
        z3 = false;
        if (z3) {
            arrayList = z7;
        } else {
            if (!z8 || !list.isEmpty()) {
                for (com.amazon.aps.iva.he0.h hVar3 : list) {
                    com.amazon.aps.iva.yb0.j.f(hVar3, "<this>");
                    if (com.amazon.aps.iva.dg.b.t((e0) hVar3) != null) {
                        z4 = true;
                        continue;
                    } else {
                        z4 = false;
                        continue;
                    }
                    if (z4) {
                        z5 = true;
                        break;
                    }
                }
            }
            z5 = false;
            if (!z5) {
                return null;
            }
            arrayList = new ArrayList();
            for (com.amazon.aps.iva.he0.h hVar4 : list) {
                com.amazon.aps.iva.yb0.j.f(hVar4, "<this>");
                e0 t = com.amazon.aps.iva.dg.b.t((e0) hVar4);
                if (t != null) {
                    arrayList.add(t);
                }
            }
        }
        Iterable<com.amazon.aps.iva.he0.h> iterable = arrayList;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (com.amazon.aps.iva.he0.h hVar5 : iterable) {
                if (!b.a.P(hVar5)) {
                    z6 = false;
                    break;
                }
            }
        }
        z6 = true;
        if (z6) {
            kVar = k.NULLABLE;
        } else {
            kVar = k.NOT_NULL;
        }
        if (arrayList != z7) {
            z9 = true;
        }
        return new l(kVar, z9);
    }

    public final ArrayList d(com.amazon.aps.iva.he0.h hVar) {
        v vVar = (v) this;
        com.amazon.aps.iva.xc0.e e = vVar.e();
        com.amazon.aps.iva.yb0.j.f(hVar, "<this>");
        C0248a c0248a = new C0248a(hVar, e.b((z) ((com.amazon.aps.iva.kb0.e) vVar.c.d).getValue(), ((e0) hVar).getAnnotations()), null);
        d dVar = new d(this);
        ArrayList arrayList = new ArrayList(1);
        a(c0248a, arrayList, dVar);
        return arrayList;
    }
}
