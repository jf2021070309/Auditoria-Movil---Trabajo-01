package com.amazon.aps.iva.c6;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.amazon.aps.iva.a6.o1;
import com.amazon.aps.iva.a6.p1;
import com.amazon.aps.iva.b6.p1;
import com.amazon.aps.iva.c6.c;
import com.amazon.aps.iva.c6.j;
import com.amazon.aps.iva.c6.k;
import com.amazon.aps.iva.c6.m;
import com.amazon.aps.iva.c6.v;
import com.amazon.aps.iva.q5.k0;
import com.amazon.aps.iva.s6.w;
import com.amazon.aps.iva.t5.d0;
import com.amazon.aps.iva.t5.g0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: DefaultAudioSink.java */
/* loaded from: classes.dex */
public final class s implements com.amazon.aps.iva.c6.k {
    public static final Object g0 = new Object();
    public static ExecutorService h0;
    public static int i0;
    public h A;
    public k0 B;
    public boolean C;
    public ByteBuffer D;
    public int E;
    public long F;
    public long G;
    public long H;
    public long I;
    public int J;
    public boolean K;
    public boolean L;
    public long M;
    public float N;
    public ByteBuffer O;
    public int P;
    public ByteBuffer Q;
    public byte[] R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public int X;
    public com.amazon.aps.iva.q5.h Y;
    public c Z;
    public final Context a;
    public boolean a0;
    public final com.amazon.aps.iva.r5.c b;
    public long b0;
    public final boolean c;
    public long c0;
    public final n d;
    public boolean d0;
    public final a0 e;
    public boolean e0;
    public final ImmutableList<com.amazon.aps.iva.r5.b> f;
    public Looper f0;
    public final ImmutableList<com.amazon.aps.iva.r5.b> g;
    public final com.amazon.aps.iva.t5.f h;
    public final m i;
    public final ArrayDeque<h> j;
    public final boolean k;
    public final int l;
    public k m;
    public final i<k.b> n;
    public final i<k.e> o;
    public final v p;
    public p1 q;
    public k.c r;
    public f s;
    public f t;
    public com.amazon.aps.iva.r5.a u;
    public AudioTrack v;
    public com.amazon.aps.iva.c6.a w;
    public com.amazon.aps.iva.c6.c x;
    public com.amazon.aps.iva.q5.f y;
    public h z;

    /* compiled from: DefaultAudioSink.java */
    /* loaded from: classes.dex */
    public static final class a {
        public static void a(AudioTrack audioTrack, c cVar) {
            AudioDeviceInfo audioDeviceInfo;
            if (cVar == null) {
                audioDeviceInfo = null;
            } else {
                audioDeviceInfo = cVar.a;
            }
            audioTrack.setPreferredDevice(audioDeviceInfo);
        }
    }

    /* compiled from: DefaultAudioSink.java */
    /* loaded from: classes.dex */
    public static final class b {
        public static void a(AudioTrack audioTrack, p1 p1Var) {
            LogSessionId logSessionId;
            boolean equals;
            p1.a aVar = p1Var.a;
            aVar.getClass();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            LogSessionId logSessionId2 = aVar.a;
            equals = logSessionId2.equals(logSessionId);
            if (!equals) {
                audioTrack.setLogSessionId(logSessionId2);
            }
        }
    }

    /* compiled from: DefaultAudioSink.java */
    /* loaded from: classes.dex */
    public static final class c {
        public final AudioDeviceInfo a;

        public c(AudioDeviceInfo audioDeviceInfo) {
            this.a = audioDeviceInfo;
        }
    }

    /* compiled from: DefaultAudioSink.java */
    /* loaded from: classes.dex */
    public interface d {
        public static final v a = new v(new v.a());
    }

    /* compiled from: DefaultAudioSink.java */
    /* loaded from: classes.dex */
    public static final class e {
        public final Context a;
        public g c;
        public boolean d;
        public boolean e;
        public final com.amazon.aps.iva.c6.a b = com.amazon.aps.iva.c6.a.c;
        public int f = 0;
        public final v g = d.a;

        public e(Context context) {
            this.a = context;
        }
    }

