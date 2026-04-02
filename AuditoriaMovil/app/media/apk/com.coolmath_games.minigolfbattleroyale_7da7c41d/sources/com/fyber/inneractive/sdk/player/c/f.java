package com.fyber.inneractive.sdk.player.c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.fyber.inneractive.sdk.player.c.e;
import com.fyber.inneractive.sdk.player.c.g;
import com.fyber.inneractive.sdk.player.c.k.t;
import com.fyber.inneractive.sdk.player.c.q;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
/* loaded from: classes.dex */
public final class f implements e {
    final com.fyber.inneractive.sdk.player.c.i.g a;
    final CopyOnWriteArraySet<e.a> b;
    boolean c;
    boolean d;
    int e;
    int f;
    int g;
    boolean h;
    q i;
    Object j;
    com.fyber.inneractive.sdk.player.c.g.i k;
    com.fyber.inneractive.sdk.player.c.i.f l;
    m m;
    g.b n;
    private final n[] o;
    private final com.fyber.inneractive.sdk.player.c.i.f p;
    private final Handler q;
    private final g r;
    private final q.b s;
    private final q.a t;
    private int u;
    private int v;
    private long w;

    public f(n[] nVarArr, com.fyber.inneractive.sdk.player.c.i.g gVar, k kVar) {
        Log.i("ExoPlayerImpl", "Init ExoPlayerLib/2.4.4 [" + t.e + "]");
        com.fyber.inneractive.sdk.player.c.k.a.b(nVarArr.length > 0);
        this.o = (n[]) com.fyber.inneractive.sdk.player.c.k.a.a(nVarArr);
        this.a = (com.fyber.inneractive.sdk.player.c.i.g) com.fyber.inneractive.sdk.player.c.k.a.a(gVar);
        this.d = false;
        this.e = 1;
        this.b = new CopyOnWriteArraySet<>();
        this.p = new com.fyber.inneractive.sdk.player.c.i.f(new com.fyber.inneractive.sdk.player.c.i.e[nVarArr.length]);
        this.i = q.a;
        this.s = new q.b();
        this.t = new q.a();
        this.k = com.fyber.inneractive.sdk.player.c.g.i.a;
        this.l = this.p;
        this.m = m.a;
        this.q = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()) { // from class: com.fyber.inneractive.sdk.player.c.f.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                f fVar = f.this;
                switch (message.what) {
                    case 0:
                        fVar.g--;
                        return;
                    case 1:
                        fVar.e = message.arg1;
                        Iterator<e.a> it = fVar.b.iterator();
                        while (it.hasNext()) {
                            it.next().a(fVar.d, fVar.e);
                        }
                        return;
                    case 2:
                        fVar.h = message.arg1 != 0;
                        Iterator<e.a> it2 = fVar.b.iterator();
                        while (it2.hasNext()) {
                            it2.next();
                        }
                        return;
                    case 3:
                        if (fVar.g == 0) {
                            com.fyber.inneractive.sdk.player.c.i.h hVar = (com.fyber.inneractive.sdk.player.c.i.h) message.obj;
                            fVar.c = true;
                            fVar.k = hVar.a;
                            fVar.l = hVar.b;
                            fVar.a.a(hVar.c);
                            Iterator<e.a> it3 = fVar.b.iterator();
                            while (it3.hasNext()) {
                                it3.next();
                            }
                            return;
                        }
                        return;
                    case 4:
                        int i = fVar.f - 1;
                        fVar.f = i;
                        if (i == 0) {
                            fVar.n = (g.b) message.obj;
                            if (message.arg1 != 0) {
                                Iterator<e.a> it4 = fVar.b.iterator();
                                while (it4.hasNext()) {
                                    it4.next();
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        if (fVar.f == 0) {
                            fVar.n = (g.b) message.obj;
                            Iterator<e.a> it5 = fVar.b.iterator();
                            while (it5.hasNext()) {
                                it5.next();
                            }
                            return;
                        }
                        return;
                    case 6:
                        g.d dVar = (g.d) message.obj;
                        fVar.f -= dVar.d;
                        if (fVar.g == 0) {
                            fVar.i = dVar.a;
                            fVar.j = dVar.b;
                            fVar.n = dVar.c;
                            Iterator<e.a> it6 = fVar.b.iterator();
                            while (it6.hasNext()) {
                                it6.next();
                            }
                            return;
                        }
                        return;
                    case 7:
                        m mVar = (m) message.obj;
                        if (fVar.m.equals(mVar)) {
                            return;
                        }
                        fVar.m = mVar;
                        Iterator<e.a> it7 = fVar.b.iterator();
                        while (it7.hasNext()) {
                            it7.next();
                        }
                        return;
                    case 8:
                        d dVar2 = (d) message.obj;
                        Iterator<e.a> it8 = fVar.b.iterator();
                        while (it8.hasNext()) {
                            it8.next().a(dVar2);
                        }
                        return;
                    default:
                        throw new IllegalStateException();
                }
            }
        };
        this.n = new g.b(0, 0L);
        this.r = new g(nVarArr, gVar, kVar, this.d, this.q, this.n, this);
    }

    @Override // com.fyber.inneractive.sdk.player.c.e
    public final void a(e.a aVar) {
        this.b.add(aVar);
    }

    @Override // com.fyber.inneractive.sdk.player.c.e
    public final void a(boolean z) {
        if (this.d != z) {
            this.d = z;
            this.r.a.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
            Iterator<e.a> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().a(z, this.e);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.c.e
    public final void a() {
        a(g(), -9223372036854775807L);
    }

    @Override // com.fyber.inneractive.sdk.player.c.e
    public final void a(long j) {
        a(g(), j);
    }

    private void a(int i, long j) {
        if (i < 0 || (!this.i.a() && i >= this.i.b())) {
            throw new j(this.i, i, j);
        }
        this.f++;
        this.u = i;
        if (this.i.a()) {
            this.v = 0;
        } else {
            this.i.a(i, this.s, 0L);
            long j2 = j == -9223372036854775807L ? this.s.h : j;
            int i2 = this.s.f;
            long b = this.s.j + b.b(j2);
            long j3 = this.i.a(i2, this.t, false).d;
            while (j3 != -9223372036854775807L && b >= j3 && i2 < this.s.g) {
                b -= j3;
                i2++;
                j3 = this.i.a(i2, this.t, false).d;
            }
            this.v = i2;
        }
        if (j == -9223372036854775807L) {
            this.w = 0L;
            this.r.a(this.i, i, -9223372036854775807L);
            return;
        }
        this.w = j;
        this.r.a(this.i, i, b.b(j));
        Iterator<e.a> it = this.b.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.c.e
    public final void b() {
        this.r.a.sendEmptyMessage(5);
    }

    @Override // com.fyber.inneractive.sdk.player.c.e
    public final void c() {
        this.r.a();
        this.q.removeCallbacksAndMessages(null);
    }

    @Override // com.fyber.inneractive.sdk.player.c.e
    public final void a(e.c... cVarArr) {
        g gVar = this.r;
        if (gVar.b) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            return;
        }
        gVar.c++;
        gVar.a.obtainMessage(11, cVarArr).sendToTarget();
    }

    private int g() {
        if (this.i.a() || this.f > 0) {
            return this.u;
        }
        return this.i.a(this.n.a, this.t, false).c;
    }

    @Override // com.fyber.inneractive.sdk.player.c.e
    public final long e() {
        if (this.i.a()) {
            return -9223372036854775807L;
        }
        return b.a(this.i.a(g(), this.s, 0L).i);
    }

    @Override // com.fyber.inneractive.sdk.player.c.e
    public final long f() {
        if (this.i.a() || this.f > 0) {
            return this.w;
        }
        this.i.a(this.n.a, this.t, false);
        return b.a(this.t.f) + b.a(this.n.c);
    }

    @Override // com.fyber.inneractive.sdk.player.c.e
    public final com.fyber.inneractive.sdk.player.c.i.f d() {
        return this.l;
    }

    @Override // com.fyber.inneractive.sdk.player.c.e
    public final void a(com.fyber.inneractive.sdk.player.c.g.d dVar) {
        if (!this.i.a() || this.j != null) {
            this.i = q.a;
            this.j = null;
            Iterator<e.a> it = this.b.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        if (this.c) {
            this.c = false;
            this.k = com.fyber.inneractive.sdk.player.c.g.i.a;
            this.l = this.p;
            this.a.a(null);
            Iterator<e.a> it2 = this.b.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        this.g++;
        this.r.a.obtainMessage(0, 1, 0, dVar).sendToTarget();
    }
}
