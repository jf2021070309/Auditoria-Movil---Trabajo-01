package com.amazon.aps.iva.a6;

import com.amazon.aps.iva.a6.l1;
import java.io.IOException;
/* compiled from: Renderer.java */
/* loaded from: classes.dex */
public interface o1 extends l1.b {

    /* compiled from: Renderer.java */
    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b();
    }

    u0 A();

    void a();

    boolean d();

    boolean g();

    String getName();

    int getState();

    com.amazon.aps.iva.o6.h0 getStream();

    boolean h();

    void j(q1 q1Var, com.amazon.aps.iva.q5.v[] vVarArr, com.amazon.aps.iva.o6.h0 h0Var, long j, boolean z, boolean z2, long j2, long j3) throws l;

    void k();

    void m() throws IOException;

    boolean n();

    void o(com.amazon.aps.iva.q5.v[] vVarArr, com.amazon.aps.iva.o6.h0 h0Var, long j, long j2) throws l;

    int p();

    e r();

    void reset();

    void start() throws l;

    void stop();

    void w(long j, long j2) throws l;

    long x();

    void y(int i, com.amazon.aps.iva.b6.p1 p1Var);

    void z(long j) throws l;

    default void release() {
    }

    default void u(float f, float f2) throws l {
    }
}
