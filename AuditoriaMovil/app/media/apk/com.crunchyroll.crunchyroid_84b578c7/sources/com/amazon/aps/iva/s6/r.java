package com.amazon.aps.iva.s6;

import com.amazon.aps.iva.q5.s0;
import java.util.List;
/* compiled from: ExoTrackSelection.java */
/* loaded from: classes.dex */
public interface r extends u {

    /* compiled from: ExoTrackSelection.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final s0 a;
        public final int[] b;
        public final int c;

        public a() {
            throw null;
        }

        public a(int i, s0 s0Var, int[] iArr) {
            if (iArr.length == 0) {
                com.amazon.aps.iva.t5.p.d("Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.a = s0Var;
            this.b = iArr;
            this.c = i;
        }
    }

    /* compiled from: ExoTrackSelection.java */
    /* loaded from: classes.dex */
    public interface b {
        r[] a(a[] aVarArr, com.amazon.aps.iva.t6.d dVar);
    }

    void a();

    boolean b(int i, long j);

    int c();

    void g(long j, long j2, long j3, List<? extends com.amazon.aps.iva.q6.m> list, com.amazon.aps.iva.q6.n[] nVarArr);

    boolean h(int i, long j);

    void i(float f);

    Object j();

    void o();

    default boolean p(long j, com.amazon.aps.iva.q6.e eVar, List<? extends com.amazon.aps.iva.q6.m> list) {
        return false;
    }

    int q();

    com.amazon.aps.iva.q5.v r();

    int s();

    int u(List list, long j);

    default void k() {
    }

    default void t() {
    }

    default void n(boolean z) {
    }
}
