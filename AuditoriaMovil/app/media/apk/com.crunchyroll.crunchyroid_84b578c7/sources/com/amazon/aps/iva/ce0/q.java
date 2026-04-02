package com.amazon.aps.iva.ce0;

import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.lb0.x;
import java.util.ArrayList;
import java.util.List;
/* compiled from: DeserializedTypeParameterDescriptor.kt */
/* loaded from: classes4.dex */
public final class q extends com.amazon.aps.iva.rc0.c {
    public final com.amazon.aps.iva.ae0.n l;
    public final com.amazon.aps.iva.id0.r m;
    public final com.amazon.aps.iva.ce0.a n;

    /* compiled from: DeserializedTypeParameterDescriptor.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<List<? extends com.amazon.aps.iva.pc0.c>> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final List<? extends com.amazon.aps.iva.pc0.c> invoke() {
            q qVar = q.this;
            com.amazon.aps.iva.ae0.n nVar = qVar.l;
            return x.X0(nVar.a.e.a(qVar.m, nVar.b));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q(com.amazon.aps.iva.ae0.n r11, com.amazon.aps.iva.id0.r r12, int r13) {
        /*
            r10 = this;
            java.lang.String r0 = "c"
            com.amazon.aps.iva.yb0.j.f(r11, r0)
            com.amazon.aps.iva.ae0.l r0 = r11.a
            com.amazon.aps.iva.de0.l r2 = r0.a
            com.amazon.aps.iva.oc0.k r3 = r11.c
            com.amazon.aps.iva.pc0.h$a$a r4 = com.amazon.aps.iva.pc0.h.a.a
            int r1 = r12.f
            com.amazon.aps.iva.kd0.c r5 = r11.b
            com.amazon.aps.iva.nd0.f r5 = com.amazon.aps.iva.aq.j.w(r5, r1)
            com.amazon.aps.iva.id0.r$c r1 = r12.h
            java.lang.String r6 = "proto.variance"
            com.amazon.aps.iva.yb0.j.e(r1, r6)
            int[] r6 = com.amazon.aps.iva.ae0.f0.a.c
            int r1 = r1.ordinal()
            r1 = r6[r1]
            r6 = 1
            if (r1 == r6) goto L39
            r6 = 2
            if (r1 == r6) goto L36
            r6 = 3
            if (r1 != r6) goto L30
            com.amazon.aps.iva.ee0.v1 r1 = com.amazon.aps.iva.ee0.v1.INVARIANT
            goto L3b
        L30:
            com.amazon.aps.iva.kb0.h r11 = new com.amazon.aps.iva.kb0.h
            r11.<init>()
            throw r11
        L36:
            com.amazon.aps.iva.ee0.v1 r1 = com.amazon.aps.iva.ee0.v1.OUT_VARIANCE
            goto L3b
        L39:
            com.amazon.aps.iva.ee0.v1 r1 = com.amazon.aps.iva.ee0.v1.IN_VARIANCE
        L3b:
            r6 = r1
            boolean r7 = r12.g
            com.amazon.aps.iva.oc0.w0$a r9 = com.amazon.aps.iva.oc0.w0.a.a
            r1 = r10
            r8 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r10.l = r11
            r10.m = r12
            com.amazon.aps.iva.ce0.a r11 = new com.amazon.aps.iva.ce0.a
            com.amazon.aps.iva.ce0.q$a r12 = new com.amazon.aps.iva.ce0.q$a
            r12.<init>()
            com.amazon.aps.iva.de0.l r13 = r0.a
            r11.<init>(r13, r12)
            r10.n = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ce0.q.<init>(com.amazon.aps.iva.ae0.n, com.amazon.aps.iva.id0.r, int):void");
    }

    @Override // com.amazon.aps.iva.rc0.k
    public final void G0(e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "type");
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    @Override // com.amazon.aps.iva.rc0.k
    public final List<e0> H0() {
        com.amazon.aps.iva.ae0.n nVar = this.l;
        com.amazon.aps.iva.kd0.g gVar = nVar.d;
        com.amazon.aps.iva.id0.r rVar = this.m;
        com.amazon.aps.iva.yb0.j.f(rVar, "<this>");
        com.amazon.aps.iva.yb0.j.f(gVar, "typeTable");
        List<com.amazon.aps.iva.id0.p> list = rVar.i;
        boolean z = !list.isEmpty();
        ?? r3 = list;
        if (!z) {
            r3 = 0;
        }
        if (r3 == 0) {
            List<Integer> list2 = rVar.j;
            com.amazon.aps.iva.yb0.j.e(list2, "upperBoundIdList");
            List<Integer> list3 = list2;
            r3 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list3));
            for (Integer num : list3) {
                com.amazon.aps.iva.yb0.j.e(num, "it");
                r3.add(gVar.a(num.intValue()));
            }
        }
        if (r3.isEmpty()) {
            return f1.J(com.amazon.aps.iva.ud0.b.e(this).n());
        }
        Iterable<com.amazon.aps.iva.id0.p> iterable = (Iterable) r3;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(iterable));
        for (com.amazon.aps.iva.id0.p pVar : iterable) {
            arrayList.add(nVar.h.g(pVar));
        }
        return arrayList;
    }

    @Override // com.amazon.aps.iva.pc0.b, com.amazon.aps.iva.pc0.a
    public final com.amazon.aps.iva.pc0.h getAnnotations() {
        return this.n;
    }
}
