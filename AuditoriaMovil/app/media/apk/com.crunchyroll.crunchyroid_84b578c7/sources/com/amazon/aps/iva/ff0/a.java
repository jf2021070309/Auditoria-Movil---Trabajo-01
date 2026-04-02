package com.amazon.aps.iva.ff0;

import com.amazon.aps.iva.ef0.e;
import com.amazon.aps.iva.ef0.t;
import com.amazon.aps.iva.ef0.y;
import com.amazon.aps.iva.yb0.j;
import com.google.common.primitives.UnsignedBytes;
/* compiled from: Buffer.kt */
/* loaded from: classes4.dex */
public final class a {
    public static final byte[] a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(com.amazon.aps.iva.oe0.a.b);
        j.e(bytes, "this as java.lang.String).getBytes(charset)");
        a = bytes;
    }

    public static final boolean a(y yVar, int i, byte[] bArr, int i2) {
        int i3 = yVar.c;
        byte[] bArr2 = yVar.a;
        for (int i4 = 1; i4 < i2; i4++) {
            if (i == i3) {
                yVar = yVar.f;
                j.c(yVar);
                i = yVar.b;
                i3 = yVar.c;
                bArr2 = yVar.a;
            }
            if (bArr2[i] != bArr[i4]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static final String b(e eVar, long j) {
        j.f(eVar, "<this>");
        if (j > 0) {
            long j2 = j - 1;
            if (eVar.i(j2) == 13) {
                String B = eVar.B(j2);
                eVar.e(2L);
                return B;
            }
        }
        String B2 = eVar.B(j);
        eVar.e(1L);
        return B2;
    }

    public static final int c(e eVar, t tVar, boolean z) {
        int i;
        int i2;
        boolean z2;
        byte[] bArr;
        int i3;
        y yVar;
        j.f(eVar, "<this>");
        j.f(tVar, "options");
        y yVar2 = eVar.b;
        int i4 = -2;
        if (yVar2 == null) {
            if (z) {
                return -2;
            }
            return -1;
        }
        int i5 = yVar2.b;
        int i6 = yVar2.c;
        byte[] bArr2 = yVar2.a;
        y yVar3 = yVar2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int[] iArr = tVar.c;
            int i10 = iArr[i8];
            int i11 = i9 + 1;
            int i12 = iArr[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (yVar3 == null) {
                break;
            }
            if (i10 < 0) {
                int i13 = (i10 * (-1)) + i11;
                while (true) {
                    int i14 = i5 + 1;
                    int i15 = i11 + 1;
                    if ((bArr2[i5] & UnsignedBytes.MAX_VALUE) != iArr[i11]) {
                        return i7;
                    }
                    if (i15 == i13) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (i14 == i6) {
                        j.c(yVar3);
                        y yVar4 = yVar3.f;
                        j.c(yVar4);
                        i3 = yVar4.b;
                        int i16 = yVar4.c;
                        bArr = yVar4.a;
                        if (yVar4 == yVar2) {
                            if (!z2) {
                                break loop0;
                            }
                            i6 = i16;
                            yVar = null;
                        } else {
                            yVar = yVar4;
                            i6 = i16;
                        }
                    } else {
                        y yVar5 = yVar3;
                        bArr = bArr2;
                        i3 = i14;
                        yVar = yVar5;
                    }
                    if (z2) {
                        i = iArr[i15];
                        i2 = i3;
                        bArr2 = bArr;
                        yVar3 = yVar;
                        break;
                    }
                    i5 = i3;
                    bArr2 = bArr;
                    i11 = i15;
                    yVar3 = yVar;
                }
            } else {
                int i17 = i5 + 1;
                int i18 = bArr2[i5] & UnsignedBytes.MAX_VALUE;
                int i19 = i11 + i10;
                while (i11 != i19) {
                    if (i18 == iArr[i11]) {
                        i = iArr[i11 + i10];
                        if (i17 == i6) {
                            yVar3 = yVar3.f;
                            j.c(yVar3);
                            i2 = yVar3.b;
                            i6 = yVar3.c;
                            bArr2 = yVar3.a;
                            if (yVar3 == yVar2) {
                                yVar3 = null;
                            }
                        } else {
                            i2 = i17;
                        }
                    } else {
                        i11++;
                    }
                }
                return i7;
            }
            if (i >= 0) {
                return i;
            }
            i8 = -i;
            i5 = i2;
            i4 = -2;
        }
        if (z) {
            return i4;
        }
        return i7;
    }
}
