package com.amazon.aps.iva.o6;

import android.media.MediaCodec;
import com.amazon.aps.iva.o6.g0;
import com.amazon.aps.iva.x6.f0;
import com.amazon.aps.iva.z5.c;
import com.google.common.base.Ascii;
import com.google.common.primitives.Ints;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* compiled from: SampleDataQueue.java */
/* loaded from: classes.dex */
public final class f0 {
    public final com.amazon.aps.iva.t6.b a;
    public final int b;
    public final com.amazon.aps.iva.t5.v c;
    public a d;
    public a e;
    public a f;
    public long g;

    /* compiled from: SampleDataQueue.java */
    /* loaded from: classes.dex */
    public static final class a {
        public long a;
        public long b;
        public com.amazon.aps.iva.t6.a c;
        public a d;

        public a(long j, int i) {
            boolean z;
            if (this.c == null) {
                z = true;
            } else {
                z = false;
            }
            com.amazon.aps.iva.cq.b.C(z);
            this.a = j;
            this.b = j + i;
        }
    }

    public f0(com.amazon.aps.iva.t6.b bVar) {
        this.a = bVar;
        int i = ((com.amazon.aps.iva.t6.f) bVar).b;
        this.b = i;
        this.c = new com.amazon.aps.iva.t5.v(32);
        a aVar = new a(0L, i);
        this.d = aVar;
        this.e = aVar;
        this.f = aVar;
    }

    public static a d(a aVar, long j, ByteBuffer byteBuffer, int i) {
        while (j >= aVar.b) {
            aVar = aVar.d;
        }
        while (i > 0) {
            int min = Math.min(i, (int) (aVar.b - j));
            com.amazon.aps.iva.t6.a aVar2 = aVar.c;
            byteBuffer.put(aVar2.a, ((int) (j - aVar.a)) + aVar2.b, min);
            i -= min;
            j += min;
            if (j == aVar.b) {
                aVar = aVar.d;
            }
        }
        return aVar;
    }

