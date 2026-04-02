package com.amazon.aps.iva.d0;
/* compiled from: Arrangement.kt */
/* loaded from: classes.dex */
public final class a {
    public static final i a = new i();
    public static final c b = new c();
    public static final j c = new j();
    public static final C0188a d = new C0188a();
    public static final b e = new b();
    public static final f f;

    /* compiled from: Arrangement.kt */
    /* renamed from: com.amazon.aps.iva.d0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0188a implements k {
        @Override // com.amazon.aps.iva.d0.a.k
        public final void b(com.amazon.aps.iva.o2.c cVar, int i, int[] iArr, int[] iArr2) {
            com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
            com.amazon.aps.iva.yb0.j.f(iArr, "sizes");
            com.amazon.aps.iva.yb0.j.f(iArr2, "outPositions");
            a.c(i, iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#Bottom";
        }
    }

    /* compiled from: Arrangement.kt */
    /* loaded from: classes.dex */
    public static final class b implements d, k {
        public final float a = 0;

        @Override // com.amazon.aps.iva.d0.a.d, com.amazon.aps.iva.d0.a.k
        public final float a() {
            return this.a;
        }

        @Override // com.amazon.aps.iva.d0.a.k
        public final void b(com.amazon.aps.iva.o2.c cVar, int i, int[] iArr, int[] iArr2) {
            com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
            com.amazon.aps.iva.yb0.j.f(iArr, "sizes");
            com.amazon.aps.iva.yb0.j.f(iArr2, "outPositions");
            a.a(i, iArr, iArr2, false);
        }

        @Override // com.amazon.aps.iva.d0.a.d
        public final void c(int i, com.amazon.aps.iva.o2.c cVar, com.amazon.aps.iva.o2.l lVar, int[] iArr, int[] iArr2) {
            com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
            com.amazon.aps.iva.yb0.j.f(iArr, "sizes");
            com.amazon.aps.iva.yb0.j.f(lVar, "layoutDirection");
            com.amazon.aps.iva.yb0.j.f(iArr2, "outPositions");
            if (lVar == com.amazon.aps.iva.o2.l.Ltr) {
                a.a(i, iArr, iArr2, false);
            } else {
                a.a(i, iArr, iArr2, true);
            }
        }

        public final String toString() {
            return "Arrangement#Center";
        }
    }

    /* compiled from: Arrangement.kt */
    /* loaded from: classes.dex */
    public static final class c implements d {
        @Override // com.amazon.aps.iva.d0.a.d
        public final void c(int i, com.amazon.aps.iva.o2.c cVar, com.amazon.aps.iva.o2.l lVar, int[] iArr, int[] iArr2) {
            com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
            com.amazon.aps.iva.yb0.j.f(iArr, "sizes");
            com.amazon.aps.iva.yb0.j.f(lVar, "layoutDirection");
            com.amazon.aps.iva.yb0.j.f(iArr2, "outPositions");
            if (lVar == com.amazon.aps.iva.o2.l.Ltr) {
                a.c(i, iArr, iArr2, false);
            } else {
                a.b(iArr, iArr2, true);
            }
        }

        public final String toString() {
            return "Arrangement#End";
        }
    }

    /* compiled from: Arrangement.kt */
    /* loaded from: classes.dex */
    public interface d {
        default float a() {
            return 0;
        }

        void c(int i, com.amazon.aps.iva.o2.c cVar, com.amazon.aps.iva.o2.l lVar, int[] iArr, int[] iArr2);
    }

    /* compiled from: Arrangement.kt */
    /* loaded from: classes.dex */
    public static final class e implements d, k {
        public final float a = 0;

        @Override // com.amazon.aps.iva.d0.a.d, com.amazon.aps.iva.d0.a.k
        public final float a() {
            return this.a;
        }

        @Override // com.amazon.aps.iva.d0.a.k
        public final void b(com.amazon.aps.iva.o2.c cVar, int i, int[] iArr, int[] iArr2) {
            com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
            com.amazon.aps.iva.yb0.j.f(iArr, "sizes");
            com.amazon.aps.iva.yb0.j.f(iArr2, "outPositions");
            a.d(i, iArr, iArr2, false);
        }

        @Override // com.amazon.aps.iva.d0.a.d
        public final void c(int i, com.amazon.aps.iva.o2.c cVar, com.amazon.aps.iva.o2.l lVar, int[] iArr, int[] iArr2) {
            com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
            com.amazon.aps.iva.yb0.j.f(iArr, "sizes");
            com.amazon.aps.iva.yb0.j.f(lVar, "layoutDirection");
            com.amazon.aps.iva.yb0.j.f(iArr2, "outPositions");
            if (lVar == com.amazon.aps.iva.o2.l.Ltr) {
                a.d(i, iArr, iArr2, false);
            } else {
                a.d(i, iArr, iArr2, true);
            }
        }

