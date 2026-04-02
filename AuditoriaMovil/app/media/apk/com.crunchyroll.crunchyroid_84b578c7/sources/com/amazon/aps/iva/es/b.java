package com.amazon.aps.iva.es;
/* compiled from: AccountOwnershipVerificationEvent.kt */
/* loaded from: classes2.dex */
public final class b extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.amazon.aps.iva.js.t0 t0Var) {
        super("Widget Uninstalled", t0Var);
        com.amazon.aps.iva.yb0.j.f(t0Var, "widgetType");
    }

    public b() {
        super("Mark as Watched Succeeded", new com.amazon.aps.iva.is.a[0], 3, 0);
    }

    public b(String str, com.amazon.aps.iva.js.i iVar) {
        super("Account Ownership Verification Failed", new com.amazon.aps.iva.is.a[]{new com.amazon.aps.iva.js.j(str), new p0("eventSource", iVar)}, 0, 0);
    }
}
