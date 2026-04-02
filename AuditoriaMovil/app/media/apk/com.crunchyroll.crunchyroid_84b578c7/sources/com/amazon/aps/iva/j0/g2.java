package com.amazon.aps.iva.j0;
/* compiled from: TextFieldScroll.kt */
/* loaded from: classes.dex */
public final class g2 {

    /* compiled from: TextFieldScroll.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.amazon.aps.iva.b0.f0.values().length];
            try {
                iArr[com.amazon.aps.iva.b0.f0.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.amazon.aps.iva.b0.f0.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public static final com.amazon.aps.iva.e1.e a(com.amazon.aps.iva.s1.f0 f0Var, int i, com.amazon.aps.iva.i2.o0 o0Var, com.amazon.aps.iva.c2.y yVar, boolean z, int i2) {
        com.amazon.aps.iva.e1.e eVar;
        float f;
        float f2;
        if (yVar != null) {
            eVar = yVar.c(o0Var.b.b(i));
        } else {
            eVar = com.amazon.aps.iva.e1.e.e;
        }
        int f0 = f0Var.f0(k1.b);
        float f3 = eVar.a;
        if (z) {
            f = (i2 - f3) - f0;
        } else {
            f = f3;
        }
        if (z) {
            f2 = i2 - f3;
        } else {
            f2 = f0 + f3;
        }
        return new com.amazon.aps.iva.e1.e(f, eVar.b, f2, eVar.d);
    }
}
