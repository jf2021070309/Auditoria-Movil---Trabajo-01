package com.amazon.aps.iva.mc0;

import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.ee0.q1;
import com.amazon.aps.iva.ee0.v1;
import com.amazon.aps.iva.ke0.t;
import com.amazon.aps.iva.lb0.c0;
import com.amazon.aps.iva.lb0.d0;
import com.amazon.aps.iva.lb0.e0;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.nd0.f;
import com.amazon.aps.iva.oc0.b;
import com.amazon.aps.iva.oc0.b0;
import com.amazon.aps.iva.oc0.c1;
import com.amazon.aps.iva.oc0.k;
import com.amazon.aps.iva.oc0.q;
import com.amazon.aps.iva.oc0.q0;
import com.amazon.aps.iva.oc0.t0;
import com.amazon.aps.iva.oc0.v;
import com.amazon.aps.iva.oc0.y0;
import com.amazon.aps.iva.pc0.h;
import com.amazon.aps.iva.rc0.p0;
import com.amazon.aps.iva.rc0.v0;
import com.amazon.aps.iva.rc0.x;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
/* compiled from: FunctionInvokeDescriptor.kt */
/* loaded from: classes4.dex */
public final class e extends p0 {

    /* compiled from: FunctionInvokeDescriptor.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static e a(b bVar, boolean z) {
            String lowerCase;
            boolean z2;
            j.f(bVar, "functionClass");
            e eVar = new e(bVar, null, b.a.DECLARATION, z);
            q0 F0 = bVar.F0();
            z zVar = z.b;
            List<y0> list = bVar.l;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((y0) obj).i() == v1.IN_VARIANCE) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    break;
                }
                arrayList.add(obj);
            }
            d0 d1 = x.d1(arrayList);
            ArrayList arrayList2 = new ArrayList(r.Y(d1));
            Iterator it = d1.iterator();
            while (true) {
                e0 e0Var = (e0) it;
                if (e0Var.hasNext()) {
                    c0 c0Var = (c0) e0Var.next();
                    int i = c0Var.a;
                    y0 y0Var = (y0) c0Var.b;
                    String b = y0Var.getName().b();
                    j.e(b, "typeParameter.name.asString()");
                    if (j.a(b, RequestConfiguration.MAX_AD_CONTENT_RATING_T)) {
                        lowerCase = "instance";
                    } else if (j.a(b, "E")) {
                        lowerCase = "receiver";
                    } else {
                        lowerCase = b.toLowerCase(Locale.ROOT);
                        j.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    }
                    h.a.C0609a c0609a = h.a.a;
                    f h = f.h(lowerCase);
                    m0 m = y0Var.m();
                    j.e(m, "typeParameter.defaultType");
                    ArrayList arrayList3 = arrayList2;
                    arrayList3.add(new v0(eVar, null, i, c0609a, h, m, false, false, false, null, t0.a));
                    arrayList2 = arrayList3;
                } else {
                    eVar.J0(null, F0, zVar, zVar, arrayList2, ((y0) x.D0(list)).m(), b0.ABSTRACT, q.e);
                    eVar.y = true;
                    return eVar;
                }
            }
        }
    }

    public e(k kVar, e eVar, b.a aVar, boolean z) {
        super(kVar, eVar, h.a.a, t.g, aVar, t0.a);
        this.n = true;
        this.w = z;
        this.x = false;
    }

    @Override // com.amazon.aps.iva.rc0.x, com.amazon.aps.iva.oc0.v
    public final boolean C() {
        return false;
    }

    @Override // com.amazon.aps.iva.rc0.p0, com.amazon.aps.iva.rc0.x
    public final com.amazon.aps.iva.rc0.x G0(b.a aVar, k kVar, v vVar, t0 t0Var, h hVar, f fVar) {
        j.f(kVar, "newOwner");
        j.f(aVar, "kind");
        j.f(hVar, "annotations");
        return new e(kVar, (e) vVar, aVar, this.w);
    }

    @Override // com.amazon.aps.iva.rc0.x
    public final com.amazon.aps.iva.rc0.x H0(x.a aVar) {
        boolean z;
        boolean z2;
        boolean z3;
        f fVar;
        boolean z4;
        j.f(aVar, "configuration");
        e eVar = (e) super.H0(aVar);
        if (eVar == null) {
            return null;
        }
        List<c1> f = eVar.f();
        j.e(f, "substituted.valueParameters");
        List<c1> list = f;
        boolean z5 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (c1 c1Var : list) {
                com.amazon.aps.iva.ee0.e0 type = c1Var.getType();
                j.e(type, "it.type");
                if (com.amazon.aps.iva.lc0.f.c(type) != null) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    z2 = false;
                    break;
                }
            }
        }
        z2 = true;
        if (z2) {
            return eVar;
        }
        List<c1> f2 = eVar.f();
        j.e(f2, "substituted.valueParameters");
        List<c1> list2 = f2;
        ArrayList arrayList = new ArrayList(r.Y(list2));
        for (c1 c1Var2 : list2) {
            com.amazon.aps.iva.ee0.e0 type2 = c1Var2.getType();
            j.e(type2, "it.type");
            arrayList.add(com.amazon.aps.iva.lc0.f.c(type2));
        }
        int size = eVar.f().size() - arrayList.size();
        if (size == 0) {
            List<c1> f3 = eVar.f();
            j.e(f3, "valueParameters");
            ArrayList e1 = com.amazon.aps.iva.lb0.x.e1(arrayList, f3);
            if (!e1.isEmpty()) {
                Iterator it = e1.iterator();
                while (it.hasNext()) {
                    com.amazon.aps.iva.kb0.j jVar = (com.amazon.aps.iva.kb0.j) it.next();
                    if (!j.a((f) jVar.b, ((c1) jVar.c).getName())) {
                        z4 = false;
                        break;
                    }
                }
            }
            z4 = true;
            if (z4) {
                return eVar;
            }
        }
        List<c1> f4 = eVar.f();
        j.e(f4, "valueParameters");
        List<c1> list3 = f4;
        ArrayList arrayList2 = new ArrayList(r.Y(list3));
        for (c1 c1Var3 : list3) {
            f name = c1Var3.getName();
            j.e(name, "it.name");
            int index = c1Var3.getIndex();
            int i = index - size;
            if (i >= 0 && (fVar = (f) arrayList.get(i)) != null) {
                name = fVar;
            }
            arrayList2.add(c1Var3.W(eVar, name, index));
        }
        x.a K0 = eVar.K0(q1.b);
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (((f) it2.next()) == null) {
                    z3 = true;
                    continue;
                } else {
                    z3 = false;
                    continue;
                }
                if (z3) {
                    z5 = true;
                    break;
                }
            }
        }
        K0.v = Boolean.valueOf(z5);
        K0.g = arrayList2;
        K0.e = eVar.a();
        com.amazon.aps.iva.rc0.x H0 = super.H0(K0);
        j.c(H0);
        return H0;
    }

    @Override // com.amazon.aps.iva.rc0.x, com.amazon.aps.iva.oc0.a0
    public final boolean isExternal() {
        return false;
    }

    @Override // com.amazon.aps.iva.rc0.x, com.amazon.aps.iva.oc0.v
    public final boolean isInline() {
        return false;
    }
}
