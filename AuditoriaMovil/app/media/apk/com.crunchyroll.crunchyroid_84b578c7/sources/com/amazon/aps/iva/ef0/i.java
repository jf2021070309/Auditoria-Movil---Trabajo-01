package com.amazon.aps.iva.ef0;

import com.amazon.aps.iva.ef0.e;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;
/* compiled from: ByteString.kt */
/* loaded from: classes4.dex */
public class i implements Serializable, Comparable<i> {
    public static final i e;
    public final byte[] b;
    public transient int c;
    public transient String d;

    /* compiled from: ByteString.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        /* JADX WARN: Code restructure failed: missing block: B:73:0x00e5, code lost:
            r7 = null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static com.amazon.aps.iva.ef0.i a(java.lang.String r16) {
            /*
                Method dump skipped, instructions count: 238
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ef0.i.a.a(java.lang.String):com.amazon.aps.iva.ef0.i");
        }

        public static i b(String str) {
            boolean z;
            if (str.length() % 2 == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i = 0; i < length; i++) {
                    int i2 = i * 2;
                    bArr[i] = (byte) (com.amazon.aps.iva.ff0.b.k(str.charAt(i2 + 1)) + (com.amazon.aps.iva.ff0.b.k(str.charAt(i2)) << 4));
                }
                return new i(bArr);
            }
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }

        public static i c(String str) {
            com.amazon.aps.iva.yb0.j.f(str, "<this>");
            byte[] bytes = str.getBytes(com.amazon.aps.iva.oe0.a.b);
            com.amazon.aps.iva.yb0.j.e(bytes, "this as java.lang.String).getBytes(charset)");
            i iVar = new i(bytes);
            iVar.d = str;
            return iVar;
        }

        public static i d(byte[] bArr) {
            i iVar = i.e;
            e.a aVar = b.a;
            int length = bArr.length;
            b.b(bArr.length, 0, length);
            int i = length + 0;
            com.amazon.aps.iva.a60.b.m(i, bArr.length);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i);
            com.amazon.aps.iva.yb0.j.e(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
            return new i(copyOfRange);
        }
    }

    static {
        new a();
        e = new i(new byte[0]);
    }

    public i(byte[] bArr) {
        com.amazon.aps.iva.yb0.j.f(bArr, "data");
        this.b = bArr;
    }

    public String a() {
        byte[] bArr = com.amazon.aps.iva.ef0.a.a;
        byte[] bArr2 = this.b;
        com.amazon.aps.iva.yb0.j.f(bArr2, "<this>");
        com.amazon.aps.iva.yb0.j.f(bArr, "map");
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            byte b = bArr2[i];
            int i4 = i3 + 1;
            byte b2 = bArr2[i3];
            int i5 = i4 + 1;
            byte b3 = bArr2[i4];
            int i6 = i2 + 1;
            bArr3[i2] = bArr[(b & UnsignedBytes.MAX_VALUE) >> 2];
            int i7 = i6 + 1;
            bArr3[i6] = bArr[((b & 3) << 4) | ((b2 & UnsignedBytes.MAX_VALUE) >> 4)];
            int i8 = i7 + 1;
            bArr3[i7] = bArr[((b2 & Ascii.SI) << 2) | ((b3 & UnsignedBytes.MAX_VALUE) >> 6)];
            i2 = i8 + 1;
            bArr3[i8] = bArr[b3 & 63];
            i = i5;
        }
        int length2 = bArr2.length - length;
        if (length2 != 1) {
            if (length2 == 2) {
                int i9 = i + 1;
                byte b4 = bArr2[i];
                byte b5 = bArr2[i9];
                int i10 = i2 + 1;
                bArr3[i2] = bArr[(b4 & UnsignedBytes.MAX_VALUE) >> 2];
                int i11 = i10 + 1;
                bArr3[i10] = bArr[((b4 & 3) << 4) | ((b5 & UnsignedBytes.MAX_VALUE) >> 4)];
                bArr3[i11] = bArr[(b5 & Ascii.SI) << 2];
                bArr3[i11 + 1] = 61;
            }
        } else {
            byte b6 = bArr2[i];
            int i12 = i2 + 1;
            bArr3[i2] = bArr[(b6 & UnsignedBytes.MAX_VALUE) >> 2];
            int i13 = i12 + 1;
            bArr3[i12] = bArr[(b6 & 3) << 4];
            bArr3[i13] = 61;
            bArr3[i13 + 1] = 61;
        }
        return new String(bArr3, com.amazon.aps.iva.oe0.a.b);
    }

    public i b(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.b, 0, c());
        byte[] digest = messageDigest.digest();
        com.amazon.aps.iva.yb0.j.c(digest);
        return new i(digest);
    }

    public int c() {
        return this.b.length;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032 A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compareTo(com.amazon.aps.iva.ef0.i r8) {
        /*
            r7 = this;
            com.amazon.aps.iva.ef0.i r8 = (com.amazon.aps.iva.ef0.i) r8
            java.lang.String r0 = "other"
            com.amazon.aps.iva.yb0.j.f(r8, r0)
            int r0 = r7.c()
            int r1 = r8.c()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L15:
            if (r4 >= r2) goto L2b
            byte r5 = r7.i(r4)
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r6 = r8.i(r4)
            r6 = r6 & 255(0xff, float:3.57E-43)
            if (r5 != r6) goto L28
            int r4 = r4 + 1
            goto L15
        L28:
            if (r5 >= r6) goto L32
            goto L30
        L2b:
            if (r0 != r1) goto L2e
            goto L33
        L2e:
            if (r0 >= r1) goto L32
        L30:
            r3 = -1
            goto L33
        L32:
            r3 = 1
        L33:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ef0.i.compareTo(java.lang.Object):int");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            int c = iVar.c();
            byte[] bArr = this.b;
            if (c == bArr.length && iVar.j(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        byte[] bArr = this.b;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = com.amazon.aps.iva.ff0.b.b;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & Ascii.SI];
        }
        return new String(cArr);
    }

    public byte[] h() {
        return this.b;
    }

    public int hashCode() {
        int i = this.c;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.b);
            this.c = hashCode;
            return hashCode;
        }
        return i;
    }

    public byte i(int i) {
        return this.b[i];
    }

    public boolean j(int i, byte[] bArr, int i2, int i3) {
        com.amazon.aps.iva.yb0.j.f(bArr, "other");
        if (i >= 0) {
            byte[] bArr2 = this.b;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && b.a(bArr2, i, bArr, i2, i3)) {
                return true;
            }
        }
        return false;
    }

    public boolean k(i iVar, int i) {
        com.amazon.aps.iva.yb0.j.f(iVar, "other");
        return iVar.j(0, this.b, 0, i);
    }

    public i l() {
        int i = 0;
        while (true) {
            byte[] bArr = this.b;
            if (i < bArr.length) {
                byte b = bArr[i];
                if (b >= 65 && b <= 90) {
                    byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                    com.amazon.aps.iva.yb0.j.e(copyOf, "copyOf(this, size)");
                    copyOf[i] = (byte) (b + 32);
                    for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                        byte b2 = copyOf[i2];
                        if (b2 >= 65 && b2 <= 90) {
                            copyOf[i2] = (byte) (b2 + 32);
                        }
                    }
                    return new i(copyOf);
                }
                i++;
            } else {
                return this;
            }
        }
    }

    public final String m() {
        String str = this.d;
        if (str == null) {
            byte[] h = h();
            com.amazon.aps.iva.yb0.j.f(h, "<this>");
            String str2 = new String(h, com.amazon.aps.iva.oe0.a.b);
            this.d = str2;
            return str2;
        }
        return str;
    }

    public void n(e eVar, int i) {
        com.amazon.aps.iva.yb0.j.f(eVar, "buffer");
        eVar.H(0, this.b, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x00fc, code lost:
        if (r3 == 64) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x010d, code lost:
        if (r3 == 64) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x011c, code lost:
        if (r3 == 64) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x012e, code lost:
        if (r3 == 64) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x013b, code lost:
        if (r3 == 64) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0185, code lost:
        if (r3 == 64) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0196, code lost:
        if (r3 == 64) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x01a7, code lost:
        if (r3 == 64) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x01b6, code lost:
        if (r3 == 64) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x01cc, code lost:
        if (r3 == 64) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x01d9, code lost:
        if (r3 == 64) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x01e0, code lost:
        if (r3 == 64) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0221, code lost:
        if (r3 == 64) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0224, code lost:
        r4 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0098, code lost:
        if (r3 == 64) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00a7, code lost:
        if (r3 == 64) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00b2, code lost:
        if (r3 == 64) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0224 A[EDGE_INSN: B:280:0x0224->B:247:0x0224 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0224 A[EDGE_INSN: B:285:0x0224->B:247:0x0224 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0224 A[EDGE_INSN: B:290:0x0224->B:247:0x0224 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0224 A[EDGE_INSN: B:302:0x0224->B:247:0x0224 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0224 A[EDGE_INSN: B:307:0x0224->B:247:0x0224 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ef0.i.toString():java.lang.String");
    }
}
