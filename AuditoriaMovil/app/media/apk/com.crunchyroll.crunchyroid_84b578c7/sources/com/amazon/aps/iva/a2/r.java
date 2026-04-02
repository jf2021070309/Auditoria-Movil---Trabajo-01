package com.amazon.aps.iva.a2;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.u1.i1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.http2.Http2Connection;
/* compiled from: SemanticsNode.kt */
/* loaded from: classes.dex */
public final class r {
    public final f.c a;
    public final boolean b;
    public final androidx.compose.ui.node.e c;
    public final l d;
    public boolean e;
    public r f;
    public final int g;

    /* compiled from: SemanticsNode.kt */
    /* loaded from: classes.dex */
    public static final class a extends f.c implements i1 {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<c0, com.amazon.aps.iva.kb0.q> o;

        /* JADX WARN: Multi-variable type inference failed */
        public a(com.amazon.aps.iva.xb0.l<? super c0, com.amazon.aps.iva.kb0.q> lVar) {
            this.o = lVar;
        }

        @Override // com.amazon.aps.iva.u1.i1
        public final void o0(l lVar) {
            com.amazon.aps.iva.yb0.j.f(lVar, "<this>");
            this.o.invoke(lVar);
        }
    }

    /* compiled from: SemanticsNode.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.compose.ui.node.e, Boolean> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
            if (r2.c == true) goto L5;
         */
        @Override // com.amazon.aps.iva.xb0.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke(androidx.compose.ui.node.e r2) {
            /*
                r1 = this;
                androidx.compose.ui.node.e r2 = (androidx.compose.ui.node.e) r2
                java.lang.String r0 = "it"
                com.amazon.aps.iva.yb0.j.f(r2, r0)
                com.amazon.aps.iva.a2.l r2 = r2.s()
                if (r2 == 0) goto L13
                boolean r2 = r2.c
                r0 = 1
                if (r2 != r0) goto L13
                goto L14
            L13:
                r0 = 0
            L14:
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.a2.r.b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SemanticsNode.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.compose.ui.node.e, Boolean> {
        public static final c h = new c();

        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(androidx.compose.ui.node.e eVar) {
            androidx.compose.ui.node.e eVar2 = eVar;
            com.amazon.aps.iva.yb0.j.f(eVar2, "it");
            return Boolean.valueOf(eVar2.z.d(8));
        }
    }

    public r(f.c cVar, boolean z, androidx.compose.ui.node.e eVar, l lVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "outerSemanticsNode");
        com.amazon.aps.iva.yb0.j.f(eVar, "layoutNode");
        com.amazon.aps.iva.yb0.j.f(lVar, "unmergedConfig");
        this.a = cVar;
        this.b = z;
        this.c = eVar;
        this.d = lVar;
        this.g = eVar.c;
    }

    public final r a(i iVar, com.amazon.aps.iva.xb0.l<? super c0, com.amazon.aps.iva.kb0.q> lVar) {
        int i;
        l lVar2 = new l();
        lVar2.c = false;
        lVar2.d = false;
        lVar.invoke(lVar2);
        a aVar = new a(lVar);
        if (iVar != null) {
            i = Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
        } else {
            i = 2000000000;
        }
        r rVar = new r(aVar, false, new androidx.compose.ui.node.e(true, this.g + i), lVar2);
        rVar.e = true;
        rVar.f = this;
        return rVar;
    }

    public final void b(androidx.compose.ui.node.e eVar, ArrayList arrayList) {
        com.amazon.aps.iva.p0.f<androidx.compose.ui.node.e> x = eVar.x();
        int i = x.d;
        if (i > 0) {
            androidx.compose.ui.node.e[] eVarArr = x.b;
            int i2 = 0;
            do {
                androidx.compose.ui.node.e eVar2 = eVarArr[i2];
                if (eVar2.F()) {
                    if (eVar2.z.d(8)) {
                        arrayList.add(t.a(eVar2, this.b));
                    } else {
                        b(eVar2, arrayList);
                    }
                }
                i2++;
            } while (i2 < i);
        }
    }

    public final androidx.compose.ui.node.o c() {
        if (this.e) {
            r i = i();
            if (i != null) {
                return i.c();
            }
            return null;
        }
        com.amazon.aps.iva.u1.h c2 = t.c(this.c);
        if (c2 == null) {
            c2 = this.a;
        }
        return com.amazon.aps.iva.u1.i.d(c2, 8);
    }

    public final void d(List list) {
        List<r> m = m(false);
        int size = m.size();
        for (int i = 0; i < size; i++) {
            r rVar = m.get(i);
            if (rVar.k()) {
                list.add(rVar);
            } else if (!rVar.d.d) {
                rVar.d(list);
            }
        }
    }

    public final com.amazon.aps.iva.e1.e e() {
        com.amazon.aps.iva.e1.e c2;
        androidx.compose.ui.node.o c3 = c();
        if (c3 != null) {
            if (!c3.l()) {
                c3 = null;
            }
            if (c3 != null && (c2 = com.amazon.aps.iva.gd0.j.c(c3)) != null) {
                return c2;
            }
        }
        return com.amazon.aps.iva.e1.e.e;
    }

    public final com.amazon.aps.iva.e1.e f() {
        androidx.compose.ui.node.o c2 = c();
        if (c2 != null) {
            if (!c2.l()) {
                c2 = null;
            }
            if (c2 != null) {
                return com.amazon.aps.iva.gd0.j.d(c2);
            }
        }
        return com.amazon.aps.iva.e1.e.e;
    }

    public final List<r> g(boolean z, boolean z2) {
        if (!z && this.d.d) {
            return com.amazon.aps.iva.lb0.z.b;
        }
        if (k()) {
            ArrayList arrayList = new ArrayList();
            d(arrayList);
            return arrayList;
        }
        return m(z2);
    }

    public final l h() {
        boolean k = k();
        l lVar = this.d;
        if (k) {
            lVar.getClass();
            l lVar2 = new l();
            lVar2.c = lVar.c;
            lVar2.d = lVar.d;
            lVar2.b.putAll(lVar.b);
            l(lVar2);
            return lVar2;
        }
        return lVar;
    }

    public final r i() {
        androidx.compose.ui.node.e eVar;
        r rVar = this.f;
        if (rVar != null) {
            return rVar;
        }
        androidx.compose.ui.node.e eVar2 = this.c;
        boolean z = this.b;
        if (z) {
            eVar = t.b(eVar2, b.h);
        } else {
            eVar = null;
        }
        if (eVar == null) {
            eVar = t.b(eVar2, c.h);
        }
        if (eVar == null) {
            return null;
        }
        return t.a(eVar, z);
    }

    public final List<r> j() {
        return g(false, true);
    }

    public final boolean k() {
        if (this.b && this.d.c) {
            return true;
        }
        return false;
    }

    public final void l(l lVar) {
        if (!this.d.d) {
            List<r> m = m(false);
            int size = m.size();
            for (int i = 0; i < size; i++) {
                r rVar = m.get(i);
                if (!rVar.k()) {
                    l lVar2 = rVar.d;
                    com.amazon.aps.iva.yb0.j.f(lVar2, "child");
                    for (Map.Entry entry : lVar2.b.entrySet()) {
                        b0 b0Var = (b0) entry.getKey();
                        Object value = entry.getValue();
                        LinkedHashMap linkedHashMap = lVar.b;
                        Object obj = linkedHashMap.get(b0Var);
                        com.amazon.aps.iva.yb0.j.d(b0Var, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        Object invoke = b0Var.b.invoke(obj, value);
                        if (invoke != null) {
                            linkedHashMap.put(b0Var, invoke);
                        }
                    }
                    rVar.l(lVar);
                }
            }
        }
    }

    public final List<r> m(boolean z) {
        String str;
        if (this.e) {
            return com.amazon.aps.iva.lb0.z.b;
        }
        ArrayList arrayList = new ArrayList();
        b(this.c, arrayList);
        if (z) {
            b0<i> b0Var = v.s;
            l lVar = this.d;
            i iVar = (i) m.a(lVar, b0Var);
            if (iVar != null && lVar.c && (!arrayList.isEmpty())) {
                arrayList.add(a(iVar, new p(iVar)));
            }
            b0<List<String>> b0Var2 = v.a;
            if (lVar.d(b0Var2) && (!arrayList.isEmpty()) && lVar.c) {
                List list = (List) m.a(lVar, b0Var2);
                if (list != null) {
                    str = (String) com.amazon.aps.iva.lb0.x.v0(list);
                } else {
                    str = null;
                }
                if (str != null) {
                    arrayList.add(0, a(null, new q(str)));
                }
            }
        }
        return arrayList;
    }
}
