package com.kwad.sdk.core.a;

import android.text.TextUtils;
import com.flurry.android.Constants;
import java.nio.charset.Charset;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class c {
    private static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");

    /* loaded from: classes.dex */
    public static class a {
        private static final int[] aon;
        private final boolean aop;
        private final boolean aoq = false;
        static final a aol = new a(false, false);
        static final a aom = new a(true, false);
        private static final int[] aoo = new int[256];

        static {
            int[] iArr = new int[256];
            aon = iArr;
            Arrays.fill(iArr, -1);
            for (int i = 0; i < b.aot.length; i++) {
                aon[b.aot[i]] = i;
            }
            aon[61] = -2;
            Arrays.fill(aoo, -1);
            for (int i2 = 0; i2 < b.aou.length; i2++) {
                aoo[b.aou[i2]] = i2;
            }
            aoo[61] = -2;
        }

        private a(boolean z, boolean z2) {
            this.aop = z;
        }

        private int a(byte[] bArr, int i, int i2) {
            int i3;
            int[] iArr = this.aop ? aoo : aon;
            int i4 = i2 + 0;
            int i5 = 0;
            if (i4 == 0) {
                return 0;
            }
            if (i4 < 2) {
                if (this.aoq && iArr[0] == -1) {
                    return 0;
                }
                throw new IllegalArgumentException("Input byte[] should at least have 2 bytes for base64 bytes");
            }
            if (this.aoq) {
                int i6 = 0;
                while (true) {
                    if (i >= i2) {
                        break;
                    }
                    int i7 = i + 1;
                    int i8 = bArr[i] & Constants.UNKNOWN;
                    if (i8 == 61) {
                        i4 -= (i2 - i7) + 1;
                        break;
                    }
                    if (iArr[i8] == -1) {
                        i6++;
                    }
                    i = i7;
                }
                i4 -= i6;
            } else if (bArr[i2 - 1] == 61) {
                i5 = bArr[i2 - 2] == 61 ? 2 : 1;
            }
            if (i5 == 0 && (i3 = i4 & 3) != 0) {
                i5 = 4 - i3;
            }
            return (((i4 + 3) / 4) * 3) - i5;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
            if (r11[r8] == 61) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
            if (r4 != 18) goto L25;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private int a(byte[] r11, int r12, int r13, byte[] r14) {
            /*
                Method dump skipped, instructions count: 200
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kwad.sdk.core.a.c.a.a(byte[], int, int, byte[]):int");
        }

        public final byte[] decode(String str) {
            return decode(str.getBytes(c.ISO_8859_1));
        }

        public final byte[] decode(byte[] bArr) {
            int a = a(bArr, 0, bArr.length);
            byte[] bArr2 = new byte[a];
            int a2 = a(bArr, 0, bArr.length, bArr2);
            return a2 != a ? Arrays.copyOf(bArr2, a2) : bArr2;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        static final b aor = new b(false, null, -1, true);
        static final b aos = new b(true, null, -1, false);
        private static final char[] aot = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
        private static final char[] aou = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-', '_'};
        private final boolean aop;
        private final byte[] aov = null;
        private final int aow = -1;
        private final boolean aox;

        private b(boolean z, byte[] bArr, int i, boolean z2) {
            this.aop = z;
            this.aox = z2;
        }

        private int b(byte[] bArr, int i, int i2, byte[] bArr2) {
            char[] cArr = this.aop ? aou : aot;
            int i3 = ((i2 + 0) / 3) * 3;
            int i4 = i3 + 0;
            int i5 = this.aow;
            if (i5 > 0 && i3 > (i5 / 4) * 3) {
                i3 = (i5 / 4) * 3;
            }
            int i6 = 0;
            int i7 = 0;
            while (i6 < i4) {
                int min = Math.min(i6 + i3, i4);
                int i8 = i6;
                int i9 = i7;
                while (i8 < min) {
                    int i10 = i8 + 1;
                    int i11 = i10 + 1;
                    int i12 = ((bArr[i8] & Constants.UNKNOWN) << 16) | ((bArr[i10] & Constants.UNKNOWN) << 8);
                    int i13 = i11 + 1;
                    int i14 = i12 | (bArr[i11] & Constants.UNKNOWN);
                    int i15 = i9 + 1;
                    bArr2[i9] = (byte) cArr[(i14 >>> 18) & 63];
                    int i16 = i15 + 1;
                    bArr2[i15] = (byte) cArr[(i14 >>> 12) & 63];
                    int i17 = i16 + 1;
                    bArr2[i16] = (byte) cArr[(i14 >>> 6) & 63];
                    i9 = i17 + 1;
                    bArr2[i17] = (byte) cArr[i14 & 63];
                    i8 = i13;
                }
                int i18 = ((min - i6) / 3) * 4;
                i7 += i18;
                if (i18 == this.aow && min < i2) {
                    byte[] bArr3 = this.aov;
                    int length = bArr3.length;
                    int i19 = 0;
                    while (i19 < length) {
                        bArr2[i7] = bArr3[i19];
                        i19++;
                        i7++;
                    }
                }
                i6 = min;
            }
            if (i6 < i2) {
                int i20 = i6 + 1;
                int i21 = bArr[i6] & Constants.UNKNOWN;
                int i22 = i7 + 1;
                bArr2[i7] = (byte) cArr[i21 >> 2];
                if (i20 == i2) {
                    int i23 = i22 + 1;
                    bArr2[i22] = (byte) cArr[(i21 << 4) & 63];
                    if (this.aox) {
                        int i24 = i23 + 1;
                        bArr2[i23] = 61;
                        int i25 = i24 + 1;
                        bArr2[i24] = 61;
                        return i25;
                    }
                    return i23;
                }
                int i26 = bArr[i20] & Constants.UNKNOWN;
                int i27 = i22 + 1;
                bArr2[i22] = (byte) cArr[((i21 << 4) & 63) | (i26 >> 4)];
                int i28 = i27 + 1;
                bArr2[i27] = (byte) cArr[(i26 << 2) & 63];
                if (this.aox) {
                    int i29 = i28 + 1;
                    bArr2[i28] = 61;
                    return i29;
                }
                return i28;
            }
            return i7;
        }

        private final int bX(int i) {
            int i2;
            if (this.aox) {
                i2 = ((i + 2) / 3) * 4;
            } else {
                int i3 = i % 3;
                i2 = ((i / 3) * 4) + (i3 == 0 ? 0 : i3 + 1);
            }
            int i4 = this.aow;
            return i4 > 0 ? i2 + (((i2 - 1) / i4) * this.aov.length) : i2;
        }

        public final byte[] encode(byte[] bArr) {
            int bX = bX(bArr.length);
            byte[] bArr2 = new byte[bX];
            int b = b(bArr, 0, bArr.length, bArr2);
            return b != bX ? Arrays.copyOf(bArr2, b) : bArr2;
        }

        public final String encodeToString(byte[] bArr) {
            byte[] encode = encode(bArr);
            return new String(encode, 0, 0, encode.length);
        }
    }

    public static b AI() {
        return b.aor;
    }

    public static b AJ() {
        return b.aos;
    }

    public static a AK() {
        return a.aol;
    }

    public static a AL() {
        return a.aom;
    }

    public static String cR(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return "sDAkk/dS" + new String(AI().encode(str.getBytes()), com.kwad.sdk.crash.utils.a.UTF_8);
    }

    public static String cS(String str) {
        return TextUtils.isEmpty(str) ? "" : str.startsWith("sDAkk/dS") ? new String(AK().decode(str.substring(8)), com.kwad.sdk.crash.utils.a.UTF_8) : str;
    }

    public static boolean cT(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("sDAkk/dS");
    }
}
