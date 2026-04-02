package com.amazon.aps.iva.hj;

import com.amazon.aps.iva.cj.r;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
/* compiled from: InternalPlayerController.kt */
/* loaded from: classes.dex */
public final class c implements com.amazon.aps.iva.hj.a {
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.jl.a> a;
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.uj.a> b;

    /* compiled from: InternalPlayerController.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<q> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            c.this.b.invoke().b();
            return q.a;
        }
    }

    /* compiled from: InternalPlayerController.kt */
    /* loaded from: classes.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a<q> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            c.this.b.invoke().a();
            return q.a;
        }
    }

    public c(r rVar, com.amazon.aps.iva.cj.q qVar) {
        this.a = rVar;
        this.b = qVar;
    }

    @Override // com.amazon.aps.iva.hj.a
    public final void a() {
        this.a.invoke().u5(new b());
    }

    @Override // com.amazon.aps.iva.hj.a
    public final void b() {
        this.a.invoke().u5(new a());
    }

    @Override // com.amazon.aps.iva.hj.a
    public final void c(long j) {
        this.b.invoke().c(j);
    }

    @Override // com.amazon.aps.iva.hj.a
    public final void d() {
        this.b.invoke().d();
    }

    @Override // com.amazon.aps.iva.cj.j
    public final void e() {
        this.b.invoke().e();
    }

    public final void f() {
        this.b.invoke().f();
    }

    @Override // com.amazon.aps.iva.hj.a
    public final void j() {
        this.b.invoke().j();
    }

    @Override // com.amazon.aps.iva.hj.a
    public final void pause() {
        this.b.invoke().pause();
    }
}
