package com.amazon.aps.iva.d0;
/* compiled from: Intrinsic.kt */
/* loaded from: classes.dex */
public final class j0 {

    /* compiled from: Intrinsic.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b1.values().length];
            try {
                iArr[b1.Min.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b1.Max.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public static final com.amazon.aps.iva.a1.f a(com.amazon.aps.iva.a1.f fVar, b1 b1Var) {
        com.amazon.aps.iva.yb0.j.f(fVar, "<this>");
        com.amazon.aps.iva.yb0.j.f(b1Var, "intrinsicSize");
        int i = a.a[b1Var.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return fVar.o(f1.c);
            }
            throw new com.amazon.aps.iva.kb0.h();
        }
        return fVar.o(h1.c);
    }
}