        public final String toString() {
            return "Arrangement#SpaceAround";
        }
    }

    /* compiled from: Arrangement.kt */
    /* loaded from: classes.dex */
    public static final class f implements d, k {
        public final float a = 0;

        @Override // com.amazon.aps.iva.d0.a.d, com.amazon.aps.iva.d0.a.k
        public final float a() {
            return this.a;
        }

        @Override // com.amazon.aps.iva.d0.a.k
        public final void b(com.amazon.aps.iva.o2.c cVar, int i, int[] iArr, int[] iArr2) {
            com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
            com.amazon.aps.iva.yb0.j.f(iArr, "sizes");
            com.amazon.aps.iva.yb0.j.f(iArr2, "outPositions");
            a.e(i, iArr, iArr2, false);
        }

        @Override // com.amazon.aps.iva.d0.a.d
        public final void c(int i, com.amazon.aps.iva.o2.c cVar, com.amazon.aps.iva.o2.l lVar, int[] iArr, int[] iArr2) {
            com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
            com.amazon.aps.iva.yb0.j.f(iArr, "sizes");
            com.amazon.aps.iva.yb0.j.f(lVar, "layoutDirection");
            com.amazon.aps.iva.yb0.j.f(iArr2, "outPositions");
            if (lVar == com.amazon.aps.iva.o2.l.Ltr) {
                a.e(i, iArr, iArr2, false);
            } else {
                a.e(i, iArr, iArr2, true);
            }
        }

        public final String toString() {
            return "Arrangement#SpaceBetween";
        }
    }

    /* compiled from: Arrangement.kt */
    /* loaded from: classes.dex */
    public static final class g implements d, k {
        public final float a = 0;

        @Override // com.amazon.aps.iva.d0.a.d, com.amazon.aps.iva.d0.a.k
        public final float a() {
            return this.a;
        }

        @Override // com.amazon.aps.iva.d0.a.k
        public final void b(com.amazon.aps.iva.o2.c cVar, int i, int[] iArr, int[] iArr2) {
            com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
            com.amazon.aps.iva.yb0.j.f(iArr, "sizes");
            com.amazon.aps.iva.yb0.j.f(iArr2, "outPositions");
            a.f(i, iArr, iArr2, false);
        }

        @Override // com.amazon.aps.iva.d0.a.d
        public final void c(int i, com.amazon.aps.iva.o2.c cVar, com.amazon.aps.iva.o2.l lVar, int[] iArr, int[] iArr2) {
            com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
            com.amazon.aps.iva.yb0.j.f(iArr, "sizes");
            com.amazon.aps.iva.yb0.j.f(lVar, "layoutDirection");
            com.amazon.aps.iva.yb0.j.f(iArr2, "outPositions");
            if (lVar == com.amazon.aps.iva.o2.l.Ltr) {
                a.f(i, iArr, iArr2, false);
            } else {
                a.f(i, iArr, iArr2, true);
            }
        }

        public final String toString() {
            return "Arrangement#SpaceEvenly";
        }
    }

    /* compiled from: Arrangement.kt */
    /* loaded from: classes.dex */
    public static final class h implements d, k {
        public final float a;
        public final boolean b;
        public final com.amazon.aps.iva.xb0.p<Integer, com.amazon.aps.iva.o2.l, Integer> c;
        public final float d;

        public h() {
            throw null;
        }

        public h(float f, com.amazon.aps.iva.xb0.p pVar) {
            this.a = f;
            this.b = true;
            this.c = pVar;
            this.d = f;
        }

        @Override // com.amazon.aps.iva.d0.a.d, com.amazon.aps.iva.d0.a.k
        public final float a() {
            return this.d;
        }

        @Override // com.amazon.aps.iva.d0.a.k
        public final void b(com.amazon.aps.iva.o2.c cVar, int i, int[] iArr, int[] iArr2) {
            com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
            com.amazon.aps.iva.yb0.j.f(iArr, "sizes");
            com.amazon.aps.iva.yb0.j.f(iArr2, "outPositions");
            c(i, cVar, com.amazon.aps.iva.o2.l.Ltr, iArr, iArr2);
        }

