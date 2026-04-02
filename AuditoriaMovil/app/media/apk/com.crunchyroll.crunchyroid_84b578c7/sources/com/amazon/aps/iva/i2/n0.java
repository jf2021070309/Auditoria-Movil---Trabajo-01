package com.amazon.aps.iva.i2;
/* compiled from: TextInputService.kt */
/* loaded from: classes.dex */
public final class n0 {
    public final f0 a;
    public final z b;

    public n0(f0 f0Var, z zVar) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "textInputService");
        com.amazon.aps.iva.yb0.j.f(zVar, "platformTextInputService");
        this.a = f0Var;
        this.b = zVar;
    }

    public final boolean a() {
        return com.amazon.aps.iva.yb0.j.a(this.a.b.get(), this);
    }

    public final void b(e0 e0Var, e0 e0Var2) {
        if (a()) {
            this.b.f(e0Var, e0Var2);
        }
    }
}
