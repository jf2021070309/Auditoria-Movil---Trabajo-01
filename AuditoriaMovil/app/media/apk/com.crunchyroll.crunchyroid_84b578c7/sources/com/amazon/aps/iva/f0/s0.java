package com.amazon.aps.iva.f0;

import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.h2;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.q3;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: LazySaveableStateHolder.kt */
/* loaded from: classes.dex */
public final class s0 {

    /* compiled from: LazySaveableStateHolder.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ o0 h;
        public final /* synthetic */ com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.x0.e, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> i;
        public final /* synthetic */ int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(o0 o0Var, com.amazon.aps.iva.xb0.q<? super com.amazon.aps.iva.x0.e, ? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> qVar, int i) {
            super(2);
            this.h = o0Var;
            this.i = qVar;
            this.j = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = com.amazon.aps.iva.o0.e0.a;
                com.amazon.aps.iva.x0.f D = com.amazon.aps.iva.dg.b.D(iVar2);
                o0 o0Var = this.h;
                o0Var.b.setValue(D);
                this.i.invoke(o0Var, iVar2, Integer.valueOf(((this.j << 3) & 112) | 8));
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: LazySaveableStateHolder.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.x0.e, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> h;
        public final /* synthetic */ int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(com.amazon.aps.iva.xb0.q<? super com.amazon.aps.iva.x0.e, ? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> qVar, int i) {
            super(2);
            this.h = qVar;
            this.i = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.i | 1);
            s0.a(this.h, iVar, I);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: LazySaveableStateHolder.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<o0> {
        public final /* synthetic */ com.amazon.aps.iva.x0.i h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.amazon.aps.iva.x0.i iVar) {
            super(0);
            this.h = iVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final o0 invoke() {
            return new o0(this.h, com.amazon.aps.iva.lb0.a0.b);
        }
    }

    public static final void a(com.amazon.aps.iva.xb0.q<? super com.amazon.aps.iva.x0.e, ? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> qVar, com.amazon.aps.iva.o0.i iVar, int i) {
        int i2;
        int i3;
        com.amazon.aps.iva.yb0.j.f(qVar, FirebaseAnalytics.Param.CONTENT);
        com.amazon.aps.iva.o0.j g = iVar.g(674185128);
        if ((i & 14) == 0) {
            if (g.v(qVar)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && g.h()) {
            g.A();
        } else {
            e0.b bVar = com.amazon.aps.iva.o0.e0.a;
            q3 q3Var = com.amazon.aps.iva.x0.k.a;
            com.amazon.aps.iva.x0.i iVar2 = (com.amazon.aps.iva.x0.i) g.i(q3Var);
            o0 o0Var = (o0) defpackage.i.A(new Object[]{iVar2}, com.amazon.aps.iva.x0.m.a(p0.h, new q0(iVar2)), new c(iVar2), g, 4);
            com.amazon.aps.iva.o0.l0.a(new h2[]{q3Var.b(o0Var)}, com.amazon.aps.iva.v0.b.b(g, 1863926504, new a(o0Var, qVar, i2)), g, 56);
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new b(qVar, i);
        }
    }
}
