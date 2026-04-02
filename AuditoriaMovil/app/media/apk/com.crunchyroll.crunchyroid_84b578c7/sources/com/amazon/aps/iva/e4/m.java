package com.amazon.aps.iva.e4;

import java.io.IOException;
import java.nio.charset.Charset;
/* compiled from: CodedOutputStreamWriter.java */
/* loaded from: classes.dex */
public final class m {
    public final l a;

    public m(l lVar) {
        Charset charset = z.a;
        if (lVar != null) {
            this.a = lVar;
            lVar.a = this;
            return;
        }
        throw new NullPointerException("output");
    }

    public final void a(int i, boolean z) throws IOException {
        this.a.A(i, z);
    }

    public final void b(int i, i iVar) throws IOException {
        this.a.C(i, iVar);
    }

    public final void c(int i, double d) throws IOException {
        l lVar = this.a;
        lVar.getClass();
        lVar.G(i, Double.doubleToRawLongBits(d));
    }

    public final void d(int i, int i2) throws IOException {
        this.a.I(i, i2);
    }

    public final void e(int i, int i2) throws IOException {
        this.a.E(i, i2);
    }

    public final void f(int i, long j) throws IOException {
        this.a.G(i, j);
    }

    public final void g(int i, float f) throws IOException {
        l lVar = this.a;
        lVar.getClass();
        lVar.E(i, Float.floatToRawIntBits(f));
    }

    public final void h(int i, g1 g1Var, Object obj) throws IOException {
        l lVar = this.a;
        lVar.Q(i, 3);
        g1Var.b((q0) obj, lVar.a);
        lVar.Q(i, 4);
    }

    public final void i(int i, int i2) throws IOException {
        this.a.I(i, i2);
    }

    public final void j(int i, long j) throws IOException {
        this.a.T(i, j);
    }

    public final void k(int i, g1 g1Var, Object obj) throws IOException {
        this.a.K(i, (q0) obj, g1Var);
    }

    public final void l(int i, Object obj) throws IOException {
        boolean z = obj instanceof i;
        l lVar = this.a;
        if (z) {
            lVar.N(i, (i) obj);
        } else {
            lVar.M(i, (q0) obj);
        }
    }

    public final void m(int i, int i2) throws IOException {
        this.a.E(i, i2);
    }

    public final void n(int i, long j) throws IOException {
        this.a.G(i, j);
    }

    public final void o(int i, int i2) throws IOException {
        this.a.R(i, (i2 >> 31) ^ (i2 << 1));
    }

    public final void p(int i, long j) throws IOException {
        this.a.T(i, (j >> 63) ^ (j << 1));
    }

    public final void q(int i, int i2) throws IOException {
        this.a.R(i, i2);
    }

    public final void r(int i, long j) throws IOException {
        this.a.T(i, j);
    }
}
