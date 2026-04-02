package k;

import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;
/* loaded from: classes2.dex */
public class h implements Serializable, Comparable<h> {
    public static final a a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final h f9621b = new h(new byte[0]);

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f9622c;

    /* renamed from: d  reason: collision with root package name */
    public transient int f9623d;

    /* renamed from: e  reason: collision with root package name */
    public transient String f9624e;

    /* loaded from: classes2.dex */
    public static final class a {
        public static final h a(String str) {
            h.o.c.j.e(str, "<this>");
            h.o.c.j.e(str, "<this>");
            byte[] bytes = str.getBytes(h.t.a.a);
            h.o.c.j.d(bytes, "(this as java.lang.String).getBytes(charset)");
            h hVar = new h(bytes);
            hVar.f9624e = str;
            return hVar;
        }
    }

    public h(byte[] bArr) {
        h.o.c.j.e(bArr, "data");
        this.f9622c = bArr;
    }

    public static final h b(String str) {
        h.o.c.j.e(str, "<this>");
        int i2 = 0;
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            int i3 = length - 1;
            if (i3 >= 0) {
                while (true) {
                    int i4 = i2 + 1;
                    int i5 = i2 * 2;
                    bArr[i2] = (byte) (k.b0.b.a(str.charAt(i5 + 1)) + (k.b0.b.a(str.charAt(i5)) << 4));
                    if (i4 > i3) {
                        break;
                    }
                    i2 = i4;
                }
            }
            return new h(bArr);
        }
        throw new IllegalArgumentException(h.o.c.j.i("Unexpected hex string: ", str).toString());
    }

    public static final h h(String str) {
        h.o.c.j.e(str, "<this>");
        h.o.c.j.e(str, "<this>");
        byte[] bytes = str.getBytes(h.t.a.a);
        h.o.c.j.d(bytes, "(this as java.lang.String).getBytes(charset)");
        h hVar = new h(bytes);
        hVar.f9624e = str;
        return hVar;
    }

    public static final h y(byte... bArr) {
        h.o.c.j.e(bArr, "data");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        h.o.c.j.d(copyOf, "java.util.Arrays.copyOf(this, size)");
        return new h(copyOf);
    }

    public boolean B(int i2, byte[] bArr, int i3, int i4) {
        h.o.c.j.e(bArr, "other");
        if (i2 >= 0) {
            byte[] bArr2 = this.f9622c;
            if (i2 <= bArr2.length - i4 && i3 >= 0 && i3 <= bArr.length - i4 && a0.a(bArr2, i2, bArr, i3, i4)) {
                return true;
            }
        }
        return false;
    }

    public h G() {
        byte b2;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f9622c;
            if (i2 >= bArr.length) {
                return this;
            }
            byte b3 = bArr[i2];
            byte b4 = (byte) 65;
            if (b3 >= b4 && b3 <= (b2 = (byte) 90)) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                h.o.c.j.d(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i2] = (byte) (b3 + 32);
                for (int i3 = i2 + 1; i3 < copyOf.length; i3++) {
                    byte b5 = copyOf[i3];
                    if (b5 >= b4 && b5 <= b2) {
                        copyOf[i3] = (byte) (b5 + 32);
                    }
                }
                return new h(copyOf);
            }
            i2++;
        }
    }

    public byte[] I() {
        byte[] bArr = this.f9622c;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        h.o.c.j.d(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    public String K() {
        String str = this.f9624e;
        if (str == null) {
            byte[] u = u();
            h.o.c.j.e(u, "<this>");
            String str2 = new String(u, h.t.a.a);
            this.f9624e = str2;
            return str2;
        }
        return str;
    }

    public void M(d dVar, int i2, int i3) {
        h.o.c.j.e(dVar, "buffer");
        h.o.c.j.e(this, "<this>");
        h.o.c.j.e(dVar, "buffer");
        dVar.f0(this.f9622c, i2, i3);
    }

    public String a() {
        byte[] bArr = this.f9622c;
        byte[] bArr2 = z.a;
        byte[] bArr3 = z.a;
        h.o.c.j.e(bArr, "<this>");
        h.o.c.j.e(bArr3, "map");
        byte[] bArr4 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            int i5 = i4 + 1;
            byte b3 = bArr[i4];
            int i6 = i5 + 1;
            byte b4 = bArr[i5];
            int i7 = i3 + 1;
            bArr4[i3] = bArr3[(b2 & 255) >> 2];
            int i8 = i7 + 1;
            bArr4[i7] = bArr3[((b2 & 3) << 4) | ((b3 & 255) >> 4)];
            int i9 = i8 + 1;
            bArr4[i8] = bArr3[((b3 & 15) << 2) | ((b4 & 255) >> 6)];
            i3 = i9 + 1;
            bArr4[i9] = bArr3[b4 & 63];
            i2 = i6;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b5 = bArr[i2];
            int i10 = i3 + 1;
            bArr4[i3] = bArr3[(b5 & 255) >> 2];
            int i11 = i10 + 1;
            bArr4[i10] = bArr3[(b5 & 3) << 4];
            byte b6 = (byte) 61;
            bArr4[i11] = b6;
            bArr4[i11 + 1] = b6;
        } else if (length2 == 2) {
            int i12 = i2 + 1;
            byte b7 = bArr[i2];
            byte b8 = bArr[i12];
            int i13 = i3 + 1;
            bArr4[i3] = bArr3[(b7 & 255) >> 2];
            int i14 = i13 + 1;
            bArr4[i13] = bArr3[((b7 & 3) << 4) | ((b8 & 255) >> 4)];
            bArr4[i14] = bArr3[(b8 & 15) << 2];
            bArr4[i14 + 1] = (byte) 61;
        }
        h.o.c.j.e(bArr4, "<this>");
        return new String(bArr4, h.t.a.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032 A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compareTo(k.h r8) {
        /*
            r7 = this;
            k.h r8 = (k.h) r8
            java.lang.String r0 = "other"
            h.o.c.j.e(r8, r0)
            int r0 = r7.i()
            int r1 = r8.i()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L15:
            if (r4 >= r2) goto L2b
            byte r5 = r7.v(r4)
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r6 = r8.v(r4)
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
        throw new UnsupportedOperationException("Method not decompiled: k.h.compareTo(java.lang.Object):int");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            int i2 = hVar.i();
            byte[] bArr = this.f9622c;
            if (i2 == bArr.length && hVar.B(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public h f(String str) {
        h.o.c.j.e(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f9622c, 0, i());
        byte[] digest = messageDigest.digest();
        h.o.c.j.d(digest, "digestBytes");
        return new h(digest);
    }

    public int hashCode() {
        int i2 = this.f9623d;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = Arrays.hashCode(this.f9622c);
        this.f9623d = hashCode;
        return hashCode;
    }

    public int i() {
        return this.f9622c.length;
    }

    public String t() {
        byte[] bArr = this.f9622c;
        char[] cArr = new char[bArr.length * 2];
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            int i4 = i3 + 1;
            char[] cArr2 = k.b0.b.a;
            cArr[i3] = cArr2[(b2 >> 4) & 15];
            i3 = i4 + 1;
            cArr[i4] = cArr2[b2 & 15];
        }
        h.o.c.j.e(cArr, "<this>");
        return new String(cArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0101, code lost:
        if (r4 == 64) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0114, code lost:
        if (r4 == 64) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0123, code lost:
        if (r4 == 64) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0135, code lost:
        if (r4 == 64) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0142, code lost:
        if (r4 == 64) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x018a, code lost:
        if (r4 == 64) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x019d, code lost:
        if (r4 == 64) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x01ae, code lost:
        if (r4 == 64) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x01bd, code lost:
        if (r4 == 64) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x01d3, code lost:
        if (r4 == 64) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x01e0, code lost:
        if (r4 == 64) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x01e7, code lost:
        if (r4 == 64) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0226, code lost:
        if (r4 == 64) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0229, code lost:
        r5 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x009d, code lost:
        if (r4 == 64) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00ae, code lost:
        if (r4 == 64) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00b9, code lost:
        if (r4 == 64) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0229 A[EDGE_INSN: B:274:0x0229->B:247:0x0229 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0229 A[EDGE_INSN: B:279:0x0229->B:247:0x0229 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0229 A[EDGE_INSN: B:284:0x0229->B:247:0x0229 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0229 A[EDGE_INSN: B:296:0x0229->B:247:0x0229 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0229 A[EDGE_INSN: B:302:0x0229->B:247:0x0229 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 821
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.h.toString():java.lang.String");
    }

    public byte[] u() {
        return this.f9622c;
    }

    public byte v(int i2) {
        return this.f9622c[i2];
    }

    public boolean z(int i2, h hVar, int i3, int i4) {
        h.o.c.j.e(hVar, "other");
        return hVar.B(i3, this.f9622c, i2, i4);
    }
}
