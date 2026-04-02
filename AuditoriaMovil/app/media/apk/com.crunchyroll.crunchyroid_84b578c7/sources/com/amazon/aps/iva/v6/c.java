package com.amazon.aps.iva.v6;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import com.amazon.aps.iva.a6.i0;
import com.amazon.aps.iva.a6.i1;
import com.amazon.aps.iva.a6.p1;
import com.amazon.aps.iva.a6.q1;
import com.amazon.aps.iva.k.t;
import com.amazon.aps.iva.k6.l;
import com.amazon.aps.iva.k6.n;
import com.amazon.aps.iva.k6.o;
import com.amazon.aps.iva.k6.q;
import com.amazon.aps.iva.k6.r;
import com.amazon.aps.iva.k6.s;
import com.amazon.aps.iva.o6.h0;
import com.amazon.aps.iva.q5.s;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.q5.y0;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.t5.p;
import com.amazon.aps.iva.t5.x;
import com.amazon.aps.iva.v6.h;
import com.amazon.aps.iva.v6.m;
import com.amazon.aps.iva.x2.u;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.common.Scopes;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
/* compiled from: MediaCodecVideoRenderer.java */
/* loaded from: classes.dex */
public final class c extends o {
    public static final int[] I1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean J1;
    public static boolean K1;
    public int A1;
    public long B1;
    public y0 C1;
    public y0 D1;
    public boolean E1;
    public int F1;
    public C0786c G1;
    public g H1;
    public final Context a1;
    public final h b1;
    public final m.a c1;
    public final d d1;
    public final long e1;
    public final int f1;
    public final boolean g1;
    public b h1;
    public boolean i1;
    public boolean j1;
    public Surface k1;
    public com.amazon.aps.iva.v6.d l1;
    public boolean m1;
    public int n1;
    public boolean o1;
    public boolean p1;
    public boolean q1;
    public long r1;
    public long s1;
    public long t1;
    public int u1;
    public int v1;
    public int w1;
    public long x1;
    public long y1;
    public long z1;

    /* compiled from: MediaCodecVideoRenderer.java */
    /* loaded from: classes.dex */
    public static final class a {
        public static boolean a(Context context) {
            Display display;
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                display = displayManager.getDisplay(0);
            } else {
                display = null;
            }
            if (display == null || !display.isHdr()) {
                return false;
            }
            for (int i : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i == 1) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: MediaCodecVideoRenderer.java */
    /* loaded from: classes.dex */
    public static final class b {
        public final int a;
        public final int b;
        public final int c;

