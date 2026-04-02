package com.amazon.aps.iva.v4;

import com.google.common.base.Ascii;
/* compiled from: Utf8.java */
/* loaded from: classes.dex */
public final class p1 {
    public static final b a;

    /* compiled from: Utf8.java */
    /* loaded from: classes.dex */
    public static class a {
        public static void a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws z {
            if (!c(b2)) {
                if ((((b2 + 112) + (b << Ascii.FS)) >> 30) == 0 && !c(b3) && !c(b4)) {
                    int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                    cArr[i] = (char) ((i2 >>> 10) + 55232);
                    cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                    return;
                }
            }
            throw z.a();
        }

        public static void b(byte b, byte b2, byte b3, char[] cArr, int i) throws z {
            if (!c(b2) && ((b != -32 || b2 >= -96) && ((b != -19 || b2 < -96) && !c(b3)))) {
                cArr[i] = (char) (((b & Ascii.SI) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                return;
            }
            throw z.a();
        }

        public static boolean c(byte b) {
            if (b > -65) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Utf8.java */
    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract String a(byte[] bArr, int i, int i2) throws z;

        public abstract int b(CharSequence charSequence, byte[] bArr, int i, int i2);

        public abstract int c(byte[] bArr, int i, int i2);
    }

    /* compiled from: Utf8.java */
    /* loaded from: classes.dex */
    public static final class c extends b {
        @Override // com.amazon.aps.iva.v4.p1.b
        public final String a(byte[] bArr, int i, int i2) throws z {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (i < i3) {
                    byte b = bArr[i];
                    if (b >= 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (!z5) {
                        break;
                    }
                    i++;
                    cArr[i4] = (char) b;
                    i4++;
                }
                int i5 = i4;
                while (i < i3) {
                    int i6 = i + 1;
                    byte b2 = bArr[i];
                    if (b2 >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        int i7 = i5 + 1;
                        cArr[i5] = (char) b2;
                        i = i6;
                        while (true) {
                            i5 = i7;
                            if (i >= i3) {
                                break;
                            }
                            byte b3 = bArr[i];
                            if (b3 >= 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                break;
                            }
                            i++;
                            i7 = i5 + 1;
                            cArr[i5] = (char) b3;
                        }
                    } else {
                        if (b2 < -32) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            if (i6 < i3) {
                                int i8 = i6 + 1;
                                byte b4 = bArr[i6];
                                int i9 = i5 + 1;
                                if (b2 >= -62 && !a.c(b4)) {
                                    cArr[i5] = (char) (((b2 & Ascii.US) << 6) | (b4 & 63));
                                    i = i8;
                                    i5 = i9;
                                } else {
                                    throw z.a();
                                }
                            } else {
                                throw z.a();
                            }
                        } else {
                            if (b2 < -16) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                if (i6 < i3 - 1) {
                                    int i10 = i6 + 1;
                                    a.b(b2, bArr[i6], bArr[i10], cArr, i5);
                                    i = i10 + 1;
                                    i5++;
                                } else {
                                    throw z.a();
                                }
                            } else if (i6 < i3 - 2) {
                                int i11 = i6 + 1;
                                byte b5 = bArr[i6];
                                int i12 = i11 + 1;
                                a.a(b2, b5, bArr[i11], bArr[i12], cArr, i5);
                                i5 = i5 + 1 + 1;
                                i = i12 + 1;
                            } else {
                                throw z.a();
                            }
                        }
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
            return r10 + r0;
         */
        @Override // com.amazon.aps.iva.v4.p1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int b(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
            /*
                Method dump skipped, instructions count: 250
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.v4.p1.c.b(java.lang.CharSequence, byte[], int, int):int");
        }

        @Override // com.amazon.aps.iva.v4.p1.b
        public final int c(byte[] bArr, int i, int i2) {
            while (i < i2 && bArr[i] >= 0) {
                i++;
            }
            if (i < i2) {
                while (i < i2) {
                    int i3 = i + 1;
                    byte b = bArr[i];
                    if (b < 0) {
                        if (b < -32) {
                            if (i3 >= i2) {
                                return b;
                            }
                            if (b >= -62) {
                                i = i3 + 1;
                                if (bArr[i3] > -65) {
                                }
                            }
                            return -1;
                        }
                        if (b < -16) {
                            if (i3 >= i2 - 1) {
                                return p1.a(bArr, i3, i2);
                            }
                            int i4 = i3 + 1;
                            byte b2 = bArr[i3];
                            if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                                i = i4 + 1;
                                if (bArr[i4] > -65) {
                                }
                            }
                        } else if (i3 >= i2 - 2) {
                            return p1.a(bArr, i3, i2);
                        } else {
                            int i5 = i3 + 1;
                            byte b3 = bArr[i3];
                            if (b3 <= -65) {
                                if ((((b3 + 112) + (b << Ascii.FS)) >> 30) == 0) {
                                    int i6 = i5 + 1;
                                    if (bArr[i5] <= -65) {
                                        i3 = i6 + 1;
                                        if (bArr[i6] > -65) {
                                        }
                                    }
                                }
                            }
                        }
                        return -1;
                    }
                    i = i3;
                }
            }
            return 0;
        }
    }

    /* compiled from: Utf8.java */
    /* loaded from: classes.dex */
    public static class d extends IllegalArgumentException {
        public d(int i, int i2) {
            super(com.amazon.aps.iva.j0.j0.e("Unpaired surrogate at index ", i, " of ", i2));
        }
    }

    /* compiled from: Utf8.java */
    /* loaded from: classes.dex */
    public static final class e extends b {
        public static int d(byte[] bArr, long j, int i) {
            int i2 = 0;
            if (i < 16) {
                return 0;
            }
            while (true) {
                int i3 = i2 + 8;
                if (i3 > i || (o1.n(bArr, o1.f + j) & (-9187201950435737472L)) != 0) {
                    break;
                }
                j += 8;
                i2 = i3;
            }
            while (i2 < i) {
                long j2 = 1 + j;
                if (o1.h(bArr, j) < 0) {
                    return i2;
                }
                i2++;
                j = j2;
            }
            return i;
        }

        public static int e(byte[] bArr, int i, long j, int i2) {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        return p1.d(i, o1.h(bArr, j), o1.h(bArr, j + 1));
                    }
                    throw new AssertionError();
                }
                return p1.c(i, o1.h(bArr, j));
            }
            b bVar = p1.a;
            if (i > -12) {
                return -1;
            }
            return i;
        }

        @Override // com.amazon.aps.iva.v4.p1.b
        public final String a(byte[] bArr, int i, int i2) throws z {
            boolean z;
            int i3;
            boolean z2;
            boolean z3;
            boolean z4;
            if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
                int d = d(bArr, i, i2) + i;
                int i4 = i + i2;
                while (d < i4 && o1.h(bArr, d) >= 0) {
                    d++;
                }
                if (d == i4) {
                    return new String(bArr, i, i2, y.a);
                }
                char[] cArr = new char[i2];
                int i5 = 0;
                while (i < d) {
                    cArr[i5] = (char) o1.h(bArr, i);
                    i++;
                    i5++;
                }
                int i6 = i5;
                while (d < i4) {
                    int i7 = d + 1;
                    byte h = o1.h(bArr, d);
                    if (h >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        i3 = i6 + 1;
                        cArr[i6] = (char) h;
                        while (i7 < i4) {
                            byte h2 = o1.h(bArr, i7);
                            if (h2 >= 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                break;
                            }
                            i7++;
                            cArr[i3] = (char) h2;
                            i3++;
                        }
                        d = i7;
                    } else {
                        if (h < -32) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            if (i7 < i4) {
                                d = i7 + 1;
                                byte h3 = o1.h(bArr, i7);
                                i3 = i6 + 1;
                                if (h >= -62 && !a.c(h3)) {
                                    cArr[i6] = (char) ((h3 & 63) | ((h & Ascii.US) << 6));
                                } else {
                                    throw z.a();
                                }
                            } else {
                                throw z.a();
                            }
                        } else {
                            if (h < -16) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                if (i7 < i4 - 1) {
                                    int i8 = i7 + 1;
                                    a.b(h, o1.h(bArr, i7), o1.h(bArr, i8), cArr, i6);
                                    d = i8 + 1;
                                    i6++;
                                } else {
                                    throw z.a();
                                }
                            } else if (i7 < i4 - 2) {
                                int i9 = i7 + 1;
                                int i10 = i9 + 1;
                                a.a(h, o1.h(bArr, i7), o1.h(bArr, i9), o1.h(bArr, i10), cArr, i6);
                                i6 = i6 + 1 + 1;
                                d = i10 + 1;
                            } else {
                                throw z.a();
                            }
                        }
                    }
                    i6 = i3;
                }
                return new String(cArr, 0, i6);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }

        @Override // com.amazon.aps.iva.v4.p1.b
        public final int b(CharSequence charSequence, byte[] bArr, int i, int i2) {
            long j;
            char c;
            long j2;
            long j3;
            char c2;
            int i3;
            char charAt;
            long j4 = i;
            long j5 = i2 + j4;
            int length = charSequence.length();
            if (length <= i2 && bArr.length - i2 >= i) {
                int i4 = 0;
                while (true) {
                    j = 1;
                    c = 128;
                    if (i4 >= length || (charAt = charSequence.charAt(i4)) >= 128) {
                        break;
                    }
                    o1.q(bArr, j4, (byte) charAt);
                    i4++;
                    j4 = 1 + j4;
                }
                if (i4 == length) {
                    return (int) j4;
                }
                while (i4 < length) {
                    char charAt2 = charSequence.charAt(i4);
                    if (charAt2 < c && j4 < j5) {
                        long j6 = j4 + j;
                        o1.q(bArr, j4, (byte) charAt2);
                        j3 = j;
                        j2 = j6;
                        c2 = c;
                    } else if (charAt2 < 2048 && j4 <= j5 - 2) {
                        long j7 = j4 + j;
                        o1.q(bArr, j4, (byte) ((charAt2 >>> 6) | 960));
                        long j8 = j7 + j;
                        o1.q(bArr, j7, (byte) ((charAt2 & '?') | 128));
                        long j9 = j;
                        c2 = 128;
                        j2 = j8;
                        j3 = j9;
                    } else if ((charAt2 < 55296 || 57343 < charAt2) && j4 <= j5 - 3) {
                        long j10 = j4 + j;
                        o1.q(bArr, j4, (byte) ((charAt2 >>> '\f') | 480));
                        long j11 = j10 + j;
                        o1.q(bArr, j10, (byte) (((charAt2 >>> 6) & 63) | 128));
                        o1.q(bArr, j11, (byte) ((charAt2 & '?') | 128));
                        j2 = j11 + 1;
                        j3 = 1;
                        c2 = 128;
                    } else if (j4 <= j5 - 4) {
                        int i5 = i4 + 1;
                        if (i5 != length) {
                            char charAt3 = charSequence.charAt(i5);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                long j12 = j4 + 1;
                                o1.q(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                                long j13 = j12 + 1;
                                c2 = 128;
                                o1.q(bArr, j12, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j14 = j13 + 1;
                                o1.q(bArr, j13, (byte) (((codePoint >>> 6) & 63) | 128));
                                j3 = 1;
                                j2 = j14 + 1;
                                o1.q(bArr, j14, (byte) ((codePoint & 63) | 128));
                                i4 = i5;
                            } else {
                                i4 = i5;
                            }
                        }
                        throw new d(i4 - 1, length);
                    } else if (55296 <= charAt2 && charAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                        throw new d(i4, length);
                    } else {
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + j4);
                    }
                    i4++;
                    c = c2;
                    long j15 = j3;
                    j4 = j2;
                    j = j15;
                }
                return (int) j4;
            }
            throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i + i2));
        }

