package com.amazon.aps.iva.ae0;

import com.amazon.aps.iva.ee0.a1;
import com.amazon.aps.iva.ee0.c1;
import com.amazon.aps.iva.ee0.j1;
import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.ee0.z0;
import com.amazon.aps.iva.id0.p;
import com.amazon.aps.iva.oc0.x0;
import com.amazon.aps.iva.oc0.y0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: TypeDeserializer.kt */
/* loaded from: classes4.dex */
public final class i0 {
    public final n a;
    public final i0 b;
    public final String c;
    public final String d;
    public final com.amazon.aps.iva.de0.h e;
    public final com.amazon.aps.iva.de0.h f;
    public final Map<Integer, y0> g;

    /* compiled from: TypeDeserializer.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Integer, com.amazon.aps.iva.oc0.h> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.oc0.h invoke(Integer num) {
            int intValue = num.intValue();
            n nVar = i0.this.a;
            com.amazon.aps.iva.nd0.b s = com.amazon.aps.iva.aq.j.s(nVar.b, intValue);
            boolean z = s.c;
            l lVar = nVar.a;
            if (z) {
                return lVar.b(s);
            }
            return com.amazon.aps.iva.oc0.u.b(lVar.b, s);
        }
    }

    /* compiled from: TypeDeserializer.kt */
    /* loaded from: classes4.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<List<? extends com.amazon.aps.iva.pc0.c>> {
        public final /* synthetic */ i0 h;
        public final /* synthetic */ com.amazon.aps.iva.id0.p i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.id0.p pVar, i0 i0Var) {
            super(0);
            this.h = i0Var;
            this.i = pVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final List<? extends com.amazon.aps.iva.pc0.c> invoke() {
            n nVar = this.h.a;
            return nVar.a.e.h(this.i, nVar.b);
        }
    }

    /* compiled from: TypeDeserializer.kt */
    /* loaded from: classes4.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Integer, com.amazon.aps.iva.oc0.h> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.oc0.h invoke(Integer num) {
            int intValue = num.intValue();
            n nVar = i0.this.a;
            com.amazon.aps.iva.nd0.b s = com.amazon.aps.iva.aq.j.s(nVar.b, intValue);
            if (!s.c) {
                com.amazon.aps.iva.oc0.c0 c0Var = nVar.a.b;
                com.amazon.aps.iva.yb0.j.f(c0Var, "<this>");
                com.amazon.aps.iva.oc0.h b = com.amazon.aps.iva.oc0.u.b(c0Var, s);
                if (b instanceof x0) {
                    return (x0) b;
                }
            }
            return null;
        }
    }

    /* compiled from: TypeDeserializer.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class d extends com.amazon.aps.iva.yb0.h implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nd0.b, com.amazon.aps.iva.nd0.b> {
        public static final d b = new d();

        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.yb0.b, com.amazon.aps.iva.fc0.c
        public final String getName() {
            return "getOuterClassId";
        }

        @Override // com.amazon.aps.iva.yb0.b
        public final com.amazon.aps.iva.fc0.f getOwner() {
            return com.amazon.aps.iva.yb0.e0.a(com.amazon.aps.iva.nd0.b.class);
        }

        @Override // com.amazon.aps.iva.yb0.b
        public final String getSignature() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.nd0.b invoke(com.amazon.aps.iva.nd0.b bVar) {
            com.amazon.aps.iva.nd0.b bVar2 = bVar;
            com.amazon.aps.iva.yb0.j.f(bVar2, "p0");
            return bVar2.g();
        }
    }

    /* compiled from: TypeDeserializer.kt */
    /* loaded from: classes4.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.id0.p, com.amazon.aps.iva.id0.p> {
        public e() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.id0.p invoke(com.amazon.aps.iva.id0.p pVar) {
            com.amazon.aps.iva.id0.p pVar2 = pVar;
            com.amazon.aps.iva.yb0.j.f(pVar2, "it");
            return com.amazon.aps.iva.kd0.f.a(pVar2, i0.this.a.d);
        }
    }

    /* compiled from: TypeDeserializer.kt */
    /* loaded from: classes4.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.id0.p, Integer> {
        public static final f h = new f();

        public f() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Integer invoke(com.amazon.aps.iva.id0.p pVar) {
            com.amazon.aps.iva.id0.p pVar2 = pVar;
            com.amazon.aps.iva.yb0.j.f(pVar2, "it");
            return Integer.valueOf(pVar2.e.size());
        }
    }

    public i0(n nVar, i0 i0Var, List<com.amazon.aps.iva.id0.r> list, String str, String str2) {
        Map<Integer, y0> linkedHashMap;
        com.amazon.aps.iva.yb0.j.f(nVar, "c");
        com.amazon.aps.iva.yb0.j.f(str, "debugName");
        this.a = nVar;
        this.b = i0Var;
        this.c = str;
        this.d = str2;
        l lVar = nVar.a;
        this.e = lVar.a.h(new a());
        this.f = lVar.a.h(new c());
        if (list.isEmpty()) {
            linkedHashMap = com.amazon.aps.iva.lb0.a0.b;
        } else {
            linkedHashMap = new LinkedHashMap<>();
            int i = 0;
            for (com.amazon.aps.iva.id0.r rVar : list) {
                linkedHashMap.put(Integer.valueOf(rVar.e), new com.amazon.aps.iva.ce0.q(this.a, rVar, i));
                i++;
            }
        }
        this.g = linkedHashMap;
    }

    public static m0 a(m0 m0Var, com.amazon.aps.iva.ee0.e0 e0Var) {
        com.amazon.aps.iva.lc0.k n = com.amazon.aps.iva.da0.a.n(m0Var);
        com.amazon.aps.iva.pc0.h annotations = m0Var.getAnnotations();
        com.amazon.aps.iva.ee0.e0 f2 = com.amazon.aps.iva.lc0.f.f(m0Var);
        List<com.amazon.aps.iva.ee0.e0> d2 = com.amazon.aps.iva.lc0.f.d(m0Var);
        List<j1> p0 = com.amazon.aps.iva.lb0.x.p0(com.amazon.aps.iva.lc0.f.g(m0Var));
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(p0));
        for (j1 j1Var : p0) {
            arrayList.add(j1Var.getType());
        }
        return com.amazon.aps.iva.lc0.f.b(n, annotations, f2, d2, arrayList, e0Var, true).M0(m0Var.J0());
    }

    public static final ArrayList e(com.amazon.aps.iva.id0.p pVar, i0 i0Var) {
        Iterable iterable;
        List<p.b> list = pVar.e;
        com.amazon.aps.iva.yb0.j.e(list, "argumentList");
        List<p.b> list2 = list;
        com.amazon.aps.iva.id0.p a2 = com.amazon.aps.iva.kd0.f.a(pVar, i0Var.a.d);
        if (a2 != null) {
            iterable = e(a2, i0Var);
        } else {
            iterable = null;
        }
        if (iterable == null) {
            iterable = com.amazon.aps.iva.lb0.z.b;
        }
        return com.amazon.aps.iva.lb0.x.L0(iterable, list2);
    }

    public static a1 f(List list, com.amazon.aps.iva.pc0.h hVar, c1 c1Var, com.amazon.aps.iva.oc0.k kVar) {
        List<z0> list2 = list;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list2));
        for (z0 z0Var : list2) {
            arrayList.add(z0Var.a(hVar));
        }
        ArrayList Z = com.amazon.aps.iva.lb0.r.Z(arrayList);
        a1.c.getClass();
        return a1.a.c(Z);
    }

    public static final com.amazon.aps.iva.oc0.e h(i0 i0Var, com.amazon.aps.iva.id0.p pVar, int i) {
        com.amazon.aps.iva.nd0.b s = com.amazon.aps.iva.aq.j.s(i0Var.a.b, i);
        ArrayList g0 = com.amazon.aps.iva.ne0.s.g0(com.amazon.aps.iva.ne0.s.b0(com.amazon.aps.iva.ne0.k.R(pVar, new e()), f.h));
        int T = com.amazon.aps.iva.ne0.s.T(com.amazon.aps.iva.ne0.k.R(s, d.b));
        while (g0.size() < T) {
            g0.add(0);
        }
        return i0Var.a.a.l.a(s, g0);
    }

    public final List<y0> b() {
        return com.amazon.aps.iva.lb0.x.X0(this.g.values());
    }

    public final y0 c(int i) {
        y0 y0Var = this.g.get(Integer.valueOf(i));
        if (y0Var == null) {
            i0 i0Var = this.b;
            if (i0Var != null) {
                return i0Var.c(i);
            }
            return null;
        }
        return y0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:167:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013d  */
    /* JADX WARN: Type inference failed for: r6v26, types: [com.amazon.aps.iva.ee0.r0] */
    /* JADX WARN: Type inference failed for: r9v44, types: [com.amazon.aps.iva.ee0.s0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.ee0.m0 d(com.amazon.aps.iva.id0.p r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 999
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ae0.i0.d(com.amazon.aps.iva.id0.p, boolean):com.amazon.aps.iva.ee0.m0");
    }

    public final com.amazon.aps.iva.ee0.e0 g(com.amazon.aps.iva.id0.p pVar) {
        boolean z;
        boolean z2;
        com.amazon.aps.iva.id0.p pVar2;
        com.amazon.aps.iva.yb0.j.f(pVar, "proto");
        boolean z3 = false;
        if ((pVar.d & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            n nVar = this.a;
            String string = nVar.b.getString(pVar.g);
            m0 d2 = d(pVar, true);
            com.amazon.aps.iva.kd0.g gVar = nVar.d;
            com.amazon.aps.iva.yb0.j.f(gVar, "typeTable");
            int i = pVar.d;
            if ((i & 4) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                pVar2 = pVar.h;
            } else {
                if ((i & 8) == 8) {
                    z3 = true;
                }
                if (z3) {
                    pVar2 = gVar.a(pVar.i);
                } else {
                    pVar2 = null;
                }
            }
            com.amazon.aps.iva.yb0.j.c(pVar2);
            return nVar.a.j.a(pVar, string, d2, d(pVar2, true));
        }
        return d(pVar, true);
    }

    public final String toString() {
        i0 i0Var;
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        if (this.b == null) {
            str = "";
        } else {
            str = ". Child of " + i0Var.c;
        }
        sb.append(str);
        return sb.toString();
    }
}
