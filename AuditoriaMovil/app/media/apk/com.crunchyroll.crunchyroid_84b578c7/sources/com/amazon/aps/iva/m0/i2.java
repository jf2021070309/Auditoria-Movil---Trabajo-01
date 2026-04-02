package com.amazon.aps.iva.m0;

import com.amazon.aps.iva.h1.a;
/* compiled from: OutlinedTextField.kt */
/* loaded from: classes.dex */
public final class i2 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.h1.c, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ long h;
    public final /* synthetic */ com.amazon.aps.iva.d0.o1 i;

    /* compiled from: OutlinedTextField.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.amazon.aps.iva.o2.l.values().length];
            try {
                iArr[com.amazon.aps.iva.o2.l.Rtl.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(long j, com.amazon.aps.iva.d0.o1 o1Var) {
        super(1);
        this.h = j;
        this.i = o1Var;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.h1.c cVar) {
        float f;
        com.amazon.aps.iva.h1.c cVar2 = cVar;
        com.amazon.aps.iva.yb0.j.f(cVar2, "$this$drawWithContent");
        long j = this.h;
        float d = com.amazon.aps.iva.e1.g.d(j);
        float f2 = 0.0f;
        if (d > 0.0f) {
            float P0 = cVar2.P0(h2.a);
            float P02 = cVar2.P0(this.i.b(cVar2.getLayoutDirection())) - P0;
            float f3 = 2;
            float f4 = (P0 * f3) + d + P02;
            com.amazon.aps.iva.o2.l layoutDirection = cVar2.getLayoutDirection();
            int[] iArr = a.a;
            if (iArr[layoutDirection.ordinal()] == 1) {
                f = com.amazon.aps.iva.e1.g.d(cVar2.h()) - f4;
            } else if (P02 < 0.0f) {
                f = 0.0f;
            } else {
                f = P02;
            }
            if (iArr[cVar2.getLayoutDirection().ordinal()] == 1) {
                float d2 = com.amazon.aps.iva.e1.g.d(cVar2.h());
                if (P02 >= 0.0f) {
                    f2 = P02;
                }
                f4 = d2 - f2;
            }
            float b = com.amazon.aps.iva.e1.g.b(j);
            float f5 = (-b) / f3;
            float f6 = b / f3;
            a.b R0 = cVar2.R0();
            long h = R0.h();
            R0.a().n();
            R0.a.b(f, f5, f4, f6, 0);
            cVar2.f1();
            R0.a().g();
            R0.b(h);
        } else {
            cVar2.f1();
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
