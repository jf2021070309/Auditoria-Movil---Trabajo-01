package com.amazon.aps.iva.e6;

import java.util.Locale;
/* compiled from: UrlTemplate.java */
/* loaded from: classes.dex */
public final class m {
    public final String[] a;
    public final int[] b;
    public final String[] c;
    public final int d;

    public m(String[] strArr, int[] iArr, String[] strArr2, int i) {
        this.a = strArr;
        this.b = iArr;
        this.c = strArr2;
        this.d = i;
    }

    public final String a(String str, long j, int i, long j2) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            String[] strArr = this.a;
            int i3 = this.d;
            if (i2 < i3) {
                sb.append(strArr[i2]);
                int i4 = this.b[i2];
                if (i4 == 1) {
                    sb.append(str);
                } else {
                    String[] strArr2 = this.c;
                    if (i4 == 2) {
                        sb.append(String.format(Locale.US, strArr2[i2], Long.valueOf(j)));
                    } else if (i4 == 3) {
                        sb.append(String.format(Locale.US, strArr2[i2], Integer.valueOf(i)));
                    } else if (i4 == 4) {
                        sb.append(String.format(Locale.US, strArr2[i2], Long.valueOf(j2)));
                    }
                }
                i2++;
            } else {
                sb.append(strArr[i3]);
                return sb.toString();
            }
        }
    }
}
