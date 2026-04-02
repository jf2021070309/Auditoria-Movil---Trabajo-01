package com.amazon.aps.iva.f5;
/* compiled from: WindowAlignment.java */
/* loaded from: classes.dex */
public final class b0 {
    public final a a;
    public final a b;
    public a c;
    public a d;

    /* compiled from: WindowAlignment.java */
    /* loaded from: classes.dex */
    public static class a {
        public int c;
        public int d;
        public int i;
        public int j;
        public int k;
        public boolean l;
        public int e = 2;
        public int f = 3;
        public int g = 0;
        public float h = 50.0f;
        public int b = Integer.MIN_VALUE;
        public int a = Integer.MAX_VALUE;

        public final int a() {
            int i;
            if (!this.l) {
                int i2 = this.g;
                if (i2 < 0) {
                    i2 += this.i;
                }
                float f = this.h;
                if (f != -1.0f) {
                    return i2 + ((int) ((this.i * f) / 100.0f));
                }
                return i2;
            }
            int i3 = this.g;
            if (i3 >= 0) {
                i = this.i - i3;
            } else {
                i = -i3;
            }
            float f2 = this.h;
            if (f2 != -1.0f) {
                return i - ((int) ((this.i * f2) / 100.0f));
            }
            return i;
        }

        public final int b(int i) {
            boolean z;
            int i2;
            int i3;
            int i4 = this.i;
            int a = a();
            int i5 = this.b;
            boolean z2 = false;
            if (i5 == Integer.MIN_VALUE) {
                z = true;
            } else {
                z = false;
            }
            int i6 = this.a;
            if (i6 == Integer.MAX_VALUE) {
                z2 = true;
            }
            if (!z) {
                int i7 = this.j;
                int i8 = a - i7;
                if (this.l ? (this.f & 2) != 0 : (this.f & 1) != 0) {
                    if (i - i5 <= i8) {
                        int i9 = i5 - i7;
                        if (!z2 && i9 > (i3 = this.c)) {
                            return i3;
                        }
                        return i9;
                    }
                }
            }
            if (!z2) {
                int i10 = this.k;
                int i11 = (i4 - a) - i10;
                if (this.l ? (1 & this.f) != 0 : (this.f & 2) != 0) {
                    if (i6 - i <= i11) {
                        int i12 = i6 - (i4 - i10);
                        if (!z && i12 < (i2 = this.d)) {
                            return i2;
                        }
                        return i12;
                    }
                }
            }
            return i - a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
            r7.d = r0 - r7.j;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
            r7.c = (r4 - r7.j) - r8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void c(int r8, int r9, int r10, int r11) {
            /*
                Method dump skipped, instructions count: 236
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.f5.b0.a.c(int, int, int, int):void");
        }

        public final String toString() {
            return " min:" + this.b + " " + this.d + " max:" + this.a + " " + this.c;
        }
    }

    public b0() {
        a aVar = new a();
        this.a = aVar;
        a aVar2 = new a();
        this.b = aVar2;
        this.c = aVar2;
        this.d = aVar;
    }

    public final String toString() {
        return "horizontal=" + this.b + "; vertical=" + this.a;
    }
}
