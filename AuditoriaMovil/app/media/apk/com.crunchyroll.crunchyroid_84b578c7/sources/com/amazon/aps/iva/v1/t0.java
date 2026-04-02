package com.amazon.aps.iva.v1;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;
/* compiled from: AndroidUiDispatcher.android.kt */
/* loaded from: classes.dex */
public final class t0 extends com.amazon.aps.iva.se0.d0 {
    public static final com.amazon.aps.iva.kb0.m m = com.amazon.aps.iva.kb0.f.b(a.h);
    public static final b n = new b();
    public final Choreographer c;
    public final Handler d;
    public boolean i;
    public boolean j;
    public final u0 l;
    public final Object e = new Object();
    public final com.amazon.aps.iva.lb0.k<Runnable> f = new com.amazon.aps.iva.lb0.k<>();
    public List<Choreographer.FrameCallback> g = new ArrayList();
    public List<Choreographer.FrameCallback> h = new ArrayList();
    public final c k = new c();

    /* compiled from: AndroidUiDispatcher.android.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.ob0.g> {
        public static final a h = new a();

        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.ob0.g invoke() {
            boolean z;
            Choreographer choreographer;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                choreographer = Choreographer.getInstance();
            } else {
                com.amazon.aps.iva.ye0.c cVar = com.amazon.aps.iva.se0.r0.a;
                choreographer = (Choreographer) com.amazon.aps.iva.se0.i.e(com.amazon.aps.iva.xe0.k.a, new s0(null));
            }
            com.amazon.aps.iva.yb0.j.e(choreographer, "if (isMainThread()) Chor…eographer.getInstance() }");
            Handler a = com.amazon.aps.iva.k3.i.a(Looper.getMainLooper());
            com.amazon.aps.iva.yb0.j.e(a, "createAsync(Looper.getMainLooper())");
            t0 t0Var = new t0(choreographer, a);
            return t0Var.plus(t0Var.l);
        }
    }

    /* compiled from: AndroidUiDispatcher.android.kt */
    /* loaded from: classes.dex */
    public static final class b extends ThreadLocal<com.amazon.aps.iva.ob0.g> {
        @Override // java.lang.ThreadLocal
        public final com.amazon.aps.iva.ob0.g initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            com.amazon.aps.iva.yb0.j.e(choreographer, "getInstance()");
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                Handler a = com.amazon.aps.iva.k3.i.a(myLooper);
                com.amazon.aps.iva.yb0.j.e(a, "createAsync(\n           …d\")\n                    )");
                t0 t0Var = new t0(choreographer, a);
                return t0Var.plus(t0Var.l);
            }
            throw new IllegalStateException("no Looper on this thread".toString());
        }
    }

    /* compiled from: AndroidUiDispatcher.android.kt */
    /* loaded from: classes.dex */
    public static final class c implements Choreographer.FrameCallback, Runnable {
        public c() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            t0.this.d.removeCallbacks(this);
            t0.C(t0.this);
            t0 t0Var = t0.this;
            synchronized (t0Var.e) {
                if (t0Var.j) {
                    t0Var.j = false;
                    List<Choreographer.FrameCallback> list = t0Var.g;
                    t0Var.g = t0Var.h;
                    t0Var.h = list;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        list.get(i).doFrame(j);
                    }
                    list.clear();
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            t0.C(t0.this);
            t0 t0Var = t0.this;
            synchronized (t0Var.e) {
                if (t0Var.g.isEmpty()) {
                    t0Var.c.removeFrameCallback(this);
                    t0Var.j = false;
                }
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            }
        }
    }

    public t0(Choreographer choreographer, Handler handler) {
        this.c = choreographer;
        this.d = handler;
        this.l = new u0(choreographer, this);
    }

    public static final void C(t0 t0Var) {
        Runnable removeFirst;
        Runnable runnable;
        boolean z;
        Runnable removeFirst2;
        do {
            synchronized (t0Var.e) {
                com.amazon.aps.iva.lb0.k<Runnable> kVar = t0Var.f;
                if (kVar.isEmpty()) {
                    removeFirst = null;
                } else {
                    removeFirst = kVar.removeFirst();
                }
                runnable = removeFirst;
            }
            while (runnable != null) {
                runnable.run();
                synchronized (t0Var.e) {
                    com.amazon.aps.iva.lb0.k<Runnable> kVar2 = t0Var.f;
                    if (kVar2.isEmpty()) {
                        removeFirst2 = null;
                    } else {
                        removeFirst2 = kVar2.removeFirst();
                    }
                    runnable = removeFirst2;
                }
            }
            synchronized (t0Var.e) {
                if (t0Var.f.isEmpty()) {
                    z = false;
                    t0Var.i = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // com.amazon.aps.iva.se0.d0
    public final void x(com.amazon.aps.iva.ob0.g gVar, Runnable runnable) {
        com.amazon.aps.iva.yb0.j.f(gVar, "context");
        com.amazon.aps.iva.yb0.j.f(runnable, "block");
        synchronized (this.e) {
            this.f.addLast(runnable);
            if (!this.i) {
                this.i = true;
                this.d.post(this.k);
                if (!this.j) {
                    this.j = true;
                    this.c.postFrameCallback(this.k);
                }
            }
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        }
    }
}
