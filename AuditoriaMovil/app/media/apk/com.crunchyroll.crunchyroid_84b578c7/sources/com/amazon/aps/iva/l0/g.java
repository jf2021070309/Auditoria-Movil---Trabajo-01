package com.amazon.aps.iva.l0;
/* compiled from: AndroidSelectionHandles.android.kt */
/* loaded from: classes.dex */
public final class g implements com.amazon.aps.iva.q2.y {
    public final h a;
    public final long b;

    /* compiled from: AndroidSelectionHandles.android.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[h.values().length];
            try {
                iArr[h.TopLeft.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.TopRight.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.TopMiddle.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public g(h hVar, long j) {
        com.amazon.aps.iva.yb0.j.f(hVar, "handleReferencePoint");
        this.a = hVar;
        this.b = j;
    }

    @Override // com.amazon.aps.iva.q2.y
    public final long a(com.amazon.aps.iva.o2.i iVar, com.amazon.aps.iva.o2.l lVar, long j) {
        com.amazon.aps.iva.yb0.j.f(lVar, "layoutDirection");
        int i = a.a[this.a.ordinal()];
        long j2 = this.b;
        int i2 = iVar.b;
        int i3 = iVar.a;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    int i4 = com.amazon.aps.iva.o2.h.c;
                    return com.amazon.aps.iva.e.w.e((i3 + ((int) (j2 >> 32))) - (((int) (j >> 32)) / 2), com.amazon.aps.iva.o2.h.b(j2) + i2);
                }
                throw new com.amazon.aps.iva.kb0.h();
            }
            return com.amazon.aps.iva.e.w.e((i3 + ((int) (j2 >> 32))) - ((int) (j >> 32)), com.amazon.aps.iva.o2.h.b(j2) + i2);
        }
        return com.amazon.aps.iva.e.w.e(i3 + ((int) (j2 >> 32)), com.amazon.aps.iva.o2.h.b(j2) + i2);
    }
}
