package com.amazon.aps.iva.f1;

import android.graphics.Shader;
/* compiled from: Brush.kt */
/* loaded from: classes.dex */
public abstract class s0 extends s {
    public Shader a;
    public long b;

    public s0() {
        int i = com.amazon.aps.iva.e1.g.d;
        this.b = com.amazon.aps.iva.e1.g.c;
    }

    @Override // com.amazon.aps.iva.f1.s
    public final void a(float f, long j, l0 l0Var) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(l0Var, "p");
        Shader shader = this.a;
        if (shader == null || !com.amazon.aps.iva.e1.g.a(this.b, j)) {
            if (com.amazon.aps.iva.e1.g.e(j)) {
                shader = null;
                this.a = null;
                int i = com.amazon.aps.iva.e1.g.d;
                this.b = com.amazon.aps.iva.e1.g.c;
            } else {
                shader = b(j);
                this.a = shader;
                this.b = j;
            }
        }
        long b = l0Var.b();
        int i2 = x.h;
        long j2 = x.b;
        if (!x.c(b, j2)) {
            l0Var.f(j2);
        }
        if (!com.amazon.aps.iva.yb0.j.a(l0Var.k(), shader)) {
            l0Var.j(shader);
        }
        if (l0Var.a() == f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            l0Var.g(f);
        }
    }

    public abstract Shader b(long j);
}
