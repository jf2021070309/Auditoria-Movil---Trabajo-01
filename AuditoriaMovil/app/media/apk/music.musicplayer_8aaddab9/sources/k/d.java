package k;

import ch.qos.logback.classic.pattern.ThrowableProxyConverter;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.FileAppender;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
/* loaded from: classes2.dex */
public final class d implements g, f, Cloneable, ByteChannel {
    public s a;

    /* renamed from: b  reason: collision with root package name */
    public long f9620b;

    /* loaded from: classes2.dex */
    public static final class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(d.this.f9620b, Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            d dVar = d.this;
            if (dVar.f9620b > 0) {
                return dVar.readByte() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) {
            h.o.c.j.e(bArr, "sink");
            return d.this.read(bArr, i2, i3);
        }

        public String toString() {
            return d.this + ".inputStream()";
        }
    }

    public void B(byte[] bArr) throws EOFException {
        h.o.c.j.e(bArr, "sink");
        int i2 = 0;
        while (i2 < bArr.length) {
            int read = read(bArr, i2, bArr.length - i2);
            if (read == -1) {
                throw new EOFException();
            }
            i2 += read;
        }
    }

    @Override // k.g
    public boolean C(long j2, h hVar) {
        h.o.c.j.e(hVar, "bytes");
        int i2 = hVar.i();
        h.o.c.j.e(hVar, "bytes");
        if (j2 < 0 || i2 < 0 || this.f9620b - j2 < i2 || hVar.i() - 0 < i2) {
            return false;
        }
        if (i2 > 0) {
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (r(i3 + j2) != hVar.v(i3 + 0)) {
                    return false;
                }
                if (i4 >= i2) {
                    break;
                }
                i3 = i4;
            }
        }
        return true;
    }

    @Override // k.f
    public /* bridge */ /* synthetic */ f D(byte[] bArr, int i2, int i3) {
        f0(bArr, i2, i3);
        return this;
    }

    @Override // k.v
    public void E(d dVar, long j2) {
        s sVar;
        int i2;
        s sVar2;
        s b2;
        h.o.c.j.e(dVar, "source");
        if (!(dVar != this)) {
            throw new IllegalArgumentException("source == this".toString());
        }
        a0.b(dVar.f9620b, 0L, j2);
        while (j2 > 0) {
            s sVar3 = dVar.a;
            h.o.c.j.c(sVar3);
            int i3 = sVar3.f9640c;
            h.o.c.j.c(dVar.a);
            if (j2 < i3 - sVar.f9639b) {
                s sVar4 = this.a;
                if (sVar4 != null) {
                    h.o.c.j.c(sVar4);
                    sVar2 = sVar4.f9644g;
                } else {
                    sVar2 = null;
                }
                if (sVar2 != null && sVar2.f9642e) {
                    if ((sVar2.f9640c + j2) - (sVar2.f9641d ? 0 : sVar2.f9639b) <= FileAppender.DEFAULT_BUFFER_SIZE) {
                        s sVar5 = dVar.a;
                        h.o.c.j.c(sVar5);
                        sVar5.d(sVar2, (int) j2);
                        dVar.f9620b -= j2;
                        this.f9620b += j2;
                        return;
                    }
                }
                s sVar6 = dVar.a;
                h.o.c.j.c(sVar6);
                int i4 = (int) j2;
                if (!(i4 > 0 && i4 <= sVar6.f9640c - sVar6.f9639b)) {
                    throw new IllegalArgumentException("byteCount out of range".toString());
                }
                if (i4 >= 1024) {
                    b2 = sVar6.c();
                } else {
                    b2 = t.b();
                    byte[] bArr = sVar6.a;
                    byte[] bArr2 = b2.a;
                    int i5 = sVar6.f9639b;
                    h.l.c.c(bArr, bArr2, 0, i5, i5 + i4, 2);
                }
                b2.f9640c = b2.f9639b + i4;
                sVar6.f9639b += i4;
                s sVar7 = sVar6.f9644g;
                h.o.c.j.c(sVar7);
                sVar7.b(b2);
                dVar.a = b2;
            }
            s sVar8 = dVar.a;
            h.o.c.j.c(sVar8);
            long j3 = sVar8.f9640c - sVar8.f9639b;
            dVar.a = sVar8.a();
            s sVar9 = this.a;
            if (sVar9 == null) {
                this.a = sVar8;
                sVar8.f9644g = sVar8;
                sVar8.f9643f = sVar8;
            } else {
                h.o.c.j.c(sVar9);
                s sVar10 = sVar9.f9644g;
                h.o.c.j.c(sVar10);
                sVar10.b(sVar8);
                s sVar11 = sVar8.f9644g;
                if (!(sVar11 != sVar8)) {
                    throw new IllegalStateException("cannot compact".toString());
                }
                h.o.c.j.c(sVar11);
                if (sVar11.f9642e) {
                    int i6 = sVar8.f9640c - sVar8.f9639b;
                    s sVar12 = sVar8.f9644g;
                    h.o.c.j.c(sVar12);
                    int i7 = 8192 - sVar12.f9640c;
                    s sVar13 = sVar8.f9644g;
                    h.o.c.j.c(sVar13);
                    if (sVar13.f9641d) {
                        i2 = 0;
                    } else {
                        s sVar14 = sVar8.f9644g;
                        h.o.c.j.c(sVar14);
                        i2 = sVar14.f9639b;
                    }
                    if (i6 <= i7 + i2) {
                        s sVar15 = sVar8.f9644g;
                        h.o.c.j.c(sVar15);
                        sVar8.d(sVar15, i6);
                        sVar8.a();
                        t.a(sVar8);
                    }
                }
            }
            dVar.f9620b -= j3;
            this.f9620b += j3;
            j2 -= j3;
        }
    }

    @Override // k.g
    public boolean G(long j2) {
        return this.f9620b >= j2;
    }

    public short H() throws EOFException {
        int readShort = readShort() & 65535;
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    public String I(long j2, Charset charset) throws EOFException {
        h.o.c.j.e(charset, "charset");
        if (j2 >= 0 && j2 <= 2147483647L) {
            if (this.f9620b >= j2) {
                if (j2 == 0) {
                    return "";
                }
                s sVar = this.a;
                h.o.c.j.c(sVar);
                int i2 = sVar.f9639b;
                if (i2 + j2 > sVar.f9640c) {
                    return new String(L(j2), charset);
                }
                int i3 = (int) j2;
                String str = new String(sVar.a, i2, i3, charset);
                int i4 = sVar.f9639b + i3;
                sVar.f9639b = i4;
                this.f9620b -= j2;
                if (i4 == sVar.f9640c) {
                    this.a = sVar.a();
                    t.a(sVar);
                }
                return str;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(h.o.c.j.i("byteCount: ", Long.valueOf(j2)).toString());
    }

    @Override // k.g
    public String J() throws EOFException {
        return w(Long.MAX_VALUE);
    }

    public String K() {
        return I(this.f9620b, h.t.a.a);
    }

    @Override // k.g
    public byte[] L(long j2) throws EOFException {
        if (j2 >= 0 && j2 <= 2147483647L) {
            if (this.f9620b >= j2) {
                byte[] bArr = new byte[(int) j2];
                B(bArr);
                return bArr;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(h.o.c.j.i("byteCount: ", Long.valueOf(j2)).toString());
    }

    @Override // k.f
    public /* bridge */ /* synthetic */ f O(byte[] bArr) {
        e0(bArr);
        return this;
    }

    @Override // k.f
    public /* bridge */ /* synthetic */ f P(h hVar) {
        d0(hVar);
        return this;
    }

    public int Q() throws EOFException {
        int i2;
        int i3;
        int i4;
        if (this.f9620b != 0) {
            byte r = r(0L);
            boolean z = false;
            if ((r & 128) == 0) {
                i2 = r & Byte.MAX_VALUE;
                i3 = 1;
                i4 = 0;
            } else if ((r & 224) == 192) {
                i2 = r & 31;
                i3 = 2;
                i4 = 128;
            } else if ((r & 240) == 224) {
                i2 = r & 15;
                i3 = 3;
                i4 = ThrowableProxyConverter.BUILDER_CAPACITY;
            } else if ((r & 248) != 240) {
                skip(1L);
                return 65533;
            } else {
                i2 = r & 7;
                i3 = 4;
                i4 = 65536;
            }
            long j2 = i3;
            if (this.f9620b < j2) {
                StringBuilder z2 = e.a.d.a.a.z("size < ", i3, ": ");
                z2.append(this.f9620b);
                z2.append(" (to read code point prefixed 0x");
                z2.append(a0.c(r));
                z2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                throw new EOFException(z2.toString());
            }
            if (1 < i3) {
                int i5 = 1;
                while (true) {
                    int i6 = i5 + 1;
                    long j3 = i5;
                    byte r2 = r(j3);
                    if ((r2 & 192) != 128) {
                        skip(j3);
                        return 65533;
                    }
                    i2 = (i2 << 6) | (r2 & 63);
                    if (i6 >= i3) {
                        break;
                    }
                    i5 = i6;
                }
            }
            skip(j2);
            if (i2 > 1114111) {
                return 65533;
            }
            if (55296 <= i2 && i2 <= 57343) {
                z = true;
            }
            if (!z && i2 >= i4) {
                return i2;
            }
            return 65533;
        }
        throw new EOFException();
    }

    @Override // k.x
    public long S(d dVar, long j2) {
        h.o.c.j.e(dVar, "sink");
        if (j2 >= 0) {
            long j3 = this.f9620b;
            if (j3 == 0) {
                return -1L;
            }
            if (j2 > j3) {
                j2 = j3;
            }
            dVar.E(this, j2);
            return j2;
        }
        throw new IllegalArgumentException(h.o.c.j.i("byteCount < 0: ", Long.valueOf(j2)).toString());
    }

    @Override // k.g
    public long U(v vVar) throws IOException {
        h.o.c.j.e(vVar, "sink");
        long j2 = this.f9620b;
        if (j2 > 0) {
            ((d) vVar).E(this, j2);
        }
        return j2;
    }

    public final h W(int i2) {
        if (i2 == 0) {
            return h.f9621b;
        }
        a0.b(this.f9620b, 0L, i2);
        s sVar = this.a;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            h.o.c.j.c(sVar);
            int i6 = sVar.f9640c;
            int i7 = sVar.f9639b;
            if (i6 == i7) {
                throw new AssertionError("s.limit == s.pos");
            }
            i4 += i6 - i7;
            i5++;
            sVar = sVar.f9643f;
        }
        byte[][] bArr = new byte[i5];
        int[] iArr = new int[i5 * 2];
        s sVar2 = this.a;
        int i8 = 0;
        while (i3 < i2) {
            h.o.c.j.c(sVar2);
            bArr[i8] = sVar2.a;
            i3 += sVar2.f9640c - sVar2.f9639b;
            iArr[i8] = Math.min(i3, i2);
            iArr[i8 + i5] = sVar2.f9639b;
            sVar2.f9641d = true;
            i8++;
            sVar2 = sVar2.f9643f;
        }
        return new u(bArr, iArr);
    }

    @Override // k.g
    public void Y(long j2) throws EOFException {
        if (this.f9620b < j2) {
            throw new EOFException();
        }
    }

    /* renamed from: a */
    public d clone() {
        d dVar = new d();
        if (this.f9620b != 0) {
            s sVar = this.a;
            h.o.c.j.c(sVar);
            s c2 = sVar.c();
            dVar.a = c2;
            c2.f9644g = c2;
            c2.f9643f = c2;
            for (s sVar2 = sVar.f9643f; sVar2 != sVar; sVar2 = sVar2.f9643f) {
                s sVar3 = c2.f9644g;
                h.o.c.j.c(sVar3);
                h.o.c.j.c(sVar2);
                sVar3.b(sVar2.c());
            }
            dVar.f9620b = this.f9620b;
        }
        return dVar;
    }

    public final s a0(int i2) {
        boolean z = true;
        if ((i2 < 1 || i2 > 8192) ? false : false) {
            s sVar = this.a;
            if (sVar == null) {
                s b2 = t.b();
                this.a = b2;
                b2.f9644g = b2;
                b2.f9643f = b2;
                return b2;
            }
            h.o.c.j.c(sVar);
            s sVar2 = sVar.f9644g;
            h.o.c.j.c(sVar2);
            if (sVar2.f9640c + i2 > 8192 || !sVar2.f9642e) {
                s b3 = t.b();
                sVar2.b(b3);
                return b3;
            }
            return sVar2;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    @Override // k.g, k.f
    public d b() {
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0095 A[EDGE_INSN: B:43:0x0095->B:37:0x0095 ?: BREAK  , SYNTHETIC] */
    @Override // k.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long b0() throws java.io.EOFException {
        /*
            r15 = this;
            long r0 = r15.f9620b
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L9c
            r0 = 0
            r4 = r2
            r1 = 0
        Lb:
            k.s r6 = r15.a
            h.o.c.j.c(r6)
            byte[] r7 = r6.a
            int r8 = r6.f9639b
            int r9 = r6.f9640c
        L16:
            if (r8 >= r9) goto L81
            r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L27
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L27
            int r11 = r10 - r11
            goto L41
        L27:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L36
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L36
        L31:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L41
        L36:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L6d
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L6d
            goto L31
        L41:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L51
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L16
        L51:
            k.d r0 = new k.d
            r0.<init>()
            k.d r0 = r0.F(r4)
            r0.h0(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.K()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = h.o.c.j.i(r2, r0)
            r1.<init>(r0)
            throw r1
        L6d:
            if (r0 == 0) goto L71
            r1 = 1
            goto L81
        L71:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = k.a0.c(r10)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = h.o.c.j.i(r2, r1)
            r0.<init>(r1)
            throw r0
        L81:
            if (r8 != r9) goto L8d
            k.s r7 = r6.a()
            r15.a = r7
            k.t.a(r6)
            goto L8f
        L8d:
            r6.f9639b = r8
        L8f:
            if (r1 != 0) goto L95
            k.s r6 = r15.a
            if (r6 != 0) goto Lb
        L95:
            long r1 = r15.f9620b
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.f9620b = r1
            return r4
        L9c:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            goto La3
        La2:
            throw r0
        La3:
            goto La2
        */
        throw new UnsupportedOperationException("Method not decompiled: k.d.b0():long");
    }

    @Override // k.x
    public y c() {
        return y.a;
    }

    @Override // k.g
    public InputStream c0() {
        return new a();
    }

    @Override // k.x, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public d d0(h hVar) {
        h.o.c.j.e(hVar, "byteString");
        hVar.M(this, 0, hVar.i());
        return this;
    }

    public d e0(byte[] bArr) {
        h.o.c.j.e(bArr, "source");
        f0(bArr, 0, bArr.length);
        return this;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            long j2 = this.f9620b;
            d dVar = (d) obj;
            if (j2 != dVar.f9620b) {
                return false;
            }
            if (j2 != 0) {
                s sVar = this.a;
                h.o.c.j.c(sVar);
                s sVar2 = dVar.a;
                h.o.c.j.c(sVar2);
                int i2 = sVar.f9639b;
                int i3 = sVar2.f9639b;
                long j3 = 0;
                while (j3 < this.f9620b) {
                    long min = Math.min(sVar.f9640c - i2, sVar2.f9640c - i3);
                    if (0 < min) {
                        long j4 = 0;
                        while (true) {
                            j4++;
                            int i4 = i2 + 1;
                            int i5 = i3 + 1;
                            if (sVar.a[i2] != sVar2.a[i3]) {
                                return false;
                            }
                            if (j4 >= min) {
                                i2 = i4;
                                i3 = i5;
                                break;
                            }
                            i2 = i4;
                            i3 = i5;
                        }
                    }
                    if (i2 == sVar.f9640c) {
                        sVar = sVar.f9643f;
                        h.o.c.j.c(sVar);
                        i2 = sVar.f9639b;
                    }
                    if (i3 == sVar2.f9640c) {
                        sVar2 = sVar2.f9643f;
                        h.o.c.j.c(sVar2);
                        i3 = sVar2.f9639b;
                    }
                    j3 += min;
                }
            }
        }
        return true;
    }

    public final long f() {
        long j2 = this.f9620b;
        if (j2 == 0) {
            return 0L;
        }
        s sVar = this.a;
        h.o.c.j.c(sVar);
        s sVar2 = sVar.f9644g;
        h.o.c.j.c(sVar2);
        int i2 = sVar2.f9640c;
        if (i2 < 8192 && sVar2.f9642e) {
            j2 -= i2 - sVar2.f9639b;
        }
        return j2;
    }

    public d f0(byte[] bArr, int i2, int i3) {
        h.o.c.j.e(bArr, "source");
        long j2 = i3;
        a0.b(bArr.length, i2, j2);
        int i4 = i3 + i2;
        while (i2 < i4) {
            s a0 = a0(1);
            int min = Math.min(i4 - i2, 8192 - a0.f9640c);
            int i5 = i2 + min;
            h.l.c.b(bArr, a0.a, a0.f9640c, i2, i5);
            a0.f9640c += min;
            i2 = i5;
        }
        this.f9620b += j2;
        return this;
    }

    @Override // k.f, k.v, java.io.Flushable
    public void flush() {
    }

    @Override // k.g
    public h g(long j2) throws EOFException {
        if (j2 >= 0 && j2 <= 2147483647L) {
            if (this.f9620b >= j2) {
                if (j2 >= 4096) {
                    h W = W((int) j2);
                    skip(j2);
                    return W;
                }
                return new h(L(j2));
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(h.o.c.j.i("byteCount: ", Long.valueOf(j2)).toString());
    }

    public long g0(x xVar) throws IOException {
        h.o.c.j.e(xVar, "source");
        long j2 = 0;
        while (true) {
            long S = xVar.S(this, FileAppender.DEFAULT_BUFFER_SIZE);
            if (S == -1) {
                return j2;
            }
            j2 += S;
        }
    }

    public d h0(int i2) {
        s a0 = a0(1);
        byte[] bArr = a0.a;
        int i3 = a0.f9640c;
        a0.f9640c = i3 + 1;
        bArr[i3] = (byte) i2;
        this.f9620b++;
        return this;
    }

    public int hashCode() {
        s sVar = this.a;
        if (sVar == null) {
            return 0;
        }
        int i2 = 1;
        do {
            int i3 = sVar.f9640c;
            for (int i4 = sVar.f9639b; i4 < i3; i4++) {
                i2 = (i2 * 31) + sVar.a[i4];
            }
            sVar = sVar.f9643f;
            h.o.c.j.c(sVar);
        } while (sVar != this.a);
        return i2;
    }

    @Override // k.f
    /* renamed from: i0 */
    public d Z(long j2) {
        if (j2 == 0) {
            h0(48);
        } else {
            boolean z = false;
            int i2 = 1;
            if (j2 < 0) {
                j2 = -j2;
                if (j2 < 0) {
                    m0("-9223372036854775808");
                } else {
                    z = true;
                }
            }
            if (j2 >= 100000000) {
                i2 = j2 < 1000000000000L ? j2 < 10000000000L ? j2 < 1000000000 ? 9 : 10 : j2 < 100000000000L ? 11 : 12 : j2 < 1000000000000000L ? j2 < 10000000000000L ? 13 : j2 < 100000000000000L ? 14 : 15 : j2 < 100000000000000000L ? j2 < 10000000000000000L ? 16 : 17 : j2 < 1000000000000000000L ? 18 : 19;
            } else if (j2 >= AbstractComponentTracker.LINGERING_TIMEOUT) {
                i2 = j2 < 1000000 ? j2 < 100000 ? 5 : 6 : j2 < 10000000 ? 7 : 8;
            } else if (j2 >= 100) {
                i2 = j2 < 1000 ? 3 : 4;
            } else if (j2 >= 10) {
                i2 = 2;
            }
            if (z) {
                i2++;
            }
            s a0 = a0(i2);
            byte[] bArr = a0.a;
            int i3 = a0.f9640c + i2;
            while (j2 != 0) {
                long j3 = 10;
                i3--;
                bArr[i3] = k.b0.a.a[(int) (j2 % j3)];
                j2 /= j3;
            }
            if (z) {
                bArr[i3 - 1] = (byte) 45;
            }
            a0.f9640c += i2;
            this.f9620b += i2;
        }
        return this;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // k.f
    public /* bridge */ /* synthetic */ f j(int i2) {
        l0(i2);
        return this;
    }

    @Override // k.f
    /* renamed from: j0 */
    public d F(long j2) {
        if (j2 == 0) {
            h0(48);
        } else {
            long j3 = (j2 >>> 1) | j2;
            long j4 = j3 | (j3 >>> 2);
            long j5 = j4 | (j4 >>> 4);
            long j6 = j5 | (j5 >>> 8);
            long j7 = j6 | (j6 >>> 16);
            long j8 = j7 | (j7 >>> 32);
            long j9 = j8 - ((j8 >>> 1) & 6148914691236517205L);
            long j10 = ((j9 >>> 2) & 3689348814741910323L) + (j9 & 3689348814741910323L);
            long j11 = ((j10 >>> 4) + j10) & 1085102592571150095L;
            long j12 = j11 + (j11 >>> 8);
            long j13 = j12 + (j12 >>> 16);
            int i2 = (int) ((((j13 & 63) + ((j13 >>> 32) & 63)) + 3) / 4);
            s a0 = a0(i2);
            byte[] bArr = a0.a;
            int i3 = a0.f9640c;
            for (int i4 = (i3 + i2) - 1; i4 >= i3; i4--) {
                bArr[i4] = k.b0.a.a[(int) (15 & j2)];
                j2 >>>= 4;
            }
            a0.f9640c += i2;
            this.f9620b += i2;
        }
        return this;
    }

    @Override // k.f
    public /* bridge */ /* synthetic */ f k(int i2) {
        k0(i2);
        return this;
    }

    public d k0(int i2) {
        s a0 = a0(4);
        byte[] bArr = a0.a;
        int i3 = a0.f9640c;
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >>> 24) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i2 >>> 16) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((i2 >>> 8) & 255);
        bArr[i6] = (byte) (i2 & 255);
        a0.f9640c = i6 + 1;
        this.f9620b += 4;
        return this;
    }

    public d l0(int i2) {
        s a0 = a0(2);
        byte[] bArr = a0.a;
        int i3 = a0.f9640c;
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >>> 8) & 255);
        bArr[i4] = (byte) (i2 & 255);
        a0.f9640c = i4 + 1;
        this.f9620b += 2;
        return this;
    }

    public final d m(d dVar, long j2, long j3) {
        h.o.c.j.e(dVar, "out");
        a0.b(this.f9620b, j2, j3);
        if (j3 != 0) {
            dVar.f9620b += j3;
            s sVar = this.a;
            while (true) {
                h.o.c.j.c(sVar);
                int i2 = sVar.f9640c;
                int i3 = sVar.f9639b;
                if (j2 < i2 - i3) {
                    break;
                }
                j2 -= i2 - i3;
                sVar = sVar.f9643f;
            }
            while (j3 > 0) {
                h.o.c.j.c(sVar);
                s c2 = sVar.c();
                int i4 = c2.f9639b + ((int) j2);
                c2.f9639b = i4;
                c2.f9640c = Math.min(i4 + ((int) j3), c2.f9640c);
                s sVar2 = dVar.a;
                if (sVar2 == null) {
                    c2.f9644g = c2;
                    c2.f9643f = c2;
                    dVar.a = c2;
                } else {
                    h.o.c.j.c(sVar2);
                    s sVar3 = sVar2.f9644g;
                    h.o.c.j.c(sVar3);
                    sVar3.b(c2);
                }
                j3 -= c2.f9640c - c2.f9639b;
                sVar = sVar.f9643f;
                j2 = 0;
            }
        }
        return this;
    }

    public d m0(String str) {
        h.o.c.j.e(str, "string");
        n0(str, 0, str.length());
        return this;
    }

    public d n0(String str, int i2, int i3) {
        char charAt;
        h.o.c.j.e(str, "string");
        if (i2 >= 0) {
            if (i3 >= i2) {
                if (!(i3 <= str.length())) {
                    StringBuilder z = e.a.d.a.a.z("endIndex > string.length: ", i3, " > ");
                    z.append(str.length());
                    throw new IllegalArgumentException(z.toString().toString());
                }
                while (i2 < i3) {
                    char charAt2 = str.charAt(i2);
                    if (charAt2 < 128) {
                        s a0 = a0(1);
                        byte[] bArr = a0.a;
                        int i4 = a0.f9640c - i2;
                        int min = Math.min(i3, 8192 - i4);
                        int i5 = i2 + 1;
                        bArr[i2 + i4] = (byte) charAt2;
                        while (true) {
                            i2 = i5;
                            if (i2 >= min || (charAt = str.charAt(i2)) >= 128) {
                                break;
                            }
                            i5 = i2 + 1;
                            bArr[i2 + i4] = (byte) charAt;
                        }
                        int i6 = a0.f9640c;
                        int i7 = (i4 + i2) - i6;
                        a0.f9640c = i6 + i7;
                        this.f9620b += i7;
                    } else {
                        if (charAt2 < 2048) {
                            s a02 = a0(2);
                            byte[] bArr2 = a02.a;
                            int i8 = a02.f9640c;
                            bArr2[i8] = (byte) ((charAt2 >> 6) | 192);
                            bArr2[i8 + 1] = (byte) ((charAt2 & '?') | 128);
                            a02.f9640c = i8 + 2;
                            this.f9620b += 2;
                        } else if (charAt2 < 55296 || charAt2 > 57343) {
                            s a03 = a0(3);
                            byte[] bArr3 = a03.a;
                            int i9 = a03.f9640c;
                            bArr3[i9] = (byte) ((charAt2 >> '\f') | 224);
                            bArr3[i9 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                            bArr3[i9 + 2] = (byte) ((charAt2 & '?') | 128);
                            a03.f9640c = i9 + 3;
                            this.f9620b += 3;
                        } else {
                            int i10 = i2 + 1;
                            char charAt3 = i10 < i3 ? str.charAt(i10) : (char) 0;
                            if (charAt2 <= 56319) {
                                if (56320 <= charAt3 && charAt3 <= 57343) {
                                    int i11 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                                    s a04 = a0(4);
                                    byte[] bArr4 = a04.a;
                                    int i12 = a04.f9640c;
                                    bArr4[i12] = (byte) ((i11 >> 18) | 240);
                                    bArr4[i12 + 1] = (byte) (((i11 >> 12) & 63) | 128);
                                    bArr4[i12 + 2] = (byte) (((i11 >> 6) & 63) | 128);
                                    bArr4[i12 + 3] = (byte) ((i11 & 63) | 128);
                                    a04.f9640c = i12 + 4;
                                    this.f9620b += 4;
                                    i2 += 2;
                                }
                            }
                            h0(63);
                            i2 = i10;
                        }
                        i2++;
                    }
                }
                return this;
            }
            throw new IllegalArgumentException(e.a.d.a.a.g("endIndex < beginIndex: ", i3, " < ", i2).toString());
        }
        throw new IllegalArgumentException(h.o.c.j.i("beginIndex < 0: ", Integer.valueOf(i2)).toString());
    }

    @Override // k.g
    public d o() {
        return this;
    }

    public d o0(int i2) {
        String str;
        if (i2 < 128) {
            h0(i2);
        } else if (i2 < 2048) {
            s a0 = a0(2);
            byte[] bArr = a0.a;
            int i3 = a0.f9640c;
            bArr[i3] = (byte) ((i2 >> 6) | 192);
            bArr[i3 + 1] = (byte) ((i2 & 63) | 128);
            a0.f9640c = i3 + 2;
            this.f9620b += 2;
        } else {
            int i4 = 0;
            if (55296 <= i2 && i2 <= 57343) {
                h0(63);
            } else if (i2 < 65536) {
                s a02 = a0(3);
                byte[] bArr2 = a02.a;
                int i5 = a02.f9640c;
                bArr2[i5] = (byte) ((i2 >> 12) | 224);
                bArr2[i5 + 1] = (byte) (((i2 >> 6) & 63) | 128);
                bArr2[i5 + 2] = (byte) ((i2 & 63) | 128);
                a02.f9640c = i5 + 3;
                this.f9620b += 3;
            } else if (i2 > 1114111) {
                if (i2 != 0) {
                    char[] cArr = k.b0.b.a;
                    char[] cArr2 = {cArr[(i2 >> 28) & 15], cArr[(i2 >> 24) & 15], cArr[(i2 >> 20) & 15], cArr[(i2 >> 16) & 15], cArr[(i2 >> 12) & 15], cArr[(i2 >> 8) & 15], cArr[(i2 >> 4) & 15], cArr[i2 & 15]};
                    while (i4 < 8 && cArr2[i4] == '0') {
                        i4++;
                    }
                    h.o.c.j.e(cArr2, "<this>");
                    if (i4 < 0) {
                        throw new IndexOutOfBoundsException("startIndex: " + i4 + ", endIndex: 8, size: 8");
                    } else if (i4 > 8) {
                        throw new IllegalArgumentException(e.a.d.a.a.g("startIndex: ", i4, " > endIndex: ", 8));
                    } else {
                        str = new String(cArr2, i4, 8 - i4);
                    }
                } else {
                    str = "0";
                }
                throw new IllegalArgumentException(h.o.c.j.i("Unexpected code point: 0x", str));
            } else {
                s a03 = a0(4);
                byte[] bArr3 = a03.a;
                int i6 = a03.f9640c;
                bArr3[i6] = (byte) ((i2 >> 18) | 240);
                bArr3[i6 + 1] = (byte) (((i2 >> 12) & 63) | 128);
                bArr3[i6 + 2] = (byte) (((i2 >> 6) & 63) | 128);
                bArr3[i6 + 3] = (byte) ((i2 & 63) | 128);
                a03.f9640c = i6 + 4;
                this.f9620b += 4;
            }
        }
        return this;
    }

    @Override // k.g
    public boolean p() {
        return this.f9620b == 0;
    }

    @Override // k.f
    public /* bridge */ /* synthetic */ f q(int i2) {
        h0(i2);
        return this;
    }

    public final byte r(long j2) {
        a0.b(this.f9620b, j2, 1L);
        s sVar = this.a;
        if (sVar == null) {
            s sVar2 = null;
            h.o.c.j.c(null);
            return sVar2.a[(int) ((sVar2.f9639b + j2) - (-1))];
        }
        long j3 = this.f9620b;
        if (j3 - j2 < j2) {
            while (j3 > j2) {
                sVar = sVar.f9644g;
                h.o.c.j.c(sVar);
                j3 -= sVar.f9640c - sVar.f9639b;
            }
            h.o.c.j.c(sVar);
            return sVar.a[(int) ((sVar.f9639b + j2) - j3)];
        }
        long j4 = 0;
        while (true) {
            long j5 = (sVar.f9640c - sVar.f9639b) + j4;
            if (j5 > j2) {
                h.o.c.j.c(sVar);
                return sVar.a[(int) ((sVar.f9639b + j2) - j4)];
            }
            sVar = sVar.f9643f;
            h.o.c.j.c(sVar);
            j4 = j5;
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        h.o.c.j.e(byteBuffer, "sink");
        s sVar = this.a;
        if (sVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), sVar.f9640c - sVar.f9639b);
        byteBuffer.put(sVar.a, sVar.f9639b, min);
        int i2 = sVar.f9639b + min;
        sVar.f9639b = i2;
        this.f9620b -= min;
        if (i2 == sVar.f9640c) {
            this.a = sVar.a();
            t.a(sVar);
        }
        return min;
    }

    public int read(byte[] bArr, int i2, int i3) {
        h.o.c.j.e(bArr, "sink");
        a0.b(bArr.length, i2, i3);
        s sVar = this.a;
        if (sVar == null) {
            return -1;
        }
        int min = Math.min(i3, sVar.f9640c - sVar.f9639b);
        byte[] bArr2 = sVar.a;
        int i4 = sVar.f9639b;
        h.l.c.b(bArr2, bArr, i2, i4, i4 + min);
        int i5 = sVar.f9639b + min;
        sVar.f9639b = i5;
        this.f9620b -= min;
        if (i5 == sVar.f9640c) {
            this.a = sVar.a();
            t.a(sVar);
        }
        return min;
    }

    @Override // k.g
    public byte readByte() throws EOFException {
        if (this.f9620b != 0) {
            s sVar = this.a;
            h.o.c.j.c(sVar);
            int i2 = sVar.f9639b;
            int i3 = sVar.f9640c;
            int i4 = i2 + 1;
            byte b2 = sVar.a[i2];
            this.f9620b--;
            if (i4 == i3) {
                this.a = sVar.a();
                t.a(sVar);
            } else {
                sVar.f9639b = i4;
            }
            return b2;
        }
        throw new EOFException();
    }

    @Override // k.g
    public int readInt() throws EOFException {
        if (this.f9620b >= 4) {
            s sVar = this.a;
            h.o.c.j.c(sVar);
            int i2 = sVar.f9639b;
            int i3 = sVar.f9640c;
            if (i3 - i2 < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = sVar.a;
            int i4 = i2 + 1;
            int i5 = i4 + 1;
            int i6 = ((bArr[i2] & 255) << 24) | ((bArr[i4] & 255) << 16);
            int i7 = i5 + 1;
            int i8 = i6 | ((bArr[i5] & 255) << 8);
            int i9 = i7 + 1;
            int i10 = i8 | (bArr[i7] & 255);
            this.f9620b -= 4;
            if (i9 == i3) {
                this.a = sVar.a();
                t.a(sVar);
            } else {
                sVar.f9639b = i9;
            }
            return i10;
        }
        throw new EOFException();
    }

    @Override // k.g
    public short readShort() throws EOFException {
        if (this.f9620b >= 2) {
            s sVar = this.a;
            h.o.c.j.c(sVar);
            int i2 = sVar.f9639b;
            int i3 = sVar.f9640c;
            if (i3 - i2 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = sVar.a;
            int i4 = i2 + 1;
            int i5 = i4 + 1;
            int i6 = ((bArr[i2] & 255) << 8) | (bArr[i4] & 255);
            this.f9620b -= 2;
            if (i5 == i3) {
                this.a = sVar.a();
                t.a(sVar);
            } else {
                sVar.f9639b = i5;
            }
            return (short) i6;
        }
        throw new EOFException();
    }

    @Override // k.g
    public void skip(long j2) throws EOFException {
        while (j2 > 0) {
            s sVar = this.a;
            if (sVar == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j2, sVar.f9640c - sVar.f9639b);
            long j3 = min;
            this.f9620b -= j3;
            j2 -= j3;
            int i2 = sVar.f9639b + min;
            sVar.f9639b = i2;
            if (i2 == sVar.f9640c) {
                this.a = sVar.a();
                t.a(sVar);
            }
        }
    }

    public String toString() {
        long j2 = this.f9620b;
        if (j2 <= 2147483647L) {
            return W((int) j2).toString();
        }
        throw new IllegalStateException(h.o.c.j.i("size > Int.MAX_VALUE: ", Long.valueOf(j2)).toString());
    }

    public long u(byte b2, long j2, long j3) {
        s sVar;
        boolean z = false;
        long j4 = 0;
        if (0 <= j2 && j2 <= j3) {
            z = true;
        }
        if (!z) {
            StringBuilder y = e.a.d.a.a.y("size=");
            y.append(this.f9620b);
            e.a.d.a.a.K(y, " fromIndex=", j2, " toIndex=");
            y.append(j3);
            throw new IllegalArgumentException(y.toString().toString());
        }
        long j5 = this.f9620b;
        long j6 = j3 > j5 ? j5 : j3;
        if (j2 != j6 && (sVar = this.a) != null) {
            if (j5 - j2 < j2) {
                while (j5 > j2) {
                    sVar = sVar.f9644g;
                    h.o.c.j.c(sVar);
                    j5 -= sVar.f9640c - sVar.f9639b;
                }
                while (j5 < j6) {
                    byte[] bArr = sVar.a;
                    int min = (int) Math.min(sVar.f9640c, (sVar.f9639b + j6) - j5);
                    for (int i2 = (int) ((sVar.f9639b + j2) - j5); i2 < min; i2++) {
                        if (bArr[i2] == b2) {
                            return (i2 - sVar.f9639b) + j5;
                        }
                    }
                    j5 += sVar.f9640c - sVar.f9639b;
                    sVar = sVar.f9643f;
                    h.o.c.j.c(sVar);
                    j2 = j5;
                }
            } else {
                while (true) {
                    long j7 = (sVar.f9640c - sVar.f9639b) + j4;
                    if (j7 > j2) {
                        break;
                    }
                    sVar = sVar.f9643f;
                    h.o.c.j.c(sVar);
                    j4 = j7;
                }
                while (j4 < j6) {
                    byte[] bArr2 = sVar.a;
                    int min2 = (int) Math.min(sVar.f9640c, (sVar.f9639b + j6) - j4);
                    for (int i3 = (int) ((sVar.f9639b + j2) - j4); i3 < min2; i3++) {
                        if (bArr2[i3] == b2) {
                            return (i3 - sVar.f9639b) + j4;
                        }
                    }
                    j4 += sVar.f9640c - sVar.f9639b;
                    sVar = sVar.f9643f;
                    h.o.c.j.c(sVar);
                    j2 = j4;
                }
            }
        }
        return -1L;
    }

    @Override // k.g
    public String w(long j2) throws EOFException {
        if (j2 >= 0) {
            long j3 = j2 != Long.MAX_VALUE ? j2 + 1 : Long.MAX_VALUE;
            byte b2 = (byte) 10;
            long u = u(b2, 0L, j3);
            if (u != -1) {
                return k.b0.a.a(this, u);
            }
            if (j3 < this.f9620b && r(j3 - 1) == ((byte) 13) && r(j3) == b2) {
                return k.b0.a.a(this, j3);
            }
            d dVar = new d();
            m(dVar, 0L, Math.min(32, this.f9620b));
            StringBuilder y = e.a.d.a.a.y("\\n not found: limit=");
            y.append(Math.min(this.f9620b, j2));
            y.append(" content=");
            y.append(dVar.z().t());
            y.append((char) 8230);
            throw new EOFException(y.toString());
        }
        throw new IllegalArgumentException(h.o.c.j.i("limit < 0: ", Long.valueOf(j2)).toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        h.o.c.j.e(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i2 = remaining;
        while (i2 > 0) {
            s a0 = a0(1);
            int min = Math.min(i2, 8192 - a0.f9640c);
            byteBuffer.get(a0.a, a0.f9640c, min);
            i2 -= min;
            a0.f9640c += min;
        }
        this.f9620b += remaining;
        return remaining;
    }

    @Override // k.f
    public /* bridge */ /* synthetic */ f x(String str) {
        m0(str);
        return this;
    }

    public byte[] y() {
        return L(this.f9620b);
    }

    public h z() {
        return g(this.f9620b);
    }
}