        @Override // com.amazon.aps.iva.v4.p1.b
        public final int c(byte[] bArr, int i, int i2) {
            long j;
            if ((i | i2 | (bArr.length - i2)) >= 0) {
                long j2 = i;
                int i3 = (int) (i2 - j2);
                int d = d(bArr, j2, i3);
                int i4 = i3 - d;
                long j3 = j2 + d;
                while (true) {
                    byte b = 0;
                    while (true) {
                        if (i4 <= 0) {
                            break;
                        }
                        long j4 = j3 + 1;
                        b = o1.h(bArr, j3);
                        if (b >= 0) {
                            i4--;
                            j3 = j4;
                        } else {
                            j3 = j4;
                            break;
                        }
                    }
                    if (i4 == 0) {
                        return 0;
                    }
                    int i5 = i4 - 1;
                    if (b < -32) {
                        if (i5 == 0) {
                            return b;
                        }
                        i4 = i5 - 1;
                        if (b < -62) {
                            break;
                        }
                        j = 1 + j3;
                        if (o1.h(bArr, j3) > -65) {
                            break;
                        }
                        j3 = j;
                    } else if (b < -16) {
                        if (i5 < 2) {
                            return e(bArr, b, j3, i5);
                        }
                        i4 = i5 - 2;
                        long j5 = j3 + 1;
                        byte h = o1.h(bArr, j3);
                        if (h > -65 || ((b == -32 && h < -96) || (b == -19 && h >= -96))) {
                            break;
                        }
                        j = 1 + j5;
                        if (o1.h(bArr, j5) > -65) {
                            break;
                        }
                        j3 = j;
                    } else if (i5 < 3) {
                        return e(bArr, b, j3, i5);
                    } else {
                        i4 = i5 - 3;
                        long j6 = j3 + 1;
                        byte h2 = o1.h(bArr, j3);
                        if (h2 > -65) {
                            break;
                        }
                        if ((((h2 + 112) + (b << Ascii.FS)) >> 30) != 0) {
                            break;
                        }
                        long j7 = j6 + 1;
                        if (o1.h(bArr, j6) > -65) {
                            break;
                        }
                        j = 1 + j7;
                        if (o1.h(bArr, j7) > -65) {
                            break;
                        }
                        j3 = j;
                    }
                }
                return -1;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    static {
        boolean z;
        b cVar;
        if (o1.e && o1.d) {
            z = true;
        } else {
            z = false;
        }
        if (z && !com.amazon.aps.iva.v4.d.a()) {
            cVar = new e();
        } else {
            cVar = new c();
        }
        a = cVar;
    }

    public static int a(byte[] bArr, int i, int i2) {
        byte b2 = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    return d(b2, bArr[i], bArr[i + 1]);
                }
                throw new AssertionError();
            }
            return c(b2, bArr[i]);
        }
        if (b2 > -12) {
            b2 = -1;
        }
        return b2;
    }

    public static int b(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new d(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i3 + 4294967296L));
    }

    public static int c(int i, int i2) {
        if (i <= -12 && i2 <= -65) {
            return i ^ (i2 << 8);
        }
        return -1;
    }

    public static int d(int i, int i2, int i3) {
        if (i <= -12 && i2 <= -65 && i3 <= -65) {
            return (i ^ (i2 << 8)) ^ (i3 << 16);
        }
        return -1;
    }
}
