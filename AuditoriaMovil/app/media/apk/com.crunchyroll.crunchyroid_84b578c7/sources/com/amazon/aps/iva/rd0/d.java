package com.amazon.aps.iva.rd0;

import com.amazon.aps.iva.de0.c;
import com.amazon.aps.iva.ee0.a1;
import com.amazon.aps.iva.ee0.b0;
import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.i0;
import com.amazon.aps.iva.ee0.j1;
import com.amazon.aps.iva.ee0.l1;
import com.amazon.aps.iva.ee0.m1;
import com.amazon.aps.iva.ee0.v1;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.oc0.y0;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: CapturedTypeConstructor.kt */
/* loaded from: classes4.dex */
public final class d {

    /* compiled from: CapturedTypeConstructor.kt */
    /* loaded from: classes4.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<e0> {
        public final /* synthetic */ j1 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j1 j1Var) {
            super(0);
            this.h = j1Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final e0 invoke() {
            e0 type = this.h.getType();
            j.e(type, "this@createCapturedIfNeeded.type");
            return type;
        }
    }

    public static final j1 a(j1 j1Var, y0 y0Var) {
        if (y0Var != null && j1Var.c() != v1.INVARIANT) {
            if (y0Var.i() == j1Var.c()) {
                if (j1Var.b()) {
                    c.a aVar = com.amazon.aps.iva.de0.c.e;
                    j.e(aVar, "NO_LOCKS");
                    return new l1(new i0(aVar, new a(j1Var)));
                }
                return new l1(j1Var.getType());
            }
            c cVar = new c(j1Var);
            a1.c.getClass();
            return new l1(new com.amazon.aps.iva.rd0.a(j1Var, cVar, false, a1.d));
        }
        return j1Var;
    }

    public static m1 b(m1 m1Var) {
        if (m1Var instanceof b0) {
            b0 b0Var = (b0) m1Var;
            j1[] j1VarArr = b0Var.c;
            j.f(j1VarArr, "<this>");
            y0[] y0VarArr = b0Var.b;
            j.f(y0VarArr, "other");
            int min = Math.min(j1VarArr.length, y0VarArr.length);
            ArrayList arrayList = new ArrayList(min);
            for (int i = 0; i < min; i++) {
                arrayList.add(new com.amazon.aps.iva.kb0.j(j1VarArr[i], y0VarArr[i]));
            }
            ArrayList arrayList2 = new ArrayList(r.Y(arrayList));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.amazon.aps.iva.kb0.j jVar = (com.amazon.aps.iva.kb0.j) it.next();
                arrayList2.add(a((j1) jVar.b, (y0) jVar.c));
            }
            return new b0(y0VarArr, (j1[]) arrayList2.toArray(new j1[0]), true);
        }
        return new e(m1Var, true);
    }
}
