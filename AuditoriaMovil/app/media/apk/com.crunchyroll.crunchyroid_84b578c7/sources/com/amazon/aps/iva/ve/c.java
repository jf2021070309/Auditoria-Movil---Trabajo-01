package com.amazon.aps.iva.ve;

import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.ve.g;
import com.amazon.aps.iva.ve.h;
import com.amazon.aps.iva.ve.i;
/* compiled from: BillingStateMonitor.kt */
/* loaded from: classes.dex */
public final class c implements b {
    public final v<com.amazon.aps.iva.ez.d<g>> b = new v<>();
    public final v<com.amazon.aps.iva.ez.d<i>> c = new v<>();
    public final v<com.amazon.aps.iva.ez.d<h>> d = new v<>();
    public final v<com.amazon.aps.iva.ez.d<Boolean>> e = new v<>();
    public final v<com.amazon.aps.iva.ez.d<f>> f = new v<>();

    @Override // com.amazon.aps.iva.ve.b
    public final void a() {
        this.d.i(new com.amazon.aps.iva.ez.d<>(h.b.a));
    }

    @Override // com.amazon.aps.iva.ve.b
    public final void b() {
        this.d.i(new com.amazon.aps.iva.ez.d<>(h.c.a));
    }

    @Override // com.amazon.aps.iva.ve.b
    public final void c(long j, String str) {
        this.f.i(new com.amazon.aps.iva.ez.d<>(new f(str, j)));
    }

    @Override // com.amazon.aps.iva.ve.b
    public final void d(long j) {
        this.c.i(new com.amazon.aps.iva.ez.d<>(new i.a(j)));
    }

    @Override // com.amazon.aps.iva.ve.b
    public final void e(long j) {
        this.b.i(new com.amazon.aps.iva.ez.d<>(new g.b(j)));
    }

    @Override // com.amazon.aps.iva.ve.b
    public final void f() {
        this.e.i(new com.amazon.aps.iva.ez.d<>(Boolean.TRUE));
    }

    @Override // com.amazon.aps.iva.ve.b
    public final v g() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.ve.b
    public final void h() {
        this.d.i(new com.amazon.aps.iva.ez.d<>(h.a.a));
    }

    @Override // com.amazon.aps.iva.ve.b
    public final v<com.amazon.aps.iva.ez.d<Boolean>> i() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.ve.b
    public final v<com.amazon.aps.iva.ez.d<i>> j() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.ve.b
    public final void k(long j) {
        this.c.i(new com.amazon.aps.iva.ez.d<>(new i.b(j)));
    }

    @Override // com.amazon.aps.iva.ve.b
    public final void l(long j) {
        this.b.i(new com.amazon.aps.iva.ez.d<>(new g.a(j)));
    }

    @Override // com.amazon.aps.iva.ve.b
    public final v<com.amazon.aps.iva.ez.d<f>> m() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.ve.b
    public final v n() {
        return this.b;
    }
}
