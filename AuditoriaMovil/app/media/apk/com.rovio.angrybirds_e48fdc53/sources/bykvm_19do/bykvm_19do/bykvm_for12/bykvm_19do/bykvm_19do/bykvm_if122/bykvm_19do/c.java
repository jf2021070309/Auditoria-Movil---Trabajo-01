package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do;

import com.flurry.android.Constants;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
/* loaded from: classes.dex */
public final class c implements e, d, Cloneable, ByteChannel {
    private static final byte[] c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    o a;
    long b;

    public int a(byte[] bArr, int i, int i2) {
        u.a(bArr.length, i, i2);
        o oVar = this.a;
        if (oVar == null) {
            return -1;
        }
        int min = Math.min(i2, oVar.c - oVar.b);
        System.arraycopy(oVar.a, oVar.b, bArr, i, min);
        oVar.b += min;
        this.b -= min;
        if (oVar.b == oVar.c) {
            this.a = oVar.b();
            p.a(oVar);
        }
        return min;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.e
    public long a(byte b) {
        return a(b, 0L, Long.MAX_VALUE);
    }

    public long a(byte b, long j, long j2) {
        o oVar;
        long j3 = 0;
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.b), Long.valueOf(j), Long.valueOf(j2)));
        }
        long j4 = this.b;
        long j5 = j2 > j4 ? j4 : j2;
        if (j == j5 || (oVar = this.a) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                oVar = oVar.g;
                j4 -= oVar.c - oVar.b;
            }
        } else {
            while (true) {
                long j6 = (oVar.c - oVar.b) + j3;
                if (j6 >= j) {
                    break;
                }
                oVar = oVar.f;
                j3 = j6;
            }
            j4 = j3;
        }
        long j7 = j;
        while (j4 < j5) {
            byte[] bArr = oVar.a;
            int min = (int) Math.min(oVar.c, (oVar.b + j5) - j4);
            for (int i = (int) ((oVar.b + j7) - j4); i < min; i++) {
                if (bArr[i] == b) {
                    return j4 + (i - oVar.b);
                }
            }
            j4 += oVar.c - oVar.b;
            oVar = oVar.f;
            j7 = j4;
        }
        return -1L;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.s
    public long a(c cVar, long j) {
        if (cVar != null) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            long j2 = this.b;
            if (j2 == 0) {
                return -1L;
            }
            if (j > j2) {
                j = j2;
            }
            cVar.b(this, j);
            return j;
        }
        throw new IllegalArgumentException("sink == null");
    }

    public long a(s sVar) throws IOException {
        if (sVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long a = sVar.a(this, 8192L);
            if (a == -1) {
                return j;
            }
            j += a;
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.e, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.d
    public c a() {
        return this;
    }

    public final c a(c cVar, long j, long j2) {
        if (cVar != null) {
            u.a(this.b, j, j2);
            if (j2 != 0) {
                cVar.b += j2;
                o oVar = this.a;
                while (true) {
                    long j3 = oVar.c - oVar.b;
                    if (j < j3) {
                        break;
                    }
                    j -= j3;
                    oVar = oVar.f;
                }
                while (j2 > 0) {
                    o c2 = oVar.c();
                    c2.b = (int) (c2.b + j);
                    c2.c = Math.min(c2.b + ((int) j2), c2.c);
                    o oVar2 = cVar.a;
                    if (oVar2 == null) {
                        c2.g = c2;
                        c2.f = c2;
                        cVar.a = c2;
                    } else {
                        oVar2.g.a(c2);
                    }
                    j2 -= c2.c - c2.b;
                    oVar = oVar.f;
                    j = 0;
                }
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    public c a(f fVar) {
        if (fVar != null) {
            fVar.a(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.d
    public c a(String str) {
        return a(str, 0, str.length());
    }

    public c a(String str, int i, int i2) {
        char charAt;
        int i3;
        if (str != null) {
            if (i < 0) {
                throw new IllegalArgumentException("beginIndex < 0: " + i);
            } else if (i2 < i) {
                throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
            } else if (i2 > str.length()) {
                throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
            } else {
                while (i < i2) {
                    char charAt2 = str.charAt(i);
                    if (charAt2 < 128) {
                        o b = b(1);
                        byte[] bArr = b.a;
                        int i4 = b.c - i;
                        int min = Math.min(i2, 8192 - i4);
                        bArr[i + i4] = (byte) charAt2;
                        i++;
                        while (i < min) {
                            if (str.charAt(i) >= 128) {
                                break;
                            }
                            bArr[i + i4] = (byte) charAt;
                            i++;
                        }
                        int i5 = b.c;
                        int i6 = (i4 + i) - i5;
                        b.c = i5 + i6;
                        this.b += i6;
                    } else {
                        if (charAt2 < 2048) {
                            i3 = (charAt2 >> 6) | 192;
                        } else if (charAt2 < 55296 || charAt2 > 57343) {
                            writeByte((charAt2 >> '\f') | 224);
                            i3 = ((charAt2 >> 6) & 63) | 128;
                        } else {
                            int i7 = i + 1;
                            char charAt3 = i7 < i2 ? str.charAt(i7) : (char) 0;
                            if (charAt2 > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                                writeByte(63);
                                i = i7;
                            } else {
                                int i8 = (((charAt2 & 10239) << 10) | (9215 & charAt3)) + 65536;
                                writeByte((i8 >> 18) | 240);
                                writeByte(((i8 >> 12) & 63) | 128);
                                writeByte(((i8 >> 6) & 63) | 128);
                                writeByte((i8 & 63) | 128);
                                i += 2;
                            }
                        }
                        writeByte(i3);
                        writeByte((charAt2 & '?') | 128);
                        i++;
                    }
                }
                return this;
            }
        }
        throw new IllegalArgumentException("string == null");
    }

    public c a(String str, int i, int i2, Charset charset) {
        if (str != null) {
            if (i < 0) {
                throw new IllegalAccessError("beginIndex < 0: " + i);
            } else if (i2 < i) {
                throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
            } else if (i2 <= str.length()) {
                if (charset != null) {
                    if (charset.equals(u.a)) {
                        return a(str, i, i2);
                    }
                    byte[] bytes = str.substring(i, i2).getBytes(charset);
                    return write(bytes, 0, bytes.length);
                }
                throw new IllegalArgumentException("charset == null");
            } else {
                throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
            }
        }
        throw new IllegalArgumentException("string == null");
    }

    public final f a(int i) {
        return i == 0 ? f.e : new q(this, i);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.e
    public f a(long j) throws EOFException {
        return new f(d(j));
    }

    public String a(long j, Charset charset) throws EOFException {
        u.a(this.b, 0L, j);
        if (charset != null) {
            if (j > 2147483647L) {
                throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
            } else if (j == 0) {
                return "";
            } else {
                o oVar = this.a;
                int i = oVar.b;
                if (i + j > oVar.c) {
                    return new String(d(j), charset);
                }
                String str = new String(oVar.a, i, (int) j, charset);
                oVar.b = (int) (oVar.b + j);
                this.b -= j;
                if (oVar.b == oVar.c) {
                    this.a = oVar.b();
                    p.a(oVar);
                }
                return str;
            }
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.e
    public String a(Charset charset) {
        try {
            return a(this.b, charset);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.e
    public boolean a(long j, f fVar) {
        return a(j, fVar, 0, fVar.e());
    }

    public boolean a(long j, f fVar, int i, int i2) {
        if (j < 0 || i < 0 || i2 < 0 || this.b - j < i2 || fVar.e() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (f(i3 + j) != fVar.a(i + i3)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o b(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        o oVar = this.a;
        if (oVar != null) {
            o oVar2 = oVar.g;
            return (oVar2.c + i > 8192 || !oVar2.e) ? oVar2.a(p.a()) : oVar2;
        }
        o a = p.a();
        this.a = a;
        a.g = a;
        a.f = a;
        return a;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.s
    public t b() {
        return t.d;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.e
    public String b(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException("limit < 0: " + j);
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long a = a((byte) 10, 0L, j2);
        if (a != -1) {
            return h(a);
        }
        if (j2 < o() && f(j2 - 1) == 13 && f(j2) == 10) {
            return h(j2);
        }
        c cVar = new c();
        a(cVar, 0L, Math.min(32L, o()));
        throw new EOFException("\\n not found: limit=" + Math.min(o(), j) + " content=" + cVar.m().b() + (char) 8230);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.r
    public void b(c cVar, long j) {
        if (cVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (cVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        u.a(cVar.b, 0L, j);
        while (j > 0) {
            o oVar = cVar.a;
            if (j < oVar.c - oVar.b) {
                o oVar2 = this.a;
                o oVar3 = oVar2 != null ? oVar2.g : null;
                if (oVar3 != null && oVar3.e) {
                    if ((oVar3.c + j) - (oVar3.d ? 0 : oVar3.b) <= 8192) {
                        cVar.a.a(oVar3, (int) j);
                        cVar.b -= j;
                        this.b += j;
                        return;
                    }
                }
                cVar.a = cVar.a.a((int) j);
            }
            o oVar4 = cVar.a;
            long j2 = oVar4.c - oVar4.b;
            cVar.a = oVar4.b();
            o oVar5 = this.a;
            if (oVar5 == null) {
                this.a = oVar4;
                oVar4.g = oVar4;
                oVar4.f = oVar4;
            } else {
                oVar5.g.a(oVar4).a();
            }
            cVar.b -= j2;
            this.b += j2;
            j -= j2;
        }
    }

    public c c(int i) {
        int i2;
        int i3;
        if (i >= 128) {
            if (i < 2048) {
                i3 = (i >> 6) | 192;
            } else {
                if (i < 65536) {
                    if (i >= 55296 && i <= 57343) {
                        writeByte(63);
                        return this;
                    }
                    i2 = (i >> 12) | 224;
                } else if (i > 1114111) {
                    throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
                } else {
                    writeByte((i >> 18) | 240);
                    i2 = ((i >> 12) & 63) | 128;
                }
                writeByte(i2);
                i3 = ((i >> 6) & 63) | 128;
            }
            writeByte(i3);
            i = (i & 63) | 128;
        }
        writeByte(i);
        return this;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.e
    public short c() {
        return u.a(readShort());
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.e
    public void c(long j) throws EOFException {
        if (this.b < j) {
            throw new EOFException();
        }
    }

    /* renamed from: clone */
    public c m7clone() {
        c cVar = new c();
        if (this.b != 0) {
            o c2 = this.a.c();
            cVar.a = c2;
            c2.g = c2;
            c2.f = c2;
            o oVar = this.a;
            while (true) {
                oVar = oVar.f;
                if (oVar == this.a) {
                    break;
                }
                cVar.a.g.a(oVar.c());
            }
            cVar.b = this.b;
        }
        return cVar;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.e
    public String d() throws EOFException {
        return b(Long.MAX_VALUE);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.e
    public byte[] d(long j) throws EOFException {
        u.a(this.b, 0L, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[(int) j];
            readFully(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.e
    public int e() {
        return u.a(readInt());
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.d
    public c e(long j) {
        if (j == 0) {
            return writeByte(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        o b = b(numberOfTrailingZeros);
        byte[] bArr = b.a;
        int i = b.c;
        for (int i2 = (i + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = c[(int) (15 & j)];
            j >>>= 4;
        }
        b.c += numberOfTrailingZeros;
        this.b = numberOfTrailingZeros + this.b;
        return this;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            long j = this.b;
            if (j != cVar.b) {
                return false;
            }
            long j2 = 0;
            if (j != 0) {
                o oVar = this.a;
                o oVar2 = cVar.a;
                int i = oVar.b;
                int i2 = oVar2.b;
                while (j2 < this.b) {
                    long min = Math.min(oVar.c - i, oVar2.c - i2);
                    int i3 = 0;
                    while (i3 < min) {
                        if (oVar.a[i] != oVar2.a[i2]) {
                            return false;
                        }
                        i3++;
                        i2++;
                        i++;
                    }
                    if (i == oVar.c) {
                        oVar = oVar.f;
                        i = oVar.b;
                    }
                    if (i2 == oVar2.c) {
                        oVar2 = oVar2.f;
                        i2 = oVar2.b;
                    }
                    j2 += min;
                }
            }
        }
        return true;
    }

    public final byte f(long j) {
        u.a(this.b, j, 1L);
        long j2 = this.b;
        if (j2 - j <= j) {
            long j3 = j - j2;
            try {
                o oVar = this.a;
                do {
                    oVar = oVar.g;
                    j3 += oVar.c - oVar.b;
                } while (j3 < 0);
                return oVar.a[oVar.b + ((int) j3)];
            } catch (NullPointerException e) {
                return (byte) 0;
            }
        }
        o oVar2 = this.a;
        while (true) {
            int i = oVar2.c;
            int i2 = oVar2.b;
            long j4 = i - i2;
            if (j < j4) {
                return oVar2.a[((int) j) + i2];
            }
            j -= j4;
            oVar2 = oVar2.f;
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.e
    public boolean f() {
        return this.b == 0;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.d, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.r, java.io.Flushable
    public void flush() {
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a5 A[EDGE_INSN: B:42:0x00a5->B:38:0x00a5 ?: BREAK  , SYNTHETIC] */
    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long g() {
        /*
            r14 = this;
            long r0 = r14.b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lac
            r0 = 0
            r1 = r0
            r4 = r2
        Lb:
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.o r6 = r14.a
            byte[] r7 = r6.a
            int r8 = r6.b
            int r9 = r6.c
        L13:
            if (r8 >= r9) goto L91
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L22
            r11 = 57
            if (r10 > r11) goto L22
            int r11 = r10 + (-48)
            goto L3a
        L22:
            r11 = 97
            if (r10 < r11) goto L2f
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L2f
            int r11 = r10 + (-97)
        L2c:
            int r11 = r11 + 10
            goto L3a
        L2f:
            r11 = 65
            if (r10 < r11) goto L72
            r11 = 70
            if (r10 > r11) goto L72
            int r11 = r10 + (-65)
            goto L2c
        L3a:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4a
            long r10 = (long) r11
            int r0 = r0 + 1
            int r8 = r8 + 1
            r12 = 4
            long r4 = r4 << r12
            long r4 = r4 | r10
            goto L13
        L4a:
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.c r0 = new bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.c
            r0.<init>()
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.c r0 = r0.e(r4)
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.c r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.n()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L72:
            if (r0 == 0) goto L76
            r1 = 1
            goto L91
        L76:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L91:
            if (r8 != r9) goto L9d
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.o r7 = r6.b()
            r14.a = r7
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.p.a(r6)
            goto L9f
        L9d:
            r6.b = r8
        L9f:
            if (r1 != 0) goto La5
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.o r6 = r14.a
            if (r6 != 0) goto Lb
        La5:
            long r1 = r14.b
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.b = r1
            return r4
        Lac:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.c.g():long");
    }

    public String g(long j) throws EOFException {
        return a(j, u.a);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.d
    public c h() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String h(long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (f(j2) == 13) {
                String g = g(j2);
                skip(2L);
                return g;
            }
        }
        String g2 = g(j);
        skip(1L);
        return g2;
    }

    public int hashCode() {
        o oVar = this.a;
        if (oVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = oVar.b;
            int i3 = oVar.c;
            while (i2 < i3) {
                byte b = oVar.a[i2];
                i2++;
                i = (i * 31) + b;
            }
            oVar = oVar.f;
        } while (oVar != this.a);
        return i;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public final void j() {
        try {
            skip(this.b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final long k() {
        long j = this.b;
        if (j == 0) {
            return 0L;
        }
        o oVar = this.a.g;
        int i = oVar.c;
        return (i >= 8192 || !oVar.e) ? j : j - (i - oVar.b);
    }

    public byte[] l() throws EOFException {
        try {
            return d(this.b);
        } catch (EOFException e) {
            throw e;
        }
    }

    public f m() throws EOFException {
        return new f(l());
    }

    public String n() {
        try {
            return a(this.b, u.a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final long o() {
        return this.b;
    }

    public final f p() {
        long j = this.b;
        if (j <= 2147483647L) {
            return a((int) j);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.b);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        o oVar = this.a;
        if (oVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), oVar.c - oVar.b);
        byteBuffer.put(oVar.a, oVar.b, min);
        oVar.b += min;
        this.b -= min;
        if (oVar.b == oVar.c) {
            this.a = oVar.b();
            p.a(oVar);
        }
        return min;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.e
    public byte readByte() {
        long j = this.b;
        if (j != 0) {
            o oVar = this.a;
            int i = oVar.b;
            int i2 = oVar.c;
            int i3 = i + 1;
            byte b = oVar.a[i];
            this.b = j - 1;
            if (i3 == i2) {
                this.a = oVar.b();
                p.a(oVar);
            } else {
                oVar.b = i3;
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.e
    public void readFully(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int a = a(bArr, i, bArr.length - i);
            if (a == -1) {
                throw new EOFException();
            }
            i += a;
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.e
    public int readInt() {
        long j = this.b;
        if (j < 4) {
            throw new IllegalStateException("size < 4: " + this.b);
        }
        o oVar = this.a;
        int i = oVar.b;
        int i2 = oVar.c;
        if (i2 - i < 4) {
            return ((readByte() & Constants.UNKNOWN) << 24) | ((readByte() & Constants.UNKNOWN) << 16) | ((readByte() & Constants.UNKNOWN) << 8) | (readByte() & Constants.UNKNOWN);
        }
        byte[] bArr = oVar.a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = i4 + 1;
        int i6 = i5 + 1;
        int i7 = ((bArr[i] & Constants.UNKNOWN) << 24) | ((bArr[i3] & Constants.UNKNOWN) << 16) | ((bArr[i4] & Constants.UNKNOWN) << 8) | (bArr[i5] & Constants.UNKNOWN);
        this.b = j - 4;
        if (i6 == i2) {
            this.a = oVar.b();
            p.a(oVar);
        } else {
            oVar.b = i6;
        }
        return i7;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.e
    public short readShort() {
        int i;
        int i2;
        long j = this.b;
        if (j < 2) {
            throw new IllegalStateException("size < 2: " + this.b);
        }
        o oVar = this.a;
        int i3 = oVar.b;
        int i4 = oVar.c;
        if (i4 - i3 < 2) {
            i = (readByte() & Constants.UNKNOWN) << 8;
            i2 = readByte() & Constants.UNKNOWN;
        } else {
            byte[] bArr = oVar.a;
            int i5 = i3 + 1;
            byte b = bArr[i3];
            int i6 = i5 + 1;
            byte b2 = bArr[i5];
            this.b = j - 2;
            if (i6 == i4) {
                this.a = oVar.b();
                p.a(oVar);
            } else {
                oVar.b = i6;
            }
            i = (b & Constants.UNKNOWN) << 8;
            i2 = b2 & Constants.UNKNOWN;
        }
        return (short) (i | i2);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.e
    public void skip(long j) throws EOFException {
        o oVar;
        while (j > 0 && (oVar = this.a) != null) {
            int min = (int) Math.min(j, oVar.c - oVar.b);
            long j2 = min;
            this.b -= j2;
            j -= j2;
            o oVar2 = this.a;
            oVar2.b = min + oVar2.b;
            if (oVar2.b == oVar2.c) {
                this.a = oVar2.b();
                p.a(oVar2);
            }
        }
    }

    public String toString() {
        return p().toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i = remaining;
            while (i > 0) {
                o b = b(1);
                int min = Math.min(i, 8192 - b.c);
                byteBuffer.get(b.a, b.c, min);
                i -= min;
                b.c = min + b.c;
            }
            this.b += remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.d
    public c write(byte[] bArr) {
        if (bArr != null) {
            return write(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.d
    public c write(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = i2;
            u.a(bArr.length, i, j);
            int i3 = i2 + i;
            while (i < i3) {
                o b = b(1);
                int min = Math.min(i3 - i, 8192 - b.c);
                System.arraycopy(bArr, i, b.a, b.c, min);
                i += min;
                b.c = min + b.c;
            }
            this.b += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.d
    public c writeByte(int i) {
        o b = b(1);
        byte[] bArr = b.a;
        int i2 = b.c;
        b.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
        return this;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.d
    public c writeInt(int i) {
        o b = b(4);
        byte[] bArr = b.a;
        int i2 = b.c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        b.c = i5 + 1;
        this.b += 4;
        return this;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.d
    public c writeShort(int i) {
        o b = b(2);
        byte[] bArr = b.a;
        int i2 = b.c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        b.c = i3 + 1;
        this.b += 2;
        return this;
    }
}