        @Override // com.amazon.aps.iva.d0.a.d
        public final void c(int i, com.amazon.aps.iva.o2.c cVar, com.amazon.aps.iva.o2.l lVar, int[] iArr, int[] iArr2) {
            boolean z;
            boolean z2;
            int i2;
            int i3;
            com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
            com.amazon.aps.iva.yb0.j.f(iArr, "sizes");
            com.amazon.aps.iva.yb0.j.f(lVar, "layoutDirection");
            com.amazon.aps.iva.yb0.j.f(iArr2, "outPositions");
            if (iArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return;
            }
            int f0 = cVar.f0(this.a);
            if (this.b && lVar == com.amazon.aps.iva.o2.l.Rtl) {
                z2 = true;
            } else {
                z2 = false;
            }
            i iVar = a.a;
            if (!z2) {
                int length = iArr.length;
                int i4 = 0;
                i2 = 0;
                i3 = 0;
                int i5 = 0;
                while (i4 < length) {
                    int i6 = iArr[i4];
                    int min = Math.min(i2, i - i6);
                    iArr2[i5] = min;
                    int min2 = Math.min(f0, (i - min) - i6);
                    int i7 = iArr2[i5] + i6 + min2;
                    i4++;
                    i5++;
                    i3 = min2;
                    i2 = i7;
                }
            } else {
                i2 = 0;
                i3 = 0;
                for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                    int i8 = iArr[length2];
                    int min3 = Math.min(i2, i - i8);
                    iArr2[length2] = min3;
                    i3 = Math.min(f0, (i - min3) - i8);
                    i2 = iArr2[length2] + i8 + i3;
                }
            }
            int i9 = i2 - i3;
            com.amazon.aps.iva.xb0.p<Integer, com.amazon.aps.iva.o2.l, Integer> pVar = this.c;
            if (pVar != null && i9 < i) {
                int intValue = pVar.invoke(Integer.valueOf(i - i9), lVar).intValue();
                int length3 = iArr2.length;
                for (int i10 = 0; i10 < length3; i10++) {
                    iArr2[i10] = iArr2[i10] + intValue;
                }
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            if (com.amazon.aps.iva.o2.e.a(this.a, hVar.a) && this.b == hVar.b && com.amazon.aps.iva.yb0.j.a(this.c, hVar.c)) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int hashCode;
            int hashCode2 = Float.hashCode(this.a) * 31;
            boolean z = this.b;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int i2 = (hashCode2 + i) * 31;
            com.amazon.aps.iva.xb0.p<Integer, com.amazon.aps.iva.o2.l, Integer> pVar = this.c;
            if (pVar == null) {
                hashCode = 0;
            } else {
                hashCode = pVar.hashCode();
            }
            return i2 + hashCode;
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            if (this.b) {
                str = "";
            } else {
                str = "Absolute";
            }
            sb.append(str);
            sb.append("Arrangement#spacedAligned(");
            sb.append((Object) com.amazon.aps.iva.o2.e.b(this.a));
            sb.append(", ");
            sb.append(this.c);
            sb.append(')');
            return sb.toString();
        }
    }

    /* compiled from: Arrangement.kt */
    /* loaded from: classes.dex */
    public static final class i implements d {
        @Override // com.amazon.aps.iva.d0.a.d
        public final void c(int i, com.amazon.aps.iva.o2.c cVar, com.amazon.aps.iva.o2.l lVar, int[] iArr, int[] iArr2) {
            com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
            com.amazon.aps.iva.yb0.j.f(iArr, "sizes");
            com.amazon.aps.iva.yb0.j.f(lVar, "layoutDirection");
            com.amazon.aps.iva.yb0.j.f(iArr2, "outPositions");
            if (lVar == com.amazon.aps.iva.o2.l.Ltr) {
                a.b(iArr, iArr2, false);
            } else {
                a.c(i, iArr, iArr2, true);
            }
        }

        public final String toString() {
            return "Arrangement#Start";
        }
    }

    /* compiled from: Arrangement.kt */
    /* loaded from: classes.dex */
    public static final class j implements k {
        @Override // com.amazon.aps.iva.d0.a.k
        public final void b(com.amazon.aps.iva.o2.c cVar, int i, int[] iArr, int[] iArr2) {
            com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
            com.amazon.aps.iva.yb0.j.f(iArr, "sizes");
            com.amazon.aps.iva.yb0.j.f(iArr2, "outPositions");
            a.b(iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#Top";
        }
    }

    /* compiled from: Arrangement.kt */
    /* loaded from: classes.dex */
    public interface k {
        default float a() {
            return 0;
        }

        void b(com.amazon.aps.iva.o2.c cVar, int i, int[] iArr, int[] iArr2);
    }

    static {
        new g();
        f = new f();
        new e();
    }

    public static void a(int i2, int[] iArr, int[] iArr2, boolean z) {
        com.amazon.aps.iva.yb0.j.f(iArr, "size");
        com.amazon.aps.iva.yb0.j.f(iArr2, "outPosition");
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float f2 = (i2 - i4) / 2;
        if (!z) {
            int length = iArr.length;
            int i6 = 0;
            while (i3 < length) {
                int i7 = iArr[i3];
                iArr2[i6] = com.amazon.aps.iva.ob0.f.a(f2);
                f2 += i7;
                i3++;
                i6++;
            }
            return;
        }
        for (int length2 = iArr.length - 1; -1 < length2; length2--) {
            int i8 = iArr[length2];
            iArr2[length2] = com.amazon.aps.iva.ob0.f.a(f2);
            f2 += i8;
        }
    }

