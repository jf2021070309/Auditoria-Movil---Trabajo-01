package com.amazon.aps.iva.a6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.amazon.aps.iva.a6.b;
import com.amazon.aps.iva.a6.d;
import com.amazon.aps.iva.a6.j1;
import com.amazon.aps.iva.a6.l1;
import com.amazon.aps.iva.a6.m;
import com.amazon.aps.iva.a6.q0;
import com.amazon.aps.iva.o6.j0;
import com.amazon.aps.iva.o6.s;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.q5.d0;
import com.amazon.aps.iva.q5.f0;
import com.amazon.aps.iva.q5.l0;
import com.amazon.aps.iva.q5.q;
import com.amazon.aps.iva.q5.r0;
import com.amazon.aps.iva.q5.u;
import com.amazon.aps.iva.t5.o;
import com.amazon.aps.iva.w6.j;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
/* compiled from: ExoPlayerImpl.java */
/* loaded from: classes.dex */
public final class m0 extends com.amazon.aps.iva.q5.i implements m {
    public static final /* synthetic */ int o0 = 0;
    public final com.amazon.aps.iva.a6.d A;
    public final v1 B;
    public final w1 C;
    public final long D;
    public int E;
    public boolean F;
    public int G;
    public int H;
    public boolean I;
    public int J;
    public com.amazon.aps.iva.o6.j0 K;
    public boolean L;
    public l0.a M;
    public com.amazon.aps.iva.q5.d0 N;
    public com.amazon.aps.iva.q5.d0 O;
    public com.amazon.aps.iva.q5.v P;
    public AudioTrack Q;
    public Object R;
    public Surface S;
    public SurfaceHolder T;
    public com.amazon.aps.iva.w6.j U;
    public boolean V;
    public TextureView W;
    public final int X;
    public final int Y;
    public com.amazon.aps.iva.t5.x Z;
    public final int a0;
    public final com.amazon.aps.iva.s6.x b;
    public com.amazon.aps.iva.q5.f b0;
    public final l0.a c;
    public float c0;
    public final com.amazon.aps.iva.t5.f d = new com.amazon.aps.iva.t5.f();
    public boolean d0;
    public final Context e;
    public com.amazon.aps.iva.s5.b e0;
    public final com.amazon.aps.iva.q5.l0 f;
    public final boolean f0;
    public final o1[] g;
    public boolean g0;
    public final com.amazon.aps.iva.s6.w h;
    public boolean h0;
    public final com.amazon.aps.iva.t5.l i;
    public com.amazon.aps.iva.q5.q i0;
    public final com.amazon.aps.iva.g1.m j;
    public com.amazon.aps.iva.q5.y0 j0;
    public final q0 k;
    public com.amazon.aps.iva.q5.d0 k0;
    public final com.amazon.aps.iva.t5.o<l0.c> l;
    public k1 l0;
    public final CopyOnWriteArraySet<m.a> m;
    public int m0;
    public final r0.b n;
    public long n0;
    public final ArrayList o;
    public final boolean p;
    public final v.a q;
    public final com.amazon.aps.iva.b6.a r;
    public final Looper s;
    public final com.amazon.aps.iva.t6.d t;
    public final long u;
    public final long v;
    public final com.amazon.aps.iva.t5.y w;
    public final b x;
    public final c y;
    public final com.amazon.aps.iva.a6.b z;

    /* compiled from: ExoPlayerImpl.java */
    /* loaded from: classes.dex */
    public static final class a {
        public static com.amazon.aps.iva.b6.p1 a(Context context, m0 m0Var, boolean z) {
            PlaybackSession createPlaybackSession;
            com.amazon.aps.iva.b6.n1 n1Var;
            LogSessionId sessionId;
            LogSessionId logSessionId;
            MediaMetricsManager a = com.amazon.aps.iva.b6.s0.a(context.getSystemService("media_metrics"));
            if (a != null) {
                createPlaybackSession = a.createPlaybackSession();
                n1Var = new com.amazon.aps.iva.b6.n1(context, createPlaybackSession);
            } else {
                n1Var = null;
            }
            if (n1Var == null) {
                com.amazon.aps.iva.t5.p.g();
                logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
                return new com.amazon.aps.iva.b6.p1(logSessionId);
            }
            if (z) {
                m0Var.getClass();
                m0Var.r.F(n1Var);
            }
            sessionId = n1Var.c.getSessionId();
            return new com.amazon.aps.iva.b6.p1(sessionId);
        }
    }

    /* compiled from: ExoPlayerImpl.java */
    /* loaded from: classes.dex */
    public static final class c implements com.amazon.aps.iva.v6.g, com.amazon.aps.iva.w6.a, l1.b {
        public com.amazon.aps.iva.v6.g b;
        public com.amazon.aps.iva.w6.a c;
        public com.amazon.aps.iva.v6.g d;
        public com.amazon.aps.iva.w6.a e;

        @Override // com.amazon.aps.iva.w6.a
        public final void b(float[] fArr, long j) {
            com.amazon.aps.iva.w6.a aVar = this.e;
            if (aVar != null) {
                aVar.b(fArr, j);
            }
            com.amazon.aps.iva.w6.a aVar2 = this.c;
            if (aVar2 != null) {
                aVar2.b(fArr, j);
            }
        }

        @Override // com.amazon.aps.iva.v6.g
        public final void c(long j, long j2, com.amazon.aps.iva.q5.v vVar, MediaFormat mediaFormat) {
            com.amazon.aps.iva.v6.g gVar = this.d;
            if (gVar != null) {
                gVar.c(j, j2, vVar, mediaFormat);
            }
            com.amazon.aps.iva.v6.g gVar2 = this.b;
            if (gVar2 != null) {
                gVar2.c(j, j2, vVar, mediaFormat);
            }
        }

        @Override // com.amazon.aps.iva.w6.a
        public final void e() {
            com.amazon.aps.iva.w6.a aVar = this.e;
            if (aVar != null) {
                aVar.e();
            }
            com.amazon.aps.iva.w6.a aVar2 = this.c;
            if (aVar2 != null) {
                aVar2.e();
            }
        }

        @Override // com.amazon.aps.iva.a6.l1.b
        public final void l(int i, Object obj) {
            if (i != 7) {
                if (i != 8) {
                    if (i == 10000) {
                        com.amazon.aps.iva.w6.j jVar = (com.amazon.aps.iva.w6.j) obj;
                        if (jVar == null) {
                            this.d = null;
                            this.e = null;
                            return;
                        }
                        this.d = jVar.getVideoFrameMetadataListener();
                        this.e = jVar.getCameraMotionListener();
                        return;
                    }
                    return;
                }
                this.c = (com.amazon.aps.iva.w6.a) obj;
                return;
            }
            this.b = (com.amazon.aps.iva.v6.g) obj;
        }
    }

    /* compiled from: ExoPlayerImpl.java */
    /* loaded from: classes.dex */
    public static final class d implements z0 {
        public final Object a;
        public com.amazon.aps.iva.q5.r0 b;

        public d(s.a aVar, Object obj) {
            this.a = obj;
            this.b = aVar;
        }

        @Override // com.amazon.aps.iva.a6.z0
        public final Object a() {
            return this.a;
        }

        @Override // com.amazon.aps.iva.a6.z0
        public final com.amazon.aps.iva.q5.r0 b() {
            return this.b;
        }
    }

