package com.amazon.aps.iva.rd;
/* compiled from: PlayheadUpdateEligibilityHandler.kt */
/* loaded from: classes.dex */
public final class b implements a {
    public final com.amazon.aps.iva.xb0.a<Boolean> a;
    public final com.amazon.aps.iva.xb0.a<Boolean> b;

    public b(com.amazon.aps.iva.ux.b bVar, com.amazon.aps.iva.ux.c cVar) {
        this.a = bVar;
        this.b = cVar;
    }

    @Override // com.amazon.aps.iva.rd.a
    public final boolean a() {
        if (this.a.invoke().booleanValue() && this.b.invoke().booleanValue()) {
            return false;
        }
        return true;
    }
}
