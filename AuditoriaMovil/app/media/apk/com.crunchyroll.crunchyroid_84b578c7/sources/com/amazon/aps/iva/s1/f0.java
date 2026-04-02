package com.amazon.aps.iva.s1;

import com.amazon.aps.iva.s1.u0;
import java.util.Map;
/* compiled from: MeasureScope.kt */
/* loaded from: classes.dex */
public interface f0 extends m {

    /* compiled from: MeasureScope.kt */
    /* loaded from: classes.dex */
    public static final class a implements e0 {
        public final int a;
        public final int b;
        public final Map<com.amazon.aps.iva.s1.a, Integer> c;
        public final /* synthetic */ int d;
        public final /* synthetic */ f0 e;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<u0.a, com.amazon.aps.iva.kb0.q> f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(int i, int i2, Map<com.amazon.aps.iva.s1.a, Integer> map, f0 f0Var, com.amazon.aps.iva.xb0.l<? super u0.a, com.amazon.aps.iva.kb0.q> lVar) {
            this.d = i;
            this.e = f0Var;
            this.f = lVar;
            this.a = i;
            this.b = i2;
            this.c = map;
        }

        @Override // com.amazon.aps.iva.s1.e0
        public final Map<com.amazon.aps.iva.s1.a, Integer> c() {
            return this.c;
        }

        @Override // com.amazon.aps.iva.s1.e0
        public final void d() {
            com.amazon.aps.iva.u1.e0 e0Var;
            u0.a.C0692a c0692a = u0.a.a;
            f0 f0Var = this.e;
            com.amazon.aps.iva.o2.l layoutDirection = f0Var.getLayoutDirection();
            if (f0Var instanceof com.amazon.aps.iva.u1.e0) {
                e0Var = (com.amazon.aps.iva.u1.e0) f0Var;
            } else {
                e0Var = null;
            }
            q qVar = u0.a.d;
            c0692a.getClass();
            int i = u0.a.c;
            com.amazon.aps.iva.o2.l lVar = u0.a.b;
            u0.a.c = this.d;
            u0.a.b = layoutDirection;
            boolean l = u0.a.C0692a.l(c0692a, e0Var);
            this.f.invoke(c0692a);
            if (e0Var != null) {
                e0Var.h = l;
            }
            u0.a.c = i;
            u0.a.b = lVar;
            u0.a.d = qVar;
        }

        @Override // com.amazon.aps.iva.s1.e0
        public final int getHeight() {
            return this.b;
        }

        @Override // com.amazon.aps.iva.s1.e0
        public final int getWidth() {
            return this.a;
        }
    }

    default e0 F0(int i, int i2, Map<com.amazon.aps.iva.s1.a, Integer> map, com.amazon.aps.iva.xb0.l<? super u0.a, com.amazon.aps.iva.kb0.q> lVar) {
        com.amazon.aps.iva.yb0.j.f(map, "alignmentLines");
        com.amazon.aps.iva.yb0.j.f(lVar, "placementBlock");
        return new a(i, i2, map, this, lVar);
    }
}