    /* compiled from: DefaultAudioSink.java */
    /* loaded from: classes.dex */
    public static final class f {
        public final com.amazon.aps.iva.q5.v a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final com.amazon.aps.iva.r5.a i;
        public final boolean j;

        public f(com.amazon.aps.iva.q5.v vVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, com.amazon.aps.iva.r5.a aVar, boolean z) {
            this.a = vVar;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
            this.h = i7;
            this.i = aVar;
            this.j = z;
        }

        public static AudioAttributes c(com.amazon.aps.iva.q5.f fVar, boolean z) {
            if (z) {
                return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
            }
            return fVar.a().a;
        }

        public final AudioTrack a(boolean z, com.amazon.aps.iva.q5.f fVar, int i) throws k.b {
            boolean z2;
            boolean z3;
            int i2 = this.c;
            try {
                AudioTrack b = b(z, fVar, i);
                int state = b.getState();
                if (state == 1) {
                    return b;
                }
                try {
                    b.release();
                } catch (Exception unused) {
                }
                int i3 = this.e;
                int i4 = this.f;
                int i5 = this.h;
                com.amazon.aps.iva.q5.v vVar = this.a;
                if (i2 == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                throw new k.b(state, i3, i4, i5, vVar, z3, null);
            } catch (IllegalArgumentException | UnsupportedOperationException e) {
                int i6 = this.e;
                int i7 = this.f;
                int i8 = this.h;
                com.amazon.aps.iva.q5.v vVar2 = this.a;
                if (i2 == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                throw new k.b(0, i6, i7, i8, vVar2, z2, e);
            }
        }

        public final AudioTrack b(boolean z, com.amazon.aps.iva.q5.f fVar, int i) {
            AudioTrack.Builder offloadedPlayback;
            int i2 = g0.a;
            int i3 = this.g;
            int i4 = this.f;
            int i5 = this.e;
            if (i2 >= 29) {
                AudioFormat i6 = s.i(i5, i4, i3);
                AudioAttributes c = c(fVar, z);
                boolean z2 = true;
                AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(c).setAudioFormat(i6).setTransferMode(1).setBufferSizeInBytes(this.h).setSessionId(i);
                if (this.c != 1) {
                    z2 = false;
                }
                offloadedPlayback = sessionId.setOffloadedPlayback(z2);
                return offloadedPlayback.build();
            } else if (i2 >= 21) {
                return new AudioTrack(c(fVar, z), s.i(i5, i4, i3), this.h, 1, i);
            } else {
                int C = g0.C(fVar.d);
                if (i == 0) {
                    return new AudioTrack(C, this.e, this.f, this.g, this.h, 1);
                }
                return new AudioTrack(C, this.e, this.f, this.g, this.h, 1, i);
            }
        }
    }

    /* compiled from: DefaultAudioSink.java */
    /* loaded from: classes.dex */
    public static class g implements com.amazon.aps.iva.r5.c {
        public final com.amazon.aps.iva.r5.b[] a;
        public final y b;
        public final com.amazon.aps.iva.r5.f c;

        public g(com.amazon.aps.iva.r5.b... bVarArr) {
            y yVar = new y();
            com.amazon.aps.iva.r5.f fVar = new com.amazon.aps.iva.r5.f();
            com.amazon.aps.iva.r5.b[] bVarArr2 = new com.amazon.aps.iva.r5.b[bVarArr.length + 2];
            this.a = bVarArr2;
            System.arraycopy(bVarArr, 0, bVarArr2, 0, bVarArr.length);
            this.b = yVar;
            this.c = fVar;
            bVarArr2[bVarArr.length] = yVar;
            bVarArr2[bVarArr.length + 1] = fVar;
        }
    }

    /* compiled from: DefaultAudioSink.java */
    /* loaded from: classes.dex */
    public static final class h {
        public final k0 a;
        public final long b;
        public final long c;

        public h(k0 k0Var, long j, long j2) {
            this.a = k0Var;
            this.b = j;
            this.c = j2;
        }
    }

    /* compiled from: DefaultAudioSink.java */
    /* loaded from: classes.dex */
    public static final class i<T extends Exception> {
        public T a;
        public long b;

        public final void a(T t) throws Exception {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.a == null) {
                this.a = t;
                this.b = 100 + elapsedRealtime;
            }
            if (elapsedRealtime >= this.b) {
                T t2 = this.a;
                if (t2 != t) {
                    t2.addSuppressed(t);
                }
                T t3 = this.a;
                this.a = null;
                throw t3;
            }
        }
    }

