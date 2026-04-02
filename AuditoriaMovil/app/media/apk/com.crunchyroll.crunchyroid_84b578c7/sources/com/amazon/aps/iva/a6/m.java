package com.amazon.aps.iva.a6;

import android.content.Context;
import android.os.Looper;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.s6.a;
import com.amazon.aps.iva.t6.h;
import com.amazon.aps.iva.w5.j;
import com.google.common.base.Function;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
/* compiled from: ExoPlayer.java */
/* loaded from: classes.dex */
public interface m extends com.amazon.aps.iva.q5.l0 {

    /* compiled from: ExoPlayer.java */
    /* loaded from: classes.dex */
    public static final class b {
        public final Context a;
        public final com.amazon.aps.iva.t5.y b;
        public Supplier<r1> c;
        public Supplier<v.a> d;
        public Supplier<com.amazon.aps.iva.s6.w> e;
        public Supplier<t0> f;
        public final Supplier<com.amazon.aps.iva.t6.d> g;
        public final Function<com.amazon.aps.iva.t5.d, com.amazon.aps.iva.b6.a> h;
        public final Looper i;
        public final com.amazon.aps.iva.q5.f j;
        public boolean k;
        public final int l;
        public int m;
        public final boolean n;
        public final s1 o;
        public long p;
        public long q;
        public final h r;
        public final long s;
        public final long t;
        public boolean u;
        public final boolean v;
        public boolean w;

        public b(final Context context) {
            o oVar = new o(context, 0);
            Supplier<v.a> supplier = new Supplier() { // from class: com.amazon.aps.iva.a6.p
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return new com.amazon.aps.iva.o6.m(new j.a(context), new com.amazon.aps.iva.x6.j());
                }
            };
            Supplier<com.amazon.aps.iva.s6.w> supplier2 = new Supplier() { // from class: com.amazon.aps.iva.a6.t
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return new com.amazon.aps.iva.s6.g(context, new a.b());
                }
            };
            u uVar = new u();
            Supplier<com.amazon.aps.iva.t6.d> supplier3 = new Supplier() { // from class: com.amazon.aps.iva.a6.v
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    com.amazon.aps.iva.t6.h hVar;
                    Context context2 = context;
                    ImmutableList<Long> immutableList = com.amazon.aps.iva.t6.h.n;
                    synchronized (com.amazon.aps.iva.t6.h.class) {
                        if (com.amazon.aps.iva.t6.h.t == null) {
                            h.a aVar = new h.a(context2);
                            com.amazon.aps.iva.t6.h.t = new com.amazon.aps.iva.t6.h(aVar.a, aVar.b, aVar.c, aVar.d, aVar.e);
                        }
                        hVar = com.amazon.aps.iva.t6.h.t;
                    }
                    return hVar;
                }
            };
            w wVar = new w(0);
            this.a = context;
            this.c = oVar;
            this.d = supplier;
            this.e = supplier2;
            this.f = uVar;
            this.g = supplier3;
            this.h = wVar;
            int i = com.amazon.aps.iva.t5.g0.a;
            Looper myLooper = Looper.myLooper();
            this.i = myLooper == null ? Looper.getMainLooper() : myLooper;
            this.j = com.amazon.aps.iva.q5.f.h;
            this.l = 1;
            this.m = 0;
            this.n = true;
            this.o = s1.c;
            this.p = 5000L;
            this.q = 15000L;
            this.r = new h(com.amazon.aps.iva.t5.g0.Q(20L), com.amazon.aps.iva.t5.g0.Q(500L), 0.999f);
            this.b = com.amazon.aps.iva.t5.d.a;
            this.s = 500L;
            this.t = 2000L;
            this.v = true;
        }
    }

    void D0(com.amazon.aps.iva.b6.b bVar);

    com.amazon.aps.iva.q5.v O();

    void W(boolean z);

    void b0(com.amazon.aps.iva.b6.b bVar);

    /* compiled from: ExoPlayer.java */
    /* loaded from: classes.dex */
    public interface a {
        default void f() {
        }
    }
}
