package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Cn  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0524Cn {
    public static String[] A04 = {"mvf", "5vUSiUqvqexSVjGtqKGfn", "JwxxJCZPfqV7dBG9RK7xAyPr7ROekLAM", "", "XpEsaMQEhp4STG8PYYwcejEb1g", "Vmkb7cGbkehknCkwYPEH7uVKWZ5FPigs", "LeK9QdxXLgCTlktURPbNFMf3RZigSes2", "9odHEpKIuTJMz7KtuT4u9eB1nZm0XlV7"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final byte[] A03;

    public C0524Cn(int i2, byte[] bArr, int i3, int i4) {
        this.A01 = i2;
        this.A03 = bArr;
        this.A02 = i3;
        this.A00 = i4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0524Cn c0524Cn = (C0524Cn) obj;
        if (this.A01 == c0524Cn.A01) {
            int i2 = this.A02;
            int i3 = c0524Cn.A02;
            String[] strArr = A04;
            if (strArr[0].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[2] = "eTvhBYpDKk9eWFXXJfKHFDj3AmOCaziB";
            strArr2[1] = "mkymkzw6fBYyEptVGXW89";
            if (i2 == i3 && this.A00 == c0524Cn.A00 && Arrays.equals(this.A03, c0524Cn.A03)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A02;
        return (((((this.A01 * 31) + Arrays.hashCode(this.A03)) * 31) + result) * 31) + this.A00;
    }
}