    /* compiled from: DefaultAudioSink.java */
    /* loaded from: classes.dex */
    public final class j implements m.a {
        public j() {
        }

        @Override // com.amazon.aps.iva.c6.m.a
        public final void a(final int i, final long j) {
            s sVar = s.this;
            if (sVar.r != null) {
                final long elapsedRealtime = SystemClock.elapsedRealtime() - sVar.c0;
                final j.a aVar = w.this.b1;
                Handler handler = aVar.a;
                if (handler != null) {
                    handler.post(new Runnable() { // from class: com.amazon.aps.iva.c6.i
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2 = i;
                            long j2 = j;
                            long j3 = elapsedRealtime;
                            j jVar = j.a.this.b;
                            int i3 = g0.a;
                            jVar.A(i2, j2, j3);
                        }
                    });
                }
            }
        }

        @Override // com.amazon.aps.iva.c6.m.a
        public final void b(long j) {
            com.amazon.aps.iva.t5.p.g();
        }

        @Override // com.amazon.aps.iva.c6.m.a
        public final void c(final long j) {
            final j.a aVar;
            Handler handler;
            k.c cVar = s.this.r;
            if (cVar != null && (handler = (aVar = w.this.b1).a) != null) {
                handler.post(new Runnable() { // from class: com.amazon.aps.iva.c6.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.a aVar2 = j.a.this;
                        aVar2.getClass();
                        int i = g0.a;
                        aVar2.b.j(j);
                    }
                });
            }
        }

        @Override // com.amazon.aps.iva.c6.m.a
        public final void d(long j, long j2, long j3, long j4) {
            s sVar = s.this;
            sVar.z();
            sVar.A();
            Object obj = s.g0;
            com.amazon.aps.iva.t5.p.g();
        }

