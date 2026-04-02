package com.amazon.aps.iva.w6;
/* compiled from: Projection.java */
/* loaded from: classes.dex */
public final class e {
    public final a a;
    public final a b;
    public final int c;
    public final boolean d;

    /* compiled from: Projection.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final b[] a;

        public a(b... bVarArr) {
            this.a = bVarArr;
        }
    }

    /* compiled from: Projection.java */
    /* loaded from: classes.dex */
    public static final class b {
        public final int a;
        public final int b;
        public final float[] c;
        public final float[] d;

        public b(int i, int i2, float[] fArr, float[] fArr2) {
            boolean z;
            this.a = i;
            if (fArr.length * 2 == fArr2.length * 3) {
                z = true;
            } else {
                z = false;
            }
            com.amazon.aps.iva.cq.b.t(z);
            this.c = fArr;
            this.d = fArr2;
            this.b = i2;
        }
    }

    public e() {
        throw null;
    }

    public e(a aVar, a aVar2, int i) {
        this.a = aVar;
        this.b = aVar2;
        this.c = i;
        this.d = aVar == aVar2;
    }
}
