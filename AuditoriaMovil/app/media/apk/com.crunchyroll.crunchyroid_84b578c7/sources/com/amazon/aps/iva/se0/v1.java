package com.amazon.aps.iva.se0;

import com.amazon.aps.iva.se0.j1;
import java.util.concurrent.CancellationException;
/* compiled from: NonCancellable.kt */
/* loaded from: classes4.dex */
public final class v1 extends com.amazon.aps.iva.ob0.a implements j1 {
    public static final v1 b = new v1();

    public v1() {
        super(j1.b.b);
    }

    @Override // com.amazon.aps.iva.se0.j1
    public final Object N(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // com.amazon.aps.iva.se0.j1
    public final q R(o1 o1Var) {
        return w1.b;
    }

    @Override // com.amazon.aps.iva.se0.j1
    public final boolean c() {
        return false;
    }

    @Override // com.amazon.aps.iva.se0.j1
    public final boolean isActive() {
        return true;
    }

    @Override // com.amazon.aps.iva.se0.j1
    public final boolean isCancelled() {
        return false;
    }

    @Override // com.amazon.aps.iva.se0.j1
    public final t0 n(boolean z, boolean z2, com.amazon.aps.iva.xb0.l<? super Throwable, com.amazon.aps.iva.kb0.q> lVar) {
        return w1.b;
    }

    @Override // com.amazon.aps.iva.se0.j1
    public final CancellationException p() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // com.amazon.aps.iva.se0.j1
    public final t0 s0(com.amazon.aps.iva.xb0.l<? super Throwable, com.amazon.aps.iva.kb0.q> lVar) {
        return w1.b;
    }

    @Override // com.amazon.aps.iva.se0.j1
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // com.amazon.aps.iva.se0.j1
    public final void a(CancellationException cancellationException) {
    }
}
