package com.amazon.aps.iva.se0;
/* compiled from: Unconfined.kt */
/* loaded from: classes4.dex */
public final class k2 extends d0 {
    public static final /* synthetic */ int c = 0;

    static {
        new k2();
    }

    @Override // com.amazon.aps.iva.se0.d0
    public final String toString() {
        return "Dispatchers.Unconfined";
    }

    @Override // com.amazon.aps.iva.se0.d0
    public final void x(com.amazon.aps.iva.ob0.g gVar, Runnable runnable) {
        n2 n2Var = (n2) gVar.get(n2.c);
        if (n2Var != null) {
            n2Var.b = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }
}
