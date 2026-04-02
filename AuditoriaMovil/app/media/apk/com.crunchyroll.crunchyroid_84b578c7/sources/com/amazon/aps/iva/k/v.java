package com.amazon.aps.iva.k;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.amazon.aps.iva.o.a;
import com.amazon.aps.iva.o60.b;
import java.lang.ref.WeakReference;
/* compiled from: BaseContextWrappingDelegate.kt */
/* loaded from: classes.dex */
public final class v extends f {
    public final f k;
    public final com.amazon.aps.iva.xb0.l<Context, Context> l;

    public v(f fVar, b.a aVar) {
        this.k = fVar;
        this.l = aVar;
    }

    @Override // com.amazon.aps.iva.k.f
    public final void A(CharSequence charSequence) {
        this.k.A(charSequence);
    }

    @Override // com.amazon.aps.iva.k.f
    public final com.amazon.aps.iva.o.a B(a.InterfaceC0549a interfaceC0549a) {
        com.amazon.aps.iva.yb0.j.g(interfaceC0549a, "callback");
        return this.k.B(interfaceC0549a);
    }

    @Override // com.amazon.aps.iva.k.f
    public final void a(View view, ViewGroup.LayoutParams layoutParams) {
        this.k.a(view, layoutParams);
    }

    @Override // com.amazon.aps.iva.k.f
    public final Context b(Context context) {
        com.amazon.aps.iva.yb0.j.g(context, "context");
        Context b = this.k.b(context);
        com.amazon.aps.iva.yb0.j.b(b, "superDelegate.attachBase…achBaseContext2(context))");
        return this.l.invoke(b);
    }

    @Override // com.amazon.aps.iva.k.f
    public final <T extends View> T c(int i) {
        return (T) this.k.c(i);
    }

    @Override // com.amazon.aps.iva.k.f
    public final b e() {
        return this.k.e();
    }

    @Override // com.amazon.aps.iva.k.f
    public final int f() {
        return this.k.f();
    }

    @Override // com.amazon.aps.iva.k.f
    public final MenuInflater g() {
        return this.k.g();
    }

    @Override // com.amazon.aps.iva.k.f
    public final a h() {
        return this.k.h();
    }

    @Override // com.amazon.aps.iva.k.f
    public final void i() {
        this.k.i();
    }

    @Override // com.amazon.aps.iva.k.f
    public final void j() {
        this.k.j();
    }

    @Override // com.amazon.aps.iva.k.f
    public final void l(Configuration configuration) {
        this.k.l(configuration);
    }

    @Override // com.amazon.aps.iva.k.f
    public final void m(Bundle bundle) {
        f fVar = this.k;
        fVar.m(bundle);
        Object obj = f.i;
        synchronized (obj) {
            f.t(fVar);
        }
        synchronized (obj) {
            f.t(this);
            f.h.add(new WeakReference<>(this));
        }
    }

    @Override // com.amazon.aps.iva.k.f
    public final void n() {
        this.k.n();
        synchronized (f.i) {
            f.t(this);
        }
    }

    @Override // com.amazon.aps.iva.k.f
    public final void o(Bundle bundle) {
        this.k.o(bundle);
    }

    @Override // com.amazon.aps.iva.k.f
    public final void p() {
        this.k.p();
    }

    @Override // com.amazon.aps.iva.k.f
    public final void q(Bundle bundle) {
        this.k.q(bundle);
    }

    @Override // com.amazon.aps.iva.k.f
    public final void r() {
        this.k.r();
    }

    @Override // com.amazon.aps.iva.k.f
    public final void s() {
        this.k.s();
    }

    @Override // com.amazon.aps.iva.k.f
    public final boolean u(int i) {
        return this.k.u(i);
    }

    @Override // com.amazon.aps.iva.k.f
    public final void v(int i) {
        this.k.v(i);
    }

    @Override // com.amazon.aps.iva.k.f
    public final void w(View view) {
        this.k.w(view);
    }

    @Override // com.amazon.aps.iva.k.f
    public final void x(View view, ViewGroup.LayoutParams layoutParams) {
        this.k.x(view, layoutParams);
    }

    @Override // com.amazon.aps.iva.k.f
    public final void y(Toolbar toolbar) {
        this.k.y(toolbar);
    }

    @Override // com.amazon.aps.iva.k.f
    public final void z(int i) {
        this.k.z(i);
    }
}