    static {
        com.amazon.aps.iva.q5.c0.a("media3.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public m0(m.b bVar) {
        com.amazon.aps.iva.b6.p1 a2;
        try {
            Integer.toHexString(System.identityHashCode(this));
            int i = com.amazon.aps.iva.t5.g0.a;
            com.amazon.aps.iva.t5.p.f();
            Context context = bVar.a;
            Context applicationContext = context.getApplicationContext();
            this.e = applicationContext;
            Function<com.amazon.aps.iva.t5.d, com.amazon.aps.iva.b6.a> function = bVar.h;
            com.amazon.aps.iva.t5.y yVar = bVar.b;
            com.amazon.aps.iva.b6.a apply = function.apply(yVar);
            this.r = apply;
            this.b0 = bVar.j;
            this.X = bVar.l;
            this.Y = bVar.m;
            this.d0 = false;
            this.D = bVar.t;
            b bVar2 = new b();
            this.x = bVar2;
            this.y = new c();
            Handler handler = new Handler(bVar.i);
            o1[] a3 = bVar.c.get().a(handler, bVar2, bVar2, bVar2, bVar2);
            this.g = a3;
            com.amazon.aps.iva.cq.b.C(a3.length > 0);
            com.amazon.aps.iva.s6.w wVar = bVar.e.get();
            this.h = wVar;
            this.q = bVar.d.get();
            com.amazon.aps.iva.t6.d dVar = bVar.g.get();
            this.t = dVar;
            this.p = bVar.n;
            s1 s1Var = bVar.o;
            this.u = bVar.p;
            this.v = bVar.q;
            this.L = bVar.u;
            Looper looper = bVar.i;
            this.s = looper;
            this.w = yVar;
            this.f = this;
            this.l = new com.amazon.aps.iva.t5.o<>(looper, yVar, new k0(this));
            CopyOnWriteArraySet<m.a> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
            this.m = copyOnWriteArraySet;
            this.o = new ArrayList();
            this.K = new j0.a();
            com.amazon.aps.iva.s6.x xVar = new com.amazon.aps.iva.s6.x(new q1[a3.length], new com.amazon.aps.iva.s6.r[a3.length], com.amazon.aps.iva.q5.v0.c, null);
            this.b = xVar;
            this.n = new r0.b();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 24, 27, 28, 32};
            int length = iArr.length;
            int i2 = 0;
            while (i2 < length) {
                int i3 = length;
                int i4 = iArr[i2];
                com.amazon.aps.iva.cq.b.C(!false);
                sparseBooleanArray.append(i4, true);
                i2++;
                length = i3;
                iArr = iArr;
            }
            if (wVar.Q()) {
                com.amazon.aps.iva.cq.b.C(!false);
                sparseBooleanArray.append(29, true);
            }
            com.amazon.aps.iva.cq.b.C(!false);
            com.amazon.aps.iva.q5.u uVar = new com.amazon.aps.iva.q5.u(sparseBooleanArray);
            this.c = new l0.a(uVar);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            int i5 = 0;
            while (i5 < uVar.c()) {
                int b2 = uVar.b(i5);
                com.amazon.aps.iva.cq.b.C(!false);
                sparseBooleanArray2.append(b2, true);
                i5++;
                uVar = uVar;
            }
            com.amazon.aps.iva.cq.b.C(!false);
            sparseBooleanArray2.append(4, true);
            com.amazon.aps.iva.cq.b.C(!false);
            sparseBooleanArray2.append(10, true);
            com.amazon.aps.iva.cq.b.C(!false);
            this.M = new l0.a(new com.amazon.aps.iva.q5.u(sparseBooleanArray2));
            this.i = yVar.b(looper, null);
            com.amazon.aps.iva.g1.m mVar = new com.amazon.aps.iva.g1.m(this);
            this.j = mVar;
            this.l0 = k1.i(xVar);
            apply.n0(this, looper);
            int i6 = com.amazon.aps.iva.t5.g0.a;
            if (i6 < 31) {
                a2 = new com.amazon.aps.iva.b6.p1();
            } else {
                a2 = a.a(applicationContext, this, bVar.v);
            }
            this.k = new q0(a3, wVar, xVar, bVar.f.get(), dVar, this.E, this.F, apply, s1Var, bVar.r, bVar.s, this.L, looper, yVar, mVar, a2);
            this.c0 = 1.0f;
            this.E = 0;
            com.amazon.aps.iva.q5.d0 d0Var = com.amazon.aps.iva.q5.d0.J;
            this.N = d0Var;
            this.O = d0Var;
            this.k0 = d0Var;
            int i7 = -1;
            this.m0 = -1;
            if (i6 < 21) {
                AudioTrack audioTrack = this.Q;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.Q.release();
                    this.Q = null;
                }
                if (this.Q == null) {
                    this.Q = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.a0 = this.Q.getAudioSessionId();
            } else {
                AudioManager audioManager = (AudioManager) this.e.getSystemService("audio");
                if (audioManager != null) {
                    i7 = audioManager.generateAudioSessionId();
                }
                this.a0 = i7;
            }
            this.e0 = com.amazon.aps.iva.s5.b.d;
            this.f0 = true;
            u(this.r);
            dVar.f(new Handler(looper), this.r);
            copyOnWriteArraySet.add(bVar2);
            com.amazon.aps.iva.a6.b bVar3 = new com.amazon.aps.iva.a6.b(context, handler, bVar2);
            this.z = bVar3;
            bVar3.a(bVar.k);
            com.amazon.aps.iva.a6.d dVar2 = new com.amazon.aps.iva.a6.d(context, handler, bVar2);
            this.A = dVar2;
            dVar2.c(null);
            this.B = new v1(context);
            this.C = new w1(context);
            this.i0 = j1();
            this.j0 = com.amazon.aps.iva.q5.y0.f;
            this.Z = com.amazon.aps.iva.t5.x.c;
            this.h.T(this.b0);
            w1(1, 10, Integer.valueOf(this.a0));
            w1(2, 10, Integer.valueOf(this.a0));
            w1(1, 3, this.b0);
            w1(2, 4, Integer.valueOf(this.X));
            w1(2, 5, Integer.valueOf(this.Y));
            w1(1, 9, Boolean.valueOf(this.d0));
            w1(2, 7, this.y);
            w1(6, 8, this.y);
        } finally {
            this.d.c();
        }
    }

    public static com.amazon.aps.iva.q5.q j1() {
        q.a aVar = new q.a(0);
        aVar.b = 0;
        aVar.c = 0;
        return aVar.a();
    }

