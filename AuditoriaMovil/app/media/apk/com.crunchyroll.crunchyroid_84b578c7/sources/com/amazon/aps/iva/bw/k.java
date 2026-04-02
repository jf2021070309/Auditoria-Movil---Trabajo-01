package com.amazon.aps.iva.bw;

import android.annotation.SuppressLint;
import com.amazon.aps.iva.o6.v;
/* compiled from: DrmSessionEventListenerImpl.kt */
@SuppressLint({"UnsafeOptInUsageError"})
/* loaded from: classes2.dex */
public final class k implements com.amazon.aps.iva.g6.e {
    public final j b = new j();

    @Override // com.amazon.aps.iva.g6.e
    public final void I(int i, v.b bVar) {
        this.b.getClass();
        j.a("onDrmKeysRemoved mediaPeriodId - " + bVar);
    }

    @Override // com.amazon.aps.iva.g6.e
    public final void Q(int i, v.b bVar) {
        this.b.getClass();
        j.a("onDrmKeysRestored mediaPeriodId - " + bVar);
    }

    @Override // com.amazon.aps.iva.g6.e
    public final void R(int i, v.b bVar, int i2) {
        this.b.getClass();
        j.a("onDrmSessionAcquired mediaPeriodId - " + bVar + " state - " + i2);
    }

    @Override // com.amazon.aps.iva.g6.e
    public final void S(int i, v.b bVar, Exception exc) {
        com.amazon.aps.iva.yb0.j.f(exc, "error");
        this.b.getClass();
        j.a("onDrmSessionManagerError err0r - " + exc);
    }

    @Override // com.amazon.aps.iva.g6.e
    public final void a0(int i, v.b bVar) {
        this.b.getClass();
        j.a("onDrmSessionReleased mediaPeriodId - " + bVar);
    }

    @Override // com.amazon.aps.iva.g6.e
    public final void f0(int i, v.b bVar) {
        this.b.getClass();
        j.a("onDrmKeysLoaded mediaPeriodId - " + bVar);
    }
}
