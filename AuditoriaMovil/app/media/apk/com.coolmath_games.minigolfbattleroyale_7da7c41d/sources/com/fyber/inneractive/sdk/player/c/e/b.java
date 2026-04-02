package com.fyber.inneractive.sdk.player.c.e;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Looper;
import android.os.SystemClock;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.fyber.inneractive.sdk.player.c.c.e;
import com.fyber.inneractive.sdk.player.c.e.d;
import com.fyber.inneractive.sdk.player.c.h;
import com.fyber.inneractive.sdk.player.c.i;
import com.fyber.inneractive.sdk.player.c.k.s;
import com.fyber.inneractive.sdk.player.c.k.t;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class b extends com.fyber.inneractive.sdk.player.c.a {
    private static final byte[] j = t.f("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private ByteBuffer[] F;
    private ByteBuffer[] G;
    private long H;
    private int I;
    private int J;
    private boolean K;
    private boolean L;
    private int M;
    private int N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    protected MediaCodec h;
    protected com.fyber.inneractive.sdk.player.c.b.c i;
    private final c k;
    private final com.fyber.inneractive.sdk.player.c.c.c<e> l;
    private final boolean m;
    private final com.fyber.inneractive.sdk.player.c.b.d n;
    private final com.fyber.inneractive.sdk.player.c.b.d o;
    private final i p;
    private final List<Long> q;
    private final MediaCodec.BufferInfo r;
    private h s;
    private com.fyber.inneractive.sdk.player.c.c.b<e> t;
    private com.fyber.inneractive.sdk.player.c.c.b<e> u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public void B() {
    }

    public abstract int a(c cVar, h hVar) throws d.b;

    public void a(MediaCodec mediaCodec, MediaFormat mediaFormat) throws com.fyber.inneractive.sdk.player.c.d {
    }

    public abstract void a(com.fyber.inneractive.sdk.player.c.e.a aVar, MediaCodec mediaCodec, h hVar, MediaCrypto mediaCrypto) throws d.b;

    public void a(String str, long j2, long j3) {
    }

    public abstract boolean a(long j2, long j3, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j4, boolean z) throws com.fyber.inneractive.sdk.player.c.d;

    public boolean a(boolean z, h hVar, h hVar2) {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.c.a, com.fyber.inneractive.sdk.player.c.o
    public final int m() throws com.fyber.inneractive.sdk.player.c.d {
        return 4;
    }

    @Override // com.fyber.inneractive.sdk.player.c.a
    public void n() {
    }

    @Override // com.fyber.inneractive.sdk.player.c.a
    public void o() {
    }

    public void x() throws com.fyber.inneractive.sdk.player.c.d {
    }

    /* loaded from: classes.dex */
    public static class a extends Exception {
        public final String a;
        public final boolean b;
        public final String c;
        public final String d;

        public a(h hVar, Throwable th, boolean z, int i) {
            super("Decoder init failed: [" + i + "], " + hVar, th);
            this.a = hVar.f;
            this.b = z;
            this.c = null;
            String str = i < 0 ? "neg_" : "";
            this.d = "com.google.android.exoplayer.MediaCodecTrackRenderer_" + str + Math.abs(i);
        }

        public a(h hVar, Throwable th, boolean z, String str) {
            super("Decoder init failed: " + str + ", " + hVar, th);
            this.a = hVar.f;
            this.b = z;
            this.c = str;
            String str2 = null;
            if (t.a >= 21 && (th instanceof MediaCodec.CodecException)) {
                str2 = ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            this.d = str2;
        }
    }

    public b(int i, c cVar, boolean z) {
        super(i);
        com.fyber.inneractive.sdk.player.c.k.a.b(t.a >= 16);
        this.k = (c) com.fyber.inneractive.sdk.player.c.k.a.a(cVar);
        this.l = null;
        this.m = z;
        this.n = new com.fyber.inneractive.sdk.player.c.b.d();
        this.o = new com.fyber.inneractive.sdk.player.c.b.d();
        this.p = new i();
        this.q = new ArrayList();
        this.r = new MediaCodec.BufferInfo();
        this.M = 0;
        this.N = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.c.o
    public final int a(h hVar) throws com.fyber.inneractive.sdk.player.c.d {
        try {
            return a(this.k, hVar);
        } catch (d.b e) {
            throw com.fyber.inneractive.sdk.player.c.d.a(e, this.b);
        }
    }

    public com.fyber.inneractive.sdk.player.c.e.a a(c cVar, h hVar, boolean z) throws d.b {
        return cVar.a(hVar.f, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:118:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y() throws com.fyber.inneractive.sdk.player.c.d {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.c.e.b.y():void");
    }

    public boolean z() {
        return this.h == null && this.s != null;
    }

    @Override // com.fyber.inneractive.sdk.player.c.a
    public void a(boolean z) throws com.fyber.inneractive.sdk.player.c.d {
        this.i = new com.fyber.inneractive.sdk.player.c.b.c();
    }

    @Override // com.fyber.inneractive.sdk.player.c.a
    public void a(long j2, boolean z) throws com.fyber.inneractive.sdk.player.c.d {
        this.Q = false;
        this.R = false;
        if (this.h != null) {
            this.H = -9223372036854775807L;
            this.I = -1;
            this.J = -1;
            this.T = true;
            this.S = false;
            this.K = false;
            this.q.clear();
            this.D = false;
            this.E = false;
            if (this.x || (this.A && this.P)) {
                A();
                y();
            } else if (this.N != 0) {
                A();
                y();
            } else {
                this.h.flush();
                this.O = false;
            }
            if (!this.L || this.s == null) {
                return;
            }
            this.M = 1;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.c.a
    public void p() {
        this.s = null;
        try {
            A();
        } finally {
            this.t = null;
            this.u = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.media.MediaCodec, com.fyber.inneractive.sdk.player.c.c.b<com.fyber.inneractive.sdk.player.c.c.e>] */
    public final void A() {
        if (this.h != null) {
            this.H = -9223372036854775807L;
            this.I = -1;
            this.J = -1;
            this.S = false;
            this.K = false;
            this.q.clear();
            this.F = null;
            this.G = null;
            this.L = false;
            this.O = false;
            this.v = false;
            this.w = false;
            this.x = false;
            this.y = false;
            this.z = false;
            this.A = false;
            this.C = false;
            this.D = false;
            this.E = false;
            this.P = false;
            this.M = 0;
            this.N = 0;
            this.i.b++;
            this.n.c = null;
            try {
                this.h.stop();
                try {
                    this.h.release();
                } finally {
                    this.h = null;
                    com.fyber.inneractive.sdk.player.c.c.b<e> bVar = this.t;
                    if (bVar != null && this.u != bVar) {
                        this.t = null;
                    }
                }
            } catch (Throwable th) {
                try {
                    this.h.release();
                    this.h = null;
                    com.fyber.inneractive.sdk.player.c.c.b<e> bVar2 = this.t;
                    if (bVar2 != null && this.u != bVar2) {
                        this.t = null;
                    }
                    throw th;
                } finally {
                    this.h = null;
                    com.fyber.inneractive.sdk.player.c.c.b<e> bVar3 = this.t;
                    if (bVar3 != null && this.u != bVar3) {
                        this.t = null;
                    }
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.c.n
    public final void a(long j2, long j3) throws com.fyber.inneractive.sdk.player.c.d {
        if (this.R) {
            x();
            return;
        }
        if (this.s == null) {
            this.o.a();
            int a2 = a(this.p, this.o, true);
            if (a2 != -5) {
                if (a2 == -4) {
                    com.fyber.inneractive.sdk.player.c.k.a.b(this.o.c());
                    this.Q = true;
                    t();
                    return;
                }
                return;
            }
            b(this.p.a);
        }
        y();
        if (this.h != null) {
            s.a("drainAndFeed");
            do {
            } while (b(j2, j3));
            do {
            } while (s());
            s.a();
        } else {
            this.d.a(j2 - this.e);
            this.o.a();
            int a3 = a(this.p, this.o, false);
            if (a3 == -5) {
                b(this.p.a);
            } else if (a3 == -4) {
                com.fyber.inneractive.sdk.player.c.k.a.b(this.o.c());
                this.Q = true;
                t();
            }
        }
        this.i.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0145 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean s() throws com.fyber.inneractive.sdk.player.c.d {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.c.e.b.s():boolean");
    }

    public void b(h hVar) throws com.fyber.inneractive.sdk.player.c.d {
        h hVar2 = this.s;
        this.s = hVar;
        boolean z = true;
        if (!t.a(hVar.i, hVar2 == null ? null : hVar2.i)) {
            if (this.s.i != null) {
                com.fyber.inneractive.sdk.player.c.c.c<e> cVar = this.l;
                if (cVar == null) {
                    throw com.fyber.inneractive.sdk.player.c.d.a(new IllegalStateException("Media requires a DrmSessionManager"), this.b);
                }
                Looper.myLooper();
                com.fyber.inneractive.sdk.player.c.c.a aVar = this.s.i;
                this.u = cVar.a();
                com.fyber.inneractive.sdk.player.c.c.b<e> bVar = this.t;
            } else {
                this.u = null;
            }
        }
        if (this.u == this.t && this.h != null && a(this.v, hVar2, this.s)) {
            this.L = true;
            this.M = 1;
            this.D = (this.y && this.s.j == hVar2.j && this.s.k == hVar2.k) ? false : false;
        } else if (this.O) {
            this.N = 1;
        } else {
            A();
            y();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.c.n
    public boolean r() {
        return this.R;
    }

    @Override // com.fyber.inneractive.sdk.player.c.n
    public boolean q() {
        if (this.s == null || this.S) {
            return false;
        }
        if ((this.f ? this.g : this.d.a()) || this.J >= 0) {
            return true;
        }
        return this.H != -9223372036854775807L && SystemClock.elapsedRealtime() < this.H;
    }

    private boolean b(long j2, long j3) throws com.fyber.inneractive.sdk.player.c.d {
        boolean a2;
        boolean z;
        if (this.J < 0) {
            if (this.B && this.P) {
                try {
                    this.J = this.h.dequeueOutputBuffer(this.r, 0L);
                } catch (IllegalStateException unused) {
                    t();
                    if (this.R) {
                        A();
                    }
                    return false;
                }
            } else {
                this.J = this.h.dequeueOutputBuffer(this.r, 0L);
            }
            int i = this.J;
            if (i < 0) {
                if (i != -2) {
                    if (i != -3) {
                        if (this.z && (this.Q || this.N == 2)) {
                            t();
                        }
                        return false;
                    }
                    this.G = this.h.getOutputBuffers();
                    return true;
                }
                MediaFormat outputFormat = this.h.getOutputFormat();
                if (this.y && outputFormat.getInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY) == 32 && outputFormat.getInteger(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY) == 32) {
                    this.E = true;
                } else {
                    if (this.C) {
                        outputFormat.setInteger("channel-count", 1);
                    }
                    a(this.h, outputFormat);
                }
                return true;
            } else if (this.E) {
                this.E = false;
                this.h.releaseOutputBuffer(i, false);
                this.J = -1;
                return true;
            } else if ((this.r.flags & 4) != 0) {
                t();
                this.J = -1;
                return false;
            } else {
                ByteBuffer byteBuffer = this.G[this.J];
                if (byteBuffer != null) {
                    byteBuffer.position(this.r.offset);
                    byteBuffer.limit(this.r.offset + this.r.size);
                }
                long j4 = this.r.presentationTimeUs;
                int size = this.q.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    } else if (this.q.get(i2).longValue() == j4) {
                        this.q.remove(i2);
                        z = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                this.K = z;
            }
        }
        if (this.B && this.P) {
            try {
                a2 = a(j2, j3, this.h, this.G[this.J], this.J, this.r.flags, this.r.presentationTimeUs, this.K);
            } catch (IllegalStateException unused2) {
                t();
                if (this.R) {
                    A();
                }
                return false;
            }
        } else {
            MediaCodec mediaCodec = this.h;
            ByteBuffer[] byteBufferArr = this.G;
            int i3 = this.J;
            a2 = a(j2, j3, mediaCodec, byteBufferArr[i3], i3, this.r.flags, this.r.presentationTimeUs, this.K);
        }
        if (a2) {
            long j5 = this.r.presentationTimeUs;
            this.J = -1;
            return true;
        }
        return false;
    }

    private void t() throws com.fyber.inneractive.sdk.player.c.d {
        if (this.N == 2) {
            A();
            y();
            return;
        }
        this.R = true;
        x();
    }

    private void a(a aVar) throws com.fyber.inneractive.sdk.player.c.d {
        throw com.fyber.inneractive.sdk.player.c.d.a(aVar, this.b);
    }
}
