package com.amazon.aps.iva.v0;
/* compiled from: ThreadMap.kt */
/* loaded from: classes.dex */
public final class d {
    public final int a;
    public final long[] b;
    public final Object[] c;

    public d(int i, long[] jArr, Object[] objArr) {
        this.a = i;
        this.b = jArr;
        this.c = objArr;
    }

    public final int a(long j) {
        int i = this.a - 1;
        if (i == -1) {
            return -1;
        }
        long[] jArr = this.b;
        int i2 = 0;
        if (i != 0) {
            while (i2 <= i) {
                int i3 = (i2 + i) >>> 1;
                int i4 = ((jArr[i3] - j) > 0L ? 1 : ((jArr[i3] - j) == 0L ? 0 : -1));
                if (i4 < 0) {
                    i2 = i3 + 1;
                } else if (i4 > 0) {
                    i = i3 - 1;
                } else {
                    return i3;
                }
            }
            return -(i2 + 1);
        }
        long j2 = jArr[0];
        if (j2 == j) {
            return 0;
        }
        if (j2 <= j) {
            return -1;
        }
        return -2;
    }

    public final d b(long j, Object obj) {
        long[] jArr;
        int i;
        Object[] objArr = this.c;
        int length = objArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= length) {
                break;
            }
            if (objArr[i3] == null) {
                z = false;
            }
            if (z) {
                i4++;
            }
            i3++;
        }
        int i5 = i4 + 1;
        long[] jArr2 = new long[i5];
        Object[] objArr2 = new Object[i5];
        if (i5 > 1) {
            int i6 = 0;
            while (true) {
                jArr = this.b;
                i = this.a;
                if (i2 >= i5 || i6 >= i) {
                    break;
                }
                long j2 = jArr[i6];
                Object obj2 = objArr[i6];
                if (j2 > j) {
                    jArr2[i2] = j;
                    objArr2[i2] = obj;
                    i2++;
                    break;
                }
                if (obj2 != null) {
                    jArr2[i2] = j2;
                    objArr2[i2] = obj2;
                    i2++;
                }
                i6++;
            }
            if (i6 == i) {
                int i7 = i5 - 1;
                jArr2[i7] = j;
                objArr2[i7] = obj;
            } else {
                while (i2 < i5) {
                    long j3 = jArr[i6];
                    Object obj3 = objArr[i6];
                    if (obj3 != null) {
                        jArr2[i2] = j3;
                        objArr2[i2] = obj3;
                        i2++;
                    }
                    i6++;
                }
            }
        } else {
            jArr2[0] = j;
            objArr2[0] = obj;
        }
        return new d(i5, jArr2, objArr2);
    }
}
