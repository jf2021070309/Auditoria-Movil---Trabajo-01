package com.amazon.aps.iva.k6;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.SystemClock;
import com.amazon.aps.iva.b6.p1;
import com.amazon.aps.iva.c6.x;
import com.amazon.aps.iva.g6.d;
import com.amazon.aps.iva.k6.l;
import com.amazon.aps.iva.k6.s;
import com.amazon.aps.iva.o6.h0;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.t5.a0;
import com.amazon.aps.iva.u1.g0;
import com.amazon.aps.iva.x6.b0;
import com.amazon.aps.iva.z5.f;
import com.google.android.gms.common.ConnectionResult;
import com.google.common.base.Ascii;
import com.google.common.primitives.Ints;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
/* compiled from: MediaCodecRenderer.java */
/* loaded from: classes.dex */
public abstract class o extends com.amazon.aps.iva.a6.e {
    public static final byte[] Z0 = {0, 0, 1, 103, 66, -64, Ascii.VT, -38, 37, -112, 0, 0, 1, 104, -50, Ascii.SI, 19, 32, 0, 0, 1, 101, -120, -124, Ascii.CR, -50, 113, Ascii.CAN, -96, 0, 47, -65, Ascii.FS, 49, -61, 39, 93, 120};
    public final x A;
    public int A0;
    public v B;
    public ByteBuffer B0;
    public v C;
    public boolean C0;
    public com.amazon.aps.iva.g6.d D;
    public boolean D0;
    public com.amazon.aps.iva.g6.d E;
    public boolean E0;
    public MediaCrypto F;
    public boolean F0;
    public boolean G;
    public boolean G0;
    public final long H;
    public boolean H0;
    public float I;
    public int I0;
    public float J;
    public int J0;
    public l K;
    public int K0;
    public v L;
    public boolean L0;
    public MediaFormat M;
    public boolean M0;
    public boolean N;
    public boolean N0;
    public float O;
    public long O0;
    public ArrayDeque<n> P;
    public long P0;
    public b Q;
    public boolean Q0;
    public n R;
    public boolean R0;
    public int S;
    public boolean S0;
    public boolean T;
    public boolean T0;
    public boolean U;
    public com.amazon.aps.iva.a6.l U0;
    public boolean V;
    public com.amazon.aps.iva.a6.f V0;
    public boolean W;
    public c W0;
    public boolean X;
    public long X0;
    public boolean Y;
    public boolean Y0;
    public boolean Z;
    public boolean k0;
    public final l.b p;
    public final q q;
    public final boolean r;
    public final float s;
    public final com.amazon.aps.iva.z5.f t;
    public final com.amazon.aps.iva.z5.f u;
    public final com.amazon.aps.iva.z5.f v;
    public boolean v0;
    public final h w;
    public boolean w0;
    public final ArrayList<Long> x;
    public i x0;
    public final MediaCodec.BufferInfo y;
    public long y0;
    public final ArrayDeque<c> z;
    public int z0;

    /* compiled from: MediaCodecRenderer.java */
    /* loaded from: classes.dex */
    public static final class a {
        public static void a(l.a aVar, p1 p1Var) {
            LogSessionId logSessionId;
            boolean equals;
            String stringId;
            p1.a aVar2 = p1Var.a;
            aVar2.getClass();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            LogSessionId logSessionId2 = aVar2.a;
            equals = logSessionId2.equals(logSessionId);
            if (!equals) {
                MediaFormat mediaFormat = aVar.b;
                stringId = logSessionId2.getStringId();
                mediaFormat.setString("log-session-id", stringId);
            }
        }
    }

    /* compiled from: MediaCodecRenderer.java */
    /* loaded from: classes.dex */
    public static final class c {
        public static final c d = new c(-9223372036854775807L, -9223372036854775807L);
        public final long a;
        public final long b;
        public final a0<v> c = new a0<>();

        public c(long j, long j2) {
            this.a = j;
            this.b = j2;
        }
    }

