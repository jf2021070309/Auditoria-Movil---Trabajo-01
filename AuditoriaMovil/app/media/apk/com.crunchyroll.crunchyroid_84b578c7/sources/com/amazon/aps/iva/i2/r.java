package com.amazon.aps.iva.i2;
/* compiled from: GapBuffer.kt */
/* loaded from: classes.dex */
public final class r {
    public String a;
    public com.amazon.aps.iva.x.d b;
    public int c;
    public int d;

    public r(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "text");
        this.a = str;
        this.c = -1;
        this.d = -1;
    }

    public final int a() {
        com.amazon.aps.iva.x.d dVar = this.b;
        if (dVar == null) {
            return this.a.length();
        }
        return (dVar.b - (dVar.d - dVar.c)) + (this.a.length() - (this.d - this.c));
    }

    public final void b(int i, int i2, String str) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(str, "text");
        boolean z2 = true;
        if (i <= i2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i < 0) {
                z2 = false;
            }
            if (z2) {
                com.amazon.aps.iva.x.d dVar = this.b;
                if (dVar == null) {
                    int max = Math.max(255, str.length() + 128);
                    char[] cArr = new char[max];
                    int min = Math.min(i, 64);
                    int min2 = Math.min(this.a.length() - i2, 64);
                    int i3 = i - min;
                    com.amazon.aps.iva.e.w.Q(this.a, cArr, 0, i3, i);
                    int i4 = max - min2;
                    int i5 = min2 + i2;
                    com.amazon.aps.iva.e.w.Q(this.a, cArr, i4, i2, i5);
                    com.amazon.aps.iva.e.w.Q(str, cArr, min, 0, str.length());
                    this.b = new com.amazon.aps.iva.x.d(cArr, str.length() + min, i4);
                    this.c = i3;
                    this.d = i5;
                    return;
                }
                int i6 = this.c;
                int i7 = i - i6;
                int i8 = i2 - i6;
                if (i7 >= 0 && i8 <= dVar.b - (dVar.d - dVar.c)) {
                    int length = str.length() - (i8 - i7);
                    int i9 = dVar.d - dVar.c;
                    if (length > i9) {
                        int i10 = length - i9;
                        int i11 = dVar.b;
                        do {
                            i11 *= 2;
                        } while (i11 - dVar.b < i10);
                        char[] cArr2 = new char[i11];
                        com.amazon.aps.iva.lb0.m.E((char[]) dVar.e, cArr2, 0, 0, dVar.c);
                        int i12 = dVar.b;
                        int i13 = dVar.d;
                        int i14 = i12 - i13;
                        int i15 = i11 - i14;
                        com.amazon.aps.iva.lb0.m.E((char[]) dVar.e, cArr2, i15, i13, i14 + i13);
                        dVar.e = cArr2;
                        dVar.b = i11;
                        dVar.d = i15;
                    }
                    int i16 = dVar.c;
                    if (i7 < i16 && i8 <= i16) {
                        int i17 = i16 - i8;
                        char[] cArr3 = (char[]) dVar.e;
                        com.amazon.aps.iva.lb0.m.E(cArr3, cArr3, dVar.d - i17, i8, i16);
                        dVar.c = i7;
                        dVar.d -= i17;
                    } else if (i7 < i16 && i8 >= i16) {
                        dVar.d = (dVar.d - i16) + i8;
                        dVar.c = i7;
                    } else {
                        int i18 = dVar.d;
                        int i19 = i18 - i16;
                        int i20 = i7 + i19;
                        char[] cArr4 = (char[]) dVar.e;
                        com.amazon.aps.iva.lb0.m.E(cArr4, cArr4, i16, i18, i20);
                        dVar.c += i20 - i18;
                        dVar.d = i19 + i8;
                    }
                    com.amazon.aps.iva.e.w.Q(str, (char[]) dVar.e, dVar.c, 0, str.length());
                    dVar.c = str.length() + dVar.c;
                    return;
                }
                this.a = toString();
                this.b = null;
                this.c = -1;
                this.d = -1;
                b(i, i2, str);
                return;
            }
            throw new IllegalArgumentException(com.amazon.aps.iva.q.c0.a("start must be non-negative, but was ", i).toString());
        }
        throw new IllegalArgumentException(com.amazon.aps.iva.j0.j0.e("start index must be less than or equal to end index: ", i, " > ", i2).toString());
    }

    public final String toString() {
        com.amazon.aps.iva.x.d dVar = this.b;
        if (dVar == null) {
            return this.a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) this.a, 0, this.c);
        sb.append((char[]) dVar.e, 0, dVar.c);
        int i = dVar.d;
        sb.append((char[]) dVar.e, i, dVar.b - i);
        String str = this.a;
        sb.append((CharSequence) str, this.d, str.length());
        String sb2 = sb.toString();
        com.amazon.aps.iva.yb0.j.e(sb2, "sb.toString()");
        return sb2;
    }
}
