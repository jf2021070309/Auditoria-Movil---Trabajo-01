package com.amazon.aps.iva.jk;

import android.os.Handler;
import android.os.Looper;
import com.amazon.aps.iva.a6.m0;
import com.amazon.aps.iva.b6.b;
import com.amazon.aps.iva.mf0.a;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.pj.e;
import com.amazon.aps.iva.q.c0;
import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.q5.l0;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import java.lang.ref.WeakReference;
/* compiled from: PlayerAnalyticsListener.kt */
/* loaded from: classes.dex */
public final class a implements com.amazon.aps.iva.b6.b {
    public final com.amazon.aps.iva.oj.a a;
    public com.amazon.aps.iva.a6.m b;
    public int c;
    public long d;
    public int e;
    public int f;
    public boolean g;
    public long h;
    public long j;
    public long k;
    public long l;
    public WeakReference<Handler> i = new WeakReference<>(new Handler(Looper.getMainLooper()));
    public final com.amazon.aps.iva.m6.e m = new com.amazon.aps.iva.m6.e(this, 6);

    public a(com.amazon.aps.iva.oj.a aVar, m0 m0Var) {
        this.a = aVar;
        this.b = m0Var;
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void G(b.a aVar, com.amazon.aps.iva.o6.q qVar, com.amazon.aps.iva.o6.t tVar) {
        int i;
        com.amazon.aps.iva.q5.v O;
        com.amazon.aps.iva.yb0.j.f(aVar, "eventTime");
        com.amazon.aps.iva.yb0.j.f(qVar, "loadEventInfo");
        com.amazon.aps.iva.yb0.j.f(tVar, "mediaLoadData");
        if (tVar.a == 1 && tVar.b == 2) {
            String name = a.class.getName();
            String host = qVar.b.getHost();
            if (host == null) {
                host = "";
            }
            com.amazon.aps.iva.a6.m mVar = this.b;
            if (mVar != null && (O = mVar.O()) != null) {
                i = O.i / 1000;
            } else {
                i = 0;
            }
            this.a.b(name, new e.d(i, qVar.d, host));
        }
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void O(b.a aVar, int i) {
        com.amazon.aps.iva.yb0.j.f(aVar, "eventTime");
        if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    com.amazon.aps.iva.mf0.a.a.a("STATE_ENDED", new Object[0]);
                    V();
                    Y();
                    return;
                }
                return;
            } else if (this.h > 0) {
                this.h = 0L;
                this.g = true;
                this.d += System.currentTimeMillis() - this.h;
                return;
            } else {
                return;
            }
        }
        this.h = System.currentTimeMillis();
        this.e++;
        if (!this.g) {
            this.f++;
        }
    }

    public final void V() {
        this.d = 0L;
        this.e = 0;
        this.f = 0;
        this.c = 0;
        this.g = false;
        this.k = 0L;
        this.l = 0L;
        this.j = 0L;
        com.amazon.aps.iva.mf0.a.a.a("PlayerAnalyticsListener session reset!", new Object[0]);
    }

    public final void W() {
        Y();
        com.amazon.aps.iva.mf0.a.a.a("start heartbeat", new Object[0]);
        WeakReference<Handler> weakReference = new WeakReference<>(new Handler(Looper.getMainLooper()));
        this.i = weakReference;
        Handler handler = weakReference.get();
        if (handler != null) {
            handler.postDelayed(this.m, NotificationOptions.SKIP_STEP_THIRTY_SECONDS_IN_MS);
        }
    }

    public final void X() {
        long j;
        com.amazon.aps.iva.a6.m mVar = this.b;
        boolean z = false;
        if (mVar != null && mVar.o()) {
            z = true;
        }
        if (z) {
            return;
        }
        com.amazon.aps.iva.a6.m mVar2 = this.b;
        if (mVar2 != null) {
            j = mVar2.a();
        } else {
            j = 0;
        }
        long j2 = (j - this.k) - this.j;
        this.l += j2;
        this.a.b(a.class.getName(), new e.c(this.l, j2, j));
        this.j = 0L;
        this.k = j;
    }

    public final void Y() {
        com.amazon.aps.iva.mf0.a.a.a("stop heartbeat", new Object[0]);
        Handler handler = this.i.get();
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void a(b.a aVar, boolean z) {
        boolean z2;
        com.amazon.aps.iva.yb0.j.f(aVar, "eventTime");
        v.b bVar = aVar.d;
        if (bVar != null) {
            boolean z3 = true;
            if (bVar.a()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                com.amazon.aps.iva.a6.m mVar = this.b;
                if (mVar == null || !mVar.o()) {
                    z3 = false;
                }
                if (!z3) {
                    if (!z) {
                        com.amazon.aps.iva.mf0.a.a.a("onIsPlayingChanged isPlaying = false", new Object[0]);
                        X();
                        Y();
                        return;
                    }
                    com.amazon.aps.iva.mf0.a.a.a("onIsPlayingChanged isPlaying = true", new Object[0]);
                    X();
                    W();
                    return;
                }
            }
        }
        Y();
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void c(int i, b.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "eventTime");
        com.amazon.aps.iva.mf0.a.a.j(c0.a("DroppedFrames count: ", i), new Object[0]);
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void e(int i, l0.d dVar, l0.d dVar2, b.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "eventTime");
        com.amazon.aps.iva.yb0.j.f(dVar, "oldPosition");
        com.amazon.aps.iva.yb0.j.f(dVar2, "newPosition");
        if (i != 0) {
            if (i == 1) {
                this.j = (dVar2.g - dVar.g) + this.j;
                a.C0515a c0515a = com.amazon.aps.iva.mf0.a.a;
                c0515a.a("DISCONTINUITY_REASON_SEEK, seekToPositionTimeMs = " + this.j, new Object[0]);
            }
        } else if (dVar2.i == -1) {
            X();
            W();
        }
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void m(b.a aVar, Object obj) {
        com.amazon.aps.iva.yb0.j.f(aVar, "eventTime");
        com.amazon.aps.iva.yb0.j.f(obj, "output");
        if (this.c == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - this.h;
            this.e -= this.f;
            long j2 = this.d;
            if (j2 > 0) {
                this.d = j2 - j;
            }
            this.g = true;
            this.a.b(a.class.getName(), new e.b(currentTimeMillis, j, this.d, this.e));
            this.c++;
        }
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void n(b.a aVar, b0 b0Var, int i) {
        com.amazon.aps.iva.yb0.j.f(aVar, "eventTime");
        com.amazon.aps.iva.mf0.a.a.a("onMediaItemTransition", new Object[0]);
        V();
    }
}