    public o(int i, j jVar, q qVar, float f) {
        super(i);
        this.p = jVar;
        qVar.getClass();
        this.q = qVar;
        this.r = false;
        this.s = f;
        this.t = new com.amazon.aps.iva.z5.f(0);
        this.u = new com.amazon.aps.iva.z5.f(0);
        this.v = new com.amazon.aps.iva.z5.f(2);
        h hVar = new h();
        this.w = hVar;
        this.x = new ArrayList<>();
        this.y = new MediaCodec.BufferInfo();
        this.I = 1.0f;
        this.J = 1.0f;
        this.H = -9223372036854775807L;
        this.z = new ArrayDeque<>();
        v0(c.d);
        hVar.m(0);
        hVar.d.order(ByteOrder.nativeOrder());
        this.A = new x();
        this.O = -1.0f;
        this.S = 0;
        this.I0 = 0;
        this.z0 = -1;
        this.A0 = -1;
        this.y0 = -9223372036854775807L;
        this.O0 = -9223372036854775807L;
        this.P0 = -9223372036854775807L;
        this.X0 = -9223372036854775807L;
        this.J0 = 0;
        this.K0 = 0;
    }

    public final void A0() throws com.amazon.aps.iva.a6.l {
        com.amazon.aps.iva.z5.b d = this.E.d();
        if (d instanceof com.amazon.aps.iva.g6.n) {
            try {
                this.F.setMediaDrmSession(((com.amazon.aps.iva.g6.n) d).b);
            } catch (MediaCryptoException e) {
                throw b(6006, this.B, e, false);
            }
        }
        u0(this.E);
        this.J0 = 0;
        this.K0 = 0;
    }

    public final void B0(long j) throws com.amazon.aps.iva.a6.l {
        boolean z;
        v d;
        v e;
        a0<v> a0Var = this.W0.c;
        synchronized (a0Var) {
            z = true;
            d = a0Var.d(j, true);
        }
        v vVar = d;
        if (vVar == null && this.Y0 && this.M != null) {
            a0<v> a0Var2 = this.W0.c;
            synchronized (a0Var2) {
                if (a0Var2.d == 0) {
                    e = null;
                } else {
                    e = a0Var2.e();
                }
            }
            vVar = e;
        }
        if (vVar != null) {
            this.C = vVar;
        } else {
            z = false;
        }
        if (z || (this.N && this.C != null)) {
            h0(this.C, this.M);
            this.N = false;
            this.Y0 = false;
        }
    }

    @Override // com.amazon.aps.iva.a6.e
    public void C() {
        this.B = null;
        v0(c.d);
        this.z.clear();
        T();
    }