    public static void b(int[] iArr, int[] iArr2, boolean z) {
        com.amazon.aps.iva.yb0.j.f(iArr, "size");
        com.amazon.aps.iva.yb0.j.f(iArr2, "outPosition");
        int i2 = 0;
        if (!z) {
            int length = iArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i2 < length) {
                int i5 = iArr[i2];
                iArr2[i3] = i4;
                i4 += i5;
                i2++;
                i3++;
            }
            return;
        }
        for (int length2 = iArr.length - 1; -1 < length2; length2--) {
            int i6 = iArr[length2];
            iArr2[length2] = i2;
            i2 += i6;
        }
    }

    public static void c(int i2, int[] iArr, int[] iArr2, boolean z) {
        com.amazon.aps.iva.yb0.j.f(iArr, "size");
        com.amazon.aps.iva.yb0.j.f(iArr2, "outPosition");
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        int i6 = i2 - i4;
        if (!z) {
            int length = iArr.length;
            int i7 = 0;
            while (i3 < length) {
                int i8 = iArr[i3];
                iArr2[i7] = i6;
                i6 += i8;
                i3++;
                i7++;
            }
            return;
        }
        for (int length2 = iArr.length - 1; -1 < length2; length2--) {
            int i9 = iArr[length2];
            iArr2[length2] = i6;
            i6 += i9;
        }
    }

    public static void d(int i2, int[] iArr, int[] iArr2, boolean z) {
        boolean z2;
        float f2;
        com.amazon.aps.iva.yb0.j.f(iArr, "size");
        com.amazon.aps.iva.yb0.j.f(iArr2, "outPosition");
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        if (iArr.length == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            f2 = (i2 - i4) / iArr.length;
        } else {
            f2 = 0.0f;
        }
        float f3 = f2 / 2;
        if (!z) {
            int length = iArr.length;
            int i6 = 0;
            while (i3 < length) {
                int i7 = iArr[i3];
                iArr2[i6] = com.amazon.aps.iva.ob0.f.a(f3);
                f3 += i7 + f2;
                i3++;
                i6++;
            }
            return;
        }
        for (int length2 = iArr.length - 1; -1 < length2; length2--) {
            int i8 = iArr[length2];
            iArr2[length2] = com.amazon.aps.iva.ob0.f.a(f3);
            f3 += i8 + f2;
        }
    }

    public static void e(int i2, int[] iArr, int[] iArr2, boolean z) {
        boolean z2;
        float f2;
        com.amazon.aps.iva.yb0.j.f(iArr, "size");
        com.amazon.aps.iva.yb0.j.f(iArr2, "outPosition");
        int i3 = 0;
        if (iArr.length == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return;
        }
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float max = (i2 - i4) / Math.max(iArr.length - 1, 1);
        if (z && iArr.length == 1) {
            f2 = max;
        } else {
            f2 = 0.0f;
        }
        if (!z) {
            int length = iArr.length;
            int i6 = 0;
            while (i3 < length) {
                int i7 = iArr[i3];
                iArr2[i6] = com.amazon.aps.iva.ob0.f.a(f2);
                f2 += i7 + max;
                i3++;
                i6++;
            }
            return;
        }
        for (int length2 = iArr.length - 1; -1 < length2; length2--) {
            int i8 = iArr[length2];
            iArr2[length2] = com.amazon.aps.iva.ob0.f.a(f2);
            f2 += i8 + max;
        }
    }

    public static void f(int i2, int[] iArr, int[] iArr2, boolean z) {
        com.amazon.aps.iva.yb0.j.f(iArr, "size");
        com.amazon.aps.iva.yb0.j.f(iArr2, "outPosition");
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float length = (i2 - i4) / (iArr.length + 1);
        if (!z) {
            int length2 = iArr.length;
            float f2 = length;
            int i6 = 0;
            while (i3 < length2) {
                int i7 = iArr[i3];
                iArr2[i6] = com.amazon.aps.iva.ob0.f.a(f2);
                f2 += i7 + length;
                i3++;
                i6++;
            }
            return;
        }
        float f3 = length;
        for (int length3 = iArr.length - 1; -1 < length3; length3--) {
            int i8 = iArr[length3];
            iArr2[length3] = com.amazon.aps.iva.ob0.f.a(f3);
            f3 += i8 + length;
        }
    }

    public static h g(float f2) {
        return new h(f2, com.amazon.aps.iva.d0.b.h);
    }
}
