package com.bytedance.pangle.f.a;
/* loaded from: classes.dex */
public final class f {
    int[] a;
    int[] b;

    public final String a(int i) {
        int[] iArr;
        if (i >= 0 && (iArr = this.a) != null && i < iArr.length) {
            int i2 = iArr[i];
            int a = a(this.b, i2);
            StringBuilder sb = new StringBuilder(a);
            while (a != 0) {
                i2 += 2;
                sb.append((char) a(this.b, i2));
                a--;
            }
            return sb.toString();
        }
        return null;
    }

    private static final int a(int[] iArr, int i) {
        int i2 = iArr[i / 4];
        return (i % 4) / 2 == 0 ? i2 & 65535 : i2 >>> 16;
    }
}
