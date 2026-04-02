package com.amazon.aps.iva.v4;

import java.io.IOException;
import java.nio.charset.Charset;
/* compiled from: CodedOutputStreamWriter.java */
/* loaded from: classes.dex */
public final class l {
    public final k a;

    public l(k kVar) {
        Charset charset = y.a;
        if (kVar != null) {
            this.a = kVar;
            kVar.a = this;
            return;
        }
        throw new NullPointerException("output");
    }

    public final void a(int i, boolean z) throws IOException {
        this.a.A(i, z);
    }

    public final void b(int i, h hVar) throws IOException {
        this.a.B(i, hVar);
    }

    public final void c(int i, double d) throws IOException {
        k kVar = this.a;
        kVar.getClass();
        kVar.E(i, Double.doubleToRawLongBits(d));
    }

    public final void d(int i, int i2) throws IOException {
        this.a.G(i, i2);
    }

    public final void e(int i, int i2) throws IOException {
        this.a.C(i, i2);
    }

    public final void f(int i, long j) throws IOException {
        this.a.E(i, j);
    }

    public final void g(int i, float f) throws IOException {
        k kVar = this.a;
        kVar.getClass();
        kVar.C(i, Float.floatToRawIntBits(f));
    }

    public final void h(int i, e1 e1Var, Object obj) throws IOException {
        k kVar = this.a;
        kVar.M(i, 3);
        e1Var.a((p0) obj, kVar.a);
        kVar.M(i, 4);
    }

    public final void i(int i, int i2) throws IOException {
        this.a.G(i, i2);
    }

    public final void j(int i, long j) throws IOException {
        this.a.P(i, j);
    }

    public final void k(int i, e1 e1Var, Object obj) throws IOException {
        this.a.I(i, (p0) obj, e1Var);
    }

    public final void l(int i, Object obj) throws IOException {
        boolean z = obj instanceof h;
        k kVar = this.a;
        if (z) {
            kVar.K(i, (h) obj);
        } else {
            kVar.J(i, (p0) obj);
        }
    }

    public final void m(int i, int i2) throws IOException {
        this.a.C(i, i2);
    }

    public final void n(int i, long j) throws IOException {
        this.a.E(i, j);
    }

    public final void o(int i, int i2) throws IOException {
        this.a.N(i, (i2 >> 31) ^ (i2 << 1));
    }

    public final void p(int i, long j) throws IOException {
        this.a.P(i, (j >> 63) ^ (j << 1));
    }

    public final void q(int i, int i2) throws IOException {
        this.a.N(i, i2);
    }

    public final void r(int i, long j) throws IOException {
        this.a.P(i, j);
    }
}
