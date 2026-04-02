package com.amazon.aps.iva.f8;

import android.content.ComponentName;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.amazon.aps.iva.f8.f0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: MediaRouteProvider.java */
/* loaded from: classes.dex */
public abstract class a0 {
    public final Context b;
    public final d c;
    public final c d = new c();
    public a e;
    public z f;
    public boolean g;
    public d0 h;
    public boolean i;

    /* compiled from: MediaRouteProvider.java */
    /* loaded from: classes.dex */
    public static abstract class a {
    }

    /* compiled from: MediaRouteProvider.java */
    /* loaded from: classes.dex */
    public static abstract class b extends e {
        public final Object a = new Object();
        public Executor b;
        public InterfaceC0243b c;
        public y d;
        public ArrayList e;

        /* compiled from: MediaRouteProvider.java */
        /* loaded from: classes.dex */
        public static final class a {
            public final y a;
            public final int b;
            public final boolean c;
            public final boolean d;
            public final boolean e;

            public a(y yVar, int i, boolean z, boolean z2, boolean z3) {
                this.a = yVar;
                this.b = i;
                this.c = z;
                this.d = z2;
                this.e = z3;
            }
        }

        /* compiled from: MediaRouteProvider.java */
        /* renamed from: com.amazon.aps.iva.f8.a0$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public interface InterfaceC0243b {
        }

        public String j() {
            return null;
        }

        public String k() {
            return null;
        }

        public final void l(y yVar, ArrayList arrayList) {
            if (yVar != null) {
                synchronized (this.a) {
                    Executor executor = this.b;
                    if (executor != null) {
                        executor.execute(new c0(this, this.c, yVar, arrayList));
                    } else {
                        this.d = yVar;
                        this.e = new ArrayList(arrayList);
                    }
                }
                return;
            }
            throw new NullPointerException("groupRoute must not be null");
        }

        public abstract void m(String str);

        public abstract void n(String str);

        public abstract void o(List<String> list);
    }

    /* compiled from: MediaRouteProvider.java */
    /* loaded from: classes.dex */
    public final class c extends Handler {
        public c() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            a0 a0Var = a0.this;
            if (i != 1) {
                if (i == 2) {
                    a0Var.g = false;
                    a0Var.o(a0Var.f);
                    return;
                }
                return;
            }
            a0Var.i = false;
            a aVar = a0Var.e;
            if (aVar != null) {
                d0 d0Var = a0Var.h;
                f0.d dVar = f0.d.this;
                f0.g d = dVar.d(a0Var);
                if (d != null) {
                    dVar.o(d, d0Var);
                }
            }
        }
    }

    /* compiled from: MediaRouteProvider.java */
    /* loaded from: classes.dex */
    public static final class d {
        public final ComponentName a;

        public d(ComponentName componentName) {
            this.a = componentName;
        }

        public final String toString() {
            return "ProviderMetadata{ componentName=" + this.a.flattenToShortString() + " }";
        }
    }

    public a0(Context context, d dVar) {
        if (context != null) {
            this.b = context;
            if (dVar == null) {
                this.c = new d(new ComponentName(context, getClass()));
                return;
            } else {
                this.c = dVar;
                return;
            }
        }
        throw new IllegalArgumentException("context must not be null");
    }

    public b l(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    public e m(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    public e n(String str, String str2) {
        if (str != null) {
            if (str2 != null) {
                return m(str);
            }
            throw new IllegalArgumentException("routeGroupId cannot be null");
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    public final void p(d0 d0Var) {
        f0.b();
        if (this.h != d0Var) {
            this.h = d0Var;
            if (!this.i) {
                this.i = true;
                this.d.sendEmptyMessage(1);
            }
        }
    }

    public final void q(z zVar) {
        f0.b();
        if (com.amazon.aps.iva.o3.b.a(this.f, zVar)) {
            return;
        }
        this.f = zVar;
        if (!this.g) {
            this.g = true;
            this.d.sendEmptyMessage(2);
        }
    }

    /* compiled from: MediaRouteProvider.java */
    /* loaded from: classes.dex */
    public static abstract class e {
        public void h(int i) {
            g();
        }

        public void d() {
        }

        public void e() {
        }

        @Deprecated
        public void g() {
        }

        public void f(int i) {
        }

        public void i(int i) {
        }
    }

    public void o(z zVar) {
    }
}