    @Override // com.amazon.aps.iva.a6.e
    public void E(long j, boolean z) throws com.amazon.aps.iva.a6.l {
        int i;
        this.Q0 = false;
        this.R0 = false;
        this.T0 = false;
        if (this.E0) {
            this.w.k();
            this.v.k();
            this.F0 = false;
            x xVar = this.A;
            xVar.getClass();
            xVar.a = com.amazon.aps.iva.r5.b.a;
            xVar.c = 0;
            xVar.b = 2;
        } else if (T()) {
            b0();
        }
        a0<v> a0Var = this.W0.c;
        synchronized (a0Var) {
            i = a0Var.d;
        }
        if (i > 0) {
            this.S0 = true;
        }
        this.W0.c.b();
        this.z.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
        if (r2 >= r7) goto L14;
     */
    @Override // com.amazon.aps.iva.a6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J(com.amazon.aps.iva.q5.v[] r6, long r7, long r9) throws com.amazon.aps.iva.a6.l {
        /*
            r5 = this;
            com.amazon.aps.iva.k6.o$c r6 = r5.W0
            long r6 = r6.b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 != 0) goto L16
            com.amazon.aps.iva.k6.o$c r6 = new com.amazon.aps.iva.k6.o$c
            r6.<init>(r0, r9)
            r5.v0(r6)
            goto L4c
        L16:
            java.util.ArrayDeque<com.amazon.aps.iva.k6.o$c> r6 = r5.z
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L42
            long r7 = r5.O0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L2e
            long r2 = r5.X0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L42
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 < 0) goto L42
        L2e:
            com.amazon.aps.iva.k6.o$c r6 = new com.amazon.aps.iva.k6.o$c
            r6.<init>(r0, r9)
            r5.v0(r6)
            com.amazon.aps.iva.k6.o$c r6 = r5.W0
            long r6 = r6.b
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 == 0) goto L4c
            r5.k0()
            goto L4c
        L42:
            com.amazon.aps.iva.k6.o$c r7 = new com.amazon.aps.iva.k6.o$c
            long r0 = r5.O0
            r7.<init>(r0, r9)
            r6.add(r7)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.k6.o.J(com.amazon.aps.iva.q5.v[], long, long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b3, code lost:
        r10 = r1;
        r1 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0279 A[LOOP:0: B:33:0x0093->B:106:0x0279, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0275 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean L(long r24, long r26) throws com.amazon.aps.iva.a6.l {
        /*
            Method dump skipped, instructions count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.k6.o.L(long, long):boolean");
    }

    public abstract com.amazon.aps.iva.a6.g M(n nVar, v vVar, v vVar2);

    public m N(IllegalStateException illegalStateException, n nVar) {
        return new m(illegalStateException, nVar);
    }

    public final void O() {
        this.G0 = false;
        this.w.k();
        this.v.k();
        this.F0 = false;
        this.E0 = false;
        x xVar = this.A;
        xVar.getClass();
        xVar.a = com.amazon.aps.iva.r5.b.a;
        xVar.c = 0;
        xVar.b = 2;
    }

    @TargetApi(ConnectionResult.API_DISABLED)
    public final boolean P() throws com.amazon.aps.iva.a6.l {
        if (this.L0) {
            this.J0 = 1;
            if (!this.U && !this.W) {
                this.K0 = 2;
            } else {
                this.K0 = 3;
                return false;
            }
        } else {
            A0();
        }
        return true;
    }

    public final boolean Q(long j, long j2) throws com.amazon.aps.iva.a6.l {
        boolean z;
        boolean z2;
        boolean z3;
        MediaCodec.BufferInfo bufferInfo;
        boolean o0;
        boolean z4;
        int k;
        boolean z5;
        boolean z6;
        if (this.A0 >= 0) {
            z = true;
        } else {
            z = false;
        }
        MediaCodec.BufferInfo bufferInfo2 = this.y;
        if (!z) {
            if (this.X && this.M0) {
                try {
                    k = this.K.k(bufferInfo2);
                } catch (IllegalStateException unused) {
                    n0();
                    if (this.R0) {
                        q0();
                    }
                    return false;
                }
            } else {
                k = this.K.k(bufferInfo2);
            }
            if (k < 0) {
                if (k == -2) {
                    this.N0 = true;
                    MediaFormat a2 = this.K.a();
                    if (this.S != 0 && a2.getInteger("width") == 32 && a2.getInteger("height") == 32) {
                        this.v0 = true;
                    } else {
                        if (this.Z) {
                            a2.setInteger("channel-count", 1);
                        }
                        this.M = a2;
                        this.N = true;
                    }
                    return true;
                }
                if (this.w0 && (this.Q0 || this.J0 == 2)) {
                    n0();
                }
                return false;
            } else if (this.v0) {
                this.v0 = false;
                this.K.m(k, false);
                return true;
            } else if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                n0();
                return false;
            } else {
                this.A0 = k;
                ByteBuffer n = this.K.n(k);
                this.B0 = n;
                if (n != null) {
                    n.position(bufferInfo2.offset);
                    this.B0.limit(bufferInfo2.offset + bufferInfo2.size);
                }
                if (this.Y && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0) {
                    long j3 = this.O0;
                    if (j3 != -9223372036854775807L) {
                        bufferInfo2.presentationTimeUs = j3;
                    }
                }
                long j4 = bufferInfo2.presentationTimeUs;
                ArrayList<Long> arrayList = this.x;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        if (arrayList.get(i).longValue() == j4) {
                            arrayList.remove(i);
                            z5 = true;
                            break;
                        }
                        i++;
                    } else {
                        z5 = false;
                        break;
                    }
                }
                this.C0 = z5;
                long j5 = this.P0;
                long j6 = bufferInfo2.presentationTimeUs;
                if (j5 == j6) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                this.D0 = z6;
                B0(j6);
            }
        }
        if (this.X && this.M0) {
            try {
                z2 = true;
                z3 = false;
            } catch (IllegalStateException unused2) {
                z3 = false;
            }
            try {
                o0 = o0(j, j2, this.K, this.B0, this.A0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.C0, this.D0, this.C);
                bufferInfo = bufferInfo2;
            } catch (IllegalStateException unused3) {
                n0();
                if (this.R0) {
                    q0();
                }
                return z3;
            }
        } else {
            z2 = true;
            z3 = false;
            bufferInfo = bufferInfo2;
            o0 = o0(j, j2, this.K, this.B0, this.A0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.C0, this.D0, this.C);
        }
        if (o0) {
            j0(bufferInfo.presentationTimeUs);
            if ((bufferInfo.flags & 4) != 0) {
                z4 = z2;
            } else {
                z4 = z3;
            }
            this.A0 = -1;
            this.B0 = null;
            if (!z4) {
                return z2;
            }
            n0();
        }
        return z3;
    }

    public final boolean R() throws com.amazon.aps.iva.a6.l {
        boolean z;
        com.amazon.aps.iva.z5.c cVar;
        l lVar = this.K;
        if (lVar == null || this.J0 == 2 || this.Q0) {
            return false;
        }
        int i = this.z0;
        com.amazon.aps.iva.z5.f fVar = this.u;
        if (i < 0) {
            int j = lVar.j();
            this.z0 = j;
            if (j < 0) {
                return false;
            }
            fVar.d = this.K.d(j);
            fVar.k();
        }
        if (this.J0 == 1) {
            if (!this.w0) {
                this.M0 = true;
                this.K.l(this.z0, 0, 4, 0L);
                this.z0 = -1;
                fVar.d = null;
            }
            this.J0 = 2;
            return false;
        } else if (this.k0) {
            this.k0 = false;
            fVar.d.put(Z0);
            this.K.l(this.z0, 38, 0, 0L);
            this.z0 = -1;
            fVar.d = null;
            this.L0 = true;
            return true;
        } else {
            if (this.I0 == 1) {
                for (int i2 = 0; i2 < this.L.o.size(); i2++) {
                    fVar.d.put(this.L.o.get(i2));
                }
                this.I0 = 2;
            }
            int position = fVar.d.position();
            g0 g0Var = this.d;
            g0Var.a();
            try {
                int K = K(g0Var, fVar, 0);
                if (h() || fVar.i(536870912)) {
                    this.P0 = this.O0;
                }
                if (K == -3) {
                    return false;
                }
                if (K == -5) {
                    if (this.I0 == 2) {
                        fVar.k();
                        this.I0 = 1;
                    }
                    g0(g0Var);
                    return true;
                }
                if (fVar.i(4)) {
                    if (this.I0 == 2) {
                        fVar.k();
                        this.I0 = 1;
                    }
                    this.Q0 = true;
                    if (!this.L0) {
                        n0();
                        return false;
                    }
                    try {
                        if (!this.w0) {
                            this.M0 = true;
                            this.K.l(this.z0, 0, 4, 0L);
                            this.z0 = -1;
                            fVar.d = null;
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e) {
                        throw b(com.amazon.aps.iva.t5.g0.u(e.getErrorCode()), this.B, e, false);
                    }
                } else if (!this.L0 && !fVar.i(1)) {
                    fVar.k();
                    if (this.I0 == 2) {
                        this.I0 = 1;
                    }
                    return true;
                } else {
                    boolean i3 = fVar.i(Ints.MAX_POWER_OF_TWO);
                    com.amazon.aps.iva.z5.c cVar2 = fVar.c;
                    if (i3) {
                        if (position == 0) {
                            cVar2.getClass();
                        } else {
                            if (cVar2.d == null) {
                                int[] iArr = new int[1];
                                cVar2.d = iArr;
                                cVar2.i.numBytesOfClearData = iArr;
                            }
                            int[] iArr2 = cVar2.d;
                            iArr2[0] = iArr2[0] + position;
                        }
                    }
                    if (this.T && !i3) {
                        ByteBuffer byteBuffer = fVar.d;
                        byte[] bArr = com.amazon.aps.iva.u5.d.a;
                        int position2 = byteBuffer.position();
                        int i4 = 0;
                        int i5 = 0;
                        while (true) {
                            int i6 = i4 + 1;
                            if (i6 < position2) {
                                int i7 = byteBuffer.get(i4) & UnsignedBytes.MAX_VALUE;
                                if (i5 == 3) {
                                    if (i7 == 1 && (byteBuffer.get(i6) & Ascii.US) == 7) {
                                        ByteBuffer duplicate = byteBuffer.duplicate();
                                        duplicate.position(i4 - 3);
                                        duplicate.limit(position2);
                                        byteBuffer.position(0);
                                        byteBuffer.put(duplicate);
                                        break;
                                    }
                                } else if (i7 == 0) {
                                    i5++;
                                }
                                if (i7 != 0) {
                                    i5 = 0;
                                }
                                i4 = i6;
                            } else {
                                byteBuffer.clear();
                                break;
                            }
                        }
                        if (fVar.d.position() == 0) {
                            return true;
                        }
                        this.T = false;
                    }
                    long j2 = fVar.f;
                    i iVar = this.x0;
                    if (iVar != null) {
                        v vVar = this.B;
                        if (iVar.b == 0) {
                            iVar.a = j2;
                        }
                        if (!iVar.c) {
                            ByteBuffer byteBuffer2 = fVar.d;
                            byteBuffer2.getClass();
                            int i8 = 0;
                            int i9 = 0;
                            for (int i10 = 4; i8 < i10; i10 = 4) {
                                i9 = (i9 << 8) | (byteBuffer2.get(i8) & UnsignedBytes.MAX_VALUE);
                                i8++;
                            }
                            int b2 = b0.b(i9);
                            if (b2 == -1) {
                                iVar.c = true;
                                iVar.b = 0L;
                                iVar.a = fVar.f;
                                com.amazon.aps.iva.t5.p.g();
                                j2 = fVar.f;
                            } else {
                                z = i3;
                                long max = Math.max(0L, ((iVar.b - 529) * 1000000) / vVar.A) + iVar.a;
                                iVar.b += b2;
                                j2 = max;
                                long j3 = this.O0;
                                i iVar2 = this.x0;
                                v vVar2 = this.B;
                                iVar2.getClass();
                                cVar = cVar2;
                                this.O0 = Math.max(j3, Math.max(0L, ((iVar2.b - 529) * 1000000) / vVar2.A) + iVar2.a);
                            }
                        }
                        z = i3;
                        long j32 = this.O0;
                        i iVar22 = this.x0;
                        v vVar22 = this.B;
                        iVar22.getClass();
                        cVar = cVar2;
                        this.O0 = Math.max(j32, Math.max(0L, ((iVar22.b - 529) * 1000000) / vVar22.A) + iVar22.a);
                    } else {
                        z = i3;
                        cVar = cVar2;
                    }
                    if (fVar.j()) {
                        this.x.add(Long.valueOf(j2));
                    }
                    if (this.S0) {
                        ArrayDeque<c> arrayDeque = this.z;
                        if (!arrayDeque.isEmpty()) {
                            arrayDeque.peekLast().c.a(j2, this.B);
                        } else {
                            this.W0.c.a(j2, this.B);
                        }
                        this.S0 = false;
                    }
                    this.O0 = Math.max(this.O0, j2);
                    fVar.n();
                    if (fVar.i(268435456)) {
                        Z(fVar);
                    }
                    l0(fVar);
                    try {
                        if (z) {
                            this.K.g(this.z0, cVar, j2);
                        } else {
                            this.K.l(this.z0, fVar.d.limit(), 0, j2);
                        }
                        this.z0 = -1;
                        fVar.d = null;
                        this.L0 = true;
                        this.I0 = 0;
                        this.V0.c++;
                        return true;
                    } catch (MediaCodec.CryptoException e2) {
                        throw b(com.amazon.aps.iva.t5.g0.u(e2.getErrorCode()), this.B, e2, false);
                    }
                }
            } catch (f.a e3) {
                d0(e3);
                p0(0);
                S();
                return true;
            }
        }
    }

    public final void S() {
        try {
            this.K.flush();
        } finally {
            s0();
        }
    }

    public final boolean T() {
        boolean z;
        if (this.K == null) {
            return false;
        }
        int i = this.K0;
        if (i != 3 && !this.U && ((!this.V || this.N0) && (!this.W || !this.M0))) {
            if (i == 2) {
                int i2 = com.amazon.aps.iva.t5.g0.a;
                if (i2 >= 23) {
                    z = true;
                } else {
                    z = false;
                }
                com.amazon.aps.iva.cq.b.C(z);
                if (i2 >= 23) {
                    try {
                        A0();
                    } catch (com.amazon.aps.iva.a6.l e) {
                        com.amazon.aps.iva.t5.p.h("Failed to update the DRM session, releasing the codec instead.", e);
                        q0();
                        return true;
                    }
                }
            }
            S();
            return false;
        }
        q0();
        return true;
    }

    public final List<n> U(boolean z) throws s.b {
        v vVar = this.B;
        q qVar = this.q;
        ArrayList X = X(qVar, vVar, z);
        if (X.isEmpty() && z) {
            X = X(qVar, this.B, false);
            if (!X.isEmpty()) {
                String str = this.B.m;
                X.toString();
                com.amazon.aps.iva.t5.p.g();
            }
        }
        return X;
    }

    public boolean V() {
        return false;
    }

    public abstract float W(float f, v[] vVarArr);

    public abstract ArrayList X(q qVar, v vVar, boolean z) throws s.b;

    public abstract l.a Y(n nVar, v vVar, MediaCrypto mediaCrypto, float f);

    /* JADX WARN: Code restructure failed: missing block: B:85:0x016e, code lost:
        if ("stvm8".equals(r4) == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x017e, code lost:
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r2) == false) goto L146;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a0(com.amazon.aps.iva.k6.n r17, android.media.MediaCrypto r18) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.k6.o.a0(com.amazon.aps.iva.k6.n, android.media.MediaCrypto):void");
    }

    public final void b0() throws com.amazon.aps.iva.a6.l {
        v vVar;
        boolean z;
        boolean z2;
        if (this.K == null && !this.E0 && (vVar = this.B) != null) {
            if (this.E == null && x0(vVar)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                v vVar2 = this.B;
                O();
                String str = vVar2.m;
                boolean equals = "audio/mp4a-latm".equals(str);
                h hVar = this.w;
                if (!equals && !"audio/mpeg".equals(str) && !"audio/opus".equals(str)) {
                    hVar.getClass();
                    hVar.l = 1;
                } else {
                    hVar.getClass();
                    hVar.l = 32;
                }
                this.E0 = true;
                return;
            }
            u0(this.E);
            String str2 = this.B.m;
            com.amazon.aps.iva.g6.d dVar = this.D;
            if (dVar != null) {
                com.amazon.aps.iva.z5.b d = dVar.d();
                if (this.F == null) {
                    if (d == null) {
                        if (this.D.getError() == null) {
                            return;
                        }
                    } else if (d instanceof com.amazon.aps.iva.g6.n) {
                        com.amazon.aps.iva.g6.n nVar = (com.amazon.aps.iva.g6.n) d;
                        try {
                            MediaCrypto mediaCrypto = new MediaCrypto(nVar.a, nVar.b);
                            this.F = mediaCrypto;
                            if (!nVar.c && mediaCrypto.requiresSecureDecoderComponent(str2)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            this.G = z2;
                        } catch (MediaCryptoException e) {
                            throw b(6006, this.B, e, false);
                        }
                    }
                }
                if (com.amazon.aps.iva.g6.n.d && (d instanceof com.amazon.aps.iva.g6.n)) {
                    int state = this.D.getState();
                    if (state != 1) {
                        if (state != 4) {
                            return;
                        }
                    } else {
                        d.a error = this.D.getError();
                        error.getClass();
                        throw b(error.b, this.B, error, false);
                    }
                }
            }
            try {
                c0(this.F, this.G);
            } catch (b e2) {
                throw b(4001, this.B, e2, false);
            }
        }
    }

    @Override // com.amazon.aps.iva.a6.p1
    public final int c(v vVar) throws com.amazon.aps.iva.a6.l {
        try {
            return y0(this.q, vVar);
        } catch (s.b e) {
            throw B(e, vVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0049 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c0(android.media.MediaCrypto r12, boolean r13) throws com.amazon.aps.iva.k6.o.b {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.k6.o.c0(android.media.MediaCrypto, boolean):void");
    }

    public abstract void d0(Exception exc);

    public abstract void e0(String str, long j, long j2);

    public abstract void f0(String str);

    @Override // com.amazon.aps.iva.a6.o1
    public boolean g() {
        boolean g;
        boolean z;
        if (this.B == null) {
            return false;
        }
        if (h()) {
            g = this.m;
        } else {
            h0 h0Var = this.i;
            h0Var.getClass();
            g = h0Var.g();
        }
        if (!g) {
            if (this.A0 >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && (this.y0 == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.y0)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x013e, code lost:
        if (P() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0156, code lost:
        if (r0 == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0158, code lost:
        r13 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009d, code lost:
        if (r13 != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00f7, code lost:
        if (P() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x011c, code lost:
        if (r5.s == r6.s) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x012a, code lost:
        if (P() == false) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.amazon.aps.iva.a6.g g0(com.amazon.aps.iva.u1.g0 r13) throws com.amazon.aps.iva.a6.l {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.k6.o.g0(com.amazon.aps.iva.u1.g0):com.amazon.aps.iva.a6.g");
    }

    public abstract void h0(v vVar, MediaFormat mediaFormat) throws com.amazon.aps.iva.a6.l;

    public void j0(long j) {
        this.X0 = j;
        while (true) {
            ArrayDeque<c> arrayDeque = this.z;
            if (!arrayDeque.isEmpty() && j >= arrayDeque.peek().a) {
                v0(arrayDeque.poll());
                k0();
            } else {
                return;
            }
        }
    }

    public abstract void k0();

    public abstract void l0(com.amazon.aps.iva.z5.f fVar) throws com.amazon.aps.iva.a6.l;

    @TargetApi(ConnectionResult.API_DISABLED)
    public final void n0() throws com.amazon.aps.iva.a6.l {
        int i = this.K0;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    this.R0 = true;
                    r0();
                    return;
                }
                q0();
                b0();
                return;
            }
            S();
            A0();
            return;
        }
        S();
    }

    public abstract boolean o0(long j, long j2, l lVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, v vVar) throws com.amazon.aps.iva.a6.l;

    public final boolean p0(int i) throws com.amazon.aps.iva.a6.l {
        g0 g0Var = this.d;
        g0Var.a();
        com.amazon.aps.iva.z5.f fVar = this.t;
        fVar.k();
        int K = K(g0Var, fVar, i | 4);
        if (K == -5) {
            g0(g0Var);
            return true;
        } else if (K == -4 && fVar.i(4)) {
            this.Q0 = true;
            n0();
            return false;
        } else {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.amazon.aps.iva.g6.d, android.media.MediaCrypto] */
    public final void q0() {
        try {
            l lVar = this.K;
            if (lVar != null) {
                lVar.release();
                this.V0.b++;
                f0(this.R.a);
            }
            this.K = null;
            try {
                MediaCrypto mediaCrypto = this.F;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.K = null;
            try {
                MediaCrypto mediaCrypto2 = this.F;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public void s0() {
        this.z0 = -1;
        this.u.d = null;
        this.A0 = -1;
        this.B0 = null;
        this.y0 = -9223372036854775807L;
        this.M0 = false;
        this.L0 = false;
        this.k0 = false;
        this.v0 = false;
        this.C0 = false;
        this.D0 = false;
        this.x.clear();
        this.O0 = -9223372036854775807L;
        this.P0 = -9223372036854775807L;
        this.X0 = -9223372036854775807L;
        i iVar = this.x0;
        if (iVar != null) {
            iVar.a = 0L;
            iVar.b = 0L;
            iVar.c = false;
        }
        this.J0 = 0;
        this.K0 = 0;
        this.I0 = this.H0 ? 1 : 0;
    }

    public final void t0() {
        s0();
        this.U0 = null;
        this.x0 = null;
        this.P = null;
        this.R = null;
        this.L = null;
        this.M = null;
        this.N = false;
        this.N0 = false;
        this.O = -1.0f;
        this.S = 0;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.w0 = false;
        this.H0 = false;
        this.I0 = 0;
        this.G = false;
    }

    @Override // com.amazon.aps.iva.a6.o1
    public void u(float f, float f2) throws com.amazon.aps.iva.a6.l {
        this.I = f;
        this.J = f2;
        z0(this.L);
    }

    public final void u0(com.amazon.aps.iva.g6.d dVar) {
        com.amazon.aps.iva.g6.d.g(this.D, dVar);
        this.D = dVar;
    }

    @Override // com.amazon.aps.iva.a6.e, com.amazon.aps.iva.a6.p1
    public final int v() {
        return 8;
    }

    public final void v0(c cVar) {
        this.W0 = cVar;
        long j = cVar.b;
        if (j != -9223372036854775807L) {
            this.Y0 = true;
            i0(j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0068 A[LOOP:1: B:27:0x0048->B:37:0x0068, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084 A[LOOP:2: B:38:0x0069->B:48:0x0084, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0069 A[EDGE_INSN: B:86:0x0069->B:89:0x0069 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0085 A[EDGE_INSN: B:87:0x0085->B:49:0x0085 ?: BREAK  , SYNTHETIC] */
    @Override // com.amazon.aps.iva.a6.o1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w(long r12, long r14) throws com.amazon.aps.iva.a6.l {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.k6.o.w(long, long):void");
    }

    public boolean w0(n nVar) {
        return true;
    }

    public boolean x0(v vVar) {
        return false;
    }

    public abstract int y0(q qVar, v vVar) throws s.b;

    public final boolean z0(v vVar) throws com.amazon.aps.iva.a6.l {
        if (com.amazon.aps.iva.t5.g0.a >= 23 && this.K != null && this.K0 != 3 && this.h != 0) {
            float f = this.J;
            v[] vVarArr = this.j;
            vVarArr.getClass();
            float W = W(f, vVarArr);
            float f2 = this.O;
            if (f2 == W) {
                return true;
            }
            if (W == -1.0f) {
                if (this.L0) {
                    this.J0 = 1;
                    this.K0 = 3;
                    return false;
                }
                q0();
                b0();
                return false;
            } else if (f2 == -1.0f && W <= this.s) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", W);
                this.K.h(bundle);
                this.O = W;
            }
        }
        return true;
    }

    /* compiled from: MediaCodecRenderer.java */
    /* loaded from: classes.dex */
    public static class b extends Exception {
        public final String b;
        public final boolean c;
        public final n d;
        public final String e;

        public b(int i, v vVar, s.b bVar, boolean z) {
            this("Decoder init failed: [" + i + "], " + vVar, bVar, vVar.m, z, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i));
        }

        public b(String str, Throwable th, String str2, boolean z, n nVar, String str3) {
            super(str, th);
            this.b = str2;
            this.c = z;
            this.d = nVar;
            this.e = str3;
        }
    }

    public void r0() throws com.amazon.aps.iva.a6.l {
    }

    public void Z(com.amazon.aps.iva.z5.f fVar) throws com.amazon.aps.iva.a6.l {
    }

    public void i0(long j) {
    }

    public void m0(v vVar) throws com.amazon.aps.iva.a6.l {
    }
}
