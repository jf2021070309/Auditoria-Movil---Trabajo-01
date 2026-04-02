package com.amazon.aps.iva.ef0;

import com.amazon.aps.iva.j0.j0;
import com.google.android.gms.cast.MediaStatus;
import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* compiled from: RealBufferedSource.kt */
/* loaded from: classes4.dex */
public final class x implements h {
    public final d0 b;
    public final e c;
    public boolean d;

    public x(d0 d0Var) {
        com.amazon.aps.iva.yb0.j.f(d0Var, FirebaseAnalytics.Param.SOURCE);
        this.b = d0Var;
        this.c = new e();
    }

    @Override // com.amazon.aps.iva.ef0.h
    public final String E() {
        return q(Long.MAX_VALUE);
    }

    @Override // com.amazon.aps.iva.ef0.h
    public final void P(long j) {
        if (w(j)) {
            return;
        }
        throw new EOFException();
    }

    @Override // com.amazon.aps.iva.ef0.h
    public final i T(long j) {
        P(j);
        return this.c.T(j);
    }

    @Override // com.amazon.aps.iva.ef0.h
    public final long U(i iVar) {
        com.amazon.aps.iva.yb0.j.f(iVar, "targetBytes");
        if (!this.d) {
            long j = 0;
            while (true) {
                e eVar = this.c;
                long s = eVar.s(j, iVar);
                if (s == -1) {
                    long j2 = eVar.c;
                    if (this.b.read(eVar, MediaStatus.COMMAND_PLAYBACK_RATE) == -1) {
                        return -1L;
                    }
                    j = Math.max(j, j2);
                } else {
                    return s;
                }
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    @Override // com.amazon.aps.iva.ef0.h
    public final long W(e eVar) {
        e eVar2;
        long j = 0;
        while (true) {
            d0 d0Var = this.b;
            eVar2 = this.c;
            if (d0Var.read(eVar2, MediaStatus.COMMAND_PLAYBACK_RATE) == -1) {
                break;
            }
            long f = eVar2.f();
            if (f > 0) {
                j += f;
                eVar.write(eVar2, f);
            }
        }
        long j2 = eVar2.c;
        if (j2 > 0) {
            long j3 = j + j2;
            eVar.write(eVar2, j2);
            return j3;
        }
        return j;
    }

    @Override // com.amazon.aps.iva.ef0.h
    public final byte[] X() {
        d0 d0Var = this.b;
        e eVar = this.c;
        eVar.r(d0Var);
        return eVar.X();
    }

    @Override // com.amazon.aps.iva.ef0.h
    public final boolean Y() {
        if (!this.d) {
            e eVar = this.c;
            if (eVar.Y() && this.b.read(eVar, MediaStatus.COMMAND_PLAYBACK_RATE) == -1) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final long a(byte b, long j, long j2) {
        boolean z = true;
        if (!this.d) {
            long j3 = 0;
            if (0 > j2) {
                z = false;
            }
            if (z) {
                while (j3 < j2) {
                    long k = this.c.k(b, j3, j2);
                    if (k != -1) {
                        return k;
                    }
                    e eVar = this.c;
                    long j4 = eVar.c;
                    if (j4 >= j2 || this.b.read(eVar, MediaStatus.COMMAND_PLAYBACK_RATE) == -1) {
                        return -1L;
                    }
                    j3 = Math.max(j3, j4);
                }
                return -1L;
            }
            throw new IllegalArgumentException(j0.f("fromIndex=0 toIndex=", j2).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (r4 == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
        com.amazon.aps.iva.ab.x.x(16);
        com.amazon.aps.iva.ab.x.x(16);
        r1 = java.lang.Integer.toString(r8, 16);
        com.amazon.aps.iva.yb0.j.e(r1, "toString(this, checkRadix(radix))");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
        throw new java.lang.NumberFormatException("Expected a digit or '-' but was 0x".concat(r1));
     */
    @Override // com.amazon.aps.iva.ef0.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b0() {
        /*
            r11 = this;
            r0 = 1
            r11.P(r0)
            r2 = 0
            r4 = r2
        L8:
            long r6 = r4 + r0
            boolean r8 = r11.w(r6)
            com.amazon.aps.iva.ef0.e r9 = r11.c
            if (r8 == 0) goto L49
            byte r8 = r9.i(r4)
            r10 = 48
            if (r8 < r10) goto L1e
            r10 = 57
            if (r8 <= r10) goto L27
        L1e:
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L29
            r5 = 45
            if (r8 == r5) goto L27
            goto L29
        L27:
            r4 = r6
            goto L8
        L29:
            if (r4 == 0) goto L2c
            goto L49
        L2c:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = 16
            com.amazon.aps.iva.ab.x.x(r1)
            com.amazon.aps.iva.ab.x.x(r1)
            java.lang.String r1 = java.lang.Integer.toString(r8, r1)
            java.lang.String r2 = "toString(this, checkRadix(radix))"
            com.amazon.aps.iva.yb0.j.e(r1, r2)
            java.lang.String r2 = "Expected a digit or '-' but was 0x"
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L49:
            long r0 = r9.b0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ef0.x.b0():long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (!this.d) {
            this.d = true;
            this.b.close();
            this.c.a();
        }
    }

    @Override // com.amazon.aps.iva.ef0.h, com.amazon.aps.iva.ef0.g
    public final e d() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.ef0.h
    public final void e(long j) {
        if (!this.d) {
            while (j > 0) {
                e eVar = this.c;
                if (eVar.c == 0 && this.b.read(eVar, MediaStatus.COMMAND_PLAYBACK_RATE) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, eVar.c);
                eVar.e(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.amazon.aps.iva.ef0.h
    public final String f0(Charset charset) {
        com.amazon.aps.iva.yb0.j.f(charset, "charset");
        d0 d0Var = this.b;
        e eVar = this.c;
        eVar.r(d0Var);
        return eVar.f0(charset);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
        return -1;
     */
    @Override // com.amazon.aps.iva.ef0.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(com.amazon.aps.iva.ef0.t r8) {
        /*
            r7 = this;
            java.lang.String r0 = "options"
            com.amazon.aps.iva.yb0.j.f(r8, r0)
            boolean r0 = r7.d
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L36
        Lb:
            com.amazon.aps.iva.ef0.e r0 = r7.c
            int r2 = com.amazon.aps.iva.ff0.a.c(r0, r8, r1)
            r3 = -2
            r4 = -1
            if (r2 == r3) goto L26
            if (r2 == r4) goto L24
            com.amazon.aps.iva.ef0.i[] r8 = r8.b
            r8 = r8[r2]
            int r8 = r8.c()
            long r3 = (long) r8
            r0.e(r3)
            goto L35
        L24:
            r2 = r4
            goto L35
        L26:
            com.amazon.aps.iva.ef0.d0 r2 = r7.b
            r5 = 8192(0x2000, double:4.0474E-320)
            long r2 = r2.read(r0, r5)
            r5 = -1
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 != 0) goto Lb
            goto L24
        L35:
            return r2
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ef0.x.g(com.amazon.aps.iva.ef0.t):int");
    }

    @Override // com.amazon.aps.iva.ef0.h
    public final i h0() {
        d0 d0Var = this.b;
        e eVar = this.c;
        eVar.r(d0Var);
        return eVar.h0();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.d;
    }

    @Override // com.amazon.aps.iva.ef0.h
    public final void n0(e eVar, long j) {
        e eVar2 = this.c;
        com.amazon.aps.iva.yb0.j.f(eVar, "sink");
        try {
            P(j);
            eVar2.n0(eVar, j);
        } catch (EOFException e) {
            eVar.r(eVar2);
            throw e;
        }
    }

    @Override // com.amazon.aps.iva.ef0.h
    public final x peek() {
        return r.b(new v(this));
    }

    @Override // com.amazon.aps.iva.ef0.h
    public final String q(long j) {
        boolean z;
        long j2;
        e eVar;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (j == Long.MAX_VALUE) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j + 1;
            }
            long a2 = a((byte) 10, 0L, j2);
            int i = (a2 > (-1L) ? 1 : (a2 == (-1L) ? 0 : -1));
            e eVar2 = this.c;
            if (i != 0) {
                return com.amazon.aps.iva.ff0.a.b(eVar2, a2);
            }
            if (j2 < Long.MAX_VALUE && w(j2) && eVar2.i(j2 - 1) == 13 && w(1 + j2) && eVar2.i(j2) == 10) {
                return com.amazon.aps.iva.ff0.a.b(eVar2, j2);
            }
            eVar2.h(0L, new e(), Math.min(32, eVar2.c));
            throw new EOFException("\\n not found: limit=" + Math.min(eVar2.c, j) + " content=" + eVar.h0().f() + (char) 8230);
        }
        throw new IllegalArgumentException(j0.f("limit < 0: ", j).toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0031, code lost:
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
        com.amazon.aps.iva.ab.x.x(16);
        com.amazon.aps.iva.ab.x.x(16);
        r1 = java.lang.Integer.toString(r2, 16);
        com.amazon.aps.iva.yb0.j.e(r1, "toString(this, checkRadix(radix))");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(r1));
     */
    @Override // com.amazon.aps.iva.ef0.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long q0() {
        /*
            r6 = this;
            r0 = 1
            r6.P(r0)
            r0 = 0
        L6:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r6.w(r2)
            com.amazon.aps.iva.ef0.e r3 = r6.c
            if (r2 == 0) goto L51
            long r4 = (long) r0
            byte r2 = r3.i(r4)
            r4 = 48
            if (r2 < r4) goto L1e
            r4 = 57
            if (r2 <= r4) goto L2f
        L1e:
            r4 = 97
            if (r2 < r4) goto L26
            r4 = 102(0x66, float:1.43E-43)
            if (r2 <= r4) goto L2f
        L26:
            r4 = 65
            if (r2 < r4) goto L31
            r4 = 70
            if (r2 <= r4) goto L2f
            goto L31
        L2f:
            r0 = r1
            goto L6
        L31:
            if (r0 == 0) goto L34
            goto L51
        L34:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = 16
            com.amazon.aps.iva.ab.x.x(r1)
            com.amazon.aps.iva.ab.x.x(r1)
            java.lang.String r1 = java.lang.Integer.toString(r2, r1)
            java.lang.String r2 = "toString(this, checkRadix(radix))"
            com.amazon.aps.iva.yb0.j.e(r1, r2)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L51:
            long r0 = r3.q0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ef0.x.q0():long");
    }

    @Override // com.amazon.aps.iva.ef0.h
    public final InputStream r0() {
        return new a();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        com.amazon.aps.iva.yb0.j.f(byteBuffer, "sink");
        e eVar = this.c;
        if (eVar.c == 0 && this.b.read(eVar, MediaStatus.COMMAND_PLAYBACK_RATE) == -1) {
            return -1;
        }
        return eVar.read(byteBuffer);
    }

    @Override // com.amazon.aps.iva.ef0.h
    public final byte readByte() {
        P(1L);
        return this.c.readByte();
    }

    @Override // com.amazon.aps.iva.ef0.h
    public final void readFully(byte[] bArr) {
        e eVar = this.c;
        try {
            P(bArr.length);
            eVar.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = eVar.c;
                if (j > 0) {
                    int t = eVar.t(bArr, i, (int) j);
                    if (t != -1) {
                        i += t;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e;
                }
            }
        }
    }

    @Override // com.amazon.aps.iva.ef0.h
    public final int readInt() {
        P(4L);
        return this.c.readInt();
    }

    @Override // com.amazon.aps.iva.ef0.h
    public final long readLong() {
        P(8L);
        return this.c.readLong();
    }

    @Override // com.amazon.aps.iva.ef0.h
    public final short readShort() {
        P(2L);
        return this.c.readShort();
    }

    @Override // com.amazon.aps.iva.ef0.d0
    public final e0 timeout() {
        return this.b.timeout();
    }

    public final String toString() {
        return "buffer(" + this.b + ')';
    }

    @Override // com.amazon.aps.iva.ef0.h
    public final boolean w(long j) {
        boolean z;
        e eVar;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!this.d) {
                do {
                    eVar = this.c;
                    if (eVar.c >= j) {
                        return true;
                    }
                } while (this.b.read(eVar, MediaStatus.COMMAND_PLAYBACK_RATE) != -1);
                return false;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(j0.f("byteCount < 0: ", j).toString());
    }

    @Override // com.amazon.aps.iva.ef0.h
    public final boolean z(long j, i iVar) {
        com.amazon.aps.iva.yb0.j.f(iVar, "bytes");
        int c = iVar.c();
        if (!this.d) {
            if (c >= 0 && iVar.c() - 0 >= c) {
                for (int i = 0; i < c; i++) {
                    long j2 = i + 0;
                    if (w(1 + j2) && this.c.i(j2) == iVar.i(0 + i)) {
                    }
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.amazon.aps.iva.ef0.d0
    public final long read(e eVar, long j) {
        com.amazon.aps.iva.yb0.j.f(eVar, "sink");
        if (j >= 0) {
            if (!this.d) {
                e eVar2 = this.c;
                if (eVar2.c == 0 && this.b.read(eVar2, MediaStatus.COMMAND_PLAYBACK_RATE) == -1) {
                    return -1L;
                }
                return eVar2.read(eVar, Math.min(j, eVar2.c));
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(j0.f("byteCount < 0: ", j).toString());
    }

    /* compiled from: RealBufferedSource.kt */
    /* loaded from: classes4.dex */
    public static final class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public final int available() {
            x xVar = x.this;
            if (!xVar.d) {
                return (int) Math.min(xVar.c.c, Integer.MAX_VALUE);
            }
            throw new IOException("closed");
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            x.this.close();
        }

        @Override // java.io.InputStream
        public final int read() {
            x xVar = x.this;
            if (!xVar.d) {
                e eVar = xVar.c;
                if (eVar.c == 0 && xVar.b.read(eVar, MediaStatus.COMMAND_PLAYBACK_RATE) == -1) {
                    return -1;
                }
                return xVar.c.readByte() & UnsignedBytes.MAX_VALUE;
            }
            throw new IOException("closed");
        }

        public final String toString() {
            return x.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) {
            com.amazon.aps.iva.yb0.j.f(bArr, "data");
            x xVar = x.this;
            if (!xVar.d) {
                b.b(bArr.length, i, i2);
                e eVar = xVar.c;
                if (eVar.c == 0 && xVar.b.read(eVar, MediaStatus.COMMAND_PLAYBACK_RATE) == -1) {
                    return -1;
                }
                return xVar.c.t(bArr, i, i2);
            }
            throw new IOException("closed");
        }
    }
}
