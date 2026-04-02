package com.amazon.aps.iva.b8;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
import com.amazon.aps.iva.b8.m0;
import com.amazon.aps.iva.b8.q;
import com.amazon.aps.iva.b8.r1;
import com.amazon.aps.iva.q5.l0;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: MediaSessionImpl.java */
/* loaded from: classes.dex */
public class t {
    public static final /* synthetic */ int u = 0;
    public final Object a = new Object();
    public final a b;
    public final q.a c;
    public final Context d;
    public final p1 e;
    public final m0 f;
    public final String g;
    public final b2 h;
    public final q i;
    public final Handler j;
    public final com.amazon.aps.iva.t5.b k;
    public final com.amazon.aps.iva.v1.p l;
    public final Handler m;
    public r1 n;
    public v1 o;
    public final PendingIntent p;
    public b q;
    public boolean r;
    public final long s;
    public final ImmutableList<com.amazon.aps.iva.b8.b> t;

    /* compiled from: MediaSessionImpl.java */
    /* loaded from: classes.dex */
    public class a extends Handler {
        public boolean a;
        public boolean b;

        public a(Looper looper) {
            super(looper);
            this.a = true;
            this.b = true;
        }

        public final void a(boolean z, boolean z2) {
            boolean z3;
            boolean z4 = false;
            if (this.a && z) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.a = z3;
            if (this.b && z2) {
                z4 = true;
            }
            this.b = z4;
            if (!hasMessages(1)) {
                sendEmptyMessage(1);
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            q.d dVar;
            int i;
            int i2;
            if (message.what == 1) {
                t tVar = t.this;
                r1 r1Var = tVar.n;
                com.amazon.aps.iva.q5.r0 c1 = tVar.o.c1();
                z1 a1 = tVar.o.a1();
                int i3 = tVar.n.l;
                r1Var.getClass();
                r1.a aVar = new r1.a(r1Var);
                aVar.j = c1;
                aVar.c = a1;
                aVar.k = i3;
                r1 a = aVar.a();
                tVar.n = a;
                boolean z = this.a;
                boolean z2 = this.b;
                p1 p1Var = tVar.e;
                r1 r0 = p1Var.r0(a);
                e<IBinder> eVar = p1Var.e;
                ImmutableList<q.d> d = eVar.d();
                int i4 = 0;
                while (i4 < d.size()) {
                    q.d dVar2 = d.get(i4);
                    try {
                        w1 f = eVar.f(dVar2);
                        if (f != null) {
                            synchronized (f.a) {
                                i2 = f.b;
                                f.b = i2 + 1;
                            }
                        } else if (!tVar.f(dVar2)) {
                            break;
                        } else {
                            i2 = 0;
                        }
                        l0.a j = q1.j(eVar.c(dVar2), tVar.o.j0());
                        q.c cVar = dVar2.d;
                        com.amazon.aps.iva.cq.b.D(cVar);
                        dVar = dVar2;
                        i = i4;
                        try {
                            cVar.y(i2, r0, j, z, z2, dVar2.b);
                        } catch (DeadObjectException unused) {
                            tVar.e.e.k(dVar);
                            i4 = i + 1;
                        } catch (RemoteException e) {
                            e = e;
                            com.amazon.aps.iva.t5.p.h("Exception in " + dVar.toString(), e);
                            i4 = i + 1;
                        }
                    } catch (DeadObjectException unused2) {
                        dVar = dVar2;
                        i = i4;
                    } catch (RemoteException e2) {
                        e = e2;
                        dVar = dVar2;
                        i = i4;
                    }
                    i4 = i + 1;
                }
                this.a = true;
                this.b = true;
                return;
            }
            throw new IllegalStateException("Invalid message what=" + message.what);
        }
    }

    /* compiled from: MediaSessionImpl.java */
    /* loaded from: classes.dex */
    public static class b implements l0.c {
        public final WeakReference<t> b;
        public final WeakReference<v1> c;