        public b(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    /* compiled from: MediaCodecVideoRenderer.java */
    /* renamed from: com.amazon.aps.iva.v6.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0786c implements l.c, Handler.Callback {
        public final Handler b;

        public C0786c(com.amazon.aps.iva.k6.l lVar) {
            Handler m = g0.m(this);
            this.b = m;
            lVar.b(this, m);
        }

        public final void a(long j) {
            c cVar = c.this;
            if (this == cVar.G1 && cVar.K != null) {
                if (j == Long.MAX_VALUE) {
                    cVar.T0 = true;
                    return;
                }
                try {
                    cVar.B0(j);
                    cVar.K0(cVar.C1);
                    cVar.V0.e++;
                    cVar.J0();
                    cVar.j0(j);
                } catch (com.amazon.aps.iva.a6.l e) {
                    cVar.U0 = e;
                }
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            int i = message.arg1;
            int i2 = message.arg2;
            int i3 = g0.a;
            a(((i & 4294967295L) << 32) | (4294967295L & i2));
            return true;
        }
    }

    /* compiled from: MediaCodecVideoRenderer.java */
    /* loaded from: classes.dex */
    public static final class d {
        public final h a;
        public final c b;
        public Handler e;
        public CopyOnWriteArrayList<s> f;
        public Pair<Long, v> g;
        public Pair<Surface, x> h;
        public boolean k;
        public boolean l;
        public final ArrayDeque<Long> c = new ArrayDeque<>();
        public final ArrayDeque<Pair<Long, v>> d = new ArrayDeque<>();
        public int i = -1;
        public boolean j = true;
        public final y0 m = y0.f;
        public long n = -9223372036854775807L;
        public long o = -9223372036854775807L;

        /* compiled from: MediaCodecVideoRenderer.java */
        /* loaded from: classes.dex */
        public static final class a {
            public static Constructor<?> a;
            public static Method b;
            public static Method c;
            public static Constructor<?> d;
            public static Method e;

            public static void a() throws Exception {
                if (a == null || b == null || c == null) {
                    Class<?> cls = Class.forName("androidx.media3.effect.ScaleAndRotateTransformation$Builder");
                    a = cls.getConstructor(new Class[0]);
                    b = cls.getMethod("setRotationDegrees", Float.TYPE);
                    c = cls.getMethod("build", new Class[0]);
                }
                if (d == null || e == null) {
                    Class<?> cls2 = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    d = cls2.getConstructor(new Class[0]);
                    e = cls2.getMethod("build", new Class[0]);
                }
            }
        }

        public d(h hVar, c cVar) {
            this.a = hVar;
            this.b = cVar;
        }

        public final void a() {
            com.amazon.aps.iva.cq.b.D(null);
            throw null;
        }

        public final boolean b() {
            return false;
        }

        public final boolean c(v vVar, long j, boolean z) {
            com.amazon.aps.iva.cq.b.D(null);
            boolean z2 = false;
            if (this.i != -1) {
                z2 = true;
            }
            com.amazon.aps.iva.cq.b.C(z2);
            throw null;
        }

        public final void d(long j) {
            com.amazon.aps.iva.cq.b.D(null);
            throw null;
        }

        public final void e(long j, long j2) {
            boolean z;
            boolean z2;
            com.amazon.aps.iva.cq.b.D(null);
            while (true) {
                ArrayDeque<Long> arrayDeque = this.c;
                if (!arrayDeque.isEmpty()) {
                    c cVar = this.b;
                    if (cVar.h == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Long peek = arrayDeque.peek();
                    peek.getClass();
                    long longValue = peek.longValue();
                    long j3 = longValue + this.o;
                    long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
                    long j4 = (long) ((j3 - j) / cVar.I);
                    if (z) {
                        j4 -= elapsedRealtime - j2;
                    }
                    if (cVar.P0(j, j4)) {
                        d(-1L);
                        return;
                    } else if (z && j != cVar.r1 && j4 <= 50000) {
                        h hVar = this.a;
                        hVar.c(j3);
                        long a2 = hVar.a((j4 * 1000) + System.nanoTime());
                        cVar.getClass();
                        if ((a2 - System.nanoTime()) / 1000 < -30000) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            d(-2L);
                        } else {
                            ArrayDeque<Pair<Long, v>> arrayDeque2 = this.d;
                            if (!arrayDeque2.isEmpty() && j3 > ((Long) arrayDeque2.peek().first).longValue()) {
                                this.g = arrayDeque2.remove();
                            }
                            this.b.L0(longValue, a2, (v) this.g.second);
                            if (this.n >= j3) {
                                this.n = -9223372036854775807L;
                                cVar.K0(this.m);
                            }
                            d(a2);
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }

        public final void f() {
            throw null;
        }

        public final void g(v vVar) {
            throw null;
        }

        public final void h(Surface surface, x xVar) {
            Pair<Surface, x> pair = this.h;
            if (pair != null && ((Surface) pair.first).equals(surface) && ((x) this.h.second).equals(xVar)) {
                return;
            }
            this.h = Pair.create(surface, xVar);
            if (!b()) {
                return;
            }
            throw null;
        }
    }

    public c(Context context, com.amazon.aps.iva.k6.j jVar, q qVar, Handler handler, m mVar) {
        super(2, jVar, qVar, 30.0f);
        this.e1 = 5000L;
        this.f1 = 50;
        Context applicationContext = context.getApplicationContext();
        this.a1 = applicationContext;
        h hVar = new h(applicationContext);
        this.b1 = hVar;
        this.c1 = new m.a(handler, mVar);
        this.d1 = new d(hVar, this);
        this.g1 = "NVIDIA".equals(g0.c);
        this.s1 = -9223372036854775807L;
        this.n1 = 1;
        this.C1 = y0.f;
        this.F1 = 0;
        this.D1 = null;
    }

    public static boolean D0(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (c.class) {
            if (!J1) {
                K1 = E0();
                J1 = true;
            }
        }
        return K1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:621:0x0844, code lost:
        if (r0.equals("PGN528") == false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean E0() {
        /*
            Method dump skipped, instructions count: 3182
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.v6.c.E0():boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0070, code lost:
        if (r4.equals("video/hevc") == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int F0(com.amazon.aps.iva.q5.v r10, com.amazon.aps.iva.k6.n r11) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.v6.c.F0(com.amazon.aps.iva.q5.v, com.amazon.aps.iva.k6.n):int");
    }

    public static List<n> G0(Context context, q qVar, v vVar, boolean z, boolean z2) throws s.b {
        List<n> a2;
        List<n> a3;
        String str = vVar.m;
        if (str == null) {
            return ImmutableList.of();
        }
        if (g0.a >= 26 && "video/dolby-vision".equals(str) && !a.a(context)) {
            String b2 = com.amazon.aps.iva.k6.s.b(vVar);
            if (b2 == null) {
                a3 = ImmutableList.of();
            } else {
                a3 = qVar.a(b2, z, z2);
            }
            if (!a3.isEmpty()) {
                return a3;
            }
        }
        Pattern pattern = com.amazon.aps.iva.k6.s.a;
        List<n> a4 = qVar.a(vVar.m, z, z2);
        String b3 = com.amazon.aps.iva.k6.s.b(vVar);
        if (b3 == null) {
            a2 = ImmutableList.of();
        } else {
            a2 = qVar.a(b3, z, z2);
        }
        return ImmutableList.builder().addAll((Iterable) a4).addAll((Iterable) a2).build();
    }

    public static int H0(v vVar, n nVar) {
        if (vVar.n != -1) {
            List<byte[]> list = vVar.o;
            int size = list.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                i += list.get(i2).length;
            }
            return vVar.n + i;
        }
        return F0(vVar, nVar);
    }

    @Override // com.amazon.aps.iva.k6.o, com.amazon.aps.iva.a6.e
    public final void C() {
        m.a aVar = this.c1;
        this.D1 = null;
        C0();
        this.m1 = false;
        this.G1 = null;
        try {
            super.C();
            com.amazon.aps.iva.a6.f fVar = this.V0;
            aVar.getClass();
            synchronized (fVar) {
            }
            Handler handler = aVar.a;
            if (handler != null) {
                handler.post(new i1(3, aVar, fVar));
            }
            aVar.a(y0.f);
        } catch (Throwable th) {
            com.amazon.aps.iva.a6.f fVar2 = this.V0;
            aVar.getClass();
            synchronized (fVar2) {
                Handler handler2 = aVar.a;
                if (handler2 != null) {
                    handler2.post(new i1(3, aVar, fVar2));
                }
                aVar.a(y0.f);
                throw th;
            }
        }
    }

    public final void C0() {
        com.amazon.aps.iva.k6.l lVar;
        this.o1 = false;
        if (g0.a >= 23 && this.E1 && (lVar = this.K) != null) {
            this.G1 = new C0786c(lVar);
        }
    }

    @Override // com.amazon.aps.iva.a6.e
    public final void D(boolean z, boolean z2) throws com.amazon.aps.iva.a6.l {
        boolean z3;
        this.V0 = new com.amazon.aps.iva.a6.f();
        q1 q1Var = this.e;
        q1Var.getClass();
        boolean z4 = q1Var.a;
        if (z4 && this.F1 == 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        com.amazon.aps.iva.cq.b.C(z3);
        if (this.E1 != z4) {
            this.E1 = z4;
            q0();
        }
        com.amazon.aps.iva.a6.f fVar = this.V0;
        m.a aVar = this.c1;
        Handler handler = aVar.a;
        if (handler != null) {
            handler.post(new u(5, aVar, fVar));
        }
        this.p1 = z2;
        this.q1 = false;
    }

    @Override // com.amazon.aps.iva.k6.o, com.amazon.aps.iva.a6.e
    public final void E(long j, boolean z) throws com.amazon.aps.iva.a6.l {
        super.E(j, z);
        d dVar = this.d1;
        if (dVar.b()) {
            dVar.a();
        }
        C0();
        h hVar = this.b1;
        hVar.m = 0L;
        hVar.p = -1L;
        hVar.n = -1L;
        long j2 = -9223372036854775807L;
        this.x1 = -9223372036854775807L;
        this.r1 = -9223372036854775807L;
        this.v1 = 0;
        if (z) {
            long j3 = this.e1;
            if (j3 > 0) {
                j2 = SystemClock.elapsedRealtime() + j3;
            }
            this.s1 = j2;
            return;
        }
        this.s1 = -9223372036854775807L;
    }

    @Override // com.amazon.aps.iva.a6.e
    @TargetApi(17)
    public final void G() {
        d dVar = this.d1;
        try {
            O();
            q0();
            com.amazon.aps.iva.g6.d.g(this.E, null);
            this.E = null;
        } finally {
            if (dVar.b()) {
                dVar.f();
            }
            com.amazon.aps.iva.v6.d dVar2 = this.l1;
            if (dVar2 != null) {
                if (this.k1 == dVar2) {
                    this.k1 = null;
                }
                dVar2.release();
                this.l1 = null;
            }
        }
    }

    @Override // com.amazon.aps.iva.a6.e
    public final void H() {
        this.u1 = 0;
        this.t1 = SystemClock.elapsedRealtime();
        this.y1 = SystemClock.elapsedRealtime() * 1000;
        this.z1 = 0L;
        this.A1 = 0;
        h hVar = this.b1;
        hVar.d = true;
        hVar.m = 0L;
        hVar.p = -1L;
        hVar.n = -1L;
        h.b bVar = hVar.b;
        if (bVar != null) {
            h.e eVar = hVar.c;
            eVar.getClass();
            eVar.c.sendEmptyMessage(1);
            bVar.a(new i0(hVar, 2));
        }
        hVar.e(false);
    }

    @Override // com.amazon.aps.iva.a6.e
    public final void I() {
        this.s1 = -9223372036854775807L;
        I0();
        final int i = this.A1;
        if (i != 0) {
            final long j = this.z1;
            final m.a aVar = this.c1;
            Handler handler = aVar.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.amazon.aps.iva.v6.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        m.a aVar2 = aVar;
                        aVar2.getClass();
                        int i2 = g0.a;
                        aVar2.b.q(i, j);
                    }
                });
            }
            this.z1 = 0L;
            this.A1 = 0;
        }
        h hVar = this.b1;
        hVar.d = false;
        h.b bVar = hVar.b;
        if (bVar != null) {
            bVar.unregister();
            h.e eVar = hVar.c;
            eVar.getClass();
            eVar.c.sendEmptyMessage(2);
        }
        hVar.b();
    }

    public final void I0() {
        if (this.u1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            final long j = elapsedRealtime - this.t1;
            final int i = this.u1;
            final m.a aVar = this.c1;
            Handler handler = aVar.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.amazon.aps.iva.v6.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        m.a aVar2 = aVar;
                        aVar2.getClass();
                        int i2 = g0.a;
                        aVar2.b.u(i, j);
                    }
                });
            }
            this.u1 = 0;
            this.t1 = elapsedRealtime;
        }
    }

    public final void J0() {
        this.q1 = true;
        if (!this.o1) {
            this.o1 = true;
            Surface surface = this.k1;
            m.a aVar = this.c1;
            Handler handler = aVar.a;
            if (handler != null) {
                handler.post(new j(aVar, surface, SystemClock.elapsedRealtime()));
            }
            this.m1 = true;
        }
    }

    public final void K0(y0 y0Var) {
        if (!y0Var.equals(y0.f) && !y0Var.equals(this.D1)) {
            this.D1 = y0Var;
            this.c1.a(y0Var);
        }
    }

    public final void L0(long j, long j2, v vVar) {
        g gVar = this.H1;
        if (gVar != null) {
            gVar.c(j, j2, vVar, this.M);
        }
    }

    @Override // com.amazon.aps.iva.k6.o
    public final com.amazon.aps.iva.a6.g M(n nVar, v vVar, v vVar2) {
        int i;
        com.amazon.aps.iva.a6.g b2 = nVar.b(vVar, vVar2);
        b bVar = this.h1;
        int i2 = bVar.a;
        int i3 = vVar2.r;
        int i4 = b2.e;
        if (i3 > i2 || vVar2.s > bVar.b) {
            i4 |= 256;
        }
        if (H0(vVar2, nVar) > this.h1.c) {
            i4 |= 64;
        }
        int i5 = i4;
        String str = nVar.a;
        if (i5 != 0) {
            i = 0;
        } else {
            i = b2.d;
        }
        return new com.amazon.aps.iva.a6.g(str, vVar, vVar2, i, i5);
    }

    public final void M0(com.amazon.aps.iva.k6.l lVar, int i) {
        com.amazon.aps.iva.ab.x.u("releaseOutputBuffer");
        lVar.m(i, true);
        com.amazon.aps.iva.ab.x.I();
        this.V0.e++;
        this.v1 = 0;
        if (!this.d1.b()) {
            this.y1 = SystemClock.elapsedRealtime() * 1000;
            K0(this.C1);
            J0();
        }
    }

    @Override // com.amazon.aps.iva.k6.o
    public final com.amazon.aps.iva.k6.m N(IllegalStateException illegalStateException, n nVar) {
        return new com.amazon.aps.iva.v6.b(illegalStateException, nVar, this.k1);
    }

    public final void N0(com.amazon.aps.iva.k6.l lVar, v vVar, int i, long j, boolean z) {
        long nanoTime;
        boolean z2;
        d dVar = this.d1;
        if (dVar.b()) {
            long j2 = this.W0.b;
            if (dVar.o != -9223372036854775807L) {
                z2 = true;
            } else {
                z2 = false;
            }
            com.amazon.aps.iva.cq.b.C(z2);
            nanoTime = ((j2 + j) - dVar.o) * 1000;
        } else {
            nanoTime = System.nanoTime();
        }
        if (z) {
            L0(j, nanoTime, vVar);
        }
        if (g0.a >= 21) {
            O0(lVar, i, nanoTime);
        } else {
            M0(lVar, i);
        }
    }

    public final void O0(com.amazon.aps.iva.k6.l lVar, int i, long j) {
        com.amazon.aps.iva.ab.x.u("releaseOutputBuffer");
        lVar.i(i, j);
        com.amazon.aps.iva.ab.x.I();
        this.V0.e++;
        this.v1 = 0;
        if (!this.d1.b()) {
            this.y1 = SystemClock.elapsedRealtime() * 1000;
            K0(this.C1);
            J0();
        }
    }

    public final boolean P0(long j, long j2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this.h == 2) {
            z = true;
        } else {
            z = false;
        }
        if (this.q1 ? !this.o1 : !(!z && !this.p1)) {
            z2 = true;
        } else {
            z2 = false;
        }
        long elapsedRealtime = (SystemClock.elapsedRealtime() * 1000) - this.y1;
        if (this.s1 == -9223372036854775807L && j >= this.W0.b) {
            if (z2) {
                return true;
            }
            if (z) {
                if (j2 < -30000) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3 && elapsedRealtime > 100000) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean Q0(n nVar) {
        boolean z;
        if (g0.a < 23 || this.E1 || D0(nVar.a)) {
            return false;
        }
        if (nVar.f) {
            Context context = this.a1;
            int i = com.amazon.aps.iva.v6.d.e;
            synchronized (com.amazon.aps.iva.v6.d.class) {
                if (!com.amazon.aps.iva.v6.d.f) {
                    com.amazon.aps.iva.v6.d.e = com.amazon.aps.iva.v6.d.a(context);
                    com.amazon.aps.iva.v6.d.f = true;
                }
                if (com.amazon.aps.iva.v6.d.e != 0) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final void R0(com.amazon.aps.iva.k6.l lVar, int i) {
        com.amazon.aps.iva.ab.x.u("skipVideoBuffer");
        lVar.m(i, false);
        com.amazon.aps.iva.ab.x.I();
        this.V0.f++;
    }

    public final void S0(int i, int i2) {
        com.amazon.aps.iva.a6.f fVar = this.V0;
        fVar.h += i;
        int i3 = i + i2;
        fVar.g += i3;
        this.u1 += i3;
        int i4 = this.v1 + i3;
        this.v1 = i4;
        fVar.i = Math.max(i4, fVar.i);
        int i5 = this.f1;
        if (i5 > 0 && this.u1 >= i5) {
            I0();
        }
    }

    public final void T0(long j) {
        com.amazon.aps.iva.a6.f fVar = this.V0;
        fVar.k += j;
        fVar.l++;
        this.z1 += j;
        this.A1++;
    }

    @Override // com.amazon.aps.iva.k6.o
    public final boolean V() {
        if (this.E1 && g0.a < 23) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.k6.o
    public final float W(float f, v[] vVarArr) {
        float f2 = -1.0f;
        for (v vVar : vVarArr) {
            float f3 = vVar.t;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    @Override // com.amazon.aps.iva.k6.o
    public final ArrayList X(q qVar, v vVar, boolean z) throws s.b {
        List<n> G0 = G0(this.a1, qVar, vVar, z, this.E1);
        Pattern pattern = com.amazon.aps.iva.k6.s.a;
        ArrayList arrayList = new ArrayList(G0);
        Collections.sort(arrayList, new r(new com.amazon.aps.iva.g1.m(vVar)));
        return arrayList;
    }

    @Override // com.amazon.aps.iva.k6.o
    @TargetApi(17)
    public final l.a Y(n nVar, v vVar, MediaCrypto mediaCrypto, float f) {
        com.amazon.aps.iva.q5.n nVar2;
        String str;
        int i;
        b bVar;
        boolean z;
        int i2;
        int i3;
        Point point;
        float f2;
        int i4;
        int i5;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        com.amazon.aps.iva.q5.n nVar3;
        boolean z2;
        int i6;
        boolean z3;
        Pair<Integer, Integer> d2;
        int F0;
        v vVar2 = vVar;
        com.amazon.aps.iva.v6.d dVar = this.l1;
        if (dVar != null && dVar.b != nVar.f) {
            if (this.k1 == dVar) {
                this.k1 = null;
            }
            dVar.release();
            this.l1 = null;
        }
        String str2 = nVar.c;
        v[] vVarArr = this.j;
        vVarArr.getClass();
        int i7 = vVar2.r;
        int H0 = H0(vVar2, nVar);
        int length = vVarArr.length;
        float f3 = vVar2.t;
        int i8 = vVar2.r;
        com.amazon.aps.iva.q5.n nVar4 = vVar2.y;
        int i9 = vVar2.s;
        if (length == 1) {
            if (H0 != -1 && (F0 = F0(vVar2, nVar)) != -1) {
                H0 = Math.min((int) (H0 * 1.5f), F0);
            }
            bVar = new b(i7, i9, H0);
            str = str2;
            nVar2 = nVar4;
            i = i9;
        } else {
            int length2 = vVarArr.length;
            int i10 = 0;
            boolean z4 = false;
            int i11 = i9;
            while (i10 < length2) {
                int i12 = length2;
                v vVar3 = vVarArr[i10];
                v[] vVarArr2 = vVarArr;
                if (nVar4 != null && vVar3.y == null) {
                    v.a aVar = new v.a(vVar3);
                    aVar.w = nVar4;
                    vVar3 = new v(aVar);
                }
                if (nVar.b(vVar2, vVar3).d != 0) {
                    int i13 = vVar3.s;
                    int i14 = vVar3.r;
                    nVar3 = nVar4;
                    if (i14 != -1 && i13 != -1) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    z4 |= z2;
                    int max = Math.max(i7, i14);
                    i11 = Math.max(i11, i13);
                    i7 = max;
                    H0 = Math.max(H0, H0(vVar3, nVar));
                } else {
                    nVar3 = nVar4;
                }
                i10++;
                length2 = i12;
                vVarArr = vVarArr2;
                nVar4 = nVar3;
            }
            nVar2 = nVar4;
            if (z4) {
                p.g();
                if (i9 > i8) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i2 = i9;
                } else {
                    i2 = i8;
                }
                if (z) {
                    i3 = i8;
                } else {
                    i3 = i9;
                }
                float f4 = i3 / i2;
                int[] iArr = I1;
                int i15 = 0;
                i = i9;
                while (i15 < 9) {
                    int i16 = iArr[i15];
                    int[] iArr2 = iArr;
                    int i17 = (int) (i16 * f4);
                    if (i16 <= i2 || i17 <= i3) {
                        break;
                    }
                    int i18 = i2;
                    int i19 = i3;
                    if (g0.a >= 21) {
                        if (z) {
                            i5 = i17;
                        } else {
                            i5 = i16;
                        }
                        if (!z) {
                            i16 = i17;
                        }
                        MediaCodecInfo.CodecCapabilities codecCapabilities = nVar.d;
                        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                            point = null;
                            f2 = f4;
                        } else {
                            int widthAlignment = videoCapabilities.getWidthAlignment();
                            int heightAlignment = videoCapabilities.getHeightAlignment();
                            f2 = f4;
                            point = new Point((((i5 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i16 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
                        }
                        str = str2;
                        if (nVar.f(point.x, point.y, f3)) {
                            break;
                        }
                        i15++;
                        iArr = iArr2;
                        i2 = i18;
                        i3 = i19;
                        f4 = f2;
                        str2 = str;
                    } else {
                        str = str2;
                        f2 = f4;
                        try {
                            int i20 = (((i16 + 16) - 1) / 16) * 16;
                            int i21 = (((i17 + 16) - 1) / 16) * 16;
                            if (i20 * i21 <= com.amazon.aps.iva.k6.s.i()) {
                                if (z) {
                                    i4 = i21;
                                } else {
                                    i4 = i20;
                                }
                                if (!z) {
                                    i20 = i21;
                                }
                                point = new Point(i4, i20);
                            } else {
                                i15++;
                                iArr = iArr2;
                                i2 = i18;
                                i3 = i19;
                                f4 = f2;
                                str2 = str;
                            }
                        } catch (s.b unused) {
                        }
                    }
                }
                str = str2;
                point = null;
                if (point != null) {
                    i7 = Math.max(i7, point.x);
                    i11 = Math.max(i11, point.y);
                    vVar2 = vVar;
                    v.a aVar2 = new v.a(vVar2);
                    aVar2.p = i7;
                    aVar2.q = i11;
                    H0 = Math.max(H0, F0(new v(aVar2), nVar));
                    p.g();
                } else {
                    vVar2 = vVar;
                }
            } else {
                str = str2;
                i = i9;
            }
            bVar = new b(i7, i11, H0);
        }
        this.h1 = bVar;
        if (this.E1) {
            i6 = this.F1;
        } else {
            i6 = 0;
        }
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i8);
        mediaFormat.setInteger("height", i);
        com.amazon.aps.iva.t5.r.b(mediaFormat, vVar2.o);
        if (f3 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f3);
        }
        com.amazon.aps.iva.t5.r.a(mediaFormat, "rotation-degrees", vVar2.u);
        if (nVar2 != null) {
            com.amazon.aps.iva.q5.n nVar5 = nVar2;
            com.amazon.aps.iva.t5.r.a(mediaFormat, "color-transfer", nVar5.d);
            com.amazon.aps.iva.t5.r.a(mediaFormat, "color-standard", nVar5.b);
            com.amazon.aps.iva.t5.r.a(mediaFormat, "color-range", nVar5.c);
            byte[] bArr = nVar5.e;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(vVar2.m) && (d2 = com.amazon.aps.iva.k6.s.d(vVar)) != null) {
            com.amazon.aps.iva.t5.r.a(mediaFormat, Scopes.PROFILE, ((Integer) d2.first).intValue());
        }
        mediaFormat.setInteger("max-width", bVar.a);
        mediaFormat.setInteger("max-height", bVar.b);
        com.amazon.aps.iva.t5.r.a(mediaFormat, "max-input-size", bVar.c);
        int i22 = g0.a;
        if (i22 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (this.g1) {
            z3 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z3 = true;
        }
        if (i6 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z3);
            mediaFormat.setInteger("audio-session-id", i6);
        }
        if (this.k1 == null) {
            if (Q0(nVar)) {
                if (this.l1 == null) {
                    this.l1 = com.amazon.aps.iva.v6.d.b(this.a1, nVar.f);
                }
                this.k1 = this.l1;
            } else {
                throw new IllegalStateException();
            }
        }
        d dVar2 = this.d1;
        if (dVar2.b() && i22 >= 29 && dVar2.b.a1.getApplicationContext().getApplicationInfo().targetSdkVersion >= 29) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        if (!dVar2.b()) {
            return new l.a(nVar, mediaFormat, vVar, this.k1, mediaCrypto);
        }
        dVar2.getClass();
        throw null;
    }

    @Override // com.amazon.aps.iva.k6.o
    @TargetApi(29)
    public final void Z(com.amazon.aps.iva.z5.f fVar) throws com.amazon.aps.iva.a6.l {
        if (!this.j1) {
            return;
        }
        ByteBuffer byteBuffer = fVar.g;
        byteBuffer.getClass();
        if (byteBuffer.remaining() >= 7) {
            byte b2 = byteBuffer.get();
            short s = byteBuffer.getShort();
            short s2 = byteBuffer.getShort();
            byte b3 = byteBuffer.get();
            byte b4 = byteBuffer.get();
            byteBuffer.position(0);
            if (b2 == -75 && s == 60 && s2 == 1 && b3 == 4) {
                if (b4 == 0 || b4 == 1) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    com.amazon.aps.iva.k6.l lVar = this.K;
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    lVar.h(bundle);
                }
            }
        }
    }

    @Override // com.amazon.aps.iva.a6.e, com.amazon.aps.iva.a6.o1
    public final boolean d() {
        boolean z = this.R0;
        d dVar = this.d1;
        if (dVar.b()) {
            return z & dVar.l;
        }
        return z;
    }

    @Override // com.amazon.aps.iva.k6.o
    public final void d0(Exception exc) {
        p.d("Video codec error", exc);
        m.a aVar = this.c1;
        Handler handler = aVar.a;
        if (handler != null) {
            handler.post(new com.amazon.aps.iva.n4.d(7, aVar, exc));
        }
    }

    @Override // com.amazon.aps.iva.k6.o
    public final void e0(final String str, final long j, final long j2) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        final m.a aVar = this.c1;
        Handler handler = aVar.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.amazon.aps.iva.v6.l
                @Override // java.lang.Runnable
                public final void run() {
                    String str2 = str;
                    long j3 = j;
                    long j4 = j2;
                    m mVar = m.a.this.b;
                    int i = g0.a;
                    mVar.z(j3, j4, str2);
                }
            });
        }
        this.i1 = D0(str);
        n nVar = this.R;
        nVar.getClass();
        boolean z = false;
        int i = 1;
        if (g0.a >= 29 && "video/x-vnd.on2.vp9".equals(nVar.b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = nVar.d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (codecProfileLevelArr[i2].profile == 16384) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
        }
        this.j1 = z;
        int i3 = g0.a;
        if (i3 >= 23 && this.E1) {
            com.amazon.aps.iva.k6.l lVar = this.K;
            lVar.getClass();
            this.G1 = new C0786c(lVar);
        }
        d dVar = this.d1;
        Context context = dVar.b.a1;
        if (i3 >= 29 && context.getApplicationContext().getApplicationInfo().targetSdkVersion >= 29) {
            i = 5;
        }
        dVar.i = i;
    }

    @Override // com.amazon.aps.iva.k6.o
    public final void f0(String str) {
        m.a aVar = this.c1;
        Handler handler = aVar.a;
        if (handler != null) {
            handler.post(new t(4, aVar, str));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r0 != false) goto L12;
     */
    @Override // com.amazon.aps.iva.k6.o, com.amazon.aps.iva.a6.o1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g() {
        /*
            r9 = this;
            boolean r0 = super.g()
            r1 = 1
            r2 = 0
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L42
            com.amazon.aps.iva.v6.c$d r0 = r9.d1
            boolean r5 = r0.b()
            if (r5 == 0) goto L2b
            android.util.Pair<android.view.Surface, com.amazon.aps.iva.t5.x> r0 = r0.h
            if (r0 == 0) goto L28
            java.lang.Object r0 = r0.second
            com.amazon.aps.iva.t5.x r0 = (com.amazon.aps.iva.t5.x) r0
            com.amazon.aps.iva.t5.x r5 = com.amazon.aps.iva.t5.x.c
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L26
            goto L28
        L26:
            r0 = r2
            goto L29
        L28:
            r0 = r1
        L29:
            if (r0 == 0) goto L42
        L2b:
            boolean r0 = r9.o1
            if (r0 != 0) goto L3f
            com.amazon.aps.iva.v6.d r0 = r9.l1
            if (r0 == 0) goto L37
            android.view.Surface r5 = r9.k1
            if (r5 == r0) goto L3f
        L37:
            com.amazon.aps.iva.k6.l r0 = r9.K
            if (r0 == 0) goto L3f
            boolean r0 = r9.E1
            if (r0 == 0) goto L42
        L3f:
            r9.s1 = r3
            return r1
        L42:
            long r5 = r9.s1
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L49
            return r2
        L49:
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r7 = r9.s1
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 >= 0) goto L54
            return r1
        L54:
            r9.s1 = r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.v6.c.g():boolean");
    }

    @Override // com.amazon.aps.iva.k6.o
    public final com.amazon.aps.iva.a6.g g0(com.amazon.aps.iva.u1.g0 g0Var) throws com.amazon.aps.iva.a6.l {
        com.amazon.aps.iva.a6.g g0 = super.g0(g0Var);
        v vVar = (v) g0Var.c;
        m.a aVar = this.c1;
        Handler handler = aVar.a;
        if (handler != null) {
            handler.post(new androidx.fragment.app.c(aVar, 2, vVar, g0));
        }
        return g0;
    }

    @Override // com.amazon.aps.iva.a6.o1, com.amazon.aps.iva.a6.p1
    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0089, code lost:
        if (r4.b() == false) goto L17;
     */
    @Override // com.amazon.aps.iva.k6.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h0(com.amazon.aps.iva.q5.v r11, android.media.MediaFormat r12) {
        /*
            r10 = this;
            com.amazon.aps.iva.k6.l r0 = r10.K
            if (r0 == 0) goto L9
            int r1 = r10.n1
            r0.c(r1)
        L9:
            boolean r0 = r10.E1
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L14
            int r12 = r11.r
            int r0 = r11.s
            goto L64
        L14:
            r12.getClass()
            java.lang.String r0 = "crop-right"
            boolean r3 = r12.containsKey(r0)
            java.lang.String r4 = "crop-top"
            java.lang.String r5 = "crop-bottom"
            java.lang.String r6 = "crop-left"
            if (r3 == 0) goto L39
            boolean r3 = r12.containsKey(r6)
            if (r3 == 0) goto L39
            boolean r3 = r12.containsKey(r5)
            if (r3 == 0) goto L39
            boolean r3 = r12.containsKey(r4)
            if (r3 == 0) goto L39
            r3 = r1
            goto L3a
        L39:
            r3 = r2
        L3a:
            if (r3 == 0) goto L47
            int r0 = r12.getInteger(r0)
            int r6 = r12.getInteger(r6)
            int r0 = r0 - r6
            int r0 = r0 + r1
            goto L4d
        L47:
            java.lang.String r0 = "width"
            int r0 = r12.getInteger(r0)
        L4d:
            if (r3 == 0) goto L5b
            int r3 = r12.getInteger(r5)
            int r12 = r12.getInteger(r4)
            int r3 = r3 - r12
            int r3 = r3 + r1
            r12 = r3
            goto L61
        L5b:
            java.lang.String r3 = "height"
            int r12 = r12.getInteger(r3)
        L61:
            r9 = r0
            r0 = r12
            r12 = r9
        L64:
            float r3 = r11.v
            int r4 = com.amazon.aps.iva.t5.g0.a
            r5 = 21
            if (r4 < r5) goto L6d
            goto L6e
        L6d:
            r1 = r2
        L6e:
            com.amazon.aps.iva.v6.c$d r4 = r10.d1
            int r5 = r11.u
            if (r1 == 0) goto L85
            r1 = 90
            if (r5 == r1) goto L7c
            r1 = 270(0x10e, float:3.78E-43)
            if (r5 != r1) goto L8c
        L7c:
            r1 = 1065353216(0x3f800000, float:1.0)
            float r3 = r1 / r3
            r5 = r2
            r9 = r0
            r0 = r12
            r12 = r9
            goto L8d
        L85:
            boolean r1 = r4.b()
            if (r1 != 0) goto L8c
            goto L8d
        L8c:
            r5 = r2
        L8d:
            com.amazon.aps.iva.q5.y0 r1 = new com.amazon.aps.iva.q5.y0
            r1.<init>(r3, r12, r0, r5)
            r10.C1 = r1
            float r1 = r11.t
            com.amazon.aps.iva.v6.h r6 = r10.b1
            r6.f = r1
            com.amazon.aps.iva.v6.a r1 = r6.a
            com.amazon.aps.iva.v6.a$a r7 = r1.a
            r7.c()
            com.amazon.aps.iva.v6.a$a r7 = r1.b
            r7.c()
            r1.c = r2
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.d = r7
            r1.e = r2
            r6.d()
            boolean r1 = r4.b()
            if (r1 == 0) goto Lcf
            com.amazon.aps.iva.q5.v$a r1 = new com.amazon.aps.iva.q5.v$a
            r1.<init>(r11)
            r1.p = r12
            r1.q = r0
            r1.s = r5
            r1.t = r3
            com.amazon.aps.iva.q5.v r11 = new com.amazon.aps.iva.q5.v
            r11.<init>(r1)
            r4.g(r11)
        Lcf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.v6.c.h0(com.amazon.aps.iva.q5.v, android.media.MediaFormat):void");
    }

    @Override // com.amazon.aps.iva.k6.o
    public final void j0(long j) {
        super.j0(j);
        if (!this.E1) {
            this.w1--;
        }
    }

    @Override // com.amazon.aps.iva.k6.o
    public final void k0() {
        C0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v8, types: [android.view.Surface] */
    @Override // com.amazon.aps.iva.a6.e, com.amazon.aps.iva.a6.l1.b
    public final void l(int i, Object obj) throws com.amazon.aps.iva.a6.l {
        com.amazon.aps.iva.v6.d dVar;
        com.amazon.aps.iva.v6.d dVar2;
        long j;
        Surface surface;
        h hVar = this.b1;
        d dVar3 = this.d1;
        if (i != 1) {
            if (i != 7) {
                if (i != 10) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 13) {
                                if (i == 14) {
                                    obj.getClass();
                                    x xVar = (x) obj;
                                    if (xVar.a != 0 && xVar.b != 0 && (surface = this.k1) != null) {
                                        dVar3.h(surface, xVar);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            obj.getClass();
                            List list = (List) obj;
                            CopyOnWriteArrayList<com.amazon.aps.iva.q5.s> copyOnWriteArrayList = dVar3.f;
                            if (copyOnWriteArrayList == null) {
                                dVar3.f = new CopyOnWriteArrayList<>(list);
                                return;
                            }
                            copyOnWriteArrayList.clear();
                            dVar3.f.addAll(list);
                            return;
                        }
                        int intValue = ((Integer) obj).intValue();
                        if (hVar.j != intValue) {
                            hVar.j = intValue;
                            hVar.e(true);
                            return;
                        }
                        return;
                    }
                    int intValue2 = ((Integer) obj).intValue();
                    this.n1 = intValue2;
                    com.amazon.aps.iva.k6.l lVar = this.K;
                    if (lVar != null) {
                        lVar.c(intValue2);
                        return;
                    }
                    return;
                }
                int intValue3 = ((Integer) obj).intValue();
                if (this.F1 != intValue3) {
                    this.F1 = intValue3;
                    if (this.E1) {
                        q0();
                        return;
                    }
                    return;
                }
                return;
            }
            this.H1 = (g) obj;
            return;
        }
        if (obj instanceof Surface) {
            dVar = (Surface) obj;
        } else {
            dVar = null;
        }
        if (dVar == null) {
            com.amazon.aps.iva.v6.d dVar4 = this.l1;
            if (dVar4 != null) {
                dVar = dVar4;
            } else {
                n nVar = this.R;
                if (nVar != null && Q0(nVar)) {
                    dVar = com.amazon.aps.iva.v6.d.b(this.a1, nVar.f);
                    this.l1 = dVar;
                }
            }
        }
        Surface surface2 = this.k1;
        m.a aVar = this.c1;
        if (surface2 != dVar) {
            this.k1 = dVar;
            hVar.getClass();
            if (dVar instanceof com.amazon.aps.iva.v6.d) {
                dVar2 = null;
            } else {
                dVar2 = dVar;
            }
            if (hVar.e != dVar2) {
                hVar.b();
                hVar.e = dVar2;
                hVar.e(true);
            }
            this.m1 = false;
            int i2 = this.h;
            com.amazon.aps.iva.k6.l lVar2 = this.K;
            if (lVar2 != null && !dVar3.b()) {
                if (g0.a >= 23 && dVar != null && !this.i1) {
                    lVar2.e(dVar);
                } else {
                    q0();
                    b0();
                }
            }
            if (dVar != null && dVar != this.l1) {
                y0 y0Var = this.D1;
                if (y0Var != null) {
                    aVar.a(y0Var);
                }
                C0();
                if (i2 == 2) {
                    long j2 = this.e1;
                    if (j2 > 0) {
                        j = SystemClock.elapsedRealtime() + j2;
                    } else {
                        j = -9223372036854775807L;
                    }
                    this.s1 = j;
                }
                if (dVar3.b()) {
                    dVar3.h(dVar, x.c);
                    return;
                }
                return;
            }
            this.D1 = null;
            C0();
            if (dVar3.b()) {
                dVar3.getClass();
                throw null;
            }
        } else if (dVar != null && dVar != this.l1) {
            y0 y0Var2 = this.D1;
            if (y0Var2 != null) {
                aVar.a(y0Var2);
            }
            if (this.m1) {
                Surface surface3 = this.k1;
                Handler handler = aVar.a;
                if (handler != null) {
                    handler.post(new j(aVar, surface3, SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    @Override // com.amazon.aps.iva.k6.o
    public final void l0(com.amazon.aps.iva.z5.f fVar) throws com.amazon.aps.iva.a6.l {
        boolean z = this.E1;
        if (!z) {
            this.w1++;
        }
        if (g0.a < 23 && z) {
            long j = fVar.f;
            B0(j);
            K0(this.C1);
            this.V0.e++;
            J0();
            j0(j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9  */
    @Override // com.amazon.aps.iva.k6.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m0(com.amazon.aps.iva.q5.v r13) throws com.amazon.aps.iva.a6.l {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.v6.c.m0(com.amazon.aps.iva.q5.v):void");
    }

    @Override // com.amazon.aps.iva.k6.o
    public final boolean o0(long j, long j2, com.amazon.aps.iva.k6.l lVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, v vVar) throws com.amazon.aps.iva.a6.l {
        boolean z3;
        long j4;
        boolean z4;
        boolean z5;
        boolean z6;
        long j5;
        boolean z7;
        boolean z8;
        long j6;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        lVar.getClass();
        if (this.r1 == -9223372036854775807L) {
            this.r1 = j;
        }
        int i4 = (j3 > this.x1 ? 1 : (j3 == this.x1 ? 0 : -1));
        h hVar = this.b1;
        d dVar = this.d1;
        if (i4 != 0) {
            if (!dVar.b()) {
                hVar.c(j3);
            }
            this.x1 = j3;
        }
        long j7 = j3 - this.W0.b;
        if (z && !z2) {
            R0(lVar, i);
            return true;
        }
        if (this.h == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j8 = (long) ((j3 - j) / this.I);
        if (z3) {
            j8 -= elapsedRealtime - j2;
        }
        long j9 = j8;
        if (this.k1 == this.l1) {
            if (j9 < -30000) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                R0(lVar, i);
                T0(j9);
                return true;
            }
            return false;
        } else if (P0(j, j9)) {
            if (dVar.b()) {
                if (!dVar.c(vVar, j7, z2)) {
                    return false;
                }
                z11 = false;
            } else {
                z11 = true;
            }
            N0(lVar, vVar, i, j7, z11);
            T0(j9);
            return true;
        } else if (!z3 || j == this.r1) {
            return false;
        } else {
            long nanoTime = System.nanoTime();
            long a2 = hVar.a((j9 * 1000) + nanoTime);
            if (!dVar.b()) {
                j4 = (a2 - nanoTime) / 1000;
            } else {
                j4 = j9;
            }
            if (this.s1 != -9223372036854775807L) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (j4 < -500000) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5 && !z2) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                h0 h0Var = this.i;
                h0Var.getClass();
                j5 = a2;
                int o = h0Var.o(j - this.k);
                if (o == 0) {
                    z10 = false;
                } else {
                    if (z4) {
                        com.amazon.aps.iva.a6.f fVar = this.V0;
                        fVar.d += o;
                        fVar.f += this.w1;
                    } else {
                        this.V0.j++;
                        S0(o, this.w1);
                    }
                    if (T()) {
                        b0();
                    }
                    if (dVar.b()) {
                        dVar.a();
                    }
                    z10 = true;
                }
                if (z10) {
                    return false;
                }
            } else {
                j5 = a2;
            }
            if (j4 < -30000) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7 && !z2) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8) {
                if (z4) {
                    R0(lVar, i);
                    z9 = true;
                } else {
                    com.amazon.aps.iva.ab.x.u("dropVideoBuffer");
                    lVar.m(i, false);
                    com.amazon.aps.iva.ab.x.I();
                    z9 = true;
                    S0(0, 1);
                }
                T0(j4);
                return z9;
            } else if (dVar.b()) {
                dVar.e(j, j2);
                if (dVar.c(vVar, j7, z2)) {
                    N0(lVar, vVar, i, j7, false);
                    return true;
                }
                return false;
            } else {
                if (g0.a >= 21) {
                    if (j4 < 50000) {
                        if (j5 == this.B1) {
                            R0(lVar, i);
                            j6 = j5;
                        } else {
                            L0(j7, j5, vVar);
                            j6 = j5;
                            O0(lVar, i, j6);
                        }
                        T0(j4);
                        this.B1 = j6;
                        return true;
                    }
                } else {
                    long j10 = j5;
                    if (j4 < NotificationOptions.SKIP_STEP_THIRTY_SECONDS_IN_MS) {
                        if (j4 > 11000) {
                            try {
                                Thread.sleep((j4 - NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS) / 1000);
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                return false;
                            }
                        }
                        L0(j7, j10, vVar);
                        M0(lVar, i);
                        T0(j4);
                        return true;
                    }
                }
                return false;
            }
        }
    }

    @Override // com.amazon.aps.iva.k6.o
    public final void s0() {
        super.s0();
        this.w1 = 0;
    }

    @Override // com.amazon.aps.iva.k6.o, com.amazon.aps.iva.a6.o1
    public final void u(float f, float f2) throws com.amazon.aps.iva.a6.l {
        super.u(f, f2);
        h hVar = this.b1;
        hVar.i = f;
        hVar.m = 0L;
        hVar.p = -1L;
        hVar.n = -1L;
        hVar.e(false);
    }

    @Override // com.amazon.aps.iva.k6.o, com.amazon.aps.iva.a6.o1
    public final void w(long j, long j2) throws com.amazon.aps.iva.a6.l {
        super.w(j, j2);
        d dVar = this.d1;
        if (dVar.b()) {
            dVar.e(j, j2);
        }
    }

    @Override // com.amazon.aps.iva.k6.o
    public final boolean w0(n nVar) {
        if (this.k1 == null && !Q0(nVar)) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.k6.o
    public final int y0(q qVar, v vVar) throws s.b {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (!com.amazon.aps.iva.q5.g0.m(vVar.m)) {
            return p1.s(0, 0, 0);
        }
        if (vVar.p != null) {
            z = true;
        } else {
            z = false;
        }
        Context context = this.a1;
        List<n> G0 = G0(context, qVar, vVar, z, false);
        if (z && G0.isEmpty()) {
            G0 = G0(context, qVar, vVar, false, false);
        }
        if (G0.isEmpty()) {
            return p1.s(1, 0, 0);
        }
        int i6 = vVar.H;
        if (i6 != 0 && i6 != 2) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            return p1.s(2, 0, 0);
        }
        n nVar = G0.get(0);
        boolean d2 = nVar.d(vVar);
        if (!d2) {
            for (int i7 = 1; i7 < G0.size(); i7++) {
                n nVar2 = G0.get(i7);
                if (nVar2.d(vVar)) {
                    z3 = false;
                    d2 = true;
                    nVar = nVar2;
                    break;
                }
            }
        }
        z3 = true;
        if (d2) {
            i = 4;
        } else {
            i = 3;
        }
        if (nVar.e(vVar)) {
            i2 = 16;
        } else {
            i2 = 8;
        }
        if (nVar.g) {
            i3 = 64;
        } else {
            i3 = 0;
        }
        if (z3) {
            i4 = 128;
        } else {
            i4 = 0;
        }
        if (g0.a >= 26 && "video/dolby-vision".equals(vVar.m) && !a.a(context)) {
            i4 = 256;
        }
        if (d2) {
            List<n> G02 = G0(context, qVar, vVar, z, true);
            if (!G02.isEmpty()) {
                Pattern pattern = com.amazon.aps.iva.k6.s.a;
                ArrayList arrayList = new ArrayList(G02);
                Collections.sort(arrayList, new r(new com.amazon.aps.iva.g1.m(vVar)));
                n nVar3 = (n) arrayList.get(0);
                if (nVar3.d(vVar) && nVar3.e(vVar)) {
                    i5 = 32;
                }
            }
        }
        return i | i2 | i5 | i3 | i4;
    }
}