    public static a e(a aVar, long j, byte[] bArr, int i) {
        while (j >= aVar.b) {
            aVar = aVar.d;
        }
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (aVar.b - j));
            com.amazon.aps.iva.t6.a aVar2 = aVar.c;
            System.arraycopy(aVar2.a, ((int) (j - aVar.a)) + aVar2.b, bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == aVar.b) {
                aVar = aVar.d;
            }
        }
        return aVar;
    }

    public static a f(a aVar, com.amazon.aps.iva.z5.f fVar, g0.a aVar2, com.amazon.aps.iva.t5.v vVar) {
        boolean z;
        if (fVar.i(Ints.MAX_POWER_OF_TWO)) {
            long j = aVar2.b;
            int i = 1;
            vVar.C(1);
            a e = e(aVar, j, vVar.a, 1);
            long j2 = j + 1;
            byte b = vVar.a[0];
            if ((b & UnsignedBytes.MAX_POWER_OF_TWO) != 0) {
                z = true;
            } else {
                z = false;
            }
            int i2 = b & Ascii.DEL;
            com.amazon.aps.iva.z5.c cVar = fVar.c;
            byte[] bArr = cVar.a;
            if (bArr == null) {
                cVar.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            aVar = e(e, j2, cVar.a, i2);
            long j3 = j2 + i2;
            if (z) {
                vVar.C(2);
                aVar = e(aVar, j3, vVar.a, 2);
                j3 += 2;
                i = vVar.z();
            }
            int[] iArr = cVar.d;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = cVar.e;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
            }
            if (z) {
                int i3 = i * 6;
                vVar.C(i3);
                aVar = e(aVar, j3, vVar.a, i3);
                j3 += i3;
                vVar.F(0);
                for (int i4 = 0; i4 < i; i4++) {
                    iArr[i4] = vVar.z();
                    iArr2[i4] = vVar.x();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = aVar2.a - ((int) (j3 - aVar2.b));
            }
            f0.a aVar3 = aVar2.c;
            int i5 = com.amazon.aps.iva.t5.g0.a;
            byte[] bArr2 = aVar3.b;
            byte[] bArr3 = cVar.a;
            cVar.f = i;
            cVar.d = iArr;
            cVar.e = iArr2;
            cVar.b = bArr2;
            cVar.a = bArr3;
            int i6 = aVar3.a;
            cVar.c = i6;
            int i7 = aVar3.c;
            cVar.g = i7;
            int i8 = aVar3.d;
            cVar.h = i8;
            MediaCodec.CryptoInfo cryptoInfo = cVar.i;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i6;
            if (com.amazon.aps.iva.t5.g0.a >= 24) {
                c.a aVar4 = cVar.j;
                aVar4.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = aVar4.b;
                pattern.set(i7, i8);
                aVar4.a.setPattern(pattern);
            }
            long j4 = aVar2.b;
            int i9 = (int) (j3 - j4);
            aVar2.b = j4 + i9;
            aVar2.a -= i9;
        }
        if (fVar.i(268435456)) {
            vVar.C(4);
            a e2 = e(aVar, aVar2.b, vVar.a, 4);
            int x = vVar.x();
            aVar2.b += 4;
            aVar2.a -= 4;
            fVar.m(x);
            a d = d(e2, aVar2.b, fVar.d, x);
            aVar2.b += x;
            int i10 = aVar2.a - x;
            aVar2.a = i10;
            ByteBuffer byteBuffer = fVar.g;
            if (byteBuffer != null && byteBuffer.capacity() >= i10) {
                fVar.g.clear();
            } else {
                fVar.g = ByteBuffer.allocate(i10);
            }
            return d(d, aVar2.b, fVar.g, aVar2.a);
        }
        fVar.m(aVar2.a);
        return d(aVar, aVar2.b, fVar.d, aVar2.a);
    }

    public final void a(a aVar) {
        if (aVar.c == null) {
            return;
        }
        com.amazon.aps.iva.t6.f fVar = (com.amazon.aps.iva.t6.f) this.a;
        synchronized (fVar) {
            a aVar2 = aVar;
            while (aVar2 != null) {
                com.amazon.aps.iva.t6.a[] aVarArr = fVar.f;
                int i = fVar.e;
                fVar.e = i + 1;
                com.amazon.aps.iva.t6.a aVar3 = aVar2.c;
                aVar3.getClass();
                aVarArr[i] = aVar3;
                fVar.d--;
                aVar2 = aVar2.d;
                if (aVar2 == null || aVar2.c == null) {
                    aVar2 = null;
                }
            }
            fVar.notifyAll();
        }
        aVar.c = null;
        aVar.d = null;
    }

    public final void b(long j) {
        a aVar;
        if (j == -1) {
            return;
        }
        while (true) {
            aVar = this.d;
            if (j < aVar.b) {
                break;
            }
            com.amazon.aps.iva.t6.b bVar = this.a;
            com.amazon.aps.iva.t6.a aVar2 = aVar.c;
            com.amazon.aps.iva.t6.f fVar = (com.amazon.aps.iva.t6.f) bVar;
            synchronized (fVar) {
                com.amazon.aps.iva.t6.a[] aVarArr = fVar.f;
                int i = fVar.e;
                fVar.e = i + 1;
                aVarArr[i] = aVar2;
                fVar.d--;
                fVar.notifyAll();
            }
            a aVar3 = this.d;
            aVar3.c = null;
            a aVar4 = aVar3.d;
            aVar3.d = null;
            this.d = aVar4;
        }
        if (this.e.a < aVar.a) {
            this.e = aVar;
        }
    }

    public final int c(int i) {
        com.amazon.aps.iva.t6.a aVar;
        a aVar2 = this.f;
        if (aVar2.c == null) {
            com.amazon.aps.iva.t6.f fVar = (com.amazon.aps.iva.t6.f) this.a;
            synchronized (fVar) {
                int i2 = fVar.d + 1;
                fVar.d = i2;
                int i3 = fVar.e;
                if (i3 > 0) {
                    com.amazon.aps.iva.t6.a[] aVarArr = fVar.f;
                    int i4 = i3 - 1;
                    fVar.e = i4;
                    aVar = aVarArr[i4];
                    aVar.getClass();
                    fVar.f[fVar.e] = null;
                } else {
                    com.amazon.aps.iva.t6.a aVar3 = new com.amazon.aps.iva.t6.a(new byte[fVar.b], 0);
                    com.amazon.aps.iva.t6.a[] aVarArr2 = fVar.f;
                    if (i2 > aVarArr2.length) {
                        fVar.f = (com.amazon.aps.iva.t6.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                    }
                    aVar = aVar3;
                }
            }
            a aVar4 = new a(this.f.b, this.b);
            aVar2.c = aVar;
            aVar2.d = aVar4;
        }
        return Math.min(i, (int) (this.f.b - this.g));
    }
}
