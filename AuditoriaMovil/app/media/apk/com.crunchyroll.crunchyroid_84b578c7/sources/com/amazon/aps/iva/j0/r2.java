package com.amazon.aps.iva.j0;

import com.amazon.aps.iva.s1.u0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: BasicText.kt */
/* loaded from: classes.dex */
public final class r2 implements com.amazon.aps.iva.s1.d0 {
    public final com.amazon.aps.iva.xb0.a<List<com.amazon.aps.iva.e1.e>> a;

    /* compiled from: BasicText.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<u0.a, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ List<com.amazon.aps.iva.kb0.j<com.amazon.aps.iva.s1.u0, com.amazon.aps.iva.o2.h>> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList arrayList) {
            super(1);
            this.h = arrayList;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(u0.a aVar) {
            com.amazon.aps.iva.yb0.j.f(aVar, "$this$layout");
            List<com.amazon.aps.iva.kb0.j<com.amazon.aps.iva.s1.u0, com.amazon.aps.iva.o2.h>> list = this.h;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    com.amazon.aps.iva.kb0.j<com.amazon.aps.iva.s1.u0, com.amazon.aps.iva.o2.h> jVar = list.get(i);
                    u0.a.e(jVar.b, jVar.c.a, 0.0f);
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r2(com.amazon.aps.iva.xb0.a<? extends List<com.amazon.aps.iva.e1.e>> aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "placements");
        this.a = aVar;
    }

    @Override // com.amazon.aps.iva.s1.d0
    public final com.amazon.aps.iva.s1.e0 d(com.amazon.aps.iva.s1.f0 f0Var, List<? extends com.amazon.aps.iva.s1.c0> list, long j) {
        com.amazon.aps.iva.kb0.j jVar;
        float f;
        com.amazon.aps.iva.yb0.j.f(f0Var, "$this$measure");
        com.amazon.aps.iva.yb0.j.f(list, "measurables");
        List<com.amazon.aps.iva.e1.e> invoke = this.a.invoke();
        ArrayList arrayList = null;
        if (invoke != null) {
            ArrayList arrayList2 = new ArrayList(invoke.size());
            int size = invoke.size();
            for (int i = 0; i < size; i++) {
                com.amazon.aps.iva.e1.e eVar = invoke.get(i);
                if (eVar != null) {
                    float f2 = eVar.c;
                    float f3 = eVar.a;
                    float f4 = eVar.d;
                    jVar = new com.amazon.aps.iva.kb0.j(list.get(i).V(com.amazon.aps.iva.o2.b.b((int) Math.floor(f2 - f3), (int) Math.floor(f4 - f), 5)), new com.amazon.aps.iva.o2.h(com.amazon.aps.iva.e.w.e(com.amazon.aps.iva.ob0.f.a(f3), com.amazon.aps.iva.ob0.f.a(eVar.b))));
                } else {
                    jVar = null;
                }
                if (jVar != null) {
                    arrayList2.add(jVar);
                }
            }
            arrayList = arrayList2;
        }
        return f0Var.F0(com.amazon.aps.iva.o2.a.h(j), com.amazon.aps.iva.o2.a.g(j), com.amazon.aps.iva.lb0.a0.b, new a(arrayList));
    }
}