    public static long q1(k1 k1Var) {
        r0.d dVar = new r0.d();
        r0.b bVar = new r0.b();
        k1Var.a.i(k1Var.b.a, bVar);
        long j = k1Var.c;
        if (j == -9223372036854775807L) {
            return k1Var.a.o(bVar.d, dVar).n;
        }
        return bVar.f + j;
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void A(int i) {
        G1();
    }

    public final void A1(Object obj) {
        o1[] o1VarArr;
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (o1 o1Var : this.g) {
            if (o1Var.p() == 2) {
                l1 l1 = l1(o1Var);
                com.amazon.aps.iva.cq.b.C(!l1.g);
                l1.d = 1;
                com.amazon.aps.iva.cq.b.C(true ^ l1.g);
                l1.e = obj;
                l1.c();
                arrayList.add(l1);
            }
        }
        Object obj2 = this.R;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((l1) it.next()).a(this.D);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            Object obj3 = this.R;
            Surface surface = this.S;
            if (obj3 == surface) {
                surface.release();
                this.S = null;
            }
        }
        this.R = obj;
        if (z) {
            B1(new l(2, new r0(3), 1003));
        }
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void B(SurfaceView surfaceView) {
        SurfaceHolder holder;
        G1();
        if (surfaceView instanceof com.amazon.aps.iva.v6.f) {
            v1();
            A1(surfaceView);
            z1(surfaceView.getHolder());
            return;
        }
        boolean z = surfaceView instanceof com.amazon.aps.iva.w6.j;
        b bVar = this.x;
        if (z) {
            v1();
            this.U = (com.amazon.aps.iva.w6.j) surfaceView;
            l1 l1 = l1(this.y);
            com.amazon.aps.iva.cq.b.C(!l1.g);
            l1.d = 10000;
            com.amazon.aps.iva.w6.j jVar = this.U;
            com.amazon.aps.iva.cq.b.C(true ^ l1.g);
            l1.e = jVar;
            l1.c();
            this.U.b.add(bVar);
            A1(this.U.getVideoSurface());
            z1(surfaceView.getHolder());
            return;
        }
        if (surfaceView == null) {
            holder = null;
        } else {
            holder = surfaceView.getHolder();
        }
        G1();
        if (holder == null) {
            i1();
            return;
        }
        v1();
        this.V = true;
        this.T = holder;
        holder.addCallback(bVar);
        Surface surface = holder.getSurface();
        if (surface != null && surface.isValid()) {
            A1(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            t1(surfaceFrame.width(), surfaceFrame.height());
            return;
        }
        A1(null);
        t1(0, 0);
    }

    public final void B1(l lVar) {
        k1 k1Var = this.l0;
        k1 b2 = k1Var.b(k1Var.b);
        b2.p = b2.r;
        b2.q = 0L;
        k1 g = b2.g(1);
        if (lVar != null) {
            g = g.e(lVar);
        }
        this.G++;
        this.k.i.c(6).a();
        E1(g, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void C(int i, int i2, List<com.amazon.aps.iva.q5.b0> list) {
        boolean z;
        boolean z2;
        G1();
        if (i >= 0 && i2 >= i) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.t(z);
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        if (i > size) {
            return;
        }
        int min = Math.min(i2, size);
        ArrayList k1 = k1(list);
        if (arrayList.isEmpty()) {
            if (this.m0 == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            G1();
            y1(k1, -1, -9223372036854775807L, z2);
            return;
        }
        k1 u1 = u1(i, min, g1(this.l0, min, k1));
        E1(u1, 0, 1, !u1.b.a.equals(this.l0.b.a), 4, n1(u1), -1, false);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final long C0() {
        G1();
        return this.v;
    }

    public final void C1() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        l0.a aVar = this.M;
        int i = com.amazon.aps.iva.t5.g0.a;
        com.amazon.aps.iva.q5.l0 l0Var = this.f;
        boolean o = l0Var.o();
        boolean H0 = l0Var.H0();
        boolean x0 = l0Var.x0();
        boolean R = l0Var.R();
        boolean W0 = l0Var.W0();
        boolean Y = l0Var.Y();
        boolean r = l0Var.a0().r();
        l0.a.C0636a c0636a = new l0.a.C0636a();
        com.amazon.aps.iva.q5.u uVar = this.c.b;
        u.a aVar2 = c0636a.a;
        aVar2.getClass();
        boolean z7 = false;
        for (int i2 = 0; i2 < uVar.c(); i2++) {
            aVar2.a(uVar.b(i2));
        }
        boolean z8 = !o;
        c0636a.a(4, z8);
        if (H0 && !o) {
            z = true;
        } else {
            z = false;
        }
        c0636a.a(5, z);
        if (x0 && !o) {
            z2 = true;
        } else {
            z2 = false;
        }
        c0636a.a(6, z2);
        if (!r && ((x0 || !W0 || H0) && !o)) {
            z3 = true;
        } else {
            z3 = false;
        }
        c0636a.a(7, z3);
        if (R && !o) {
            z4 = true;
        } else {
            z4 = false;
        }
        c0636a.a(8, z4);
        if (!r && ((R || (W0 && Y)) && !o)) {
            z5 = true;
        } else {
            z5 = false;
        }
        c0636a.a(9, z5);
        c0636a.a(10, z8);
        if (H0 && !o) {
            z6 = true;
        } else {
            z6 = false;
        }
        c0636a.a(11, z6);
        if (H0 && !o) {
            z7 = true;
        }
        c0636a.a(12, z7);
        l0.a aVar3 = new l0.a(aVar2.b());
        this.M = aVar3;
        if (!aVar3.equals(aVar)) {
            this.l.b(13, new com.amazon.aps.iva.g1.q(this, 1));
        }
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void D(com.amazon.aps.iva.q5.u0 u0Var) {
        G1();
        com.amazon.aps.iva.s6.w wVar = this.h;
        if (wVar.Q() && !u0Var.equals(wVar.I())) {
            wVar.U(u0Var);
            this.l.e(19, new com.amazon.aps.iva.f1.c0(u0Var, 2));
        }
    }

    @Override // com.amazon.aps.iva.a6.m
    public final void D0(com.amazon.aps.iva.b6.b bVar) {
        G1();
        bVar.getClass();
        this.r.k0(bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r15v4 */
    public final void D1(int i, int i2, boolean z) {
        ?? r15;
        int i3 = 0;
        if (z && i != -1) {
            r15 = 1;
        } else {
            r15 = 0;
        }
        if (r15 != 0 && i != 1) {
            i3 = 1;
        }
        k1 k1Var = this.l0;
        if (k1Var.l == r15 && k1Var.m == i3) {
            return;
        }
        this.G++;
        boolean z2 = k1Var.o;
        k1 k1Var2 = k1Var;
        if (z2) {
            k1Var2 = k1Var.a();
        }
        k1 d2 = k1Var2.d(i3, r15);
        q0 q0Var = this.k;
        q0Var.getClass();
        q0Var.i.f(1, r15, i3).a();
        E1(d2, 0, i2, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final long E0() {
        G1();
        return m1(this.l0);
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0285  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E1(final com.amazon.aps.iva.a6.k1 r39, final int r40, int r41, boolean r42, int r43, long r44, int r46, boolean r47) {
        /*
            Method dump skipped, instructions count: 924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.a6.m0.E1(com.amazon.aps.iva.a6.k1, int, int, boolean, int, long, int, boolean):void");
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void F0(int i, List<com.amazon.aps.iva.q5.b0> list) {
        G1();
        f1(i, k1(list));
    }

    public final void F1() {
        int h = h();
        w1 w1Var = this.C;
        v1 v1Var = this.B;
        if (h != 1) {
            if (h != 2 && h != 3) {
                if (h != 4) {
                    throw new IllegalStateException();
                }
            } else {
                G1();
                boolean z = this.l0.o;
                k0();
                v1Var.getClass();
                k0();
                w1Var.getClass();
                return;
            }
        }
        v1Var.getClass();
        w1Var.getClass();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void G(int i, int i2) {
        boolean z;
        G1();
        if (i >= 0 && i2 >= i) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.t(z);
        int size = this.o.size();
        int min = Math.min(i2, size);
        if (i < size && i != min) {
            k1 u1 = u1(i, min, this.l0);
            E1(u1, 0, 1, !u1.b.a.equals(this.l0.b.a), 4, n1(u1), -1, false);
        }
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final long G0() {
        G1();
        if (o()) {
            k1 k1Var = this.l0;
            if (k1Var.k.equals(k1Var.b)) {
                return com.amazon.aps.iva.t5.g0.e0(this.l0.p);
            }
            return getDuration();
        }
        return R0();
    }

    public final void G1() {
        IllegalStateException illegalStateException;
        this.d.b();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.s;
        if (currentThread != looper.getThread()) {
            String o = com.amazon.aps.iva.t5.g0.o("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), looper.getThread().getName());
            if (!this.f0) {
                if (this.g0) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                com.amazon.aps.iva.t5.p.h(o, illegalStateException);
                this.g0 = true;
                return;
            }
            throw new IllegalStateException(o);
        }
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void I(com.amazon.aps.iva.q5.d0 d0Var) {
        G1();
        d0Var.getClass();
        if (d0Var.equals(this.O)) {
            return;
        }
        this.O = d0Var;
        this.l.e(15, new k0(this));
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final com.amazon.aps.iva.q5.d0 I0() {
        G1();
        return this.O;
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final com.amazon.aps.iva.q5.j0 K() {
        G1();
        return this.l0.f;
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final int K0() {
        G1();
        int o1 = o1(this.l0);
        if (o1 == -1) {
            return 0;
        }
        return o1;
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void L(boolean z) {
        G1();
        int e = this.A.e(h(), z);
        int i = 1;
        if (z && e != 1) {
            i = 2;
        }
        D1(e, i, z);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void L0(SurfaceView surfaceView) {
        SurfaceHolder holder;
        G1();
        if (surfaceView == null) {
            holder = null;
        } else {
            holder = surfaceView.getHolder();
        }
        G1();
        if (holder != null && holder == this.T) {
            i1();
        }
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void N0(int i, int i2, int i3) {
        boolean z;
        G1();
        if (i >= 0 && i <= i2 && i3 >= 0) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.t(z);
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        int min = Math.min(i2, size);
        int min2 = Math.min(i3, size - (min - i));
        if (i < size && i != min && i != min2) {
            com.amazon.aps.iva.q5.r0 a0 = a0();
            this.G++;
            com.amazon.aps.iva.t5.g0.P(i, min, min2, arrayList);
            n1 n1Var = new n1(arrayList, this.K);
            k1 k1Var = this.l0;
            k1 r1 = r1(k1Var, n1Var, p1(a0, n1Var, o1(k1Var), m1(this.l0)));
            com.amazon.aps.iva.o6.j0 j0Var = this.K;
            q0 q0Var = this.k;
            q0Var.getClass();
            q0Var.i.d(19, new q0.b(i, min, min2, j0Var)).a();
            E1(r1, 0, 1, false, 5, -9223372036854775807L, -1, false);
        }
    }

    @Override // com.amazon.aps.iva.a6.m
    public final com.amazon.aps.iva.q5.v O() {
        G1();
        return this.P;
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void P(int i) {
        G1();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final boolean P0() {
        G1();
        return false;
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final com.amazon.aps.iva.q5.v0 Q() {
        G1();
        return this.l0.i.d;
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final boolean Q0() {
        G1();
        return this.F;
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final long R0() {
        G1();
        if (this.l0.a.r()) {
            return this.n0;
        }
        k1 k1Var = this.l0;
        if (k1Var.k.d != k1Var.b.d) {
            return k1Var.a.o(K0(), this.a).a();
        }
        long j = k1Var.p;
        if (this.l0.k.a()) {
            k1 k1Var2 = this.l0;
            r0.b i = k1Var2.a.i(k1Var2.k.a, this.n);
            long d2 = i.d(this.l0.k.b);
            if (d2 == Long.MIN_VALUE) {
                j = i.e;
            } else {
                j = d2;
            }
        }
        k1 k1Var3 = this.l0;
        com.amazon.aps.iva.q5.r0 r0Var = k1Var3.a;
        Object obj = k1Var3.k.a;
        r0.b bVar = this.n;
        r0Var.i(obj, bVar);
        return com.amazon.aps.iva.t5.g0.e0(j + bVar.f);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final com.amazon.aps.iva.s5.b S() {
        G1();
        return this.e0;
    }

    @Override // com.amazon.aps.iva.q5.l0
    @Deprecated
    public final void S0(int i) {
        G1();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final int U() {
        G1();
        if (o()) {
            return this.l0.b.b;
        }
        return -1;
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final com.amazon.aps.iva.q5.d0 U0() {
        G1();
        return this.N;
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final long V0() {
        G1();
        return this.u;
    }

    @Override // com.amazon.aps.iva.a6.m
    public final void W(boolean z) {
        G1();
        if (this.L == z) {
            return;
        }
        this.L = z;
        this.k.i.f(23, z ? 1 : 0, 0).a();
    }

    @Override // com.amazon.aps.iva.q5.l0
    @Deprecated
    public final void X(boolean z) {
        G1();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final int Z() {
        G1();
        return this.l0.m;
    }

    @Override // com.amazon.aps.iva.q5.i
    public final void Z0(int i, long j, boolean z) {
        boolean z2;
        G1();
        if (i >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        com.amazon.aps.iva.cq.b.t(z2);
        this.r.L();
        com.amazon.aps.iva.q5.r0 r0Var = this.l0.a;
        if (!r0Var.r() && i >= r0Var.q()) {
            return;
        }
        this.G++;
        if (o()) {
            com.amazon.aps.iva.t5.p.g();
            q0.d dVar = new q0.d(this.l0);
            dVar.a(1);
            m0 m0Var = (m0) this.j.b;
            m0Var.getClass();
            m0Var.i.i(new com.amazon.aps.iva.n4.d(3, m0Var, dVar));
            return;
        }
        k1 k1Var = this.l0;
        int i2 = k1Var.e;
        if (i2 == 3 || (i2 == 4 && !r0Var.r())) {
            k1Var = this.l0.g(2);
        }
        int K0 = K0();
        k1 r1 = r1(k1Var, r0Var, s1(r0Var, i, j));
        long Q = com.amazon.aps.iva.t5.g0.Q(j);
        q0 q0Var = this.k;
        q0Var.getClass();
        q0Var.i.d(3, new q0.g(r0Var, i, Q)).a();
        E1(r1, 0, 1, true, 1, n1(r1), K0, z);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final long a() {
        G1();
        return com.amazon.aps.iva.t5.g0.e0(n1(this.l0));
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final com.amazon.aps.iva.q5.r0 a0() {
        G1();
        return this.l0.a;
    }

    @Override // com.amazon.aps.iva.a6.m
    public final void b0(com.amazon.aps.iva.b6.b bVar) {
        bVar.getClass();
        this.r.F(bVar);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final Looper c0() {
        return this.s;
    }

    @Override // com.amazon.aps.iva.q5.l0
    @Deprecated
    public final void d0() {
        G1();
    }

    public final void d1(int i, com.amazon.aps.iva.o6.v vVar) {
        G1();
        f1(i, Collections.singletonList(vVar));
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final com.amazon.aps.iva.q5.k0 e() {
        G1();
        return this.l0.n;
    }

    public final ArrayList e1(int i, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            j1.c cVar = new j1.c((com.amazon.aps.iva.o6.v) list.get(i2), this.p);
            arrayList.add(cVar);
            this.o.add(i2 + i, new d(cVar.a.o, cVar.b));
        }
        this.K = this.K.h(i, arrayList.size());
        return arrayList;
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void f(com.amazon.aps.iva.q5.k0 k0Var) {
        G1();
        if (k0Var == null) {
            k0Var = com.amazon.aps.iva.q5.k0.e;
        }
        if (this.l0.n.equals(k0Var)) {
            return;
        }
        k1 f = this.l0.f(k0Var);
        this.G++;
        this.k.i.d(4, k0Var).a();
        E1(f, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void f0(TextureView textureView) {
        SurfaceTexture surfaceTexture;
        G1();
        if (textureView == null) {
            i1();
            return;
        }
        v1();
        this.W = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            com.amazon.aps.iva.t5.p.g();
        }
        textureView.setSurfaceTextureListener(this.x);
        if (textureView.isAvailable()) {
            surfaceTexture = textureView.getSurfaceTexture();
        } else {
            surfaceTexture = null;
        }
        if (surfaceTexture == null) {
            A1(null);
            t1(0, 0);
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        A1(surface);
        this.S = surface;
        t1(textureView.getWidth(), textureView.getHeight());
    }

    public final void f1(int i, List<com.amazon.aps.iva.o6.v> list) {
        boolean z;
        boolean z2;
        G1();
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.t(z);
        ArrayList arrayList = this.o;
        int min = Math.min(i, arrayList.size());
        if (arrayList.isEmpty()) {
            if (this.m0 == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            G1();
            y1(list, -1, -9223372036854775807L, z2);
            return;
        }
        E1(g1(this.l0, min, list), 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void g() {
        int i;
        G1();
        boolean k0 = k0();
        int i2 = 2;
        int e = this.A.e(2, k0);
        if (k0 && e != 1) {
            i = 2;
        } else {
            i = 1;
        }
        D1(e, i, k0);
        k1 k1Var = this.l0;
        if (k1Var.e != 1) {
            return;
        }
        k1 e2 = k1Var.e(null);
        if (e2.a.r()) {
            i2 = 4;
        }
        k1 g = e2.g(i2);
        this.G++;
        this.k.i.c(0).a();
        E1(g, 1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final int g0() {
        G1();
        return 0;
    }

    public final k1 g1(k1 k1Var, int i, List<com.amazon.aps.iva.o6.v> list) {
        com.amazon.aps.iva.q5.r0 r0Var = k1Var.a;
        this.G++;
        ArrayList e1 = e1(i, list);
        n1 n1Var = new n1(this.o, this.K);
        k1 r1 = r1(k1Var, n1Var, p1(r0Var, n1Var, o1(k1Var), m1(k1Var)));
        com.amazon.aps.iva.o6.j0 j0Var = this.K;
        q0 q0Var = this.k;
        q0Var.getClass();
        q0Var.i.h(18, new q0.a(e1, j0Var, -1, -9223372036854775807L), i, 0).a();
        return r1;
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final long getDuration() {
        G1();
        if (o()) {
            k1 k1Var = this.l0;
            v.b bVar = k1Var.b;
            com.amazon.aps.iva.q5.r0 r0Var = k1Var.a;
            Object obj = bVar.a;
            r0.b bVar2 = this.n;
            r0Var.i(obj, bVar2);
            return com.amazon.aps.iva.t5.g0.e0(bVar2.b(bVar.b, bVar.c));
        }
        return o0();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final float getVolume() {
        G1();
        return this.c0;
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final int h() {
        G1();
        return this.l0.e;
    }

    public final com.amazon.aps.iva.q5.d0 h1() {
        com.amazon.aps.iva.q5.r0 a0 = a0();
        if (a0.r()) {
            return this.k0;
        }
        com.amazon.aps.iva.q5.b0 b0Var = a0.o(K0(), this.a).d;
        com.amazon.aps.iva.q5.d0 d0Var = this.k0;
        d0Var.getClass();
        d0.a aVar = new d0.a(d0Var);
        com.amazon.aps.iva.q5.d0 d0Var2 = b0Var.e;
        if (d0Var2 != null) {
            CharSequence charSequence = d0Var2.b;
            if (charSequence != null) {
                aVar.a = charSequence;
            }
            CharSequence charSequence2 = d0Var2.c;
            if (charSequence2 != null) {
                aVar.b = charSequence2;
            }
            CharSequence charSequence3 = d0Var2.d;
            if (charSequence3 != null) {
                aVar.c = charSequence3;
            }
            CharSequence charSequence4 = d0Var2.e;
            if (charSequence4 != null) {
                aVar.d = charSequence4;
            }
            CharSequence charSequence5 = d0Var2.f;
            if (charSequence5 != null) {
                aVar.e = charSequence5;
            }
            CharSequence charSequence6 = d0Var2.g;
            if (charSequence6 != null) {
                aVar.f = charSequence6;
            }
            CharSequence charSequence7 = d0Var2.h;
            if (charSequence7 != null) {
                aVar.g = charSequence7;
            }
            com.amazon.aps.iva.q5.n0 n0Var = d0Var2.i;
            if (n0Var != null) {
                aVar.h = n0Var;
            }
            com.amazon.aps.iva.q5.n0 n0Var2 = d0Var2.j;
            if (n0Var2 != null) {
                aVar.i = n0Var2;
            }
            byte[] bArr = d0Var2.k;
            if (bArr != null) {
                aVar.j = (byte[]) bArr.clone();
                aVar.k = d0Var2.l;
            }
            Uri uri = d0Var2.m;
            if (uri != null) {
                aVar.l = uri;
            }
            Integer num = d0Var2.n;
            if (num != null) {
                aVar.m = num;
            }
            Integer num2 = d0Var2.o;
            if (num2 != null) {
                aVar.n = num2;
            }
            Integer num3 = d0Var2.p;
            if (num3 != null) {
                aVar.o = num3;
            }
            Boolean bool = d0Var2.q;
            if (bool != null) {
                aVar.p = bool;
            }
            Boolean bool2 = d0Var2.r;
            if (bool2 != null) {
                aVar.q = bool2;
            }
            Integer num4 = d0Var2.s;
            if (num4 != null) {
                aVar.r = num4;
            }
            Integer num5 = d0Var2.t;
            if (num5 != null) {
                aVar.r = num5;
            }
            Integer num6 = d0Var2.u;
            if (num6 != null) {
                aVar.s = num6;
            }
            Integer num7 = d0Var2.v;
            if (num7 != null) {
                aVar.t = num7;
            }
            Integer num8 = d0Var2.w;
            if (num8 != null) {
                aVar.u = num8;
            }
            Integer num9 = d0Var2.x;
            if (num9 != null) {
                aVar.v = num9;
            }
            Integer num10 = d0Var2.y;
            if (num10 != null) {
                aVar.w = num10;
            }
            CharSequence charSequence8 = d0Var2.z;
            if (charSequence8 != null) {
                aVar.x = charSequence8;
            }
            CharSequence charSequence9 = d0Var2.A;
            if (charSequence9 != null) {
                aVar.y = charSequence9;
            }
            CharSequence charSequence10 = d0Var2.B;
            if (charSequence10 != null) {
                aVar.z = charSequence10;
            }
            Integer num11 = d0Var2.C;
            if (num11 != null) {
                aVar.A = num11;
            }
            Integer num12 = d0Var2.D;
            if (num12 != null) {
                aVar.B = num12;
            }
            CharSequence charSequence11 = d0Var2.E;
            if (charSequence11 != null) {
                aVar.C = charSequence11;
            }
            CharSequence charSequence12 = d0Var2.F;
            if (charSequence12 != null) {
                aVar.D = charSequence12;
            }
            CharSequence charSequence13 = d0Var2.G;
            if (charSequence13 != null) {
                aVar.E = charSequence13;
            }
            Integer num13 = d0Var2.H;
            if (num13 != null) {
                aVar.F = num13;
            }
            Bundle bundle = d0Var2.I;
            if (bundle != null) {
                aVar.G = bundle;
            }
        }
        return new com.amazon.aps.iva.q5.d0(aVar);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final com.amazon.aps.iva.q5.u0 i() {
        G1();
        return this.h.I();
    }

    public final void i1() {
        G1();
        v1();
        A1(null);
        t1(0, 0);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final boolean isLoading() {
        G1();
        return this.l0.g;
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void j(float f) {
        G1();
        final float h = com.amazon.aps.iva.t5.g0.h(f, 0.0f, 1.0f);
        if (this.c0 == h) {
            return;
        }
        this.c0 = h;
        w1(1, 2, Float.valueOf(this.A.g * h));
        this.l.e(22, new o.a() { // from class: com.amazon.aps.iva.a6.b0
            @Override // com.amazon.aps.iva.t5.o.a
            public final void invoke(Object obj) {
                ((l0.c) obj).h0(h);
            }
        });
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final l0.a j0() {
        G1();
        return this.M;
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final boolean k0() {
        G1();
        return this.l0.l;
    }

    public final ArrayList k1(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(this.q.d((com.amazon.aps.iva.q5.b0) list.get(i)));
        }
        return arrayList;
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void l(final int i) {
        G1();
        if (this.E != i) {
            this.E = i;
            this.k.i.f(11, i, 0).a();
            o.a<l0.c> aVar = new o.a() { // from class: com.amazon.aps.iva.a6.y
                @Override // com.amazon.aps.iva.t5.o.a
                public final void invoke(Object obj) {
                    ((l0.c) obj).w(i);
                }
            };
            com.amazon.aps.iva.t5.o<l0.c> oVar = this.l;
            oVar.b(8, aVar);
            C1();
            oVar.a();
        }
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void l0(final boolean z) {
        G1();
        if (this.F != z) {
            this.F = z;
            this.k.i.f(12, z ? 1 : 0, 0).a();
            o.a<l0.c> aVar = new o.a() { // from class: com.amazon.aps.iva.a6.a0
                @Override // com.amazon.aps.iva.t5.o.a
                public final void invoke(Object obj) {
                    ((l0.c) obj).M(z);
                }
            };
            com.amazon.aps.iva.t5.o<l0.c> oVar = this.l;
            oVar.b(9, aVar);
            C1();
            oVar.a();
        }
    }

    public final l1 l1(l1.b bVar) {
        int o1 = o1(this.l0);
        com.amazon.aps.iva.q5.r0 r0Var = this.l0.a;
        if (o1 == -1) {
            o1 = 0;
        }
        com.amazon.aps.iva.t5.y yVar = this.w;
        q0 q0Var = this.k;
        return new l1(q0Var, bVar, r0Var, o1, yVar, q0Var.k);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void m(Surface surface) {
        int i;
        G1();
        v1();
        A1(surface);
        if (surface == null) {
            i = 0;
        } else {
            i = -1;
        }
        t1(i, i);
    }

    public final long m1(k1 k1Var) {
        if (k1Var.b.a()) {
            Object obj = k1Var.b.a;
            com.amazon.aps.iva.q5.r0 r0Var = k1Var.a;
            r0.b bVar = this.n;
            r0Var.i(obj, bVar);
            long j = k1Var.c;
            if (j == -9223372036854775807L) {
                return com.amazon.aps.iva.t5.g0.e0(r0Var.o(o1(k1Var), this.a).n);
            }
            return com.amazon.aps.iva.t5.g0.e0(bVar.f) + com.amazon.aps.iva.t5.g0.e0(j);
        }
        return com.amazon.aps.iva.t5.g0.e0(n1(k1Var));
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final int n() {
        G1();
        return this.E;
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final long n0() {
        G1();
        return 3000L;
    }

    public final long n1(k1 k1Var) {
        long j;
        if (k1Var.a.r()) {
            return com.amazon.aps.iva.t5.g0.Q(this.n0);
        }
        if (k1Var.o) {
            j = k1Var.j();
        } else {
            j = k1Var.r;
        }
        if (k1Var.b.a()) {
            return j;
        }
        com.amazon.aps.iva.q5.r0 r0Var = k1Var.a;
        Object obj = k1Var.b.a;
        r0.b bVar = this.n;
        r0Var.i(obj, bVar);
        return j + bVar.f;
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final boolean o() {
        G1();
        return this.l0.b.a();
    }

    public final int o1(k1 k1Var) {
        if (k1Var.a.r()) {
            return this.m0;
        }
        return k1Var.a.i(k1Var.b.a, this.n).d;
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final long p() {
        G1();
        return com.amazon.aps.iva.t5.g0.e0(this.l0.q);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final int p0() {
        G1();
        if (this.l0.a.r()) {
            return 0;
        }
        k1 k1Var = this.l0;
        return k1Var.a.c(k1Var.b.a);
    }

    public final Pair p1(com.amazon.aps.iva.q5.r0 r0Var, n1 n1Var, int i, long j) {
        boolean z;
        long j2 = -9223372036854775807L;
        int i2 = -1;
        if (!r0Var.r() && !n1Var.r()) {
            Pair<Object, Long> k = r0Var.k(this.a, this.n, i, com.amazon.aps.iva.t5.g0.Q(j));
            Object obj = k.first;
            if (n1Var.c(obj) != -1) {
                return k;
            }
            Object I = q0.I(this.a, this.n, this.E, this.F, obj, r0Var, n1Var);
            if (I != null) {
                r0.b bVar = this.n;
                n1Var.i(I, bVar);
                int i3 = bVar.d;
                return s1(n1Var, i3, com.amazon.aps.iva.t5.g0.e0(n1Var.o(i3, this.a).n));
            }
            return s1(n1Var, -1, -9223372036854775807L);
        }
        if (!r0Var.r() && n1Var.r()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i2 = i;
        }
        if (!z) {
            j2 = j;
        }
        return s1(n1Var, i2, j2);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void r0(TextureView textureView) {
        G1();
        if (textureView != null && textureView == this.W) {
            i1();
        }
    }

    public final k1 r1(k1 k1Var, com.amazon.aps.iva.q5.r0 r0Var, Pair<Object, Long> pair) {
        boolean z;
        v.b bVar;
        com.amazon.aps.iva.o6.o0 o0Var;
        com.amazon.aps.iva.s6.x xVar;
        List<com.amazon.aps.iva.q5.f0> list;
        int i;
        long j;
        if (!r0Var.r() && pair == null) {
            z = false;
        } else {
            z = true;
        }
        com.amazon.aps.iva.cq.b.t(z);
        com.amazon.aps.iva.q5.r0 r0Var2 = k1Var.a;
        long m1 = m1(k1Var);
        k1 h = k1Var.h(r0Var);
        if (r0Var.r()) {
            v.b bVar2 = k1.t;
            long Q = com.amazon.aps.iva.t5.g0.Q(this.n0);
            k1 b2 = h.c(bVar2, Q, Q, Q, 0L, com.amazon.aps.iva.o6.o0.e, this.b, ImmutableList.of()).b(bVar2);
            b2.p = b2.r;
            return b2;
        }
        Object obj = h.b.a;
        boolean z2 = !obj.equals(pair.first);
        if (z2) {
            bVar = new v.b(pair.first);
        } else {
            bVar = h.b;
        }
        v.b bVar3 = bVar;
        long longValue = ((Long) pair.second).longValue();
        long Q2 = com.amazon.aps.iva.t5.g0.Q(m1);
        if (!r0Var2.r()) {
            Q2 -= r0Var2.i(obj, this.n).f;
        }
        if (!z2 && longValue >= Q2) {
            if (i == 0) {
                int c2 = r0Var.c(h.k.a);
                if (c2 == -1 || r0Var.h(c2, this.n, false).d != r0Var.i(bVar3.a, this.n).d) {
                    r0Var.i(bVar3.a, this.n);
                    if (bVar3.a()) {
                        j = this.n.b(bVar3.b, bVar3.c);
                    } else {
                        j = this.n.e;
                    }
                    k1 b3 = h.c(bVar3, h.r, h.r, h.d, j - h.r, h.h, h.i, h.j).b(bVar3);
                    b3.p = j;
                    return b3;
                }
                return h;
            }
            com.amazon.aps.iva.cq.b.C(!bVar3.a());
            long max = Math.max(0L, h.q - (longValue - Q2));
            long j2 = h.p;
            if (h.k.equals(h.b)) {
                j2 = longValue + max;
            }
            k1 c3 = h.c(bVar3, longValue, longValue, longValue, max, h.h, h.i, h.j);
            c3.p = j2;
            return c3;
        }
        com.amazon.aps.iva.cq.b.C(!bVar3.a());
        if (z2) {
            o0Var = com.amazon.aps.iva.o6.o0.e;
        } else {
            o0Var = h.h;
        }
        com.amazon.aps.iva.o6.o0 o0Var2 = o0Var;
        if (z2) {
            xVar = this.b;
        } else {
            xVar = h.i;
        }
        com.amazon.aps.iva.s6.x xVar2 = xVar;
        if (z2) {
            list = ImmutableList.of();
        } else {
            list = h.j;
        }
        k1 b4 = h.c(bVar3, longValue, longValue, longValue, 0L, o0Var2, xVar2, list).b(bVar3);
        b4.p = longValue;
        return b4;
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void release() {
        boolean z;
        AudioTrack audioTrack;
        Integer.toHexString(System.identityHashCode(this));
        int i = com.amazon.aps.iva.t5.g0.a;
        HashSet<String> hashSet = com.amazon.aps.iva.q5.c0.a;
        synchronized (com.amazon.aps.iva.q5.c0.class) {
            HashSet<String> hashSet2 = com.amazon.aps.iva.q5.c0.a;
        }
        com.amazon.aps.iva.t5.p.f();
        G1();
        if (com.amazon.aps.iva.t5.g0.a < 21 && (audioTrack = this.Q) != null) {
            audioTrack.release();
            this.Q = null;
        }
        this.z.a(false);
        this.B.getClass();
        this.C.getClass();
        com.amazon.aps.iva.a6.d dVar = this.A;
        dVar.c = null;
        dVar.a();
        q0 q0Var = this.k;
        synchronized (q0Var) {
            if (!q0Var.A && q0Var.k.getThread().isAlive()) {
                q0Var.i.k(7);
                q0Var.h0(new o(q0Var, 1), q0Var.w);
                z = q0Var.A;
            }
            z = true;
        }
        if (!z) {
            this.l.e(10, new com.amazon.aps.iva.q5.z(4));
        }
        this.l.c();
        this.i.a();
        this.t.g(this.r);
        k1 k1Var = this.l0;
        if (k1Var.o) {
            this.l0 = k1Var.a();
        }
        k1 g = this.l0.g(1);
        this.l0 = g;
        k1 b2 = g.b(g.b);
        this.l0 = b2;
        b2.p = b2.r;
        this.l0.q = 0L;
        this.r.release();
        this.h.release();
        v1();
        Surface surface = this.S;
        if (surface != null) {
            surface.release();
            this.S = null;
        }
        this.e0 = com.amazon.aps.iva.s5.b.d;
        this.h0 = true;
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final com.amazon.aps.iva.q5.y0 s0() {
        G1();
        return this.j0;
    }

    public final Pair<Object, Long> s1(com.amazon.aps.iva.q5.r0 r0Var, int i, long j) {
        if (r0Var.r()) {
            this.m0 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.n0 = j;
            return null;
        }
        if (i == -1 || i >= r0Var.q()) {
            i = r0Var.b(this.F);
            j = com.amazon.aps.iva.t5.g0.e0(r0Var.o(i, this.a).n);
        }
        return r0Var.k(this.a, this.n, i, com.amazon.aps.iva.t5.g0.Q(j));
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void stop() {
        G1();
        this.A.e(1, k0());
        B1(null);
        this.e0 = new com.amazon.aps.iva.s5.b(ImmutableList.of(), this.l0.r);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void t0(l0.c cVar) {
        G1();
        cVar.getClass();
        this.l.d(cVar);
    }

    public final void t1(final int i, final int i2) {
        com.amazon.aps.iva.t5.x xVar = this.Z;
        if (i != xVar.a || i2 != xVar.b) {
            this.Z = new com.amazon.aps.iva.t5.x(i, i2);
            this.l.e(24, new o.a() { // from class: com.amazon.aps.iva.a6.z
                @Override // com.amazon.aps.iva.t5.o.a
                public final void invoke(Object obj) {
                    ((l0.c) obj).X(i, i2);
                }
            });
            w1(2, 14, new com.amazon.aps.iva.t5.x(i, i2));
        }
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void u(l0.c cVar) {
        cVar.getClass();
        com.amazon.aps.iva.t5.o<l0.c> oVar = this.l;
        oVar.getClass();
        synchronized (oVar.g) {
            if (!oVar.h) {
                oVar.d.add(new o.c<>(cVar));
            }
        }
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final com.amazon.aps.iva.q5.f u0() {
        G1();
        return this.b0;
    }

    public final k1 u1(int i, int i2, k1 k1Var) {
        int o1 = o1(k1Var);
        long m1 = m1(k1Var);
        com.amazon.aps.iva.q5.r0 r0Var = k1Var.a;
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        boolean z = true;
        this.G++;
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            arrayList.remove(i3);
        }
        this.K = this.K.b(i, i2);
        n1 n1Var = new n1(arrayList, this.K);
        k1 r1 = r1(k1Var, n1Var, p1(r0Var, n1Var, o1, m1));
        int i4 = r1.e;
        if ((i4 == 1 || i4 == 4 || i >= i2 || i2 != size || o1 < r1.a.q()) ? false : false) {
            r1 = r1.g(4);
        }
        this.k.i.h(20, this.K, i, i2).a();
        return r1;
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final com.amazon.aps.iva.q5.q v0() {
        G1();
        return this.i0;
    }

    public final void v1() {
        com.amazon.aps.iva.w6.j jVar = this.U;
        b bVar = this.x;
        if (jVar != null) {
            l1 l1 = l1(this.y);
            com.amazon.aps.iva.cq.b.C(!l1.g);
            l1.d = 10000;
            com.amazon.aps.iva.cq.b.C(!l1.g);
            l1.e = null;
            l1.c();
            this.U.b.remove(bVar);
            this.U = null;
        }
        TextureView textureView = this.W;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != bVar) {
                com.amazon.aps.iva.t5.p.g();
            } else {
                this.W.setSurfaceTextureListener(null);
            }
            this.W = null;
        }
        SurfaceHolder surfaceHolder = this.T;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(bVar);
            this.T = null;
        }
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void w0(int i, int i2) {
        G1();
    }

    public final void w1(int i, int i2, Object obj) {
        o1[] o1VarArr;
        for (o1 o1Var : this.g) {
            if (o1Var.p() == i) {
                l1 l1 = l1(o1Var);
                com.amazon.aps.iva.cq.b.C(!l1.g);
                l1.d = i2;
                com.amazon.aps.iva.cq.b.C(!l1.g);
                l1.e = obj;
                l1.c();
            }
        }
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void x(int i, boolean z) {
        G1();
    }

    public final void x1(com.amazon.aps.iva.q5.f fVar) {
        G1();
        if (this.h0) {
            return;
        }
        boolean a2 = com.amazon.aps.iva.t5.g0.a(this.b0, fVar);
        int i = 1;
        com.amazon.aps.iva.t5.o<l0.c> oVar = this.l;
        if (!a2) {
            this.b0 = fVar;
            w1(1, 3, fVar);
            oVar.b(20, new com.amazon.aps.iva.f1.c0(fVar, 1));
        }
        com.amazon.aps.iva.a6.d dVar = this.A;
        dVar.c(fVar);
        this.h.T(fVar);
        boolean k0 = k0();
        int e = dVar.e(h(), k0);
        if (k0 && e != 1) {
            i = 2;
        }
        D1(e, i, k0);
        oVar.a();
    }

    @Override // com.amazon.aps.iva.q5.l0
    @Deprecated
    public final void y() {
        G1();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void y0(int i, long j, ImmutableList immutableList) {
        G1();
        ArrayList k1 = k1(immutableList);
        G1();
        y1(k1, i, j, false);
    }

    public final void y1(List<com.amazon.aps.iva.o6.v> list, int i, long j, boolean z) {
        long j2;
        int i2;
        int i3;
        k1 g;
        boolean z2;
        int i4 = i;
        int o1 = o1(this.l0);
        long a2 = a();
        this.G++;
        ArrayList arrayList = this.o;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i5 = size - 1; i5 >= 0; i5--) {
                arrayList.remove(i5);
            }
            this.K = this.K.b(0, size);
        }
        ArrayList e1 = e1(0, list);
        n1 n1Var = new n1(arrayList, this.K);
        boolean r = n1Var.r();
        int i6 = n1Var.k;
        if (!r && i4 >= i6) {
            throw new com.amazon.aps.iva.q5.y();
        }
        if (z) {
            i4 = n1Var.b(this.F);
            j2 = -9223372036854775807L;
        } else if (i4 == -1) {
            i2 = o1;
            j2 = a2;
            k1 r1 = r1(this.l0, n1Var, s1(n1Var, i2, j2));
            i3 = r1.e;
            if (i2 != -1 && i3 != 1) {
                i3 = (!n1Var.r() || i2 >= i6) ? 4 : 2;
            }
            g = r1.g(i3);
            long Q = com.amazon.aps.iva.t5.g0.Q(j2);
            com.amazon.aps.iva.o6.j0 j0Var = this.K;
            q0 q0Var = this.k;
            q0Var.getClass();
            q0Var.i.d(17, new q0.a(e1, j0Var, i2, Q)).a();
            if (this.l0.b.a.equals(g.b.a) && !this.l0.a.r()) {
                z2 = true;
            } else {
                z2 = false;
            }
            E1(g, 0, 1, z2, 4, n1(g), -1, false);
        } else {
            j2 = j;
        }
        i2 = i4;
        k1 r12 = r1(this.l0, n1Var, s1(n1Var, i2, j2));
        i3 = r12.e;
        if (i2 != -1) {
            if (n1Var.r()) {
            }
        }
        g = r12.g(i3);
        long Q2 = com.amazon.aps.iva.t5.g0.Q(j2);
        com.amazon.aps.iva.o6.j0 j0Var2 = this.K;
        q0 q0Var2 = this.k;
        q0Var2.getClass();
        q0Var2.i.d(17, new q0.a(e1, j0Var2, i2, Q2)).a();
        if (this.l0.b.a.equals(g.b.a)) {
        }
        z2 = false;
        E1(g, 0, 1, z2, 4, n1(g), -1, false);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void z(ImmutableList immutableList) {
        G1();
        ArrayList k1 = k1(immutableList);
        G1();
        y1(k1, -1, -9223372036854775807L, true);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final int z0() {
        G1();
        if (o()) {
            return this.l0.b.c;
        }
        return -1;
    }

    public final void z1(SurfaceHolder surfaceHolder) {
        this.V = false;
        this.T = surfaceHolder;
        surfaceHolder.addCallback(this.x);
        Surface surface = this.T.getSurface();
        if (surface != null && surface.isValid()) {
            Rect surfaceFrame = this.T.getSurfaceFrame();
            t1(surfaceFrame.width(), surfaceFrame.height());
            return;
        }
        t1(0, 0);
    }

    /* compiled from: ExoPlayerImpl.java */
    /* loaded from: classes.dex */
    public final class b implements com.amazon.aps.iva.v6.m, com.amazon.aps.iva.c6.j, com.amazon.aps.iva.r6.c, com.amazon.aps.iva.l6.b, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, j.b, d.b, b.InterfaceC0104b, m.a {
        public b() {
        }

        @Override // com.amazon.aps.iva.c6.j
        public final void A(int i, long j, long j2) {
            m0.this.r.A(i, j, j2);
        }

        @Override // com.amazon.aps.iva.v6.m
        public final void B(com.amazon.aps.iva.q5.y0 y0Var) {
            m0 m0Var = m0.this;
            m0Var.j0 = y0Var;
            m0Var.l.e(25, new n0(y0Var));
        }

        @Override // com.amazon.aps.iva.w6.j.b
        public final void a(Surface surface) {
            m0.this.A1(surface);
        }

        @Override // com.amazon.aps.iva.w6.j.b
        public final void b() {
            m0.this.A1(null);
        }

        @Override // com.amazon.aps.iva.v6.m
        public final void c(String str) {
            m0.this.r.c(str);
        }

        @Override // com.amazon.aps.iva.c6.j
        public final void d(String str) {
            m0.this.r.d(str);
        }

        @Override // com.amazon.aps.iva.r6.c
        public final void e(ImmutableList immutableList) {
            m0.this.l.e(27, new com.amazon.aps.iva.g1.o(immutableList, 3));
        }

        @Override // com.amazon.aps.iva.a6.m.a
        public final void f() {
            m0.this.F1();
        }

        @Override // com.amazon.aps.iva.r6.c
        public final void g(com.amazon.aps.iva.s5.b bVar) {
            m0 m0Var = m0.this;
            m0Var.e0 = bVar;
            m0Var.l.e(27, new com.amazon.aps.iva.n4.f0(bVar, 1));
        }

        @Override // com.amazon.aps.iva.c6.j
        public final void h(boolean z) {
            m0 m0Var = m0.this;
            if (m0Var.d0 == z) {
                return;
            }
            m0Var.d0 = z;
            m0Var.l.e(23, new o0(z));
        }

        @Override // com.amazon.aps.iva.c6.j
        public final void i(Exception exc) {
            m0.this.r.i(exc);
        }

        @Override // com.amazon.aps.iva.c6.j
        public final void j(long j) {
            m0.this.r.j(j);
        }

        @Override // com.amazon.aps.iva.c6.j
        public final void k(com.amazon.aps.iva.q5.v vVar, g gVar) {
            m0 m0Var = m0.this;
            m0Var.getClass();
            m0Var.r.k(vVar, gVar);
        }

        @Override // com.amazon.aps.iva.v6.m
        public final void l(Exception exc) {
            m0.this.r.l(exc);
        }

        @Override // com.amazon.aps.iva.v6.m
        public final void m(long j, Object obj) {
            m0 m0Var = m0.this;
            m0Var.r.m(j, obj);
            if (m0Var.R == obj) {
                m0Var.l.e(26, new com.amazon.aps.iva.q5.b(5));
            }
        }

        @Override // com.amazon.aps.iva.c6.j
        public final void n(f fVar) {
            m0 m0Var = m0.this;
            m0Var.getClass();
            m0Var.r.n(fVar);
        }

        @Override // com.amazon.aps.iva.c6.j
        public final void o(long j, long j2, String str) {
            m0.this.r.o(j, j2, str);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            m0 m0Var = m0.this;
            m0Var.getClass();
            Surface surface = new Surface(surfaceTexture);
            m0Var.A1(surface);
            m0Var.S = surface;
            m0Var.t1(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            m0 m0Var = m0.this;
            m0Var.A1(null);
            m0Var.t1(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            m0.this.t1(i, i2);
        }

        @Override // com.amazon.aps.iva.v6.m
        public final void q(int i, long j) {
            m0.this.r.q(i, j);
        }

        @Override // com.amazon.aps.iva.v6.m
        public final void r(f fVar) {
            m0 m0Var = m0.this;
            m0Var.r.r(fVar);
            m0Var.P = null;
        }

        @Override // com.amazon.aps.iva.v6.m
        public final void s(f fVar) {
            m0 m0Var = m0.this;
            m0Var.getClass();
            m0Var.r.s(fVar);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            m0.this.t1(i2, i3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            m0 m0Var = m0.this;
            if (m0Var.V) {
                m0Var.A1(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            m0 m0Var = m0.this;
            if (m0Var.V) {
                m0Var.A1(null);
            }
            m0Var.t1(0, 0);
        }

        @Override // com.amazon.aps.iva.l6.b
        public final void t(com.amazon.aps.iva.q5.f0 f0Var) {
            m0 m0Var = m0.this;
            com.amazon.aps.iva.q5.d0 d0Var = m0Var.k0;
            d0Var.getClass();
            d0.a aVar = new d0.a(d0Var);
            int i = 0;
            while (true) {
                f0.b[] bVarArr = f0Var.b;
                if (i >= bVarArr.length) {
                    break;
                }
                bVarArr[i].y(aVar);
                i++;
            }
            m0Var.k0 = new com.amazon.aps.iva.q5.d0(aVar);
            com.amazon.aps.iva.q5.d0 h1 = m0Var.h1();
            boolean equals = h1.equals(m0Var.N);
            com.amazon.aps.iva.t5.o<l0.c> oVar = m0Var.l;
            if (!equals) {
                m0Var.N = h1;
                oVar.b(14, new com.amazon.aps.iva.g1.p(this, 1));
            }
            oVar.b(28, new com.amazon.aps.iva.g1.q(f0Var, 2));
            oVar.a();
        }

        @Override // com.amazon.aps.iva.v6.m
        public final void u(int i, long j) {
            m0.this.r.u(i, j);
        }

        @Override // com.amazon.aps.iva.c6.j
        public final void v(f fVar) {
            m0.this.r.v(fVar);
        }

        @Override // com.amazon.aps.iva.v6.m
        public final void x(com.amazon.aps.iva.q5.v vVar, g gVar) {
            m0 m0Var = m0.this;
            m0Var.P = vVar;
            m0Var.r.x(vVar, gVar);
        }

        @Override // com.amazon.aps.iva.c6.j
        public final void y(Exception exc) {
            m0.this.r.y(exc);
        }

        @Override // com.amazon.aps.iva.v6.m
        public final void z(long j, long j2, String str) {
            m0.this.r.z(j, j2, str);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }
}
