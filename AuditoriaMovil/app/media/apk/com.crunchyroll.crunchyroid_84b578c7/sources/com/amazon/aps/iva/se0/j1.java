package com.amazon.aps.iva.se0;

import com.amazon.aps.iva.ob0.g;
import java.util.concurrent.CancellationException;
/* compiled from: Job.kt */
/* loaded from: classes4.dex */
public interface j1 extends g.b {
    public static final /* synthetic */ int m0 = 0;

    /* compiled from: Job.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static /* synthetic */ t0 a(j1 j1Var, boolean z, n1 n1Var, int i) {
            boolean z2 = false;
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = true;
            }
            return j1Var.n(z, z2, n1Var);
        }
    }

    /* compiled from: Job.kt */
    /* loaded from: classes4.dex */
    public static final class b implements g.c<j1> {
        public static final /* synthetic */ b b = new b();
    }

    Object N(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar);

    q R(o1 o1Var);

    void a(CancellationException cancellationException);

    boolean c();

    boolean isActive();

    boolean isCancelled();

    t0 n(boolean z, boolean z2, com.amazon.aps.iva.xb0.l<? super Throwable, com.amazon.aps.iva.kb0.q> lVar);

    CancellationException p();

    t0 s0(com.amazon.aps.iva.xb0.l<? super Throwable, com.amazon.aps.iva.kb0.q> lVar);

    boolean start();
}
