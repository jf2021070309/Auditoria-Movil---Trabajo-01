package com.amazon.aps.iva.d0;

import com.amazon.aps.iva.s1.u0;
/* compiled from: Intrinsic.kt */
/* loaded from: classes.dex */
public interface c1 extends com.amazon.aps.iva.s1.v {

    /* compiled from: Intrinsic.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<u0.a, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.s1.u0 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.s1.u0 u0Var) {
            super(1);
            this.h = u0Var;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(u0.a aVar) {
            u0.a aVar2 = aVar;
            com.amazon.aps.iva.yb0.j.f(aVar2, "$this$layout");
            long j = com.amazon.aps.iva.o2.h.b;
            u0.a.C0692a c0692a = u0.a.a;
            com.amazon.aps.iva.s1.u0 u0Var = this.h;
            com.amazon.aps.iva.yb0.j.f(u0Var, "$this$placeRelative");
            if (aVar2.a() != com.amazon.aps.iva.o2.l.Ltr && aVar2.b() != 0) {
                long e = com.amazon.aps.iva.e.w.e((aVar2.b() - u0Var.b) - ((int) (j >> 32)), com.amazon.aps.iva.o2.h.b(j));
                long j2 = u0Var.f;
                u0Var.r0(com.amazon.aps.iva.e.w.e(((int) (e >> 32)) + ((int) (j2 >> 32)), com.amazon.aps.iva.o2.h.b(j2) + com.amazon.aps.iva.o2.h.b(e)), 0.0f, null);
            } else {
                long j3 = u0Var.f;
                u0Var.r0(com.amazon.aps.iva.e.w.e(((int) (j >> 32)) + ((int) (j3 >> 32)), com.amazon.aps.iva.o2.h.b(j3) + com.amazon.aps.iva.o2.h.b(j)), 0.0f, null);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    @Override // com.amazon.aps.iva.s1.v
    default int b(com.amazon.aps.iva.s1.m mVar, com.amazon.aps.iva.s1.l lVar, int i) {
        com.amazon.aps.iva.yb0.j.f(mVar, "<this>");
        return lVar.M(i);
    }

    @Override // com.amazon.aps.iva.s1.v
    default int c(com.amazon.aps.iva.s1.m mVar, com.amazon.aps.iva.s1.l lVar, int i) {
        com.amazon.aps.iva.yb0.j.f(mVar, "<this>");
        return lVar.d(i);
    }

    @Override // com.amazon.aps.iva.s1.v
    default int d(com.amazon.aps.iva.s1.m mVar, com.amazon.aps.iva.s1.l lVar, int i) {
        com.amazon.aps.iva.yb0.j.f(mVar, "<this>");
        return lVar.C(i);
    }

    @Override // com.amazon.aps.iva.s1.v
    default int e(com.amazon.aps.iva.s1.m mVar, com.amazon.aps.iva.s1.l lVar, int i) {
        com.amazon.aps.iva.yb0.j.f(mVar, "<this>");
        return lVar.P(i);
    }

    @Override // com.amazon.aps.iva.s1.v
    default com.amazon.aps.iva.s1.e0 f(com.amazon.aps.iva.s1.f0 f0Var, com.amazon.aps.iva.s1.c0 c0Var, long j) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "$this$measure");
        com.amazon.aps.iva.s1.u0 V = c0Var.V(com.amazon.aps.iva.o2.b.d(j, r(f0Var, c0Var, j)));
        return f0Var.F0(V.b, V.c, com.amazon.aps.iva.lb0.a0.b, new a(V));
    }

    long r(com.amazon.aps.iva.s1.f0 f0Var, com.amazon.aps.iva.s1.c0 c0Var, long j);
}
