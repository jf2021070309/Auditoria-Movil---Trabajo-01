package com.amazon.aps.iva.a6;
/* compiled from: LoadControl.java */
/* loaded from: classes.dex */
public interface t0 {
    @Deprecated
    public static final com.amazon.aps.iva.q5.e0 a = new com.amazon.aps.iva.q5.e0(new Object());

    void b();

    boolean c();

    default void d(com.amazon.aps.iva.q5.r0 r0Var, com.amazon.aps.iva.q5.e0 e0Var, o1[] o1VarArr, com.amazon.aps.iva.o6.o0 o0Var, com.amazon.aps.iva.s6.r[] rVarArr) {
        j(o1VarArr, o0Var, rVarArr);
    }

    long e();

    void f();

    @Deprecated
    default boolean h(long j, float f, boolean z, long j2) {
        return m(com.amazon.aps.iva.q5.r0.b, a, j, f, z, j2);
    }

    com.amazon.aps.iva.t6.b i();

    @Deprecated
    default void j(o1[] o1VarArr, com.amazon.aps.iva.o6.o0 o0Var, com.amazon.aps.iva.s6.r[] rVarArr) {
        d(com.amazon.aps.iva.q5.r0.b, a, o1VarArr, o0Var, rVarArr);
    }

    void k();

    boolean l(long j, long j2, float f);

    default boolean m(com.amazon.aps.iva.q5.r0 r0Var, com.amazon.aps.iva.q5.e0 e0Var, long j, float f, boolean z, long j2) {
        return h(j, f, z, j2);
    }
}
