package com.amazon.aps.iva.nw;
/* compiled from: RenewFailure.kt */
/* loaded from: classes2.dex */
public final class g extends Exception {
    public final l b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Throwable th, l lVar) {
        super(th);
        com.amazon.aps.iva.yb0.j.f(lVar, "failureReason");
        this.b = lVar;
    }
}
