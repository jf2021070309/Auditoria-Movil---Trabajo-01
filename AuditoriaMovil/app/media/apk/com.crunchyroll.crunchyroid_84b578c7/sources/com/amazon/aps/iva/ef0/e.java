package com.amazon.aps.iva.ef0;

import com.amazon.aps.iva.j0.j0;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Arrays;
import okhttp3.internal.connection.RealConnection;
/* compiled from: Buffer.kt */
/* loaded from: classes4.dex */
public final class e implements h, g, Cloneable, ByteChannel {
    public y b;
    public long c;

    /* compiled from: Buffer.kt */
    /* loaded from: classes4.dex */
    public static final class a implements Closeable {
        public e b;
        public boolean c;
        public y d;
        public byte[] f;
        public long e = -1;
        public int g = -1;
        public int h = -1;

        public final void a(long j) {
            e eVar = this.b;
            if (eVar != null) {
                if (this.c) {
                    long j2 = eVar.c;
                    int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                    int i2 = 1;
                    if (i <= 0) {
                        if (j < 0) {
                            i2 = 0;
                        }
                        if (i2 != 0) {
                            long j3 = j2 - j;
                            while (true) {
                                if (j3 <= 0) {
                                    break;
                                }
                                y yVar = eVar.b;
                                com.amazon.aps.iva.yb0.j.c(yVar);
                                y yVar2 = yVar.g;
                                com.amazon.aps.iva.yb0.j.c(yVar2);
                                int i3 = yVar2.c;
                                long j4 = i3 - yVar2.b;
                                if (j4 <= j3) {
                                    eVar.b = yVar2.a();
                                    z.a(yVar2);
                                    j3 -= j4;
                                } else {
                                    yVar2.c = i3 - ((int) j3);
                                    break;
                                }
                            }
                            this.d = null;
                            this.e = j;
                            this.f = null;
                            this.g = -1;
                            this.h = -1;
                        } else {
                            throw new IllegalArgumentException(j0.f("newSize < 0: ", j).toString());
                        }
                    } else if (i > 0) {
                        long j5 = j - j2;
                        boolean z = true;
                        while (j5 > 0) {
                            y G = eVar.G(i2);
                            int min = (int) Math.min(j5, 8192 - G.c);
                            int i4 = G.c + min;
                            G.c = i4;
                            j5 -= min;
                            if (z) {
                                this.d = G;
                                this.e = j2;
                                this.f = G.a;
                                this.g = i4 - min;
                                this.h = i4;
                                z = false;
                            }
                            i2 = 1;
                        }
                    }
                    eVar.c = j;
                    return;
                }
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        public final int c(long j) {
            int i;
            long j2;
            e eVar = this.b;
            if (eVar != null) {
                int i2 = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
                if (i2 >= 0 && j <= (eVar.c)) {
                    if (i2 != 0 && i != 0) {
                        y yVar = eVar.b;
                        y yVar2 = this.d;
                        long j3 = 0;
                        if (yVar2 != null) {
                            long j4 = this.e - (this.g - yVar2.b);
                            if (j4 > j) {
                                j2 = j4;
                            } else {
                                j3 = j4;
                                yVar2 = yVar;
                                yVar = yVar2;
                            }
                        } else {
                            yVar2 = yVar;
                        }
                        if (j2 - j > j - j3) {
                            while (true) {
                                com.amazon.aps.iva.yb0.j.c(yVar);
                                long j5 = (yVar.c - yVar.b) + j3;
                                if (j < j5) {
                                    break;
                                }
                                yVar = yVar.f;
                                j3 = j5;
                            }
                        } else {
                            while (j2 > j) {
                                com.amazon.aps.iva.yb0.j.c(yVar2);
                                yVar2 = yVar2.g;
                                com.amazon.aps.iva.yb0.j.c(yVar2);
                                j2 -= yVar2.c - yVar2.b;
                            }
                            j3 = j2;
                            yVar = yVar2;
                        }
                        if (this.c) {
                            com.amazon.aps.iva.yb0.j.c(yVar);
                            if (yVar.d) {
                                byte[] bArr = yVar.a;
                                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                                com.amazon.aps.iva.yb0.j.e(copyOf, "copyOf(this, size)");
                                y yVar3 = new y(copyOf, yVar.b, yVar.c, false, true);
                                if (eVar.b == yVar) {
                                    eVar.b = yVar3;
                                }
                                yVar.b(yVar3);
                                y yVar4 = yVar3.g;
                                com.amazon.aps.iva.yb0.j.c(yVar4);
                                yVar4.a();
                                yVar = yVar3;
                            }
                        }
                        this.d = yVar;
                        this.e = j;
                        com.amazon.aps.iva.yb0.j.c(yVar);
                        this.f = yVar.a;
                        int i3 = yVar.b + ((int) (j - j3));
                        this.g = i3;
                        int i4 = yVar.c;
                        this.h = i4;
                        return i4 - i3;
                    }
                    this.d = null;
                    this.e = j;
                    this.f = null;
                    this.g = -1;
                    this.h = -1;
                    return -1;
                }
                throw new ArrayIndexOutOfBoundsException("offset=" + j + " > size=" + eVar.c);
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            boolean z;
            if (this.b != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.b = null;
                this.d = null;
                this.e = -1L;
                this.f = null;
                this.g = -1;
                this.h = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }
    }

    public final String A() {
        return y(this.c, com.amazon.aps.iva.oe0.a.b);
    }

    public final String B(long j) throws EOFException {
        return y(j, com.amazon.aps.iva.oe0.a.b);
    }

    public final int C() throws EOFException {
        int i;
        int i2;
        int i3;
        if (this.c != 0) {
            byte i4 = i(0L);
            boolean z = false;
            if ((i4 & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                i = i4 & Ascii.DEL;
                i3 = 0;
                i2 = 1;
            } else if ((i4 & 224) == 192) {
                i = i4 & Ascii.US;
                i2 = 2;
                i3 = 128;
            } else if ((i4 & 240) == 224) {
                i = i4 & Ascii.SI;
                i2 = 3;
                i3 = 2048;
            } else if ((i4 & 248) == 240) {
                i = i4 & 7;
                i2 = 4;
                i3 = Cast.MAX_MESSAGE_LENGTH;
            } else {
                e(1L);
                return 65533;
            }
            long j = i2;
            if (this.c >= j) {
                for (int i5 = 1; i5 < i2; i5++) {
                    long j2 = i5;
                    byte i6 = i(j2);
                    if ((i6 & 192) == 128) {
                        i = (i << 6) | (i6 & 63);
                    } else {
                        e(j2);
                        return 65533;
                    }
                }
                e(j);
                if (i > 1114111) {
                    return 65533;
                }
                if (55296 <= i && i < 57344) {
                    z = true;
                }
                if (z || i < i3) {
                    return 65533;
                }
                return i;
            }
            StringBuilder d = com.amazon.aps.iva.e4.e.d("size < ", i2, ": ");
            d.append(this.c);
            d.append(" (to read code point prefixed 0x");
            d.append(com.amazon.aps.iva.ef0.b.c(i4));
            d.append(')');
            throw new EOFException(d.toString());
        }
        throw new EOFException();
    }

    @Override // com.amazon.aps.iva.ef0.h
    public final String E() throws EOFException {
        return q(Long.MAX_VALUE);
    }

    public final i F(int i) {
        if (i == 0) {
            return i.e;
        }
        com.amazon.aps.iva.ef0.b.b(this.c, 0L, i);
        y yVar = this.b;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            com.amazon.aps.iva.yb0.j.c(yVar);
            int i5 = yVar.c;
            int i6 = yVar.b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                yVar = yVar.f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4];
        int[] iArr = new int[i4 * 2];
        y yVar2 = this.b;
        int i7 = 0;
        while (i2 < i) {
            com.amazon.aps.iva.yb0.j.c(yVar2);
            bArr[i7] = yVar2.a;
            i2 += yVar2.c - yVar2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = yVar2.b;
            yVar2.d = true;
            i7++;
            yVar2 = yVar2.f;
        }
        return new a0(bArr, iArr);
    }

    public final y G(int i) {
        boolean z = true;
        if ((i < 1 || i > 8192) ? false : false) {
            y yVar = this.b;
            if (yVar == null) {
                y b2 = z.b();
                this.b = b2;
                b2.g = b2;
                b2.f = b2;
                return b2;
            }
            y yVar2 = yVar.g;
            com.amazon.aps.iva.yb0.j.c(yVar2);
            if (yVar2.c + i <= 8192 && yVar2.e) {
                return yVar2;
            }
            y b3 = z.b();
            yVar2.b(b3);
            return b3;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    public final void H(int i, byte[] bArr, int i2) {
        com.amazon.aps.iva.yb0.j.f(bArr, FirebaseAnalytics.Param.SOURCE);
        long j = i2;
        com.amazon.aps.iva.ef0.b.b(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            y G = G(1);
            int min = Math.min(i3 - i, 8192 - G.c);
            int i4 = i + min;
            com.amazon.aps.iva.lb0.m.D(bArr, G.c, G.a, i, i4);
            G.c += min;
            i = i4;
        }
        this.c += j;
    }

    public final void I(i iVar) {
        com.amazon.aps.iva.yb0.j.f(iVar, "byteString");
        iVar.n(this, iVar.c());
    }

    @Override // com.amazon.aps.iva.ef0.g
    public final /* bridge */ /* synthetic */ g J(int i, byte[] bArr, int i2) {
        H(i, bArr, i2);
        return this;
    }

    public final void K(byte[] bArr) {
        com.amazon.aps.iva.yb0.j.f(bArr, FirebaseAnalytics.Param.SOURCE);
        H(0, bArr, bArr.length);
    }

    public final void L(int i) {
        y G = G(1);
        int i2 = G.c;
        G.c = i2 + 1;
        G.a[i2] = (byte) i;
        this.c++;
    }

    public final e M(long j) {
        boolean z;
        byte[] bArr;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            L(48);
        } else {
            int i2 = 1;
            if (i < 0) {
                j = -j;
                if (j < 0) {
                    c0("-9223372036854775808");
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            if (j < 100000000) {
                if (j < NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS) {
                    if (j < 100) {
                        if (j >= 10) {
                            i2 = 2;
                        }
                    } else if (j < 1000) {
                        i2 = 3;
                    } else {
                        i2 = 4;
                    }
                } else if (j < 1000000) {
                    if (j < 100000) {
                        i2 = 5;
                    } else {
                        i2 = 6;
                    }
                } else if (j < 10000000) {
                    i2 = 7;
                } else {
                    i2 = 8;
                }
            } else if (j < 1000000000000L) {
                if (j < RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
                    if (j < 1000000000) {
                        i2 = 9;
                    } else {
                        i2 = 10;
                    }
                } else if (j < 100000000000L) {
                    i2 = 11;
                } else {
                    i2 = 12;
                }
            } else if (j < 1000000000000000L) {
                if (j < 10000000000000L) {
                    i2 = 13;
                } else if (j < 100000000000000L) {
                    i2 = 14;
                } else {
                    i2 = 15;
                }
            } else if (j < 100000000000000000L) {
                if (j < 10000000000000000L) {
                    i2 = 16;
                } else {
                    i2 = 17;
                }
            } else if (j < 1000000000000000000L) {
                i2 = 18;
            } else {
                i2 = 19;
            }
            if (z) {
                i2++;
            }
            y G = G(i2);
            int i3 = G.c + i2;
            while (true) {
                int i4 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                bArr = G.a;
                if (i4 == 0) {
                    break;
                }
                long j2 = 10;
                i3--;
                bArr[i3] = com.amazon.aps.iva.ff0.a.a[(int) (j % j2)];
                j /= j2;
            }
            if (z) {
                bArr[i3 - 1] = 45;
            }
            G.c += i2;
            this.c += i2;
        }
        return this;
    }

    public final e N(long j) {
        if (j == 0) {
            L(48);
        } else {
            long j2 = (j >>> 1) | j;
            long j3 = j2 | (j2 >>> 2);
            long j4 = j3 | (j3 >>> 4);
            long j5 = j4 | (j4 >>> 8);
            long j6 = j5 | (j5 >>> 16);
            long j7 = j6 | (j6 >>> 32);
            long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
            long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
            long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
            long j11 = j10 + (j10 >>> 8);
            long j12 = j11 + (j11 >>> 16);
            int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
            y G = G(i);
            int i2 = G.c;
            for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
                G.a[i3] = com.amazon.aps.iva.ff0.a.a[(int) (15 & j)];
                j >>>= 4;
            }
            G.c += i;
            this.c += i;
        }
        return this;
    }

    public final void O(int i) {
        y G = G(4);
        int i2 = G.c;
        int i3 = i2 + 1;
        byte[] bArr = G.a;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        G.c = i5 + 1;
        this.c += 4;
    }

    @Override // com.amazon.aps.iva.ef0.h
    public final void P(long j) throws EOFException {
        if (this.c >= j) {
            return;
        }
        throw new EOFException();
    }

    @Override // com.amazon.aps.iva.ef0.g
    public final /* bridge */ /* synthetic */ g Q(long j) {
        M(j);
        return this;
    }

    public final void R(long j) {
        y G = G(8);
        int i = G.c;
        int i2 = i + 1;
        byte[] bArr = G.a;
        bArr[i] = (byte) ((j >>> 56) & 255);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((j >>> 48) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((j >>> 40) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((j >>> 32) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((j >>> 24) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((j >>> 16) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((j >>> 8) & 255);
        bArr[i8] = (byte) (j & 255);
        G.c = i8 + 1;
        this.c += 8;
    }

    @Override // com.amazon.aps.iva.ef0.g
    public final /* bridge */ /* synthetic */ g S(i iVar) {
        I(iVar);
        return this;
    }

    @Override // com.amazon.aps.iva.ef0.h
    public final i T(long j) throws EOFException {
        boolean z;
        if (j >= 0 && j <= 2147483647L) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.c >= j) {
                if (j >= MediaStatus.COMMAND_EDIT_TRACKS) {
                    i F = F((int) j);
                    e(j);
                    return F;
                }
                return new i(x(j));
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(j0.f("byteCount: ", j).toString());
    }

    @Override // com.amazon.aps.iva.ef0.h
    public final long U(i iVar) {
        com.amazon.aps.iva.yb0.j.f(iVar, "targetBytes");
        return s(0L, iVar);
    }

    public final void V(int i) {
        y G = G(2);
        int i2 = G.c;
        int i3 = i2 + 1;
        byte[] bArr = G.a;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        G.c = i3 + 1;
        this.c += 2;
    }

    @Override // com.amazon.aps.iva.ef0.h
    public final long W(e eVar) throws IOException {
        long j = this.c;
        if (j > 0) {
            eVar.write(this, j);
        }
        return j;
    }

    @Override // com.amazon.aps.iva.ef0.h
    public final byte[] X() {
        return x(this.c);
    }

    @Override // com.amazon.aps.iva.ef0.h
    public final boolean Y() {
        if (this.c == 0) {
            return true;
        }
        return false;
    }

    public final e Z(String str, int i, int i2, Charset charset) {
        boolean z;
        boolean z2;
        com.amazon.aps.iva.yb0.j.f(str, "string");
        com.amazon.aps.iva.yb0.j.f(charset, "charset");
        boolean z3 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 > str.length()) {
                    z3 = false;
                }
                if (z3) {
                    if (com.amazon.aps.iva.yb0.j.a(charset, com.amazon.aps.iva.oe0.a.b)) {
                        a0(i, i2, str);
                        return this;
                    }
                    String substring = str.substring(i, i2);
                    com.amazon.aps.iva.yb0.j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    byte[] bytes = substring.getBytes(charset);
                    com.amazon.aps.iva.yb0.j.e(bytes, "this as java.lang.String).getBytes(charset)");
                    H(0, bytes, bytes.length);
                    return this;
                }
                StringBuilder d = com.amazon.aps.iva.e4.e.d("endIndex > string.length: ", i2, " > ");
                d.append(str.length());
                throw new IllegalArgumentException(d.toString().toString());
            }
            throw new IllegalArgumentException(j0.e("endIndex < beginIndex: ", i2, " < ", i).toString());
        }
        throw new IllegalArgumentException(com.amazon.aps.iva.q.c0.a("beginIndex < 0: ", i).toString());
    }

    public final void a() {
        e(this.c);
    }

    public final void a0(int i, int i2, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        char charAt;
        char c;
        boolean z4;
        com.amazon.aps.iva.yb0.j.f(str, "string");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 <= str.length()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    while (i < i2) {
                        char charAt2 = str.charAt(i);
                        if (charAt2 < 128) {
                            y G = G(1);
                            int i3 = G.c - i;
                            int min = Math.min(i2, 8192 - i3);
                            int i4 = i + 1;
                            byte[] bArr = G.a;
                            bArr[i + i3] = (byte) charAt2;
                            while (true) {
                                i = i4;
                                if (i >= min || (charAt = str.charAt(i)) >= 128) {
                                    break;
                                }
                                i4 = i + 1;
                                bArr[i + i3] = (byte) charAt;
                            }
                            int i5 = G.c;
                            int i6 = (i3 + i) - i5;
                            G.c = i5 + i6;
                            this.c += i6;
                        } else {
                            if (charAt2 < 2048) {
                                y G2 = G(2);
                                int i7 = G2.c;
                                byte[] bArr2 = G2.a;
                                bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                                G2.c = i7 + 2;
                                this.c += 2;
                            } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                                int i8 = i + 1;
                                if (i8 < i2) {
                                    c = str.charAt(i8);
                                } else {
                                    c = 0;
                                }
                                if (charAt2 <= 56319) {
                                    if (56320 <= c && c < 57344) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z4) {
                                        int i9 = (((charAt2 & 1023) << 10) | (c & 1023)) + Cast.MAX_MESSAGE_LENGTH;
                                        y G3 = G(4);
                                        int i10 = G3.c;
                                        byte[] bArr3 = G3.a;
                                        bArr3[i10] = (byte) ((i9 >> 18) | 240);
                                        bArr3[i10 + 1] = (byte) (((i9 >> 12) & 63) | 128);
                                        bArr3[i10 + 2] = (byte) (((i9 >> 6) & 63) | 128);
                                        bArr3[i10 + 3] = (byte) ((i9 & 63) | 128);
                                        G3.c = i10 + 4;
                                        this.c += 4;
                                        i += 2;
                                    }
                                }
                                L(63);
                                i = i8;
                            } else {
                                y G4 = G(3);
                                int i11 = G4.c;
                                byte[] bArr4 = G4.a;
                                bArr4[i11] = (byte) ((charAt2 >> '\f') | 224);
                                bArr4[i11 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr4[i11 + 2] = (byte) ((charAt2 & '?') | 128);
                                G4.c = i11 + 3;
                                this.c += 3;
                            }
                            i++;
                        }
                    }
                    return;
                }
                StringBuilder d = com.amazon.aps.iva.e4.e.d("endIndex > string.length: ", i2, " > ");
                d.append(str.length());
                throw new IllegalArgumentException(d.toString().toString());
            }
            throw new IllegalArgumentException(j0.e("endIndex < beginIndex: ", i2, " < ", i).toString());
        }
        throw new IllegalArgumentException(com.amazon.aps.iva.q.c0.a("beginIndex < 0: ", i).toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
        r0 = new com.amazon.aps.iva.ef0.e();
        r0.M(r3);
        r0.L(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
        if (r1 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
        r0.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
        throw new java.lang.NumberFormatException("Number too large: ".concat(r0.A()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
        r2 = true;
     */
    @Override // com.amazon.aps.iva.ef0.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b0() throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ef0.e.b0():long");
    }

    /* renamed from: c */
    public final e clone() {
        e eVar = new e();
        if (this.c != 0) {
            y yVar = this.b;
            com.amazon.aps.iva.yb0.j.c(yVar);
            y c = yVar.c();
            eVar.b = c;
            c.g = c;
            c.f = c;
            for (y yVar2 = yVar.f; yVar2 != yVar; yVar2 = yVar2.f) {
                y yVar3 = c.g;
                com.amazon.aps.iva.yb0.j.c(yVar3);
                com.amazon.aps.iva.yb0.j.c(yVar2);
                yVar3.b(yVar2.c());
            }
            eVar.c = this.c;
        }
        return eVar;
    }

    public final void c0(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "string");
        a0(0, str.length(), str);
    }

    @Override // com.amazon.aps.iva.ef0.h
    public final void e(long j) throws EOFException {
        while (j > 0) {
            y yVar = this.b;
            if (yVar != null) {
                int min = (int) Math.min(j, yVar.c - yVar.b);
                long j2 = min;
                this.c -= j2;
                j -= j2;
                int i = yVar.b + min;
                yVar.b = i;
                if (i == yVar.c) {
                    this.b = yVar.a();
                    z.a(yVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                long j = this.c;
                e eVar = (e) obj;
                if (j == eVar.c) {
                    if (j != 0) {
                        y yVar = this.b;
                        com.amazon.aps.iva.yb0.j.c(yVar);
                        y yVar2 = eVar.b;
                        com.amazon.aps.iva.yb0.j.c(yVar2);
                        int i = yVar.b;
                        int i2 = yVar2.b;
                        long j2 = 0;
                        while (j2 < this.c) {
                            long min = Math.min(yVar.c - i, yVar2.c - i2);
                            long j3 = 0;
                            while (j3 < min) {
                                int i3 = i + 1;
                                byte b2 = yVar.a[i];
                                int i4 = i2 + 1;
                                if (b2 == yVar2.a[i2]) {
                                    j3++;
                                    i2 = i4;
                                    i = i3;
                                }
                            }
                            if (i == yVar.c) {
                                y yVar3 = yVar.f;
                                com.amazon.aps.iva.yb0.j.c(yVar3);
                                i = yVar3.b;
                                yVar = yVar3;
                            }
                            if (i2 == yVar2.c) {
                                yVar2 = yVar2.f;
                                com.amazon.aps.iva.yb0.j.c(yVar2);
                                i2 = yVar2.b;
                            }
                            j2 += min;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final long f() {
        long j = this.c;
        if (j == 0) {
            return 0L;
        }
        y yVar = this.b;
        com.amazon.aps.iva.yb0.j.c(yVar);
        y yVar2 = yVar.g;
        com.amazon.aps.iva.yb0.j.c(yVar2);
        int i = yVar2.c;
        if (i < 8192 && yVar2.e) {
            j -= i - yVar2.b;
        }
        return j;
    }

    @Override // com.amazon.aps.iva.ef0.h
    public final String f0(Charset charset) {
        com.amazon.aps.iva.yb0.j.f(charset, "charset");
        return y(this.c, charset);
    }

    @Override // com.amazon.aps.iva.ef0.h
    public final int g(t tVar) {
        com.amazon.aps.iva.yb0.j.f(tVar, "options");
        int c = com.amazon.aps.iva.ff0.a.c(this, tVar, false);
        if (c == -1) {
            return -1;
        }
        e(tVar.b[c].c());
        return c;
    }

    @Override // com.amazon.aps.iva.ef0.g
    public final /* bridge */ /* synthetic */ g g0(long j) {
        N(j);
        return this;
    }

    public final void h(long j, e eVar, long j2) {
        com.amazon.aps.iva.yb0.j.f(eVar, "out");
        com.amazon.aps.iva.ef0.b.b(this.c, j, j2);
        if (j2 != 0) {
            eVar.c += j2;
            y yVar = this.b;
            while (true) {
                com.amazon.aps.iva.yb0.j.c(yVar);
                long j3 = yVar.c - yVar.b;
                if (j < j3) {
                    break;
                }
                j -= j3;
                yVar = yVar.f;
            }
            while (j2 > 0) {
                com.amazon.aps.iva.yb0.j.c(yVar);
                y c = yVar.c();
                int i = c.b + ((int) j);
                c.b = i;
                c.c = Math.min(i + ((int) j2), c.c);
                y yVar2 = eVar.b;
                if (yVar2 == null) {
                    c.g = c;
                    c.f = c;
                    eVar.b = c;
                } else {
                    y yVar3 = yVar2.g;
                    com.amazon.aps.iva.yb0.j.c(yVar3);
                    yVar3.b(c);
                }
                j2 -= c.c - c.b;
                yVar = yVar.f;
                j = 0;
            }
        }
    }

    @Override // com.amazon.aps.iva.ef0.h
    public final i h0() {
        return T(this.c);
    }

    public final int hashCode() {
        y yVar = this.b;
        if (yVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = yVar.c;
            for (int i3 = yVar.b; i3 < i2; i3++) {
                i = (i * 31) + yVar.a[i3];
            }
            yVar = yVar.f;
            com.amazon.aps.iva.yb0.j.c(yVar);
        } while (yVar != this.b);
        return i;
    }

    public final byte i(long j) {
        com.amazon.aps.iva.ef0.b.b(this.c, j, 1L);
        y yVar = this.b;
        if (yVar != null) {
            long j2 = this.c;
            if (j2 - j < j) {
                while (j2 > j) {
                    yVar = yVar.g;
                    com.amazon.aps.iva.yb0.j.c(yVar);
                    j2 -= yVar.c - yVar.b;
                }
                return yVar.a[(int) ((yVar.b + j) - j2)];
            }
            long j3 = 0;
            while (true) {
                int i = yVar.c;
                int i2 = yVar.b;
                long j4 = (i - i2) + j3;
                if (j4 <= j) {
                    yVar = yVar.f;
                    com.amazon.aps.iva.yb0.j.c(yVar);
                    j3 = j4;
                } else {
                    return yVar.a[(int) ((i2 + j) - j3)];
                }
            }
        } else {
            com.amazon.aps.iva.yb0.j.c(null);
            throw null;
        }
    }

    public final void i0(int i) {
        boolean z;
        String str;
        if (i < 128) {
            L(i);
        } else if (i < 2048) {
            y G = G(2);
            int i2 = G.c;
            byte[] bArr = G.a;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            G.c = i2 + 2;
            this.c += 2;
        } else {
            int i3 = 0;
            if (55296 <= i && i < 57344) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                L(63);
            } else if (i < 65536) {
                y G2 = G(3);
                int i4 = G2.c;
                byte[] bArr2 = G2.a;
                bArr2[i4] = (byte) ((i >> 12) | 224);
                bArr2[i4 + 1] = (byte) (((i >> 6) & 63) | 128);
                bArr2[i4 + 2] = (byte) ((i & 63) | 128);
                G2.c = i4 + 3;
                this.c += 3;
            } else if (i <= 1114111) {
                y G3 = G(4);
                int i5 = G3.c;
                byte[] bArr3 = G3.a;
                bArr3[i5] = (byte) ((i >> 18) | 240);
                bArr3[i5 + 1] = (byte) (((i >> 12) & 63) | 128);
                bArr3[i5 + 2] = (byte) (((i >> 6) & 63) | 128);
                bArr3[i5 + 3] = (byte) ((i & 63) | 128);
                G3.c = i5 + 4;
                this.c += 4;
            } else {
                StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
                a aVar = com.amazon.aps.iva.ef0.b.a;
                if (i != 0) {
                    char[] cArr = com.amazon.aps.iva.ff0.b.b;
                    char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
                    while (i3 < 8 && cArr2[i3] == '0') {
                        i3++;
                    }
                    if (i3 >= 0) {
                        if (i3 <= 8) {
                            str = new String(cArr2, i3, 8 - i3);
                        } else {
                            throw new IllegalArgumentException(com.amazon.aps.iva.c80.a.d("startIndex: ", i3, " > endIndex: 8"));
                        }
                    } else {
                        throw new IndexOutOfBoundsException(com.amazon.aps.iva.c80.a.d("startIndex: ", i3, ", endIndex: 8, size: 8"));
                    }
                } else {
                    str = "0";
                }
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final long k(byte b2, long j, long j2) {
        y yVar;
        long j3 = 0;
        boolean z = false;
        if (0 <= j && j <= j2) {
            z = true;
        }
        if (z) {
            long j4 = this.c;
            if (j2 > j4) {
                j2 = j4;
            }
            if (j == j2 || (yVar = this.b) == null) {
                return -1L;
            }
            if (j4 - j < j) {
                while (j4 > j) {
                    yVar = yVar.g;
                    com.amazon.aps.iva.yb0.j.c(yVar);
                    j4 -= yVar.c - yVar.b;
                }
                while (j4 < j2) {
                    int min = (int) Math.min(yVar.c, (yVar.b + j2) - j4);
                    for (int i = (int) ((yVar.b + j) - j4); i < min; i++) {
                        if (yVar.a[i] == b2) {
                            return (i - yVar.b) + j4;
                        }
                    }
                    j4 += yVar.c - yVar.b;
                    yVar = yVar.f;
                    com.amazon.aps.iva.yb0.j.c(yVar);
                    j = j4;
                }
                return -1L;
            }
            while (true) {
                long j5 = (yVar.c - yVar.b) + j3;
                if (j5 > j) {
                    break;
                }
                yVar = yVar.f;
                com.amazon.aps.iva.yb0.j.c(yVar);
                j3 = j5;
            }
            while (j3 < j2) {
                int min2 = (int) Math.min(yVar.c, (yVar.b + j2) - j3);
                for (int i2 = (int) ((yVar.b + j) - j3); i2 < min2; i2++) {
                    if (yVar.a[i2] == b2) {
                        return (i2 - yVar.b) + j3;
                    }
                }
                j3 += yVar.c - yVar.b;
                yVar = yVar.f;
                com.amazon.aps.iva.yb0.j.c(yVar);
                j = j3;
            }
            return -1L;
        }
        throw new IllegalArgumentException(("size=" + this.c + " fromIndex=" + j + " toIndex=" + j2).toString());
    }

    public final long m(long j, i iVar) throws IOException {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(iVar, "bytes");
        boolean z2 = true;
        if (iVar.c() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long j2 = 0;
            if (j < 0) {
                z2 = false;
            }
            if (z2) {
                y yVar = this.b;
                if (yVar != null) {
                    long j3 = this.c;
                    if (j3 - j < j) {
                        while (j3 > j) {
                            yVar = yVar.g;
                            com.amazon.aps.iva.yb0.j.c(yVar);
                            j3 -= yVar.c - yVar.b;
                        }
                        byte[] h = iVar.h();
                        byte b2 = h[0];
                        int c = iVar.c();
                        long j4 = (this.c - c) + 1;
                        while (j3 < j4) {
                            int min = (int) Math.min(yVar.c, (yVar.b + j4) - j3);
                            for (int i = (int) ((yVar.b + j) - j3); i < min; i++) {
                                if (yVar.a[i] == b2 && com.amazon.aps.iva.ff0.a.a(yVar, i + 1, h, c)) {
                                    return (i - yVar.b) + j3;
                                }
                            }
                            j3 += yVar.c - yVar.b;
                            yVar = yVar.f;
                            com.amazon.aps.iva.yb0.j.c(yVar);
                            j = j3;
                        }
                    } else {
                        while (true) {
                            long j5 = (yVar.c - yVar.b) + j2;
                            if (j5 > j) {
                                break;
                            }
                            yVar = yVar.f;
                            com.amazon.aps.iva.yb0.j.c(yVar);
                            j2 = j5;
                        }
                        byte[] h2 = iVar.h();
                        byte b3 = h2[0];
                        int c2 = iVar.c();
                        long j6 = (this.c - c2) + 1;
                        while (j2 < j6) {
                            int min2 = (int) Math.min(yVar.c, (yVar.b + j6) - j2);
                            for (int i2 = (int) ((yVar.b + j) - j2); i2 < min2; i2++) {
                                if (yVar.a[i2] == b3 && com.amazon.aps.iva.ff0.a.a(yVar, i2 + 1, h2, c2)) {
                                    return (i2 - yVar.b) + j2;
                                }
                            }
                            j2 += yVar.c - yVar.b;
                            yVar = yVar.f;
                            com.amazon.aps.iva.yb0.j.c(yVar);
                            j = j2;
                        }
                    }
                }
                return -1L;
            }
            throw new IllegalArgumentException(j0.f("fromIndex < 0: ", j).toString());
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    @Override // com.amazon.aps.iva.ef0.h
    public final void n0(e eVar, long j) throws EOFException {
        com.amazon.aps.iva.yb0.j.f(eVar, "sink");
        long j2 = this.c;
        if (j2 >= j) {
            eVar.write(this, j);
        } else {
            eVar.write(this, j2);
            throw new EOFException();
        }
    }

    public final long p(i iVar) throws IOException {
        com.amazon.aps.iva.yb0.j.f(iVar, "bytes");
        return m(0L, iVar);
    }

    @Override // com.amazon.aps.iva.ef0.h
    public final x peek() {
        return r.b(new v(this));
    }

    @Override // com.amazon.aps.iva.ef0.h
    public final String q(long j) throws EOFException {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            long k = k((byte) 10, 0L, j2);
            if (k != -1) {
                return com.amazon.aps.iva.ff0.a.b(this, k);
            }
            if (j2 < this.c && i(j2 - 1) == 13 && i(j2) == 10) {
                return com.amazon.aps.iva.ff0.a.b(this, j2);
            }
            e eVar = new e();
            h(0L, eVar, Math.min(32, this.c));
            throw new EOFException("\\n not found: limit=" + Math.min(this.c, j) + " content=" + eVar.h0().f() + (char) 8230);
        }
        throw new IllegalArgumentException(j0.f("limit < 0: ", j).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008f A[EDGE_INSN: B:43:0x008f->B:38:0x008f ?: BREAK  , SYNTHETIC] */
    @Override // com.amazon.aps.iva.ef0.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long q0() throws java.io.EOFException {
        /*
            r13 = this;
            long r0 = r13.c
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L96
            r0 = 0
            r1 = r0
            r4 = r2
        Lb:
            com.amazon.aps.iva.ef0.y r6 = r13.b
            com.amazon.aps.iva.yb0.j.c(r6)
            int r7 = r6.b
            int r8 = r6.c
        L14:
            if (r7 >= r8) goto L7b
            byte[] r9 = r6.a
            r9 = r9[r7]
            r10 = 48
            if (r9 < r10) goto L25
            r10 = 57
            if (r9 > r10) goto L25
            int r10 = r9 + (-48)
            goto L3c
        L25:
            r10 = 97
            if (r9 < r10) goto L30
            r10 = 102(0x66, float:1.43E-43)
            if (r9 > r10) goto L30
            int r10 = r9 + (-97)
            goto L3a
        L30:
            r10 = 65
            if (r9 < r10) goto L67
            r10 = 70
            if (r9 > r10) goto L67
            int r10 = r9 + (-65)
        L3a:
            int r10 = r10 + 10
        L3c:
            r11 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r11 = r11 & r4
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 != 0) goto L4c
            r9 = 4
            long r4 = r4 << r9
            long r9 = (long) r10
            long r4 = r4 | r9
            int r7 = r7 + 1
            int r0 = r0 + 1
            goto L14
        L4c:
            com.amazon.aps.iva.ef0.e r0 = new com.amazon.aps.iva.ef0.e
            r0.<init>()
            r0.N(r4)
            r0.L(r9)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.A()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L67:
            if (r0 == 0) goto L6b
            r1 = 1
            goto L7b
        L6b:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = com.amazon.aps.iva.ef0.b.c(r9)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L7b:
            if (r7 != r8) goto L87
            com.amazon.aps.iva.ef0.y r7 = r6.a()
            r13.b = r7
            com.amazon.aps.iva.ef0.z.a(r6)
            goto L89
        L87:
            r6.b = r7
        L89:
            if (r1 != 0) goto L8f
            com.amazon.aps.iva.ef0.y r6 = r13.b
            if (r6 != 0) goto Lb
        L8f:
            long r1 = r13.c
            long r6 = (long) r0
            long r1 = r1 - r6
            r13.c = r1
            return r4
        L96:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ef0.e.q0():long");
    }

    @Override // com.amazon.aps.iva.ef0.g
    public final long r(d0 d0Var) throws IOException {
        com.amazon.aps.iva.yb0.j.f(d0Var, FirebaseAnalytics.Param.SOURCE);
        long j = 0;
        while (true) {
            long read = d0Var.read(this, MediaStatus.COMMAND_PLAYBACK_RATE);
            if (read != -1) {
                j += read;
            } else {
                return j;
            }
        }
    }

    @Override // com.amazon.aps.iva.ef0.h
    public final InputStream r0() {
        return new b();
    }

    @Override // com.amazon.aps.iva.ef0.d0
    public final long read(e eVar, long j) {
        com.amazon.aps.iva.yb0.j.f(eVar, "sink");
        if (j >= 0) {
            long j2 = this.c;
            if (j2 == 0) {
                return -1L;
            }
            if (j > j2) {
                j = j2;
            }
            eVar.write(this, j);
            return j;
        }
        throw new IllegalArgumentException(j0.f("byteCount < 0: ", j).toString());
    }

    @Override // com.amazon.aps.iva.ef0.h
    public final byte readByte() throws EOFException {
        if (this.c != 0) {
            y yVar = this.b;
            com.amazon.aps.iva.yb0.j.c(yVar);
            int i = yVar.b;
            int i2 = yVar.c;
            int i3 = i + 1;
            byte b2 = yVar.a[i];
            this.c--;
            if (i3 == i2) {
                this.b = yVar.a();
                z.a(yVar);
            } else {
                yVar.b = i3;
            }
            return b2;
        }
        throw new EOFException();
    }

    @Override // com.amazon.aps.iva.ef0.h
    public final void readFully(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int t = t(bArr, i, bArr.length - i);
            if (t != -1) {
                i += t;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // com.amazon.aps.iva.ef0.h
    public final int readInt() throws EOFException {
        if (this.c >= 4) {
            y yVar = this.b;
            com.amazon.aps.iva.yb0.j.c(yVar);
            int i = yVar.b;
            int i2 = yVar.c;
            if (i2 - i < 4) {
                return ((readByte() & UnsignedBytes.MAX_VALUE) << 24) | ((readByte() & UnsignedBytes.MAX_VALUE) << 16) | ((readByte() & UnsignedBytes.MAX_VALUE) << 8) | (readByte() & UnsignedBytes.MAX_VALUE);
            }
            int i3 = i + 1;
            byte[] bArr = yVar.a;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & UnsignedBytes.MAX_VALUE) << 24) | ((bArr[i3] & UnsignedBytes.MAX_VALUE) << 16);
            int i6 = i4 + 1;
            int i7 = i5 | ((bArr[i4] & UnsignedBytes.MAX_VALUE) << 8);
            int i8 = i6 + 1;
            int i9 = i7 | (bArr[i6] & UnsignedBytes.MAX_VALUE);
            this.c -= 4;
            if (i8 == i2) {
                this.b = yVar.a();
                z.a(yVar);
            } else {
                yVar.b = i8;
            }
            return i9;
        }
        throw new EOFException();
    }

    @Override // com.amazon.aps.iva.ef0.h
    public final long readLong() throws EOFException {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.c >= 8) {
            y yVar = this.b;
            com.amazon.aps.iva.yb0.j.c(yVar);
            int i7 = yVar.b;
            int i8 = yVar.c;
            if (i8 - i7 < 8) {
                return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
            }
            byte[] bArr = yVar.a;
            long j = ((bArr[i7] & 255) << 56) | ((bArr[i] & 255) << 48) | ((bArr[i2] & 255) << 40);
            int i9 = i7 + 1 + 1 + 1 + 1;
            long j2 = ((bArr[i3] & 255) << 32) | j;
            long j3 = j2 | ((bArr[i9] & 255) << 24) | ((bArr[i4] & 255) << 16);
            int i10 = i9 + 1 + 1 + 1 + 1;
            long j4 = j3 | ((bArr[i5] & 255) << 8) | (bArr[i6] & 255);
            this.c -= 8;
            if (i10 == i8) {
                this.b = yVar.a();
                z.a(yVar);
            } else {
                yVar.b = i10;
            }
            return j4;
        }
        throw new EOFException();
    }

    @Override // com.amazon.aps.iva.ef0.h
    public final short readShort() throws EOFException {
        if (this.c >= 2) {
            y yVar = this.b;
            com.amazon.aps.iva.yb0.j.c(yVar);
            int i = yVar.b;
            int i2 = yVar.c;
            if (i2 - i < 2) {
                return (short) (((readByte() & UnsignedBytes.MAX_VALUE) << 8) | (readByte() & UnsignedBytes.MAX_VALUE));
            }
            int i3 = i + 1;
            byte[] bArr = yVar.a;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[i3] & UnsignedBytes.MAX_VALUE);
            this.c -= 2;
            if (i4 == i2) {
                this.b = yVar.a();
                z.a(yVar);
            } else {
                yVar.b = i4;
            }
            return (short) i5;
        }
        throw new EOFException();
    }

    public final long s(long j, i iVar) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        com.amazon.aps.iva.yb0.j.f(iVar, "targetBytes");
        long j2 = 0;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            y yVar = this.b;
            if (yVar == null) {
                return -1L;
            }
            long j3 = this.c;
            if (j3 - j < j) {
                while (j3 > j) {
                    yVar = yVar.g;
                    com.amazon.aps.iva.yb0.j.c(yVar);
                    j3 -= yVar.c - yVar.b;
                }
                if (iVar.c() == 2) {
                    byte i5 = iVar.i(0);
                    byte i6 = iVar.i(1);
                    while (j3 < this.c) {
                        i3 = (int) ((yVar.b + j) - j3);
                        int i7 = yVar.c;
                        while (i3 < i7) {
                            byte b2 = yVar.a[i3];
                            if (b2 != i5 && b2 != i6) {
                                i3++;
                            } else {
                                i4 = yVar.b;
                            }
                        }
                        j3 += yVar.c - yVar.b;
                        yVar = yVar.f;
                        com.amazon.aps.iva.yb0.j.c(yVar);
                        j = j3;
                    }
                    return -1L;
                }
                byte[] h = iVar.h();
                while (j3 < this.c) {
                    i3 = (int) ((yVar.b + j) - j3);
                    int i8 = yVar.c;
                    while (i3 < i8) {
                        byte b3 = yVar.a[i3];
                        for (byte b4 : h) {
                            if (b3 == b4) {
                                i4 = yVar.b;
                            }
                        }
                        i3++;
                    }
                    j3 += yVar.c - yVar.b;
                    yVar = yVar.f;
                    com.amazon.aps.iva.yb0.j.c(yVar);
                    j = j3;
                }
                return -1L;
                return (i3 - i4) + j3;
            }
            while (true) {
                long j4 = (yVar.c - yVar.b) + j2;
                if (j4 > j) {
                    break;
                }
                yVar = yVar.f;
                com.amazon.aps.iva.yb0.j.c(yVar);
                j2 = j4;
            }
            if (iVar.c() == 2) {
                byte i9 = iVar.i(0);
                byte i10 = iVar.i(1);
                while (j2 < this.c) {
                    i = (int) ((yVar.b + j) - j2);
                    int i11 = yVar.c;
                    while (i < i11) {
                        byte b5 = yVar.a[i];
                        if (b5 != i9 && b5 != i10) {
                            i++;
                        } else {
                            i2 = yVar.b;
                        }
                    }
                    j2 += yVar.c - yVar.b;
                    yVar = yVar.f;
                    com.amazon.aps.iva.yb0.j.c(yVar);
                    j = j2;
                }
                return -1L;
            }
            byte[] h2 = iVar.h();
            while (j2 < this.c) {
                i = (int) ((yVar.b + j) - j2);
                int i12 = yVar.c;
                while (i < i12) {
                    byte b6 = yVar.a[i];
                    for (byte b7 : h2) {
                        if (b6 == b7) {
                            i2 = yVar.b;
                        }
                    }
                    i++;
                }
                j2 += yVar.c - yVar.b;
                yVar = yVar.f;
                com.amazon.aps.iva.yb0.j.c(yVar);
                j = j2;
            }
            return -1L;
            return (i - i2) + j2;
        }
        throw new IllegalArgumentException(j0.f("fromIndex < 0: ", j).toString());
    }

    public final int t(byte[] bArr, int i, int i2) {
        com.amazon.aps.iva.yb0.j.f(bArr, "sink");
        com.amazon.aps.iva.ef0.b.b(bArr.length, i, i2);
        y yVar = this.b;
        if (yVar == null) {
            return -1;
        }
        int min = Math.min(i2, yVar.c - yVar.b);
        int i3 = yVar.b;
        com.amazon.aps.iva.lb0.m.D(yVar.a, i, bArr, i3, i3 + min);
        int i4 = yVar.b + min;
        yVar.b = i4;
        this.c -= min;
        if (i4 == yVar.c) {
            this.b = yVar.a();
            z.a(yVar);
        }
        return min;
    }

    @Override // com.amazon.aps.iva.ef0.d0
    public final e0 timeout() {
        return e0.NONE;
    }

    public final String toString() {
        boolean z;
        long j = this.c;
        if (j <= 2147483647L) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return F((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.c).toString());
    }

    @Override // com.amazon.aps.iva.ef0.g
    public final /* bridge */ /* synthetic */ g u(String str) {
        c0(str);
        return this;
    }

    public final a v(a aVar) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(aVar, "unsafeCursor");
        byte[] bArr = com.amazon.aps.iva.ff0.a.a;
        if (aVar == com.amazon.aps.iva.ef0.b.a) {
            aVar = new a();
        }
        if (aVar.b == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            aVar.b = this;
            aVar.c = true;
            return aVar;
        }
        throw new IllegalStateException("already attached to a buffer".toString());
    }

    @Override // com.amazon.aps.iva.ef0.h
    public final boolean w(long j) {
        if (this.c >= j) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.ef0.g
    public final /* bridge */ /* synthetic */ g write(byte[] bArr) {
        K(bArr);
        return this;
    }

    @Override // com.amazon.aps.iva.ef0.g
    public final /* bridge */ /* synthetic */ g writeByte(int i) {
        L(i);
        return this;
    }

    @Override // com.amazon.aps.iva.ef0.g
    public final /* bridge */ /* synthetic */ g writeInt(int i) {
        O(i);
        return this;
    }

    @Override // com.amazon.aps.iva.ef0.g
    public final /* bridge */ /* synthetic */ g writeShort(int i) {
        V(i);
        return this;
    }

    public final byte[] x(long j) throws EOFException {
        boolean z;
        if (j >= 0 && j <= 2147483647L) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.c >= j) {
                byte[] bArr = new byte[(int) j];
                readFully(bArr);
                return bArr;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(j0.f("byteCount: ", j).toString());
    }

    public final String y(long j, Charset charset) throws EOFException {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(charset, "charset");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0 && j <= 2147483647L) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.c >= j) {
                if (i == 0) {
                    return "";
                }
                y yVar = this.b;
                com.amazon.aps.iva.yb0.j.c(yVar);
                int i2 = yVar.b;
                if (i2 + j > yVar.c) {
                    return new String(x(j), charset);
                }
                int i3 = (int) j;
                String str = new String(yVar.a, i2, i3, charset);
                int i4 = yVar.b + i3;
                yVar.b = i4;
                this.c -= j;
                if (i4 == yVar.c) {
                    this.b = yVar.a();
                    z.a(yVar);
                }
                return str;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(j0.f("byteCount: ", j).toString());
    }

    @Override // com.amazon.aps.iva.ef0.h
    public final boolean z(long j, i iVar) {
        com.amazon.aps.iva.yb0.j.f(iVar, "bytes");
        int c = iVar.c();
        if (j < 0 || c < 0 || this.c - j < c || iVar.c() - 0 < c) {
            return false;
        }
        for (int i = 0; i < c; i++) {
            if (i(i + j) != iVar.i(0 + i)) {
                return false;
            }
        }
        return true;
    }

    /* compiled from: Buffer.kt */
    /* loaded from: classes4.dex */
    public static final class b extends InputStream {
        public b() {
        }

        @Override // java.io.InputStream
        public final int available() {
            return (int) Math.min(e.this.c, Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream
        public final int read() {
            e eVar = e.this;
            if (eVar.c > 0) {
                return eVar.readByte() & UnsignedBytes.MAX_VALUE;
            }
            return -1;
        }

        public final String toString() {
            return e.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) {
            com.amazon.aps.iva.yb0.j.f(bArr, "sink");
            return e.this.t(bArr, i, i2);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }

    @Override // com.amazon.aps.iva.ef0.b0
    public final void write(e eVar, long j) {
        y yVar;
        int i;
        y b2;
        com.amazon.aps.iva.yb0.j.f(eVar, FirebaseAnalytics.Param.SOURCE);
        if (eVar != this) {
            com.amazon.aps.iva.ef0.b.b(eVar.c, 0L, j);
            while (j > 0) {
                y yVar2 = eVar.b;
                com.amazon.aps.iva.yb0.j.c(yVar2);
                int i2 = yVar2.c;
                com.amazon.aps.iva.yb0.j.c(eVar.b);
                if (j < i2 - yVar.b) {
                    y yVar3 = this.b;
                    y yVar4 = yVar3 != null ? yVar3.g : null;
                    if (yVar4 != null && yVar4.e) {
                        if ((yVar4.c + j) - (yVar4.d ? 0 : yVar4.b) <= MediaStatus.COMMAND_PLAYBACK_RATE) {
                            y yVar5 = eVar.b;
                            com.amazon.aps.iva.yb0.j.c(yVar5);
                            yVar5.d(yVar4, (int) j);
                            eVar.c -= j;
                            this.c += j;
                            return;
                        }
                    }
                    y yVar6 = eVar.b;
                    com.amazon.aps.iva.yb0.j.c(yVar6);
                    int i3 = (int) j;
                    if (i3 > 0 && i3 <= yVar6.c - yVar6.b) {
                        if (i3 >= 1024) {
                            b2 = yVar6.c();
                        } else {
                            b2 = z.b();
                            int i4 = yVar6.b;
                            com.amazon.aps.iva.lb0.m.D(yVar6.a, 0, b2.a, i4, i4 + i3);
                        }
                        b2.c = b2.b + i3;
                        yVar6.b += i3;
                        y yVar7 = yVar6.g;
                        com.amazon.aps.iva.yb0.j.c(yVar7);
                        yVar7.b(b2);
                        eVar.b = b2;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range".toString());
                    }
                }
                y yVar8 = eVar.b;
                com.amazon.aps.iva.yb0.j.c(yVar8);
                long j2 = yVar8.c - yVar8.b;
                eVar.b = yVar8.a();
                y yVar9 = this.b;
                if (yVar9 == null) {
                    this.b = yVar8;
                    yVar8.g = yVar8;
                    yVar8.f = yVar8;
                } else {
                    y yVar10 = yVar9.g;
                    com.amazon.aps.iva.yb0.j.c(yVar10);
                    yVar10.b(yVar8);
                    y yVar11 = yVar8.g;
                    if (yVar11 != yVar8) {
                        com.amazon.aps.iva.yb0.j.c(yVar11);
                        if (yVar11.e) {
                            int i5 = yVar8.c - yVar8.b;
                            y yVar12 = yVar8.g;
                            com.amazon.aps.iva.yb0.j.c(yVar12);
                            int i6 = 8192 - yVar12.c;
                            y yVar13 = yVar8.g;
                            com.amazon.aps.iva.yb0.j.c(yVar13);
                            if (yVar13.d) {
                                i = 0;
                            } else {
                                y yVar14 = yVar8.g;
                                com.amazon.aps.iva.yb0.j.c(yVar14);
                                i = yVar14.b;
                            }
                            if (i5 <= i6 + i) {
                                y yVar15 = yVar8.g;
                                com.amazon.aps.iva.yb0.j.c(yVar15);
                                yVar8.d(yVar15, i5);
                                yVar8.a();
                                z.a(yVar8);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact".toString());
                    }
                }
                eVar.c -= j2;
                this.c += j2;
                j -= j2;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) throws IOException {
        com.amazon.aps.iva.yb0.j.f(byteBuffer, "sink");
        y yVar = this.b;
        if (yVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), yVar.c - yVar.b);
        byteBuffer.put(yVar.a, yVar.b, min);
        int i = yVar.b + min;
        yVar.b = i;
        this.c -= min;
        if (i == yVar.c) {
            this.b = yVar.a();
            z.a(yVar);
        }
        return min;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, com.amazon.aps.iva.ef0.b0
    public final void close() {
    }

    @Override // com.amazon.aps.iva.ef0.h, com.amazon.aps.iva.ef0.g
    public final e d() {
        return this;
    }

    @Override // com.amazon.aps.iva.ef0.g, com.amazon.aps.iva.ef0.b0, java.io.Flushable
    public final void flush() {
    }

    @Override // com.amazon.aps.iva.ef0.g
    public final g j() {
        return this;
    }

    @Override // com.amazon.aps.iva.ef0.g
    public final g o() {
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) throws IOException {
        com.amazon.aps.iva.yb0.j.f(byteBuffer, FirebaseAnalytics.Param.SOURCE);
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            y G = G(1);
            int min = Math.min(i, 8192 - G.c);
            byteBuffer.get(G.a, G.c, min);
            i -= min;
            G.c += min;
        }
        this.c += remaining;
        return remaining;
    }
}