        public b(t tVar, v1 v1Var) {
            this.b = new WeakReference<>(tVar);
            this.c = new WeakReference<>(v1Var);
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void B(com.amazon.aps.iva.q5.y0 y0Var) {
            t G = G();
            if (G == null) {
                return;
            }
            G.n();
            r1 r1Var = G.n;
            r1Var.getClass();
            r1.a aVar = new r1.a(r1Var);
            aVar.l = y0Var;
            G.n = aVar.a();
            G.b.a(true, true);
            try {
                G.f.d.getClass();
            } catch (RemoteException e) {
                com.amazon.aps.iva.t5.p.d("Exception in using media1 API", e);
            }
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void C(int i) {
            boolean z;
            t G = G();
            if (G == null) {
                return;
            }
            G.n();
            if (this.c.get() == null) {
                return;
            }
            r1 r1Var = G.n;
            boolean z2 = r1Var.u;
            r1.a aVar = new r1.a(r1Var);
            aVar.t = z2;
            aVar.u = r1Var.v;
            aVar.x = i;
            if (r1Var.z == 3 && z2 && i == 0) {
                z = true;
            } else {
                z = false;
            }
            aVar.v = z;
            G.n = aVar.a();
            G.b.a(true, true);
            try {
                G.f.d.b();
            } catch (RemoteException e) {
                com.amazon.aps.iva.t5.p.d("Exception in using media1 API", e);
            }
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void E(com.amazon.aps.iva.q5.d0 d0Var) {
            t G = G();
            if (G == null) {
                return;
            }
            G.n();
            if (this.c.get() == null) {
                return;
            }
            r1 r1Var = G.n;
            r1Var.getClass();
            r1.a aVar = new r1.a(r1Var);
            aVar.z = d0Var;
            G.n = aVar.a();
            G.b.a(true, true);
            try {
                G.f.d.j();
            } catch (RemoteException e) {
                com.amazon.aps.iva.t5.p.d("Exception in using media1 API", e);
            }
        }

        public final t G() {
            return this.b.get();
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void H(int i, l0.d dVar, l0.d dVar2) {
            t G = G();
            if (G == null) {
                return;
            }
            G.n();
            if (this.c.get() == null) {
                return;
            }
            r1 r1Var = G.n;
            r1Var.getClass();
            r1.a aVar = new r1.a(r1Var);
            aVar.d = dVar;
            aVar.e = dVar2;
            aVar.f = i;
            G.n = aVar.a();
            G.b.a(true, true);
            try {
                G.f.d.f();
            } catch (RemoteException e) {
                com.amazon.aps.iva.t5.p.d("Exception in using media1 API", e);
            }
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void J(int i) {
            boolean z;
            t G = G();
            if (G == null) {
                return;
            }
            G.n();
            v1 v1Var = this.c.get();
            if (v1Var == null) {
                return;
            }
            r1 r1Var = G.n;
            com.amazon.aps.iva.q5.j0 K = v1Var.K();
            r1Var.getClass();
            r1.a aVar = new r1.a(r1Var);
            aVar.a = K;
            aVar.y = i;
            if (i == 3 && r1Var.u && r1Var.y == 0) {
                z = true;
            } else {
                z = false;
            }
            aVar.v = z;
            G.n = aVar.a();
            G.b.a(true, true);
            try {
                m0.d dVar = G.f.d;
                v1Var.K();
                dVar.v();
            } catch (RemoteException e) {
                com.amazon.aps.iva.t5.p.d("Exception in using media1 API", e);
            }
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void M(boolean z) {
            t G = G();
            if (G == null) {
                return;
            }
            G.n();
            if (this.c.get() == null) {
                return;
            }
            r1 r1Var = G.n;
            r1Var.getClass();
            r1.a aVar = new r1.a(r1Var);
            aVar.i = z;
            G.n = aVar.a();
            G.b.a(true, true);
            try {
                G.f.d.h(z);
            } catch (RemoteException e) {
                com.amazon.aps.iva.t5.p.d("Exception in using media1 API", e);
            }
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void V() {
            t G = G();
            if (G == null) {
                return;
            }
            G.n();
            G.d(new com.amazon.aps.iva.g1.e(6));
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void Z(com.amazon.aps.iva.a6.l lVar) {
            t G = G();
            if (G == null) {
                return;
            }
            G.n();
            if (this.c.get() == null) {
                return;
            }
            r1 r1Var = G.n;
            r1Var.getClass();
            r1.a aVar = new r1.a(r1Var);
            aVar.a = lVar;
            G.n = aVar.a();
            G.b.a(true, true);
            try {
                G.f.d.c();
            } catch (RemoteException e) {
                com.amazon.aps.iva.t5.p.d("Exception in using media1 API", e);
            }
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void b(com.amazon.aps.iva.q5.v0 v0Var) {
            t G = G();
            if (G == null) {
                return;
            }
            G.n();
            if (this.c.get() == null) {
                return;
            }
            G.n = G.n.a(v0Var);
            G.b.a(true, false);
            G.d(new com.amazon.aps.iva.n4.f0(v0Var, 3));
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void c0(com.amazon.aps.iva.q5.u0 u0Var) {
            t G = G();
            if (G == null) {
                return;
            }
            G.n();
            if (this.c.get() == null) {
                return;
            }
            G.n = G.n.b(u0Var);
            G.b.a(true, true);
            G.d(new com.amazon.aps.iva.a6.i0(u0Var, 4));
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void d0(boolean z) {
            t G = G();
            if (G == null) {
                return;
            }
            G.n();
            if (this.c.get() == null) {
                return;
            }
            r1 r1Var = G.n;
            r1Var.getClass();
            r1.a aVar = new r1.a(r1Var);
            aVar.w = z;
            G.n = aVar.a();
            G.b.a(true, true);
            try {
                G.f.d.getClass();
            } catch (RemoteException e) {
                com.amazon.aps.iva.t5.p.d("Exception in using media1 API", e);
            }
            G.m();
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void e(com.amazon.aps.iva.q5.f fVar) {
            t G = G();
            if (G == null) {
                return;
            }
            G.n();
            if (this.c.get() == null) {
                return;
            }
            r1 r1Var = G.n;
            r1Var.getClass();
            r1.a aVar = new r1.a(r1Var);
            aVar.o = fVar;
            G.n = aVar.a();
            G.b.a(true, true);
            G.b(new com.amazon.aps.iva.f1.d0(fVar, 5));
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void e0(com.amazon.aps.iva.q5.q qVar) {
            t G = G();
            if (G == null) {
                return;
            }
            G.n();
            if (this.c.get() == null) {
                return;
            }
            r1 r1Var = G.n;
            r1Var.getClass();
            r1.a aVar = new r1.a(r1Var);
            aVar.q = qVar;
            G.n = aVar.a();
            G.b.a(true, true);
            G.b(new com.amazon.aps.iva.f1.d0(qVar, 4));
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void g(com.amazon.aps.iva.s5.b bVar) {
            t G = G();
            if (G == null) {
                return;
            }
            G.n();
            if (this.c.get() == null) {
                return;
            }
            r1.a aVar = new r1.a(G.n);
            aVar.p = bVar;
            G.n = aVar.a();
            G.b.a(true, true);
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void g0(int i, boolean z) {
            boolean z2;
            t G = G();
            if (G == null) {
                return;
            }
            G.n();
            if (this.c.get() == null) {
                return;
            }
            r1 r1Var = G.n;
            int i2 = r1Var.y;
            r1.a aVar = new r1.a(r1Var);
            aVar.t = z;
            aVar.u = i;
            aVar.x = i2;
            if (r1Var.z == 3 && z && i2 == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            aVar.v = z2;
            G.n = aVar.a();
            G.b.a(true, true);
            try {
                G.f.d.q();
            } catch (RemoteException e) {
                com.amazon.aps.iva.t5.p.d("Exception in using media1 API", e);
            }
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void h0(float f) {
            t G = G();
            if (G == null) {
                return;
            }
            G.n();
            r1 r1Var = G.n;
            r1Var.getClass();
            r1.a aVar = new r1.a(r1Var);
            aVar.n = f;
            G.n = aVar.a();
            G.b.a(true, true);
            try {
                G.f.d.getClass();
            } catch (RemoteException e) {
                com.amazon.aps.iva.t5.p.d("Exception in using media1 API", e);
            }
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void i0(com.amazon.aps.iva.q5.k0 k0Var) {
            t G = G();
            if (G == null) {
                return;
            }
            G.n();
            if (this.c.get() == null) {
                return;
            }
            r1 r1Var = G.n;
            r1Var.getClass();
            r1.a aVar = new r1.a(r1Var);
            aVar.g = k0Var;
            G.n = aVar.a();
            G.b.a(true, true);
            try {
                G.f.d.A();
            } catch (RemoteException e) {
                com.amazon.aps.iva.t5.p.d("Exception in using media1 API", e);
            }
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void l0(int i, com.amazon.aps.iva.q5.b0 b0Var) {
            t G = G();
            if (G == null) {
                return;
            }
            G.n();
            if (this.c.get() == null) {
                return;
            }
            r1 r1Var = G.n;
            r1Var.getClass();
            r1.a aVar = new r1.a(r1Var);
            aVar.b = i;
            G.n = aVar.a();
            G.b.a(true, true);
            try {
                G.f.d.C(b0Var);
            } catch (RemoteException e) {
                com.amazon.aps.iva.t5.p.d("Exception in using media1 API", e);
            }
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void o0(l0.a aVar) {
            t G = G();
            if (G == null) {
                return;
            }
            G.n();
            if (this.c.get() == null) {
                return;
            }
            G.e(aVar);
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void p(com.amazon.aps.iva.q5.d0 d0Var) {
            t G = G();
            if (G == null) {
                return;
            }
            G.n();
            r1 r1Var = G.n;
            r1Var.getClass();
            r1.a aVar = new r1.a(r1Var);
            aVar.m = d0Var;
            G.n = aVar.a();
            G.b.a(true, true);
            try {
                G.f.d.p(d0Var);
            } catch (RemoteException e) {
                com.amazon.aps.iva.t5.p.d("Exception in using media1 API", e);
            }
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void q0(com.amazon.aps.iva.q5.r0 r0Var, int i) {
            t G = G();
            if (G == null) {
                return;
            }
            G.n();
            v1 v1Var = this.c.get();
            if (v1Var == null) {
                return;
            }
            r1 r1Var = G.n;
            z1 a1 = v1Var.a1();
            r1Var.getClass();
            r1.a aVar = new r1.a(r1Var);
            aVar.j = r0Var;
            aVar.c = a1;
            aVar.k = i;
            G.n = aVar.a();
            G.b.a(false, true);
            try {
                G.f.d.i(r0Var);
            } catch (RemoteException e) {
                com.amazon.aps.iva.t5.p.d("Exception in using media1 API", e);
            }
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void s0(boolean z) {
            t G = G();
            if (G == null) {
                return;
            }
            G.n();
            if (this.c.get() == null) {
                return;
            }
            r1 r1Var = G.n;
            r1Var.getClass();
            r1.a aVar = new r1.a(r1Var);
            aVar.v = z;
            G.n = aVar.a();
            G.b.a(true, true);
            try {
                G.f.d.t();
            } catch (RemoteException e) {
                com.amazon.aps.iva.t5.p.d("Exception in using media1 API", e);
            }
            G.m();
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void w(int i) {
            t G = G();
            if (G == null) {
                return;
            }
            G.n();
            if (this.c.get() == null) {
                return;
            }
            r1 r1Var = G.n;
            r1Var.getClass();
            r1.a aVar = new r1.a(r1Var);
            aVar.h = i;
            G.n = aVar.a();
            G.b.a(true, true);
            try {
                G.f.d.g(i);
            } catch (RemoteException e) {
                com.amazon.aps.iva.t5.p.d("Exception in using media1 API", e);
            }
        }
    }

    /* compiled from: MediaSessionImpl.java */
    /* loaded from: classes.dex */
    public interface c {
        void g(q.c cVar, int i) throws RemoteException;
    }

    static {
        new a2(1);
    }

    public t(q qVar, Context context, String str, com.amazon.aps.iva.q5.l0 l0Var, ImmutableList immutableList, q.a aVar, Bundle bundle, com.amazon.aps.iva.t5.b bVar) {
        this.d = context;
        this.i = qVar;
        p1 p1Var = new p1(this);
        this.e = p1Var;
        this.p = null;
        this.t = immutableList;
        this.m = new Handler(Looper.getMainLooper());
        Handler handler = new Handler(l0Var.c0());
        this.j = handler;
        this.c = aVar;
        this.k = bVar;
        this.n = r1.G;
        this.b = new a(l0Var.c0());
        this.g = str;
        Uri build = new Uri.Builder().scheme(t.class.getName()).appendPath(str).appendPath(String.valueOf(SystemClock.elapsedRealtime())).build();
        this.h = new b2(Process.myUid(), context.getPackageName(), p1Var, bundle);
        this.f = new m0(this, build, handler);
        v1 v1Var = new v1(l0Var);
        this.o = v1Var;
        v1Var.c = immutableList;
        com.amazon.aps.iva.t5.g0.U(handler, new com.amazon.aps.iva.n4.d(8, this, v1Var));
        this.s = 3000L;
        this.l = new com.amazon.aps.iva.v1.p(this, 6);
        com.amazon.aps.iva.t5.g0.U(handler, new com.amazon.aps.iva.e.i(this, 3));
    }

    public final com.amazon.aps.iva.a6.x0 a(q.d dVar, Runnable runnable) {
        return new com.amazon.aps.iva.a6.x0(this, 2, dVar, runnable);
    }

    public final void b(com.amazon.aps.iva.f1.d0 d0Var) {
        try {
            d0Var.g(this.f.d, 0);
        } catch (RemoteException e) {
            com.amazon.aps.iva.t5.p.d("Exception in using media1 API", e);
        }
    }

    public final void c(q.d dVar, c cVar) {
        int i;
        try {
            w1 f = this.e.e.f(dVar);
            if (f != null) {
                synchronized (f.a) {
                    i = f.b;
                    f.b = i + 1;
                }
            } else if (!f(dVar)) {
                return;
            } else {
                i = 0;
            }
            q.c cVar2 = dVar.d;
            if (cVar2 != null) {
                cVar.g(cVar2, i);
            }
        } catch (DeadObjectException unused) {
            this.e.e.k(dVar);
        } catch (RemoteException e) {
            com.amazon.aps.iva.t5.p.h("Exception in " + dVar.toString(), e);
        }
    }

    public void d(c cVar) {
        ImmutableList<q.d> d = this.e.e.d();
        for (int i = 0; i < d.size(); i++) {
            c(d.get(i), cVar);
        }
        try {
            cVar.g(this.f.d, 0);
        } catch (RemoteException e) {
            com.amazon.aps.iva.t5.p.d("Exception in using media1 API", e);
        }
    }

    public final void e(l0.a aVar) {
        this.b.a(false, false);
        d(new com.amazon.aps.iva.g1.o(aVar, 6));
        try {
            m0.d dVar = this.f.d;
            com.amazon.aps.iva.q5.q qVar = this.n.r;
            dVar.B();
        } catch (RemoteException e) {
            com.amazon.aps.iva.t5.p.d("Exception in using media1 API", e);
        }
    }

    public boolean f(q.d dVar) {
        if (!this.e.e.g(dVar) && !this.f.a.g(dVar)) {
            return false;
        }
        return true;
    }

    public final boolean g() {
        boolean z;
        synchronized (this.a) {
            z = this.r;
        }
        return z;
    }

    public final ListenableFuture h(List list) {
        this.c.getClass();
        ListenableFuture c2 = q.a.c(list);
        com.amazon.aps.iva.cq.b.B(c2, "Callback.onAddMediaItems must return a non-null future");
        return c2;
    }

    public final boolean i() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            SettableFuture create = SettableFuture.create();
            this.m.post(new androidx.fragment.app.t(5, this, create));
            try {
                return ((Boolean) create.get()).booleanValue();
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException(e);
            }
        }
        return true;
    }

    public final ListenableFuture j(List list, int i, long j) {
        this.c.getClass();
        return q.a.a(list, i, j);
    }

    public final void k(com.amazon.aps.iva.q5.l0 l0Var) {
        Executor hVar;
        n();
        this.c.getClass();
        ListenableFuture e = q.a.e();
        com.amazon.aps.iva.cq.b.B(e, "Callback.onPlaybackResumption must return a non-null future");
        if (e.isDone()) {
            hVar = MoreExecutors.directExecutor();
        } else {
            hVar = new com.amazon.aps.iva.k3.h(this.j);
        }
        Futures.addCallback(e, new s(l0Var), hVar);
    }

    public final void l() {
        synchronized (this.a) {
            if (this.r) {
                return;
            }
            this.r = true;
            this.j.removeCallbacksAndMessages(null);
            try {
                com.amazon.aps.iva.t5.g0.U(this.j, new com.amazon.aps.iva.e.k(this, 5));
            } catch (Exception e) {
                com.amazon.aps.iva.t5.p.h("Exception thrown while closing", e);
            }
            m0 m0Var = this.f;
            boolean z = m0Var.j;
            MediaSessionCompat mediaSessionCompat = m0Var.g;
            if (!z) {
                mediaSessionCompat.a.a.setMediaButtonReceiver(null);
            }
            m0.e eVar = m0Var.i;
            if (eVar != null) {
                m0Var.b.d.unregisterReceiver(eVar);
            }
            mediaSessionCompat.d();
            p1 p1Var = this.e;
            for (q.d dVar : p1Var.e.d()) {
                q.c cVar = dVar.d;
                if (cVar != null) {
                    try {
                        cVar.d();
                    } catch (RemoteException unused) {
                    }
                }
            }
            for (q.d dVar2 : p1Var.f) {
                q.c cVar2 = dVar2.d;
                if (cVar2 != null) {
                    try {
                        cVar2.d();
                    } catch (RemoteException unused2) {
                    }
                }
            }
        }
    }

    public final void m() {
        Handler handler = this.j;
        com.amazon.aps.iva.v1.p pVar = this.l;
        handler.removeCallbacks(pVar);
        long j = this.s;
        if (j > 0) {
            if (this.o.J0() || this.o.isLoading()) {
                handler.postDelayed(pVar, j);
            }
        }
    }

    public final void n() {
        if (Looper.myLooper() == this.j.getLooper()) {
            return;
        }
        throw new IllegalStateException("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
    }
}
