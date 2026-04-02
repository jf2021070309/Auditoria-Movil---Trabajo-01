package com.amazon.aps.iva.u1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: LayoutNodeAlignmentLines.kt */
/* loaded from: classes.dex */
public abstract class a {
    public final b a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public b h;
    public boolean b = true;
    public final HashMap i = new HashMap();

    /* compiled from: LayoutNodeAlignmentLines.kt */
    /* renamed from: com.amazon.aps.iva.u1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0751a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<b, com.amazon.aps.iva.kb0.q> {
        public C0751a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(b bVar) {
            a aVar;
            b bVar2 = bVar;
            com.amazon.aps.iva.yb0.j.f(bVar2, "childOwner");
            if (bVar2.A()) {
                if (bVar2.c().b) {
                    bVar2.z();
                }
                Iterator it = bVar2.c().i.entrySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    aVar = a.this;
                    if (!hasNext) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    a.a(aVar, (com.amazon.aps.iva.s1.a) entry.getKey(), ((Number) entry.getValue()).intValue(), bVar2.L());
                }
                androidx.compose.ui.node.o oVar = bVar2.L().k;
                com.amazon.aps.iva.yb0.j.c(oVar);
                while (!com.amazon.aps.iva.yb0.j.a(oVar, aVar.a.L())) {
                    for (com.amazon.aps.iva.s1.a aVar2 : aVar.c(oVar).keySet()) {
                        a.a(aVar, aVar2, aVar.d(oVar, aVar2), oVar);
                    }
                    oVar = oVar.k;
                    com.amazon.aps.iva.yb0.j.c(oVar);
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public a(b bVar) {
        this.a = bVar;
    }

    public static final void a(a aVar, com.amazon.aps.iva.s1.a aVar2, int i, androidx.compose.ui.node.o oVar) {
        int a;
        aVar.getClass();
        float f = i;
        long d = com.amazon.aps.iva.e1.d.d(f, f);
        while (true) {
            d = aVar.b(oVar, d);
            oVar = oVar.k;
            com.amazon.aps.iva.yb0.j.c(oVar);
            if (com.amazon.aps.iva.yb0.j.a(oVar, aVar.a.L())) {
                break;
            } else if (aVar.c(oVar).containsKey(aVar2)) {
                float d2 = aVar.d(oVar, aVar2);
                d = com.amazon.aps.iva.e1.d.d(d2, d2);
            }
        }
        if (aVar2 instanceof com.amazon.aps.iva.s1.j) {
            a = com.amazon.aps.iva.ob0.f.a(com.amazon.aps.iva.e1.c.d(d));
        } else {
            a = com.amazon.aps.iva.ob0.f.a(com.amazon.aps.iva.e1.c.c(d));
        }
        HashMap hashMap = aVar.i;
        if (hashMap.containsKey(aVar2)) {
            int intValue = ((Number) com.amazon.aps.iva.lb0.i0.S(aVar2, hashMap)).intValue();
            com.amazon.aps.iva.s1.j jVar = com.amazon.aps.iva.s1.b.a;
            com.amazon.aps.iva.yb0.j.f(aVar2, "<this>");
            a = aVar2.a.invoke(Integer.valueOf(intValue), Integer.valueOf(a)).intValue();
        }
        hashMap.put(aVar2, Integer.valueOf(a));
    }

    public abstract long b(androidx.compose.ui.node.o oVar, long j);

    public abstract Map<com.amazon.aps.iva.s1.a, Integer> c(androidx.compose.ui.node.o oVar);

    public abstract int d(androidx.compose.ui.node.o oVar, com.amazon.aps.iva.s1.a aVar);

    public final boolean e() {
        if (!this.c && !this.e && !this.f && !this.g) {
            return false;
        }
        return true;
    }

    public final boolean f() {
        i();
        if (this.h != null) {
            return true;
        }
        return false;
    }

    public final void g() {
        this.b = true;
        b bVar = this.a;
        b i = bVar.i();
        if (i == null) {
            return;
        }
        if (this.c) {
            i.i0();
        } else if (this.e || this.d) {
            i.requestLayout();
        }
        if (this.f) {
            bVar.i0();
        }
        if (this.g) {
            bVar.requestLayout();
        }
        i.c().g();
    }

    public final void h() {
        HashMap hashMap = this.i;
        hashMap.clear();
        C0751a c0751a = new C0751a();
        b bVar = this.a;
        bVar.w(c0751a);
        hashMap.putAll(c(bVar.L()));
        this.b = false;
    }

    public final void i() {
        a c;
        a c2;
        boolean e = e();
        b bVar = this.a;
        if (!e) {
            b i = bVar.i();
            if (i == null) {
                return;
            }
            bVar = i.c().h;
            if (bVar == null || !bVar.c().e()) {
                b bVar2 = this.h;
                if (bVar2 != null && !bVar2.c().e()) {
                    b i2 = bVar2.i();
                    if (i2 != null && (c2 = i2.c()) != null) {
                        c2.i();
                    }
                    b i3 = bVar2.i();
                    if (i3 != null && (c = i3.c()) != null) {
                        bVar = c.h;
                    } else {
                        bVar = null;
                    }
                } else {
                    return;
                }
            }
        }
        this.h = bVar;
    }
}
