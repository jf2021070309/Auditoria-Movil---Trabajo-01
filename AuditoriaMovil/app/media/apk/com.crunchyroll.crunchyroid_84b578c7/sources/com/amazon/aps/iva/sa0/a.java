package com.amazon.aps.iva.sa0;
/* loaded from: classes4.dex */
public final class a implements Comparable {
    public final int[] b;
    public final String c;

    public a(String str) {
        this.c = str;
        String[] split = str.split("\\.");
        int i = 0;
        if (split.length >= 2) {
            this.b = new int[split.length];
            while (true) {
                int[] iArr = this.b;
                if (i < iArr.length && i < 4) {
                    iArr[i] = Integer.parseInt(split[i]);
                    i++;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException(String.format("'%s' is not a valid semantic version. Must contain dot-separated major, minor, and patch numbers", new Object[0]));
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(a aVar) {
        int i;
        int i2;
        int i3;
        int[] iArr = this.b;
        int i4 = 0;
        int i5 = iArr[0];
        int[] iArr2 = aVar.b;
        int i6 = i5 - iArr2[0];
        if (i6 != 0) {
            return i6;
        }
        int i7 = iArr[1] - iArr2[1];
        if (i7 != 0) {
            return i7;
        }
        if (iArr.length > 2) {
            i = iArr[2];
        } else {
            i = 0;
        }
        if (iArr2.length > 2) {
            i2 = iArr2[2];
        } else {
            i2 = 0;
        }
        int i8 = i - i2;
        if (i8 != 0) {
            return i8;
        }
        if (iArr.length > 3) {
            i3 = iArr[3];
        } else {
            i3 = 0;
        }
        if (iArr2.length > 3) {
            i4 = iArr2[3];
        }
        return i3 - i4;
    }

    public final String toString() {
        return this.c;
    }
}
