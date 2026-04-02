package com.amazon.aps.iva.j0;
/* compiled from: ValidatingOffsetMapping.kt */
/* loaded from: classes.dex */
public final class t2 implements com.amazon.aps.iva.i2.q {
    public final com.amazon.aps.iva.i2.q a;
    public final int b;
    public final int c;

    public t2(com.amazon.aps.iva.i2.q qVar, int i, int i2) {
        com.amazon.aps.iva.yb0.j.f(qVar, "delegate");
        this.a = qVar;
        this.b = i;
        this.c = i2;
    }

    @Override // com.amazon.aps.iva.i2.q
    public final int a(int i) {
        int a = this.a.a(i);
        int i2 = this.b;
        boolean z = false;
        if (a >= 0 && a <= i2) {
            z = true;
        }
        if (z) {
            return a;
        }
        throw new IllegalStateException(com.amazon.aps.iva.d0.b2.b(com.amazon.aps.iva.b6.x.a("OffsetMapping.transformedToOriginal returned invalid mapping: ", i, " -> ", a, " is not in range of original text [0, "), i2, ']').toString());
    }

    @Override // com.amazon.aps.iva.i2.q
    public final int b(int i) {
        int b = this.a.b(i);
        int i2 = this.c;
        boolean z = false;
        if (b >= 0 && b <= i2) {
            z = true;
        }
        if (z) {
            return b;
        }
        throw new IllegalStateException(com.amazon.aps.iva.d0.b2.b(com.amazon.aps.iva.b6.x.a("OffsetMapping.originalToTransformed returned invalid mapping: ", i, " -> ", b, " is not in range of transformed text [0, "), i2, ']').toString());
    }
}
