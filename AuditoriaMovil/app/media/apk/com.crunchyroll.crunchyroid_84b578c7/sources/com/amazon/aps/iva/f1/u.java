package com.amazon.aps.iva.f1;
/* compiled from: Canvas.kt */
/* loaded from: classes.dex */
public interface u {
    void a(long j, long j2, l0 l0Var);

    void b(i0 i0Var, long j, long j2, long j3, long j4, l0 l0Var);

    default void c(com.amazon.aps.iva.e1.e eVar, k kVar) {
        com.amazon.aps.iva.yb0.j.f(kVar, "paint");
        v(eVar.a, eVar.b, eVar.c, eVar.d, kVar);
    }

    void d();

    void e(float f, float f2, float f3, float f4, int i);

    void f(float f, float f2);

    void g();

    void h(m0 m0Var, int i);

    void j();

    void k(i0 i0Var, long j, l0 l0Var);

    void l(com.amazon.aps.iva.e1.e eVar, l0 l0Var);

    void m(m0 m0Var, l0 l0Var);

    void n();

    void o();

    void p(float f, float f2, float f3, float f4, float f5, float f6, l0 l0Var);

    void q(float[] fArr);

    default void r(com.amazon.aps.iva.e1.e eVar, int i) {
        e(eVar.a, eVar.b, eVar.c, eVar.d, i);
    }

    void s();

    void t(float f, float f2, float f3, float f4, float f5, float f6, l0 l0Var);

    void u(float f, long j, l0 l0Var);

    void v(float f, float f2, float f3, float f4, l0 l0Var);
}