        @Override // com.amazon.aps.iva.c6.m.a
        public final void e(long j, long j2, long j3, long j4) {
            s sVar = s.this;
            sVar.z();
            sVar.A();
            Object obj = s.g0;
            com.amazon.aps.iva.t5.p.g();
        }
    }

    /* compiled from: DefaultAudioSink.java */
    /* loaded from: classes.dex */
    public final class k {
        public final Handler a = new Handler(Looper.myLooper());
        public final a b = new a();

        /* compiled from: DefaultAudioSink.java */
        /* loaded from: classes.dex */
        public class a extends AudioTrack$StreamEventCallback {
            public a() {
            }

            public final void onDataRequest(AudioTrack audioTrack, int i) {
                s sVar;
                k.c cVar;
                o1.a aVar;
                if (audioTrack.equals(s.this.v) && (cVar = (sVar = s.this).r) != null && sVar.V && (aVar = w.this.l1) != null) {
                    aVar.b();
                }
            }

            public final void onTearDown(AudioTrack audioTrack) {
                s sVar;
                k.c cVar;
                o1.a aVar;
                if (audioTrack.equals(s.this.v) && (cVar = (sVar = s.this).r) != null && sVar.V && (aVar = w.this.l1) != null) {
                    aVar.b();
                }
            }
        }

        public k() {
        }
    }

    public s(e eVar) {
        com.amazon.aps.iva.c6.a aVar;
        boolean z;
        int i2;
        Context context = eVar.a;
        this.a = context;
        if (context != null) {
            aVar = com.amazon.aps.iva.c6.a.a(context);
        } else {
            aVar = eVar.b;
        }
        this.w = aVar;
        this.b = eVar.c;
        int i3 = g0.a;
        boolean z2 = true;
        if (i3 >= 21 && eVar.d) {
            z = true;
        } else {
            z = false;
        }
        this.c = z;
        this.k = (i3 < 23 || !eVar.e) ? false : z2;
        if (i3 >= 29) {
            i2 = eVar.f;
        } else {
            i2 = 0;
        }
        this.l = i2;
        this.p = eVar.g;
        com.amazon.aps.iva.t5.f fVar = new com.amazon.aps.iva.t5.f(0);
        this.h = fVar;
        fVar.c();
        this.i = new m(new j());
        n nVar = new n();
        this.d = nVar;
        a0 a0Var = new a0();
        this.e = a0Var;
        this.f = ImmutableList.of((a0) new com.amazon.aps.iva.r5.g(), (a0) nVar, a0Var);
        this.g = ImmutableList.of(new z());
        this.N = 1.0f;
        this.y = com.amazon.aps.iva.q5.f.h;
        this.X = 0;
        this.Y = new com.amazon.aps.iva.q5.h();
        k0 k0Var = k0.e;
        this.A = new h(k0Var, 0L, 0L);
        this.B = k0Var;
        this.C = false;
        this.j = new ArrayDeque<>();
        this.n = new i<>();
        this.o = new i<>();
    }

    public static boolean D(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (g0.a >= 29) {
            isOffloadedPlayback = audioTrack.isOffloadedPlayback();
            if (isOffloadedPlayback) {
                return true;
            }
        }
        return false;
    }

    public static AudioFormat i(int i2, int i3, int i4) {
        return new AudioFormat.Builder().setSampleRate(i2).setChannelMask(i3).setEncoding(i4).build();
    }

    public final long A() {
        f fVar = this.t;
        if (fVar.c == 0) {
            return this.H / fVar.d;
        }
        return this.I;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0105  */
    /* JADX WARN: Type inference failed for: r6v4, types: [com.amazon.aps.iva.c6.u] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean B() throws com.amazon.aps.iva.c6.k.b {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.c6.s.B():boolean");
    }

    public final boolean C() {
        if (this.v != null) {
            return true;
        }
        return false;
    }

    public final void E() {
        if (!this.U) {
            this.U = true;
            long A = A();
            m mVar = this.i;
            mVar.A = mVar.b();
            mVar.y = SystemClock.elapsedRealtime() * 1000;
            mVar.B = A;
            this.v.stop();
            this.E = 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
        r0 = r3.O;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
        if (r0 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0051, code lost:
        if (r0.hasRemaining() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
        r0 = r3.u;
        r1 = r3.O;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
        if (r0.d() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0060, code lost:
        if (r0.d == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0063, code lost:
        r0.e(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0067, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(long r4) throws com.amazon.aps.iva.c6.k.e {
        /*
            r3 = this;
            com.amazon.aps.iva.r5.a r0 = r3.u
            boolean r0 = r0.d()
            if (r0 != 0) goto L13
            java.nio.ByteBuffer r0 = r3.O
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            java.nio.ByteBuffer r0 = com.amazon.aps.iva.r5.b.a
        Lf:
            r3.M(r0, r4)
            return
        L13:
            com.amazon.aps.iva.r5.a r0 = r3.u
            boolean r0 = r0.c()
            if (r0 != 0) goto L67
        L1b:
            com.amazon.aps.iva.r5.a r0 = r3.u
            boolean r1 = r0.d()
            if (r1 != 0) goto L26
            java.nio.ByteBuffer r0 = com.amazon.aps.iva.r5.b.a
            goto L39
        L26:
            java.nio.ByteBuffer[] r1 = r0.c
            int r2 = r1.length
            int r2 = r2 + (-1)
            r1 = r1[r2]
            boolean r2 = r1.hasRemaining()
            if (r2 != 0) goto L38
            java.nio.ByteBuffer r2 = com.amazon.aps.iva.r5.b.a
            r0.e(r2)
        L38:
            r0 = r1
        L39:
            boolean r1 = r0.hasRemaining()
            if (r1 == 0) goto L49
            r3.M(r0, r4)
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto L1b
            return
        L49:
            java.nio.ByteBuffer r0 = r3.O
            if (r0 == 0) goto L67
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L54
            goto L67
        L54:
            com.amazon.aps.iva.r5.a r0 = r3.u
            java.nio.ByteBuffer r1 = r3.O
            boolean r2 = r0.d()
            if (r2 == 0) goto L13
            boolean r2 = r0.d
            if (r2 == 0) goto L63
            goto L13
        L63:
            r0.e(r1)
            goto L13
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.c6.s.F(long):void");
    }

    public final void G() {
        this.F = 0L;
        this.G = 0L;
        this.H = 0L;
        this.I = 0L;
        this.e0 = false;
        this.J = 0;
        this.A = new h(this.B, 0L, 0L);
        this.M = 0L;
        this.z = null;
        this.j.clear();
        this.O = null;
        this.P = 0;
        this.Q = null;
        this.U = false;
        this.T = false;
        this.D = null;
        this.E = 0;
        this.e.o = 0L;
        com.amazon.aps.iva.r5.a aVar = this.t.i;
        this.u = aVar;
        aVar.b();
    }

    public final void H(k0 k0Var) {
        h hVar = new h(k0Var, -9223372036854775807L, -9223372036854775807L);
        if (C()) {
            this.z = hVar;
        } else {
            this.A = hVar;
        }
    }

    public final void I() {
        if (C()) {
            try {
                this.v.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.B.b).setPitch(this.B.c).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e2) {
                com.amazon.aps.iva.t5.p.h("Failed to set playback params", e2);
            }
            k0 k0Var = new k0(this.v.getPlaybackParams().getSpeed(), this.v.getPlaybackParams().getPitch());
            this.B = k0Var;
            float f2 = k0Var.b;
            m mVar = this.i;
            mVar.j = f2;
            l lVar = mVar.f;
            if (lVar != null) {
                lVar.a();
            }
            mVar.d();
        }
    }

    public final void J() {
        if (C()) {
            if (g0.a >= 21) {
                this.v.setVolume(this.N);
                return;
            }
            AudioTrack audioTrack = this.v;
            float f2 = this.N;
            audioTrack.setStereoVolume(f2, f2);
        }
    }

    public final boolean K() {
        f fVar = this.t;
        if (fVar != null && fVar.j && g0.a >= 23) {
            return true;
        }
        return false;
    }

    public final boolean L(com.amazon.aps.iva.q5.f fVar, com.amazon.aps.iva.q5.v vVar) {
        int i2;
        int q;
        boolean isOffloadedPlaybackSupported;
        int i3;
        boolean z;
        boolean z2;
        int i4 = g0.a;
        if (i4 < 29 || (i2 = this.l) == 0) {
            return false;
        }
        String str = vVar.m;
        str.getClass();
        int d2 = com.amazon.aps.iva.q5.g0.d(str, vVar.j);
        if (d2 == 0 || (q = g0.q(vVar.z)) == 0) {
            return false;
        }
        AudioFormat i5 = i(vVar.A, q, d2);
        AudioAttributes audioAttributes = fVar.a().a;
        if (i4 >= 31) {
            i3 = AudioManager.getPlaybackOffloadSupport(i5, audioAttributes);
        } else {
            isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(i5, audioAttributes);
            if (!isOffloadedPlaybackSupported) {
                i3 = 0;
            } else if (i4 == 30 && g0.d.startsWith("Pixel")) {
                i3 = 2;
            } else {
                i3 = 1;
            }
        }
        if (i3 == 0) {
            return false;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                return true;
            }
            throw new IllegalStateException();
        }
        if (vVar.C == 0 && vVar.D == 0) {
            z = false;
        } else {
            z = true;
        }
        if (i2 == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ee, code lost:
        if (r15 < r14) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M(java.nio.ByteBuffer r13, long r14) throws com.amazon.aps.iva.c6.k.e {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.c6.s.M(java.nio.ByteBuffer, long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0086, code lost:
        if (r1 != false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r16) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.c6.s.a(long):void");
    }

    @Override // com.amazon.aps.iva.c6.k
    public final void b() {
        this.V = true;
        if (C()) {
            l lVar = this.i.f;
            lVar.getClass();
            lVar.a();
            this.v.play();
        }
    }

    @Override // com.amazon.aps.iva.c6.k
    public final boolean c(com.amazon.aps.iva.q5.v vVar) {
        if (k(vVar) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.c6.k
    public final boolean d() {
        if (C() && (!this.T || m())) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.c6.k
    public final k0 e() {
        return this.B;
    }

    @Override // com.amazon.aps.iva.c6.k
    public final void f(k0 k0Var) {
        this.B = new k0(g0.h(k0Var.b, 0.1f, 8.0f), g0.h(k0Var.c, 0.1f, 8.0f));
        if (K()) {
            I();
        } else {
            H(k0Var);
        }
    }

    @Override // com.amazon.aps.iva.c6.k
    public final void flush() {
        boolean z;
        if (C()) {
            G();
            AudioTrack audioTrack = this.i.c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.v.pause();
            }
            if (D(this.v)) {
                k kVar = this.m;
                kVar.getClass();
                this.v.unregisterStreamEventCallback(kVar.b);
                kVar.a.removeCallbacksAndMessages(null);
            }
            if (g0.a < 21 && !this.W) {
                this.X = 0;
            }
            f fVar = this.s;
            if (fVar != null) {
                this.t = fVar;
                this.s = null;
            }
            m mVar = this.i;
            mVar.d();
            mVar.c = null;
            mVar.f = null;
            AudioTrack audioTrack2 = this.v;
            com.amazon.aps.iva.t5.f fVar2 = this.h;
            synchronized (fVar2) {
                fVar2.a = false;
            }
            synchronized (g0) {
                try {
                    if (h0 == null) {
                        h0 = Executors.newSingleThreadExecutor(new d0("ExoPlayer:AudioTrackReleaseThread"));
                    }
                    i0++;
                    h0.execute(new androidx.fragment.app.t(1, audioTrack2, fVar2));
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.v = null;
        }
        this.o.a = null;
        this.n.a = null;
    }

    public final boolean g() throws k.e {
        if (!this.u.d()) {
            ByteBuffer byteBuffer = this.Q;
            if (byteBuffer == null) {
                return true;
            }
            M(byteBuffer, Long.MIN_VALUE);
            if (this.Q != null) {
                return false;
            }
            return true;
        }
        com.amazon.aps.iva.r5.a aVar = this.u;
        if (aVar.d() && !aVar.d) {
            aVar.d = true;
            ((com.amazon.aps.iva.r5.b) aVar.b.get(0)).e();
        }
        F(Long.MIN_VALUE);
        if (!this.u.c()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.Q;
        if (byteBuffer2 != null && byteBuffer2.hasRemaining()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.amazon.aps.iva.c6.r] */
    public final com.amazon.aps.iva.c6.a h() {
        Context context;
        com.amazon.aps.iva.c6.a b2;
        c.b bVar;
        if (this.x == null && (context = this.a) != null) {
            this.f0 = Looper.myLooper();
            com.amazon.aps.iva.c6.c cVar = new com.amazon.aps.iva.c6.c(context, new c.e() { // from class: com.amazon.aps.iva.c6.r
                @Override // com.amazon.aps.iva.c6.c.e
                public final void a(a aVar) {
                    boolean z;
                    p1.a aVar2;
                    boolean z2;
                    w.a aVar3;
                    s sVar = s.this;
                    if (sVar.f0 == Looper.myLooper()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    com.amazon.aps.iva.cq.b.C(z);
                    if (!aVar.equals(sVar.h())) {
                        sVar.w = aVar;
                        k.c cVar2 = sVar.r;
                        if (cVar2 != null) {
                            w wVar = w.this;
                            synchronized (wVar.b) {
                                aVar2 = wVar.o;
                            }
                            if (aVar2 != null) {
                                com.amazon.aps.iva.s6.g gVar = (com.amazon.aps.iva.s6.g) aVar2;
                                synchronized (gVar.d) {
                                    z2 = gVar.h.J0;
                                }
                                if (z2 && (aVar3 = gVar.b) != null) {
                                    aVar3.c();
                                }
                            }
                        }
                    }
                }
            });
            this.x = cVar;
            if (cVar.h) {
                b2 = cVar.g;
                b2.getClass();
            } else {
                cVar.h = true;
                c.C0163c c0163c = cVar.f;
                if (c0163c != null) {
                    c0163c.a.registerContentObserver(c0163c.b, false, c0163c);
                }
                int i2 = g0.a;
                Handler handler = cVar.c;
                Context context2 = cVar.a;
                if (i2 >= 23 && (bVar = cVar.d) != null) {
                    c.a.a(context2, bVar, handler);
                }
                c.d dVar = cVar.e;
                Intent intent = null;
                if (dVar != null) {
                    intent = context2.registerReceiver(dVar, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler);
                }
                b2 = com.amazon.aps.iva.c6.a.b(context2, intent);
                cVar.g = b2;
            }
            this.w = b2;
        }
        return this.w;
    }

    @Override // com.amazon.aps.iva.c6.k
    public final void j(float f2) {
        if (this.N != f2) {
            this.N = f2;
            J();
        }
    }

    @Override // com.amazon.aps.iva.c6.k
    public final int k(com.amazon.aps.iva.q5.v vVar) {
        boolean z = true;
        if ("audio/raw".equals(vVar.m)) {
            int i2 = vVar.B;
            if (!g0.M(i2)) {
                com.amazon.aps.iva.t5.p.g();
                return 0;
            } else if (i2 != 2 && (!this.c || i2 != 4)) {
                return 1;
            } else {
                return 2;
            }
        } else if (!this.d0 && L(this.y, vVar)) {
            return 2;
        } else {
            if (h().c(vVar) == null) {
                z = false;
            }
            if (!z) {
                return 0;
            }
            return 2;
        }
    }

    @Override // com.amazon.aps.iva.c6.k
    public final void l(AudioDeviceInfo audioDeviceInfo) {
        c cVar;
        if (audioDeviceInfo == null) {
            cVar = null;
        } else {
            cVar = new c(audioDeviceInfo);
        }
        this.Z = cVar;
        AudioTrack audioTrack = this.v;
        if (audioTrack != null) {
            a.a(audioTrack, cVar);
        }
    }

    @Override // com.amazon.aps.iva.c6.k
    public final boolean m() {
        if (C() && this.i.c(A())) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.c6.k
    public final void n(int i2) {
        boolean z;
        if (this.X != i2) {
            this.X = i2;
            if (i2 != 0) {
                z = true;
            } else {
                z = false;
            }
            this.W = z;
            flush();
        }
    }

    @Override // com.amazon.aps.iva.c6.k
    public final void o() {
        if (this.a0) {
            this.a0 = false;
            flush();
        }
    }

    @Override // com.amazon.aps.iva.c6.k
    public final void p(com.amazon.aps.iva.q5.f fVar) {
        if (this.y.equals(fVar)) {
            return;
        }
        this.y = fVar;
        if (this.a0) {
            return;
        }
        flush();
    }

    @Override // com.amazon.aps.iva.c6.k
    public final void pause() {
        boolean z = false;
        this.V = false;
        if (C()) {
            m mVar = this.i;
            mVar.d();
            if (mVar.y == -9223372036854775807L) {
                l lVar = mVar.f;
                lVar.getClass();
                lVar.a();
                z = true;
            }
            if (z) {
                this.v.pause();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f3, code lost:
        if (r5.b() == 0) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0115 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0116  */
    @Override // com.amazon.aps.iva.c6.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(java.nio.ByteBuffer r19, long r20, int r22) throws com.amazon.aps.iva.c6.k.b, com.amazon.aps.iva.c6.k.e {
        /*
            Method dump skipped, instructions count: 1040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.c6.s.q(java.nio.ByteBuffer, long, int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    @Override // com.amazon.aps.iva.c6.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(com.amazon.aps.iva.q5.v r24, int[] r25) throws com.amazon.aps.iva.c6.k.a {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.c6.s.r(com.amazon.aps.iva.q5.v, int[]):void");
    }

    @Override // com.amazon.aps.iva.c6.k
    public final void release() {
        c.b bVar;
        com.amazon.aps.iva.c6.c cVar = this.x;
        if (cVar != null && cVar.h) {
            cVar.g = null;
            int i2 = g0.a;
            Context context = cVar.a;
            if (i2 >= 23 && (bVar = cVar.d) != null) {
                c.a.b(context, bVar);
            }
            c.d dVar = cVar.e;
            if (dVar != null) {
                context.unregisterReceiver(dVar);
            }
            c.C0163c c0163c = cVar.f;
            if (c0163c != null) {
                c0163c.a.unregisterContentObserver(c0163c);
            }
            cVar.h = false;
        }
    }

    @Override // com.amazon.aps.iva.c6.k
    public final void reset() {
        flush();
        UnmodifiableIterator<com.amazon.aps.iva.r5.b> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().reset();
        }
        UnmodifiableIterator<com.amazon.aps.iva.r5.b> it2 = this.g.iterator();
        while (it2.hasNext()) {
            it2.next().reset();
        }
        com.amazon.aps.iva.r5.a aVar = this.u;
        if (aVar != null) {
            aVar.f();
        }
        this.V = false;
        this.d0 = false;
    }

    @Override // com.amazon.aps.iva.c6.k
    public final void s() throws k.e {
        if (!this.T && C() && g()) {
            E();
            this.T = true;
        }
    }

    @Override // com.amazon.aps.iva.c6.k
    public final void t(com.amazon.aps.iva.b6.p1 p1Var) {
        this.q = p1Var;
    }

    @Override // com.amazon.aps.iva.c6.k
    public final long u(boolean z) {
        ArrayDeque<h> arrayDeque;
        long x;
        long j2;
        if (C() && !this.L) {
            long a2 = this.i.a(z);
            f fVar = this.t;
            long min = Math.min(a2, g0.W(fVar.e, A()));
            while (true) {
                arrayDeque = this.j;
                if (arrayDeque.isEmpty() || min < arrayDeque.getFirst().c) {
                    break;
                }
                this.A = arrayDeque.remove();
            }
            h hVar = this.A;
            long j3 = min - hVar.c;
            boolean equals = hVar.a.equals(k0.e);
            com.amazon.aps.iva.r5.c cVar = this.b;
            if (equals) {
                x = this.A.b + j3;
            } else if (arrayDeque.isEmpty()) {
                com.amazon.aps.iva.r5.f fVar2 = ((g) cVar).c;
                if (fVar2.o >= 1024) {
                    long j4 = fVar2.n;
                    com.amazon.aps.iva.r5.e eVar = fVar2.j;
                    eVar.getClass();
                    long j5 = j4 - ((eVar.k * eVar.b) * 2);
                    int i2 = fVar2.h.a;
                    int i3 = fVar2.g.a;
                    if (i2 == i3) {
                        j2 = g0.X(j3, j5, fVar2.o);
                    } else {
                        j2 = g0.X(j3, j5 * i2, fVar2.o * i3);
                    }
                } else {
                    j2 = (long) (fVar2.c * j3);
                }
                x = j2 + this.A.b;
            } else {
                h first = arrayDeque.getFirst();
                x = first.b - g0.x(first.c - min, this.A.a.b);
            }
            f fVar3 = this.t;
            return g0.W(fVar3.e, ((g) cVar).b.t) + x;
        }
        return Long.MIN_VALUE;
    }

    @Override // com.amazon.aps.iva.c6.k
    public final void v() {
        this.K = true;
    }

    @Override // com.amazon.aps.iva.c6.k
    public final void w() {
        boolean z;
        if (g0.a >= 21) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.C(z);
        com.amazon.aps.iva.cq.b.C(this.W);
        if (!this.a0) {
            this.a0 = true;
            flush();
        }
    }

    @Override // com.amazon.aps.iva.c6.k
    public final void x(com.amazon.aps.iva.q5.h hVar) {
        if (this.Y.equals(hVar)) {
            return;
        }
        int i2 = hVar.a;
        AudioTrack audioTrack = this.v;
        if (audioTrack != null) {
            if (this.Y.a != i2) {
                audioTrack.attachAuxEffect(i2);
            }
            if (i2 != 0) {
                this.v.setAuxEffectSendLevel(hVar.b);
            }
        }
        this.Y = hVar;
    }

    @Override // com.amazon.aps.iva.c6.k
    public final void y(boolean z) {
        k0 k0Var;
        this.C = z;
        if (K()) {
            k0Var = k0.e;
        } else {
            k0Var = this.B;
        }
        H(k0Var);
    }

    public final long z() {
        f fVar = this.t;
        if (fVar.c == 0) {
            return this.F / fVar.b;
        }
        return this.G;
    }
}
